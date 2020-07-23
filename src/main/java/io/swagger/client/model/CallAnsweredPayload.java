/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * CallAnsweredPayload
 */


public class CallAnsweredPayload {
  @SerializedName("call_control_id")
  private UUID callControlId = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_session_id")
  private String callSessionId = null;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  /**
   * State received from a command.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ANSWERED("answered");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("state")
  private StateEnum state = null;

  public CallAnsweredPayload callControlId(UUID callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @Schema(description = "Call ID used to issue commands via Call Control API.")
  public UUID getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(UUID callControlId) {
    this.callControlId = callControlId;
  }

  public CallAnsweredPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @Schema(example = "7267xxxxxxxxxxxxxx", description = "Telnyx connection ID used in the call.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public CallAnsweredPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @Schema(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", description = "ID that is unique to the call and can be used to correlate webhook events.")
  public String getCallLegId() {
    return callLegId;
  }

  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }

  public CallAnsweredPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "ID that is unique to the call session and can be used to correlate webhook events.")
  public String getCallSessionId() {
    return callSessionId;
  }

  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }

  public CallAnsweredPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @Schema(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", description = "State received from a command.")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public CallAnsweredPayload from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Number or SIP URI placing the call.
   * @return from
  **/
  @Schema(example = "+35319605860", description = "Number or SIP URI placing the call.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public CallAnsweredPayload to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Destination number or SIP URI of the call.
   * @return to
  **/
  @Schema(example = "+13129457420", description = "Destination number or SIP URI of the call.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public CallAnsweredPayload state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State received from a command.
   * @return state
  **/
  @Schema(example = "answered", description = "State received from a command.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
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
    CallAnsweredPayload callAnsweredPayload = (CallAnsweredPayload) o;
    return Objects.equals(this.callControlId, callAnsweredPayload.callControlId) &&
        Objects.equals(this.connectionId, callAnsweredPayload.connectionId) &&
        Objects.equals(this.callLegId, callAnsweredPayload.callLegId) &&
        Objects.equals(this.callSessionId, callAnsweredPayload.callSessionId) &&
        Objects.equals(this.clientState, callAnsweredPayload.clientState) &&
        Objects.equals(this.from, callAnsweredPayload.from) &&
        Objects.equals(this.to, callAnsweredPayload.to) &&
        Objects.equals(this.state, callAnsweredPayload.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, from, to, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallAnsweredPayload {\n");
    
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
