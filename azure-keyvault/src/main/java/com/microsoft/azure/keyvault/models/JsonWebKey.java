/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.keyvault.webkey.JsonWebKeyType;
import com.microsoft.rest.Base64Url;

/**
 * As of http://tools.ietf.org/html/draft-ietf-jose-json-web-key-18.
 */
public class JsonWebKey {
    /**
     * Key Identifier.
     */
    private String kid;

    /**
     * Key type, usually RSA. Possible values include: 'EC', 'RSA', 'RSA-HSM',
     * 'oct'.
     */
    private String kty;

    /**
     * The keyOps property.
     */
    @JsonProperty(value = "key_ops")
    private List<String> keyOps;

    /**
     * RSA modulus.
     */
    private Base64Url n;

    /**
     * RSA public exponent.
     */
    private Base64Url e;

    /**
     * RSA private exponent.
     */
    private Base64Url d;

    /**
     * RSA Private Key Parameter.
     */
    private Base64Url dp;

    /**
     * RSA Private Key Parameter.
     */
    private Base64Url dq;

    /**
     * RSA Private Key Parameter.
     */
    private Base64Url qi;

    /**
     * RSA secret prime.
     */
    private Base64Url p;

    /**
     * RSA secret prime, with p &lt; q.
     */
    private Base64Url q;

    /**
     * Symmetric key.
     */
    @JsonProperty(value = "K")
    private Base64Url k;

    /**
     * HSM Token, used with Bring Your Own Key.
     */
    @JsonProperty(value = "key_hsm")
    private Base64Url t;

    /**
     * Get the kid value.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Set the kid value.
     *
     * @param kid the kid value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the kty value.
     *
     * @return the kty value
     */
    public String kty() {
        return this.kty;
    }

    /**
     * Set the kty value.
     *
     * @param kty the kty value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withKty(String kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the keyOps value.
     *
     * @return the keyOps value
     */
    public List<String> keyOps() {
        return this.keyOps;
    }

    /**
     * Set the keyOps value.
     *
     * @param keyOps the keyOps value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withKeyOps(List<String> keyOps) {
        this.keyOps = keyOps;
        return this;
    }

    /**
     * Get the n value.
     *
     * @return the n value
     */
    public byte[] n() {
        if (this.n == null) {
            return null;
        }
        return this.n.getDecodedBytes();
    }

    /**
     * Set the n value.
     *
     * @param n the n value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withN(byte[] n) {
        if (n == null) {
            this.n = null;
        } else {
            this.n = Base64Url.encode(n);
        }
        return this;
    }

    /**
     * Get the e value.
     *
     * @return the e value
     */
    public byte[] e() {
        if (this.e == null) {
            return null;
        }
        return this.e.getDecodedBytes();
    }

    /**
     * Set the e value.
     *
     * @param e the e value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withE(byte[] e) {
        if (e == null) {
            this.e = null;
        } else {
            this.e = Base64Url.encode(e);
        }
        return this;
    }

    /**
     * Get the d value.
     *
     * @return the d value
     */
    public byte[] d() {
        if (this.d == null) {
            return null;
        }
        return this.d.getDecodedBytes();
    }

    /**
     * Set the d value.
     *
     * @param d the d value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withD(byte[] d) {
        if (d == null) {
            this.d = null;
        } else {
            this.d = Base64Url.encode(d);
        }
        return this;
    }

    /**
     * Get the dp value.
     *
     * @return the dp value
     */
    public byte[] dp() {
        if (this.dp == null) {
            return null;
        }
        return this.dp.getDecodedBytes();
    }

    /**
     * Set the dp value.
     *
     * @param dp the dp value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withDp(byte[] dp) {
        if (dp == null) {
            this.dp = null;
        } else {
            this.dp = Base64Url.encode(dp);
        }
        return this;
    }

    /**
     * Get the dq value.
     *
     * @return the dq value
     */
    public byte[] dq() {
        if (this.dq == null) {
            return null;
        }
        return this.dq.getDecodedBytes();
    }

    /**
     * Set the dq value.
     *
     * @param dq the dq value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withDq(byte[] dq) {
        if (dq == null) {
            this.dq = null;
        } else {
            this.dq = Base64Url.encode(dq);
        }
        return this;
    }

    /**
     * Get the qi value.
     *
     * @return the qi value
     */
    public byte[] qi() {
        if (this.qi == null) {
            return null;
        }
        return this.qi.getDecodedBytes();
    }

    /**
     * Set the qi value.
     *
     * @param qi the qi value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withQi(byte[] qi) {
        if (qi == null) {
            this.qi = null;
        } else {
            this.qi = Base64Url.encode(qi);
        }
        return this;
    }

    /**
     * Get the p value.
     *
     * @return the p value
     */
    public byte[] p() {
        if (this.p == null) {
            return null;
        }
        return this.p.getDecodedBytes();
    }

    /**
     * Set the p value.
     *
     * @param p the p value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withP(byte[] p) {
        if (p == null) {
            this.p = null;
        } else {
            this.p = Base64Url.encode(p);
        }
        return this;
    }

    /**
     * Get the q value.
     *
     * @return the q value
     */
    public byte[] q() {
        if (this.q == null) {
            return null;
        }
        return this.q.getDecodedBytes();
    }

    /**
     * Set the q value.
     *
     * @param q the q value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withQ(byte[] q) {
        if (q == null) {
            this.q = null;
        } else {
            this.q = Base64Url.encode(q);
        }
        return this;
    }

    /**
     * Get the k value.
     *
     * @return the k value
     */
    public byte[] k() {
        if (this.k == null) {
            return null;
        }
        return this.k.getDecodedBytes();
    }

    /**
     * Set the k value.
     *
     * @param k the k value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withK(byte[] k) {
        if (k == null) {
            this.k = null;
        } else {
            this.k = Base64Url.encode(k);
        }
        return this;
    }

    /**
     * Get the t value.
     *
     * @return the t value
     */
    public byte[] t() {
        if (this.t == null) {
            return null;
        }
        return this.t.getDecodedBytes();
    }

    /**
     * Set the t value.
     *
     * @param t the t value to set
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey withT(byte[] t) {
        if (t == null) {
            this.t = null;
        } else {
            this.t = Base64Url.encode(t);
        }
        return this;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonGenerationException e) {
            throw new IllegalStateException(e);
        } catch (JsonMappingException e) {
            throw new IllegalStateException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Get the RSA public key spec value.
     *
     * @return the RSA public key spec value
     */
    private RSAPublicKeySpec getRSAPublicKeySpec() {

        return new RSAPublicKeySpec(toBigInteger(n()), toBigInteger(e()));
    }

    /**
     * Get the RSA private key spec value.
     *
     * @return the RSA private key spec value
     */
    private RSAPrivateKeySpec getRSAPrivateKeySpec() {

        return new RSAPrivateCrtKeySpec(toBigInteger(n()), toBigInteger(e()), toBigInteger(d()), toBigInteger(p()),
                toBigInteger(q()), toBigInteger(dp()), toBigInteger(dq()), toBigInteger(qi()));
    }

    /**
     * Get the RSA public key value.
     *
     * @return the RSA public key value
     */
    private PublicKey getRSAPublicKey() {

        try {
            RSAPublicKeySpec publicKeySpec = getRSAPublicKeySpec();
            KeyFactory factory = KeyFactory.getInstance("RSA");

            return factory.generatePublic(publicKeySpec);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Get the RSA private key value.
     *
     * @return the RSA private key value
     */
    private PrivateKey getRSAPrivateKey() {

        try {
            RSAPrivateKeySpec privateKeySpec = getRSAPrivateKeySpec();
            KeyFactory factory = KeyFactory.getInstance("RSA");

            return factory.generatePrivate(privateKeySpec);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Verifies if the key is an RSA key.
     */
    private void checkRSACompatible() {
        if (!JsonWebKeyType.RSA.equals(kty()) && !JsonWebKeyType.RSAHSM.equals(kty())) {
            throw new UnsupportedOperationException("Not an RSA key");
        }
    }

    private static byte[] toByteArray(BigInteger n) {
        byte[] result = n.toByteArray();
        if (result[0] == 0) {
            // The leading zero is used to let the number positive. Since RSA
            // parameters are always positive, we remove it.
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    private static BigInteger toBigInteger(byte[] b) {
        if (b[0] < 0) {
            // RSA parameters are always positive numbers, so if the first byte
            // is negative, we need to add a leading zero
            // to make the entire BigInteger positive.
            byte[] temp = new byte[1 + b.length];
            System.arraycopy(b, 0, temp, 1, b.length);
            b = temp;
        }
        return new BigInteger(b);
    }

    /**
     * Converts RSA key pair to JSON web key.
     * @param keyPair RSA key pair
     * @return the JSON web key, converted from RSA key pair.
     */
    public static JsonWebKey fromRSA(KeyPair keyPair) {

        RSAPrivateCrtKey privateKey = (RSAPrivateCrtKey) keyPair.getPrivate();
        JsonWebKey key = null;

        if (privateKey != null) {

            key = new JsonWebKey()
                    .withKty(JsonWebKeyType.RSA)
                    .withN(toByteArray(privateKey.getModulus()))
                    .withE(toByteArray(privateKey.getPublicExponent()))
                    .withD(toByteArray(privateKey.getPrivateExponent()))
                    .withP(toByteArray(privateKey.getPrimeP()))
                    .withQ(toByteArray(privateKey.getPrimeQ()))
                    .withDp(toByteArray(privateKey.getPrimeExponentP()))
                    .withDq(toByteArray(privateKey.getPrimeExponentQ()))
                    .withQi(toByteArray(privateKey.getCrtCoefficient()));
        } else {

            RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

            key = new JsonWebKey()
                    .withKty(JsonWebKeyType.RSA)
                    .withN(toByteArray(publicKey.getModulus()))
                    .withE(toByteArray(publicKey.getPublicExponent()))
                    .withD(null)
                    .withP(null)
                    .withQ(null)
                    .withDp(null)
                    .withDq(null)
                    .withQi(null);
        }

        return key;
    }

    /**
     * Converts JSON web key to RSA key pair.
     * @return RSA key pair
     */
    public KeyPair toRSA() {
        return this.toRSA(false);
    }

    /**
     * Converts JSON web key to RSA key pair and include the private key if set to true.
     * @param includePrivateParameters true if the RSA key pair should include the private key. False otherwise.
     * @return RSA key pair
     */
    public KeyPair toRSA(boolean includePrivateParameters) {

        // Must be RSA
        checkRSACompatible();

        if (includePrivateParameters) {
            return new KeyPair(getRSAPublicKey(), getRSAPrivateKey());
        } else {
            return new KeyPair(getRSAPublicKey(), null);
        }
    }
}