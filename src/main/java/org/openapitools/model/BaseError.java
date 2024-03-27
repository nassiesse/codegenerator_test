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
 * Represents the generic error response to the client.
 */

@Schema(name = "BaseError", description = "Represents the generic error response to the client.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T08:27:02.169404Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BaseError {

  private String code;

  private String message;

  public BaseError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The error code.
   * @return code
  */
  
  @Schema(name = "code", description = "The error code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BaseError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
  */
  
  @Schema(name = "message", example = "Error Message", description = "Error message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseError baseError = (BaseError) o;
    return Objects.equals(this.code, baseError.code) &&
        Objects.equals(this.message, baseError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

