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
 * PlaybackStopRequest
 */
@JsonPropertyOrder({
  PlaybackStopRequest.JSON_PROPERTY_OVERLAY,
  PlaybackStopRequest.JSON_PROPERTY_STOP,
  PlaybackStopRequest.JSON_PROPERTY_CLIENT_STATE,
  PlaybackStopRequest.JSON_PROPERTY_COMMAND_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlaybackStopRequest {
  public static final String JSON_PROPERTY_OVERLAY = "overlay";
  private Boolean overlay = false;

  public static final String JSON_PROPERTY_STOP = "stop";
  private String stop = "all";

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public PlaybackStopRequest() { 
  }

  public PlaybackStopRequest overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * When enabled, it stops the audio being played in the overlay queue.
   * @return overlay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When enabled, it stops the audio being played in the overlay queue.")
  @JsonProperty(JSON_PROPERTY_OVERLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverlay() {
    return overlay;
  }


  @JsonProperty(JSON_PROPERTY_OVERLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }


  public PlaybackStopRequest stop(String stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Use &#x60;current&#x60; to stop the current audio being played. Use &#x60;all&#x60; to stop the current audio file being played and clear all audio files from the queue.
   * @return stop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "current", value = "Use `current` to stop the current audio being played. Use `all` to stop the current audio file being played and clear all audio files from the queue.")
  @JsonProperty(JSON_PROPERTY_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStop() {
    return stop;
  }


  @JsonProperty(JSON_PROPERTY_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStop(String stop) {
    this.stop = stop;
  }


  public PlaybackStopRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
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


  public PlaybackStopRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Return true if this PlaybackStopRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackStopRequest playbackStopRequest = (PlaybackStopRequest) o;
    return Objects.equals(this.overlay, playbackStopRequest.overlay) &&
        Objects.equals(this.stop, playbackStopRequest.stop) &&
        Objects.equals(this.clientState, playbackStopRequest.clientState) &&
        Objects.equals(this.commandId, playbackStopRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overlay, stop, clientState, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackStopRequest {\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

