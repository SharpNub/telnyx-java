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
 * CallPlaybackStartedPayload
 */


public class CallPlaybackStartedPayload {
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

  @SerializedName("media_url")
  private String mediaUrl = null;

  @SerializedName("overlay")
  private Boolean overlay = null;

  public CallPlaybackStartedPayload callControlId(UUID callControlId) {
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

  public CallPlaybackStartedPayload connectionId(String connectionId) {
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

  public CallPlaybackStartedPayload callLegId(String callLegId) {
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

  public CallPlaybackStartedPayload callSessionId(String callSessionId) {
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

  public CallPlaybackStartedPayload clientState(String clientState) {
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

  public CallPlaybackStartedPayload mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The audio URL being played back.
   * @return mediaUrl
  **/
  @Schema(example = "http://example.com/audio.wav", description = "The audio URL being played back.")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public CallPlaybackStartedPayload overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * Whether the audio is going to be played in overlay mode or not.
   * @return overlay
  **/
  @Schema(example = "false", description = "Whether the audio is going to be played in overlay mode or not.")
  public Boolean isOverlay() {
    return overlay;
  }

  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallPlaybackStartedPayload callPlaybackStartedPayload = (CallPlaybackStartedPayload) o;
    return Objects.equals(this.callControlId, callPlaybackStartedPayload.callControlId) &&
        Objects.equals(this.connectionId, callPlaybackStartedPayload.connectionId) &&
        Objects.equals(this.callLegId, callPlaybackStartedPayload.callLegId) &&
        Objects.equals(this.callSessionId, callPlaybackStartedPayload.callSessionId) &&
        Objects.equals(this.clientState, callPlaybackStartedPayload.clientState) &&
        Objects.equals(this.mediaUrl, callPlaybackStartedPayload.mediaUrl) &&
        Objects.equals(this.overlay, callPlaybackStartedPayload.overlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, mediaUrl, overlay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallPlaybackStartedPayload {\n");
    
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
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
