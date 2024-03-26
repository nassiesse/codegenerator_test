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
 * Represents the generic error response to the client.
 */
@Schema(description = "Represents the generic error response to the client.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T17:53:54.587113Z[Etc/UTC]")
@JacksonXmlRootElement(localName = "BaseError")
@XmlRootElement(name = "BaseError")
@XmlAccessorType(XmlAccessType.FIELD)

public class BaseError   {
  @JsonProperty("code")
  @JacksonXmlProperty(localName = "code")
  private String code = null;

  @JsonProperty("message")
  @JacksonXmlProperty(localName = "message")
  private String message = null;

  public BaseError code(String code) {
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

  public BaseError message(String message) {
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


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
