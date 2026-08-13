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
 * PointTransaction
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")public class PointTransaction {

  private UUID id;

  private UUID memberId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    EARN("EARN"),
    
    BURN("BURN"),
    
    EXPIRY("EXPIRY"),
    
    ADJUSTMENT("ADJUSTMENT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private TypeEnum type;

  private Integer points;

  private String source;

  private Integer balanceAfter;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occurredAt;

  public PointTransaction id(UUID id) {
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

  public PointTransaction memberId(UUID memberId) {
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

  public PointTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
    @Schema(name = "type", example = "EARN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PointTransaction points(Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Positive for earn, negative for burn or expiry
   * @return points
  */
    @Schema(name = "points", example = "350", description = "Positive for earn, negative for burn or expiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public PointTransaction source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
    @Schema(name = "source", example = "ORDER:ORD-2026-0001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PointTransaction balanceAfter(Integer balanceAfter) {
    this.balanceAfter = balanceAfter;
    return this;
  }

  /**
   * Get balanceAfter
   * @return balanceAfter
  */
    @Schema(name = "balanceAfter", example = "12450", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceAfter")
  public Integer getBalanceAfter() {
    return balanceAfter;
  }

  public void setBalanceAfter(Integer balanceAfter) {
    this.balanceAfter = balanceAfter;
  }

  public PointTransaction occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Get occurredAt
   * @return occurredAt
  */
  @Valid   @Schema(name = "occurredAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurredAt")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointTransaction pointTransaction = (PointTransaction) o;
    return Objects.equals(this.id, pointTransaction.id) &&
        Objects.equals(this.memberId, pointTransaction.memberId) &&
        Objects.equals(this.type, pointTransaction.type) &&
        Objects.equals(this.points, pointTransaction.points) &&
        Objects.equals(this.source, pointTransaction.source) &&
        Objects.equals(this.balanceAfter, pointTransaction.balanceAfter) &&
        Objects.equals(this.occurredAt, pointTransaction.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, memberId, type, points, source, balanceAfter, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    balanceAfter: ").append(toIndentedString(balanceAfter)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
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

