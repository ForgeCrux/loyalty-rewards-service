package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * RedeemRewardRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")
@Document(collection = "loyalty_rewards_service_rewards")
public class RedeemRewardRequest {

    private UUID memberId;

    private String deliveryEmail;

    public RedeemRewardRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RedeemRewardRequest(UUID memberId) {
        this.memberId = memberId;
    }

    public RedeemRewardRequest memberId(UUID memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * Get memberId
     * @return memberId
     */
    @NotNull
    @Valid
    @Schema(name = "memberId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("memberId")
    public UUID getMemberId() {
        return memberId;
    }

    public void setMemberId(UUID memberId) {
        this.memberId = memberId;
    }

    public RedeemRewardRequest deliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
        return this;
    }

    /**
     * Get deliveryEmail
     * @return deliveryEmail
     */
    @jakarta.validation.constraints.Email
    @Schema(name = "deliveryEmail", example = "john.doe@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deliveryEmail")
    public String getDeliveryEmail() {
        return deliveryEmail;
    }

    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RedeemRewardRequest redeemRewardRequest = (RedeemRewardRequest) o;
        return Objects.equals(this.memberId, redeemRewardRequest.memberId) && Objects.equals(this.deliveryEmail, redeemRewardRequest.deliveryEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, deliveryEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedeemRewardRequest {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    deliveryEmail: ").append(toIndentedString(deliveryEmail)).append("\n");
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
