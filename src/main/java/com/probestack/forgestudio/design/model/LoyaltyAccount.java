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
 * LoyaltyAccount
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")public class LoyaltyAccount {

  private UUID memberId;

  private Integer pointBalance;

  private Integer lifetimePoints;

  /**
   * Gets or Sets tier
   */
  public enum TierEnum {
    BRONZE("BRONZE"),
    
    SILVER("SILVER"),
    
    GOLD("GOLD"),
    
    PLATINUM("PLATINUM");

    private String value;

    TierEnum(String value) {
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
    public static TierEnum fromValue(String value) {
      for (TierEnum b : TierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private TierEnum tier;

  private Integer pointsToNextTier;

  private Boolean autoRedeem;

  private Boolean emailUpdates;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime enrolledAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public LoyaltyAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoyaltyAccount(UUID memberId, Integer pointBalance, TierEnum tier) {
    this.memberId = memberId;
    this.pointBalance = pointBalance;
    this.tier = tier;
  }

  public LoyaltyAccount memberId(UUID memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  */
  @NotNull @Valid   @Schema(name = "memberId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("memberId")
  public UUID getMemberId() {
    return memberId;
  }

  public void setMemberId(UUID memberId) {
    this.memberId = memberId;
  }

  public LoyaltyAccount pointBalance(Integer pointBalance) {
    this.pointBalance = pointBalance;
    return this;
  }

  /**
   * Get pointBalance
   * @return pointBalance
  */
  @NotNull   @Schema(name = "pointBalance", example = "12450", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pointBalance")
  public Integer getPointBalance() {
    return pointBalance;
  }

  public void setPointBalance(Integer pointBalance) {
    this.pointBalance = pointBalance;
  }

  public LoyaltyAccount lifetimePoints(Integer lifetimePoints) {
    this.lifetimePoints = lifetimePoints;
    return this;
  }

  /**
   * Get lifetimePoints
   * @return lifetimePoints
  */
    @Schema(name = "lifetimePoints", example = "48200", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetimePoints")
  public Integer getLifetimePoints() {
    return lifetimePoints;
  }

  public void setLifetimePoints(Integer lifetimePoints) {
    this.lifetimePoints = lifetimePoints;
  }

  public LoyaltyAccount tier(TierEnum tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Get tier
   * @return tier
  */
  @NotNull   @Schema(name = "tier", example = "GOLD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tier")
  public TierEnum getTier() {
    return tier;
  }

  public void setTier(TierEnum tier) {
    this.tier = tier;
  }

  public LoyaltyAccount pointsToNextTier(Integer pointsToNextTier) {
    this.pointsToNextTier = pointsToNextTier;
    return this;
  }

  /**
   * Get pointsToNextTier
   * @return pointsToNextTier
  */
    @Schema(name = "pointsToNextTier", example = "2550", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointsToNextTier")
  public Integer getPointsToNextTier() {
    return pointsToNextTier;
  }

  public void setPointsToNextTier(Integer pointsToNextTier) {
    this.pointsToNextTier = pointsToNextTier;
  }

  public LoyaltyAccount autoRedeem(Boolean autoRedeem) {
    this.autoRedeem = autoRedeem;
    return this;
  }

  /**
   * Get autoRedeem
   * @return autoRedeem
  */
    @Schema(name = "autoRedeem", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRedeem")
  public Boolean getAutoRedeem() {
    return autoRedeem;
  }

  public void setAutoRedeem(Boolean autoRedeem) {
    this.autoRedeem = autoRedeem;
  }

  public LoyaltyAccount emailUpdates(Boolean emailUpdates) {
    this.emailUpdates = emailUpdates;
    return this;
  }

  /**
   * Get emailUpdates
   * @return emailUpdates
  */
    @Schema(name = "emailUpdates", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailUpdates")
  public Boolean getEmailUpdates() {
    return emailUpdates;
  }

  public void setEmailUpdates(Boolean emailUpdates) {
    this.emailUpdates = emailUpdates;
  }

  public LoyaltyAccount enrolledAt(OffsetDateTime enrolledAt) {
    this.enrolledAt = enrolledAt;
    return this;
  }

  /**
   * Get enrolledAt
   * @return enrolledAt
  */
  @Valid   @Schema(name = "enrolledAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enrolledAt")
  public OffsetDateTime getEnrolledAt() {
    return enrolledAt;
  }

  public void setEnrolledAt(OffsetDateTime enrolledAt) {
    this.enrolledAt = enrolledAt;
  }

  public LoyaltyAccount updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyAccount loyaltyAccount = (LoyaltyAccount) o;
    return Objects.equals(this.memberId, loyaltyAccount.memberId) &&
        Objects.equals(this.pointBalance, loyaltyAccount.pointBalance) &&
        Objects.equals(this.lifetimePoints, loyaltyAccount.lifetimePoints) &&
        Objects.equals(this.tier, loyaltyAccount.tier) &&
        Objects.equals(this.pointsToNextTier, loyaltyAccount.pointsToNextTier) &&
        Objects.equals(this.autoRedeem, loyaltyAccount.autoRedeem) &&
        Objects.equals(this.emailUpdates, loyaltyAccount.emailUpdates) &&
        Objects.equals(this.enrolledAt, loyaltyAccount.enrolledAt) &&
        Objects.equals(this.updatedAt, loyaltyAccount.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, pointBalance, lifetimePoints, tier, pointsToNextTier, autoRedeem, emailUpdates, enrolledAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyAccount {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    pointBalance: ").append(toIndentedString(pointBalance)).append("\n");
    sb.append("    lifetimePoints: ").append(toIndentedString(lifetimePoints)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    pointsToNextTier: ").append(toIndentedString(pointsToNextTier)).append("\n");
    sb.append("    autoRedeem: ").append(toIndentedString(autoRedeem)).append("\n");
    sb.append("    emailUpdates: ").append(toIndentedString(emailUpdates)).append("\n");
    sb.append("    enrolledAt: ").append(toIndentedString(enrolledAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

