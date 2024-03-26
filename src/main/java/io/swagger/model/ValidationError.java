package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ValidationRepr;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents response to client for request validation errors.
 */
@Schema(description = "Represents response to client for request validation errors.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T17:48:51.033314Z[Etc/UTC]")


public class ValidationError   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("errors")
  @Valid
  private List<ValidationRepr> errors = null;

  public ValidationError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The error code.
   * @return code
   **/
  @Schema(description = "The error code.")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ValidationError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
   **/
  @Schema(example = "Error Message", description = "Error message")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationError errors(List<ValidationRepr> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationError addErrorsItem(ValidationRepr errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationRepr>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * List of validation errors
   * @return errors
   **/
  @Schema(description = "List of validation errors")
      @Valid
    public List<ValidationRepr> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationRepr> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.code, validationError.code) &&
        Objects.equals(this.message, validationError.message) &&
        Objects.equals(this.errors, validationError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
