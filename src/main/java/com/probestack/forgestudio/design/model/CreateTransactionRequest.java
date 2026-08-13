package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * CreateTransactionRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")
@Document(collection = "loyalty_rewards_service_transactions")
public class CreateTransactionRequest {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {

        EARN("EARN"), BURN("BURN"), ADJUSTMENT("ADJUSTMENT");

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

    private String note;

    public CreateTransactionRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CreateTransactionRequest(TypeEnum type, Integer points) {
        this.type = type;
        this.points = points;
    }

    public CreateTransactionRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "EARN", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateTransactionRequest points(Integer points) {
        this.points = points;
        return this;
    }

    /**
     * Get points
     * @return points
     */
    @NotNull
    @Schema(name = "points", example = "350", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public CreateTransactionRequest source(String source) {
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

    public CreateTransactionRequest note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     * @return note
     */
    @Schema(name = "note", example = "Points for August order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransactionRequest createTransactionRequest = (CreateTransactionRequest) o;
        return Objects.equals(this.type, createTransactionRequest.type) && Objects.equals(this.points, createTransactionRequest.points) && Objects.equals(this.source, createTransactionRequest.source) && Objects.equals(this.note, createTransactionRequest.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, points, source, note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransactionRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
