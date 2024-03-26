package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Create Process Repr
 */
@Schema(description = "Create Process Repr")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T18:23:40.844777Z[Etc/UTC]")


public class CreateProcessRepr   {
  @JsonProperty("processInstanceKey")
  private Long processInstanceKey = null;

  public CreateProcessRepr processInstanceKey(Long processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
    return this;
  }

  /**
   * Process Instance Identifier.
   * @return processInstanceKey
   **/
  @Schema(required = true, description = "Process Instance Identifier.")
      @NotNull

    public Long getProcessInstanceKey() {
    return processInstanceKey;
  }

  public void setProcessInstanceKey(Long processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProcessRepr createProcessRepr = (CreateProcessRepr) o;
    return Objects.equals(this.processInstanceKey, createProcessRepr.processInstanceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProcessRepr {\n");
    
    sb.append("    processInstanceKey: ").append(toIndentedString(processInstanceKey)).append("\n");
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
