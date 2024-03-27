package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VariableReq;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Complete User Task Req
 */

@Schema(name = "CompleteUserTaskReq", description = "Complete User Task Req")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T08:27:02.169404Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CompleteUserTaskReq {

  @Valid
  private List<@Valid VariableReq> variables = new ArrayList<>();

  public CompleteUserTaskReq() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CompleteUserTaskReq(List<@Valid VariableReq> variables) {
    this.variables = variables;
  }

  public CompleteUserTaskReq variables(List<@Valid VariableReq> variables) {
    this.variables = variables;
    return this;
  }

  /**
   * List of variables associated with the process.
   * @return variables
  */
  @NotNull @Valid 
  @Schema(name = "variables", description = "List of variables associated with the process.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("variables")
  public List<@Valid VariableReq> getVariables() {
    return variables;
  }

  public void setVariables(List<@Valid VariableReq> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteUserTaskReq completeUserTaskReq = (CompleteUserTaskReq) o;
    return Objects.equals(this.variables, completeUserTaskReq.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteUserTaskReq {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

