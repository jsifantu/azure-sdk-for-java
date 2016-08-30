/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import com.microsoft.azure.management.graphrbac.PasswordProfile;
import com.microsoft.azure.management.graphrbac.User;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;
import rx.functions.Func1;

/**
 * Implementation for StorageAccount and its parent interfaces.
 */
class UserImpl
        extends WrapperImpl<UserInner>
        implements
            User,
            User.Definition,
            User.Update {
    private UsersInner client;
    private UserCreateParametersInner createParameters;

    UserImpl(String userPrincipalName, UsersInner client) {
        super(new UserInner());
        this.client = client;
        this.createParameters = new UserCreateParametersInner().withUserPrincipalName(userPrincipalName);
    }

    UserImpl(UserInner innerObject, UsersInner client) {
        super(innerObject);
        this.client = client;
        this.createParameters = new UserCreateParametersInner();
    }

    @Override
    public String objectId() {
        return inner().objectId();
    }

    @Override
    public String objectType() {
        return inner().objectType();
    }

    @Override
    public String userPrincipalName() {
        return inner().userPrincipalName();
    }

    @Override
    public String displayName() {
        return inner().displayName();
    }

    @Override
    public String signInName() {
        return inner().signInName();
    }

    @Override
    public String mail() {
        return inner().mail();
    }

    @Override
    public String mailNickname() {
        return inner().mailNickname();
    }

    @Override
    public String name() {
        return userPrincipalName();
    }

    @Override
    public UserImpl create() throws Exception {
        setInner(client.create(createParameters).getBody());
        return this;
    }

    @Override
    public ServiceCall<User> createAsync(final ServiceCallback<User> callback) {
        final UserImpl self = this;
        return obser
    }

    @Override
    public Observable<User> createAsync() {
        final UserImpl self = this;
        return client.createAsync(createParameters)
                .map(new Func1<ServiceResponse<UserInner>, User>() {
                    @Override
                    public User call(ServiceResponse<UserInner> userInnerServiceResponse) {
                        setInner(userInnerServiceResponse.getBody());
                        return self;
                    }
                });
    }

    @Override
    public String key() {
        return objectId();
    }

    @Override
    public UserImpl withAccountEnabled(boolean enabled) {
        createParameters.withAccountEnabled(enabled);
        return this;
    }

    @Override
    public UserImpl withDisplayName(String displayName) {
        createParameters.withDisplayName(displayName);
        return this;
    }

    @Override
    public UserImpl withMailNickname(String mailNickname) {
        createParameters.withMailNickname(mailNickname);
        return this;
    }

    @Override
    public UserImpl withPassword(String password) {
        createParameters.withPasswordProfile(new PasswordProfile().withPassword(password));
        return this;
    }

    @Override
    public UserImpl withPassword(String password, boolean forceChangePasswordNextLogin) {
        createParameters.withPasswordProfile(new PasswordProfile().withPassword(password).withForceChangePasswordNextLogin(forceChangePasswordNextLogin));
        return this;
    }
}
