package com.squareup.square.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for CreateCustomerCardRequest type.
 */
public class CreateCustomerCardRequest {

    /**
     * Initialization constructor.
     * @param cardNonce
     * @param billingAddress
     * @param cardholderName
     * @param verificationToken
     */
    @JsonCreator
    public CreateCustomerCardRequest(
            @JsonProperty("card_nonce") String cardNonce,
            @JsonProperty("billing_address") Address billingAddress,
            @JsonProperty("cardholder_name") String cardholderName,
            @JsonProperty("verification_token") String verificationToken) {
        this.cardNonce = cardNonce;
        this.billingAddress = billingAddress;
        this.cardholderName = cardholderName;
        this.verificationToken = verificationToken;
    }

    private final String cardNonce;
    private final Address billingAddress;
    private final String cardholderName;
    private final String verificationToken;
    /**
     * Getter for CardNonce.
     * A card nonce representing the credit card to link to the customer.
     * Card nonces are generated by the Square Payment Form when customers enter
     * their card information. See
     * [Embedding the payment form](https://developer.squareup.com/docs/payment-form/payment-form-walkthrough) for
     * more information.
     * __NOTE:__ Card nonces generated by digital wallets (e.g., Apple Pay)
     * cannot be used to create a customer card.
     */
    @JsonGetter("card_nonce")
    public String getCardNonce() {
        return this.cardNonce;
    }

    /**
     * Getter for BillingAddress.
     * Represents a physical address.
     */
    @JsonGetter("billing_address")
    public Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Getter for CardholderName.
     * The full name printed on the credit card.
     */
    @JsonGetter("cardholder_name")
    public String getCardholderName() {
        return this.cardholderName;
    }

    /**
     * Getter for VerificationToken.
     * An identifying token generated by `SqPaymentForm.verifyBuyer()`.
     * Verification tokens encapsulate customer device information and 3-D Secure
     * challenge results to indicate that Square has verified the buyer identity.
     */
    @JsonGetter("verification_token")
    public String getVerificationToken() {
        return this.verificationToken;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(cardNonce, billingAddress, cardholderName, verificationToken);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CreateCustomerCardRequest)) {
            return false;
        }
        CreateCustomerCardRequest createCustomerCardRequest = (CreateCustomerCardRequest) obj;
        return Objects.equals(cardNonce, createCustomerCardRequest.cardNonce) &&
            Objects.equals(billingAddress, createCustomerCardRequest.billingAddress) &&
            Objects.equals(cardholderName, createCustomerCardRequest.cardholderName) &&
            Objects.equals(verificationToken, createCustomerCardRequest.verificationToken);
    }

    /**
     * Builds a new {@link CreateCustomerCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cardNonce)
            .billingAddress(getBillingAddress())
            .cardholderName(getCardholderName())
            .verificationToken(getVerificationToken());
            return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerCardRequest}
     */
    public static class Builder {
        private String cardNonce;
        private Address billingAddress;
        private String cardholderName;
        private String verificationToken;

        /**
         * Initialization constructor
         */
        public Builder(String cardNonce) {
            this.cardNonce = cardNonce;
        }

        /**
         * Setter for cardNonce
         * @param cardNonce
         * @return Builder
         */
        public Builder cardNonce(String cardNonce) {
            this.cardNonce = cardNonce;
            return this;
        }
        /**
         * Setter for billingAddress
         * @param billingAddress
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }
        /**
         * Setter for cardholderName
         * @param cardholderName
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
            return this;
        }
        /**
         * Setter for verificationToken
         * @param verificationToken
         * @return Builder
         */
        public Builder verificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }

        /**
         * Builds a new {@link CreateCustomerCardRequest} object using the set fields.
         * @return {@link CreateCustomerCardRequest}
         */
        public CreateCustomerCardRequest build() {
            return new CreateCustomerCardRequest(cardNonce,
                billingAddress,
                cardholderName,
                verificationToken);
        }
    }
}