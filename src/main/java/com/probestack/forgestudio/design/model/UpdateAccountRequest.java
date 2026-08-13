package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * UpdateAccountRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")
@Document(collection = "loyalty_rewards_service_accounts")
public class UpdateAccountRequest {

    private Boolean autoRedeem;

    private Boolean emailUpdates;

    public UpdateAccountRequest autoRedeem(Boolean autoRedeem) {
        this.autoRedeem = autoRedeem;
        return this;
    }

    /**
     * Get autoRedeem
     * @return autoRedeem
     */
    @Schema(name = "autoRedeem", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("autoRedeem")
    public Boolean getAutoRedeem() {
        return autoRedeem;
    }

    public void setAutoRedeem(Boolean autoRedeem) {
        this.autoRedeem = autoRedeem;
    }

    public UpdateAccountRequest emailUpdates(Boolean emailUpdates) {
        this.emailUpdates = emailUpdates;
        return this;
    }

    /**
     * Get emailUpdates
     * @return emailUpdates
     */
    @Schema(name = "emailUpdates", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("emailUpdates")
    public Boolean getEmailUpdates() {
        return emailUpdates;
    }

    public void setEmailUpdates(Boolean emailUpdates) {
        this.emailUpdates = emailUpdates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) o;
        return Objects.equals(this.autoRedeem, updateAccountRequest.autoRedeem) && Objects.equals(this.emailUpdates, updateAccountRequest.emailUpdates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoRedeem, emailUpdates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccountRequest {\n");
        sb.append("    autoRedeem: ").append(toIndentedString(autoRedeem)).append("\n");
        sb.append("    emailUpdates: ").append(toIndentedString(emailUpdates)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Id()
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
