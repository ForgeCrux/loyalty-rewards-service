package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Redemption
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")public class Redemption {

  private UUID id;

  private UUID rewardId;

  private UUID memberId;

  private Integer pointsBurned;

  private String redemptionCode;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ISSUED("ISSUED"),
    
    USED("USED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  public Redemption id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid   @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Redemption rewardId(UUID rewardId) {
    this.rewardId = rewardId;
    return this;
  }

  /**
   * Get rewardId
   * @return rewardId
  */
  @Valid   @Schema(name = "rewardId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rewardId")
  public UUID getRewardId() {
    return rewardId;
  }

  public void setRewardId(UUID rewardId) {
    this.rewardId = rewardId;
  }

  public Redemption memberId(UUID memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  */
  @Valid   @Schema(name = "memberId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberId")
  public UUID getMemberId() {
    return memberId;
  }

  public void setMemberId(UUID memberId) {
    this.memberId = memberId;
  }

  public Redemption pointsBurned(Integer pointsBurned) {
    this.pointsBurned = pointsBurned;
    return this;
  }

  /**
   * Get pointsBurned
   * @return pointsBurned
  */
    @Schema(name = "pointsBurned", example = "1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointsBurned")
  public Integer getPointsBurned() {
    return pointsBurned;
  }

  public void setPointsBurned(Integer pointsBurned) {
    this.pointsBurned = pointsBurned;
  }

  public Redemption redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

  /**
   * Get redemptionCode
   * @return redemptionCode
  */
    @Schema(name = "redemptionCode", example = "RWD-8H3K-92QP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionCode")
  public String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public Redemption status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
    @Schema(name = "status", example = "ISSUED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Redemption expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  */
  @Valid   @Schema(name = "expiresAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiresAt")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Redemption redemption = (Redemption) o;
    return Objects.equals(this.id, redemption.id) &&
        Objects.equals(this.rewardId, redemption.rewardId) &&
        Objects.equals(this.memberId, redemption.memberId) &&
        Objects.equals(this.pointsBurned, redemption.pointsBurned) &&
        Objects.equals(this.redemptionCode, redemption.redemptionCode) &&
        Objects.equals(this.status, redemption.status) &&
        Objects.equals(this.expiresAt, redemption.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rewardId, memberId, pointsBurned, redemptionCode, status, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Redemption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardId: ").append(toIndentedString(rewardId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    pointsBurned: ").append(toIndentedString(pointsBurned)).append("\n");
    sb.append("    redemptionCode: ").append(toIndentedString(redemptionCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
}

