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
 * Complete User Task Req
 */
@Schema(description = "Complete User Task Req")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T18:21:54.895046Z[Etc/UTC]")


public class CompleteUserTaskReq   {
  @JsonProperty("variables")
  @Valid
  private List<VariableReq> variables = new ArrayList<VariableReq>();

  public CompleteUserTaskReq variables(List<VariableReq> variables) {
    this.variables = variables;
    return this;
  }

  public CompleteUserTaskReq addVariablesItem(VariableReq variablesItem) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}