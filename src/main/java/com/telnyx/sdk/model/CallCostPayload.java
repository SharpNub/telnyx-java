/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.CallCostPayloadCostParts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallCostPayload
 */
@JsonPropertyOrder({
  CallCostPayload.JSON_PROPERTY_BILLED_DURATION_SECS,
  CallCostPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  CallCostPayload.JSON_PROPERTY_CALL_LEG_ID,
  CallCostPayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallCostPayload.JSON_PROPERTY_CLIENT_STATE,
  CallCostPayload.JSON_PROPERTY_CONNECTION_ID,
  CallCostPayload.JSON_PROPERTY_COST_PARTS,
  CallCostPayload.JSON_PROPERTY_TOTAL_COST,
  CallCostPayload.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallCostPayload {
  public static final String JSON_PROPERTY_BILLED_DURATION_SECS = "billed_duration_secs";
  private Integer billedDurationSecs;

  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_COST_PARTS = "cost_parts";
  private List<CallCostPayloadCostParts> costParts = null;

  public static final String JSON_PROPERTY_TOTAL_COST = "total_cost";
  private BigDecimal totalCost;

  /**
   * Reflects how command ended.
   */
  public enum StatusEnum {
    VALID("valid"),
    
    INVALID("invalid"),
    
    CALL_HANGUP("call_hangup"),
    
    CANCELLED("cancelled"),
    
    CANCELLED_AMD("cancelled_amd");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public CallCostPayload() { 
  }

  public CallCostPayload billedDurationSecs(Integer billedDurationSecs) {
    this.billedDurationSecs = billedDurationSecs;
    return this;
  }

   /**
   * The number of seconds for which this call will be billed
   * minimum: 0
   * @return billedDurationSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The number of seconds for which this call will be billed")
  @JsonProperty(JSON_PROPERTY_BILLED_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBilledDurationSecs() {
    return billedDurationSecs;
  }


  @JsonProperty(JSON_PROPERTY_BILLED_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBilledDurationSecs(Integer billedDurationSecs) {
    this.billedDurationSecs = billedDurationSecs;
  }


  public CallCostPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ", value = "Call ID used to issue commands via Call Control API.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallControlId() {
    return callControlId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public CallCostPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", value = "ID that is unique to the call and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallLegId() {
    return callLegId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallCostPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
   * @return callSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSessionId() {
    return callSessionId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallCostPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "State received from a command.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public CallCostPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public CallCostPayload costParts(List<CallCostPayloadCostParts> costParts) {
    this.costParts = costParts;
    return this;
  }

  public CallCostPayload addCostPartsItem(CallCostPayloadCostParts costPartsItem) {
    if (this.costParts == null) {
      this.costParts = new ArrayList<>();
    }
    this.costParts.add(costPartsItem);
    return this;
  }

   /**
   * Get costParts
   * @return costParts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CallCostPayloadCostParts> getCostParts() {
    return costParts;
  }


  @JsonProperty(JSON_PROPERTY_COST_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostParts(List<CallCostPayloadCostParts> costParts) {
    this.costParts = costParts;
  }


  public CallCostPayload totalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * The billed cost of the call
   * minimum: 0.0
   * @return totalCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0", value = "The billed cost of the call")
  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalCost() {
    return totalCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
  }


  public CallCostPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Reflects how command ended.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "valid", value = "Reflects how command ended.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this CallCost_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallCostPayload callCostPayload = (CallCostPayload) o;
    return Objects.equals(this.billedDurationSecs, callCostPayload.billedDurationSecs) &&
        Objects.equals(this.callControlId, callCostPayload.callControlId) &&
        Objects.equals(this.callLegId, callCostPayload.callLegId) &&
        Objects.equals(this.callSessionId, callCostPayload.callSessionId) &&
        Objects.equals(this.clientState, callCostPayload.clientState) &&
        Objects.equals(this.connectionId, callCostPayload.connectionId) &&
        Objects.equals(this.costParts, callCostPayload.costParts) &&
        Objects.equals(this.totalCost, callCostPayload.totalCost) &&
        Objects.equals(this.status, callCostPayload.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billedDurationSecs, callControlId, callLegId, callSessionId, clientState, connectionId, costParts, totalCost, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallCostPayload {\n");
    sb.append("    billedDurationSecs: ").append(toIndentedString(billedDurationSecs)).append("\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    costParts: ").append(toIndentedString(costParts)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

