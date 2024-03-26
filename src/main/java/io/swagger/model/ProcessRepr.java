package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Process Repr
 */
@Schema(description = "Process Repr")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-26T17:48:51.033314Z[Etc/UTC]")


public class ProcessRepr   {
  @JsonProperty("processInstanceKey")
  private Integer processInstanceKey = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("state")
  private String state = null;

  public ProcessRepr processInstanceKey(Integer processInstanceKey) {
    this.processInstanceKey = processInstanceKey;
    return this;
  }

  /**
   * Process Instance Key.
   * @return processInstanceKey
   **/
  @Schema(example = "0", required = true, description = "Process Instance Key.")
      @NotNull

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
   **/
  @Schema(example = "2023-10-12T08:38:44.041Z", required = true, description = "Start date of the process instance.")
      @NotNull

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
   **/
  @Schema(example = "2023-10-12T08:38:44.041Z", required = true, description = "End date of the process instance.")
      @NotNull

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
   **/
  @Schema(example = "ACTIVE", required = true, description = "State of the process instance.")
      @NotNull

    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
