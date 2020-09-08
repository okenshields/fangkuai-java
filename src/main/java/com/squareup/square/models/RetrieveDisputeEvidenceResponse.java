package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.squareup.square.http.client.HttpContext;


/**
 * This is a model class for RetrieveDisputeEvidenceResponse type.
 */
public class RetrieveDisputeEvidenceResponse {

    /**
     * Initialization constructor.
     * @param errors
     * @param evidence
     */
    @JsonCreator
    public RetrieveDisputeEvidenceResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("evidence") DisputeEvidence evidence) {
        this.errors = errors;
        this.evidence = evidence;
    }

    private HttpContext httpContext;
    private final List<Error> errors;
    private final DisputeEvidence evidence;

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Getter for Evidence.
     */
    @JsonGetter("evidence")
    public DisputeEvidence getEvidence() {
        return this.evidence;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(errors, evidence);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof RetrieveDisputeEvidenceResponse)) {
            return false;
        }
        RetrieveDisputeEvidenceResponse retrieveDisputeEvidenceResponse = (RetrieveDisputeEvidenceResponse) obj;
        return Objects.equals(errors, retrieveDisputeEvidenceResponse.errors) &&
            Objects.equals(evidence, retrieveDisputeEvidenceResponse.evidence);
    }

    /**
     * Builds a new {@link RetrieveDisputeEvidenceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveDisputeEvidenceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .errors(getErrors())
            .evidence(getEvidence());
            return builder;
    }

    /**
     * Class to build instances of {@link RetrieveDisputeEvidenceResponse}
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private DisputeEvidence evidence;

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
         * Setter for errors
         * @param errors
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }
        /**
         * Setter for evidence
         * @param evidence
         * @return Builder
         */
        public Builder evidence(DisputeEvidence evidence) {
            this.evidence = evidence;
            return this;
        }

        /**
         * Builds a new {@link RetrieveDisputeEvidenceResponse} object using the set fields.
         * @return {@link RetrieveDisputeEvidenceResponse}
         */
        public RetrieveDisputeEvidenceResponse build() {
            RetrieveDisputeEvidenceResponse model = new RetrieveDisputeEvidenceResponse(errors,
                evidence);
            model.httpContext = httpContext;
            return model;
        }
    }
}
