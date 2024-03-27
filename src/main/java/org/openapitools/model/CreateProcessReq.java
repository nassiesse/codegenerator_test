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
 * Create Process Req
 */

@Schema(name = "CreateProcessReq", description = "Create Process Req")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T08:27:02.169404Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateProcessReq {

  private String bpmnProcessId;

  private Integer version;

  @Valid
  private List<@Valid VariableReq> variables = new ArrayList<>();

  public CreateProcessReq() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateProcessReq(String bpmnProcessId, List<@Valid VariableReq> variables) {
    this.bpmnProcessId = bpmnProcessId;
    this.variables = variables;
  }

  public CreateProcessReq bpmnProcessId(String bpmnProcessId) {
    this.bpmnProcessId = bpmnProcessId;
    return this;
  }

  /**
   * BPMN process identifier.
   * @return bpmnProcessId
  */
  @NotNull 
  @Schema(name = "bpmnProcessId", example = "string", description = "BPMN process identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bpmnProcessId")
  public String getBpmnProcessId() {
    return bpmnProcessId;
  }

  public void setBpmnProcessId(String bpmnProcessId) {
    this.bpmnProcessId = bpmnProcessId;
  }

  public CreateProcessReq version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the BPMN process.
   * @return version
  */
  
  @Schema(name = "version", example = "0", description = "Version of the BPMN process.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CreateProcessReq variables(List<@Valid VariableReq> variables) {
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
    CreateProcessReq createProcessReq = (CreateProcessReq) o;
    return Objects.equals(this.bpmnProcessId, createProcessReq.bpmnProcessId) &&
        Objects.equals(this.version, createProcessReq.version) &&
        Objects.equals(this.variables, createProcessReq.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpmnProcessId, version, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProcessReq {\n");
    sb.append("    bpmnProcessId: ").append(toIndentedString(bpmnProcessId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

