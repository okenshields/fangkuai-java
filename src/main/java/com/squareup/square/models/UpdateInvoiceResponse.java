package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.squareup.square.http.client.HttpContext;


/**
 * This is a model class for UpdateInvoiceResponse type.
 */
public class UpdateInvoiceResponse {

    /**
     * Initialization constructor.
     * @param invoice
     * @param errors
     */
    @JsonCreator
    public UpdateInvoiceResponse(
            @JsonProperty("invoice") Invoice invoice,
            @JsonProperty("errors") List<Error> errors) {
        this.invoice = invoice;
        this.errors = errors;
    }

    private HttpContext httpContext;
    private final Invoice invoice;
    private final List<Error> errors;

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Invoice.
     * Stores information about an invoice. You use the Invoices API to create and process
     * invoices. For more information, see [Manage Invoices Using the Invoices API](https://developer.squareup.com/docs/docs/invoices-api/overview).
     */
    @JsonGetter("invoice")
    public Invoice getInvoice() {
        return this.invoice;
    }

    /**
     * Getter for Errors.
     * Information about errors encountered during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(invoice, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof UpdateInvoiceResponse)) {
            return false;
        }
        UpdateInvoiceResponse updateInvoiceResponse = (UpdateInvoiceResponse) obj;
        return Objects.equals(invoice, updateInvoiceResponse.invoice) &&
            Objects.equals(errors, updateInvoiceResponse.errors);
    }

    /**
     * Builds a new {@link UpdateInvoiceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateInvoiceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .invoice(getInvoice())
            .errors(getErrors());
            return builder;
    }

    /**
     * Class to build instances of {@link UpdateInvoiceResponse}
     */
    public static class Builder {
        private HttpContext httpContext;
        private Invoice invoice;
        private List<Error> errors;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for httpContext
         * @param httpContext
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }
        /**
         * Setter for invoice
         * @param invoice
         * @return Builder
         */
        public Builder invoice(Invoice invoice) {
            this.invoice = invoice;
            return this;
        }
        /**
         * Setter for errors
         * @param errors
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link UpdateInvoiceResponse} object using the set fields.
         * @return {@link UpdateInvoiceResponse}
         */
        public UpdateInvoiceResponse build() {
            UpdateInvoiceResponse model = new UpdateInvoiceResponse(invoice,
                errors);
            model.httpContext = httpContext;
            return model;
        }
    }
}
