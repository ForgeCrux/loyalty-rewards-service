package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Reward
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")public class Reward {

  private UUID id;

  private String name;

  private String description;

  private Integer pointCost;

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    CREDIT("CREDIT"),
    
    MERCHANDISE("MERCHANDISE"),
    
    EXPERIENCE("EXPERIENCE"),
    
    DONATION("DONATION");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CategoryEnum category;

  private Boolean available;

  public Reward id(UUID id) {
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

  public Reward name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
    @Schema(name = "name", example = "10 USD store credit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Reward description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "Applies as a discount on your next order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Reward pointCost(Integer pointCost) {
    this.pointCost = pointCost;
    return this;
  }

  /**
   * Get pointCost
   * @return pointCost
  */
    @Schema(name = "pointCost", example = "1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointCost")
  public Integer getPointCost() {
    return pointCost;
  }

  public void setPointCost(Integer pointCost) {
    this.pointCost = pointCost;
  }

  public Reward category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
    @Schema(name = "category", example = "CREDIT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Reward available(Boolean available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  */
    @Schema(name = "available", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reward reward = (Reward) o;
    return Objects.equals(this.id, reward.id) &&
        Objects.equals(this.name, reward.name) &&
        Objects.equals(this.description, reward.description) &&
        Objects.equals(this.pointCost, reward.pointCost) &&
        Objects.equals(this.category, reward.category) &&
        Objects.equals(this.available, reward.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, pointCost, category, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reward {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pointCost: ").append(toIndentedString(pointCost)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

