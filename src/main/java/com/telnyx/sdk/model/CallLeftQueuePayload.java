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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallLeftQueuePayload
 */
@JsonPropertyOrder({
  CallLeftQueuePayload.JSON_PROPERTY_CALL_CONTROL_ID,
  CallLeftQueuePayload.JSON_PROPERTY_CONNECTION_ID,
  CallLeftQueuePayload.JSON_PROPERTY_CALL_LEG_ID,
  CallLeftQueuePayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallLeftQueuePayload.JSON_PROPERTY_CLIENT_STATE,
  CallLeftQueuePayload.JSON_PROPERTY_QUEUE,
  CallLeftQueuePayload.JSON_PROPERTY_REASON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallLeftQueuePayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_QUEUE = "queue";
  private String queue;

  /**
   * The reason for leaving the queue
   */
  public enum ReasonEnum {
    BRIDGED("bridged"),
    
    BRIDGING_IN_PROCESS("bridging-in-process"),
    
    HANGUP("hangup"),
    
    LEAVE("leave"),
    
    TIMEOUT("timeout");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;


  public CallLeftQueuePayload callControlId(String callControlId) {
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


  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public CallLeftQueuePayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Telnyx connection ID used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public CallLeftQueuePayload callLegId(String callLegId) {
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


  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallLeftQueuePayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSessionId() {
    return callSessionId;
  }


  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallLeftQueuePayload clientState(String clientState) {
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


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public CallLeftQueuePayload queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * The name of the queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support", value = "The name of the queue")
  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQueue() {
    return queue;
  }


  public void setQueue(String queue) {
    this.queue = queue;
  }


  public CallLeftQueuePayload reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for leaving the queue
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bridged", value = "The reason for leaving the queue")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  /**
   * Return true if this CallLeftQueue_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallLeftQueuePayload callLeftQueuePayload = (CallLeftQueuePayload) o;
    return Objects.equals(this.callControlId, callLeftQueuePayload.callControlId) &&
        Objects.equals(this.connectionId, callLeftQueuePayload.connectionId) &&
        Objects.equals(this.callLegId, callLeftQueuePayload.callLegId) &&
        Objects.equals(this.callSessionId, callLeftQueuePayload.callSessionId) &&
        Objects.equals(this.clientState, callLeftQueuePayload.clientState) &&
        Objects.equals(this.queue, callLeftQueuePayload.queue) &&
        Objects.equals(this.reason, callLeftQueuePayload.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, queue, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallLeftQueuePayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
