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
 * Process Variable
 */

@Schema(name = "VariableReq", description = "Process Variable")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T08:27:02.169404Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VariableReq {

  private String name;

  private String value;

  public VariableReq() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VariableReq(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public VariableReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the variable.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "string", description = "Name of the variable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VariableReq value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the variable.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "string", description = "Value of the variable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableReq variableReq = (VariableReq) o;
    return Objects.equals(this.name, variableReq.name) &&
        Objects.equals(this.value, variableReq.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableReq {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

