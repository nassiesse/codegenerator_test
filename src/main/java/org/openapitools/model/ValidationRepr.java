package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents response to client for request validation errors.
 */

@Schema(name = "ValidationRepr", description = "Represents response to client for request validation errors.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-26T18:27:28.478353Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ValidationRepr {

  private String fieldName;

  private String fieldValue;

  private String errorDescription;

  public ValidationRepr fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field name
   * @return fieldName
  */
  
  @Schema(name = "fieldName", example = "string", description = "Field name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ValidationRepr fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * Field value
   * @return fieldValue
  */
  
  @Schema(name = "fieldValue", example = "string", description = "Field value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldValue")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public ValidationRepr errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Error description
   * @return errorDescription
  */
  
  @Schema(name = "errorDescription", example = "string", description = "Error description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorDescription")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationRepr validationRepr = (ValidationRepr) o;
    return Objects.equals(this.fieldName, validationRepr.fieldName) &&
        Objects.equals(this.fieldValue, validationRepr.fieldValue) &&
        Objects.equals(this.errorDescription, validationRepr.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldValue, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationRepr {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

