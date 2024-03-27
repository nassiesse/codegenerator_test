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
 * Create Process Repr
 */

@Schema(name = "CreateProcessRepr", description = "Create Process Repr")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T08:27:02.169404Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateProcessRepr {

  private Long processInstanceKey;

  public CreateProcessRepr() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateProcessRepr(Long processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
  }

  public CreateProcessRepr processInstanceKey(Long processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
    return this;
  }

  /**
   * Process Instance Identifier.
   * @return processInstanceKey
  */
  @NotNull 
  @Schema(name = "processInstanceKey", description = "Process Instance Identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("processInstanceKey")
  public Long getProcessInstanceKey() {
    return processInstanceKey;
  }

  public void setProcessInstanceKey(Long processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

