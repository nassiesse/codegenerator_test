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
 * Process Repr
 */

@Schema(name = "ProcessRepr", description = "Process Repr")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T08:27:02.169404Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProcessRepr {

  private Integer processInstanceKey;

  private String startDate;

  private String endDate;

  private String state;

  public ProcessRepr() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessRepr(Integer processInstanceKey, String startDate, String endDate, String state) {
    this.processInstanceKey = processInstanceKey;
    this.startDate = startDate;
    this.endDate = endDate;
    this.state = state;
  }

  public ProcessRepr processInstanceKey(Integer processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
    return this;
  }

  /**
   * Process Instance Key.
   * @return processInstanceKey
  */
  @NotNull 
  @Schema(name = "processInstanceKey", example = "0", description = "Process Instance Key.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("processInstanceKey")
  public Integer getProcessInstanceKey() {
    return processInstanceKey;
  }

  public void setProcessInstanceKey(Integer processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
  }

  public ProcessRepr startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the process instance.
   * @return startDate
  */
  @NotNull 
  @Schema(name = "startDate", example = "2023-10-12T08:38:44.041Z", description = "Start date of the process instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ProcessRepr endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the process instance.
   * @return endDate
  */
  @NotNull 
  @Schema(name = "endDate", example = "2023-10-12T08:38:44.041Z", description = "End date of the process instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endDate")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ProcessRepr state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of the process instance.
   * @return state
  */
  @NotNull 
  @Schema(name = "state", example = "ACTIVE", description = "State of the process instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRepr processRepr = (ProcessRepr) o;
    return Objects.equals(this.processInstanceKey, processRepr.processInstanceKey) &&
        Objects.equals(this.startDate, processRepr.startDate) &&
        Objects.equals(this.endDate, processRepr.endDate) &&
        Objects.equals(this.state, processRepr.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceKey, startDate, endDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRepr {\n");
    sb.append("    processInstanceKey: ").append(toIndentedString(processInstanceKey)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

