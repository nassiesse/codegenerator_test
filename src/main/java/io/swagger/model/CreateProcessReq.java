package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.VariableReq;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Create Process Req
 */
@Schema(description = "Create Process Req")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T17:48:51.033314Z[Etc/UTC]")


public class CreateProcessReq   {
  @JsonProperty("bpmnProcessId")
  private String bpmnProcessId = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("variables")
  @Valid
  private List<VariableReq> variables = new ArrayList<VariableReq>();

  public CreateProcessReq bpmnProcessId(String bpmnProcessId) {
    this.bpmnProcessId = bpmnProcessId;
    return this;
  }

  /**
   * BPMN process identifier.
   * @return bpmnProcessId
   **/
  @Schema(example = "string", required = true, description = "BPMN process identifier.")
      @NotNull

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
   **/
  @Schema(example = "0", description = "Version of the BPMN process.")
  
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CreateProcessReq variables(List<VariableReq> variables) {
    this.variables = variables;
    return this;
  }

  public CreateProcessReq addVariablesItem(VariableReq variablesItem) {
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * List of variables associated with the process.
   * @return variables
   **/
  @Schema(required = true, description = "List of variables associated with the process.")
      @NotNull
    @Valid
    public List<VariableReq> getVariables() {
    return variables;
  }

  public void setVariables(List<VariableReq> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
