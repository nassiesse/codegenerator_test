package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * Represents response to client for request validation errors.
 */
@Schema(description = "Represents response to client for request validation errors.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T17:53:54.587113Z[Etc/UTC]")
@JacksonXmlRootElement(localName = "ValidationRepr")
@XmlRootElement(name = "ValidationRepr")
@XmlAccessorType(XmlAccessType.FIELD)

public class ValidationRepr   {
  @JsonProperty("fieldName")
  @JacksonXmlProperty(localName = "fieldName")
  private String fieldName = null;

  @JsonProperty("fieldValue")
  @JacksonXmlProperty(localName = "fieldValue")
  private String fieldValue = null;

  @JsonProperty("errorDescription")
  @JacksonXmlProperty(localName = "errorDescription")
  private String errorDescription = null;

  public ValidationRepr fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field name
   * @return fieldName
   **/
  @Schema(example = "string", description = "Field name")
  
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
   **/
  @Schema(example = "string", description = "Field value")
  
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
   **/
  @Schema(example = "string", description = "Error description")
  
    public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
