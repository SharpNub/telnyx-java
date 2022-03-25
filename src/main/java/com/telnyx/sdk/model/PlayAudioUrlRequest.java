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
import com.telnyx.sdk.model.Loopcount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PlayAudioUrlRequest
 */
@JsonPropertyOrder({
  PlayAudioUrlRequest.JSON_PROPERTY_AUDIO_URL,
  PlayAudioUrlRequest.JSON_PROPERTY_LOOP,
  PlayAudioUrlRequest.JSON_PROPERTY_OVERLAY,
  PlayAudioUrlRequest.JSON_PROPERTY_STOP,
  PlayAudioUrlRequest.JSON_PROPERTY_TARGET_LEGS,
  PlayAudioUrlRequest.JSON_PROPERTY_CLIENT_STATE,
  PlayAudioUrlRequest.JSON_PROPERTY_COMMAND_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayAudioUrlRequest {
  public static final String JSON_PROPERTY_AUDIO_URL = "audio_url";
  private String audioUrl;

  public static final String JSON_PROPERTY_LOOP = "loop";
  private Loopcount loop = null;

  public static final String JSON_PROPERTY_OVERLAY = "overlay";
  private Boolean overlay = false;

  public static final String JSON_PROPERTY_STOP = "stop";
  private String stop = "all";

  public static final String JSON_PROPERTY_TARGET_LEGS = "target_legs";
  private String targetLegs = "self";

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;


  public PlayAudioUrlRequest audioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * The URL of the file to be played back on the call. The URL can point to either a WAV or MP3 file.
   * @return audioUrl
  **/
  @ApiModelProperty(example = "http://www.example.com/sounds/greeting.wav", required = true, value = "The URL of the file to be played back on the call. The URL can point to either a WAV or MP3 file.")
  @JsonProperty(JSON_PROPERTY_AUDIO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAudioUrl() {
    return audioUrl;
  }


  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }


  public PlayAudioUrlRequest loop(Loopcount loop) {
    this.loop = loop;
    return this;
  }

   /**
   * Get loop
   * @return loop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Loopcount getLoop() {
    return loop;
  }


  public void setLoop(Loopcount loop) {
    this.loop = loop;
  }


  public PlayAudioUrlRequest overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * When enabled, audio will be mixed on top of any other audio that is actively being played back. Note that &#x60;overlay: true&#x60; will only work if there is another audio file already being played on the call.
   * @return overlay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When enabled, audio will be mixed on top of any other audio that is actively being played back. Note that `overlay: true` will only work if there is another audio file already being played on the call.")
  @JsonProperty(JSON_PROPERTY_OVERLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverlay() {
    return overlay;
  }


  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }


  public PlayAudioUrlRequest stop(String stop) {
    this.stop = stop;
    return this;
  }

   /**
   * When specified, it stops the current audio being played.  Specify &#x60;current&#x60; to stop the current audio being played, and to play the next file in the queue. Specify &#x60;all&#x60; to stop the current audio file being played and to also clear all audio files from the queue.
   * @return stop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "current", value = "When specified, it stops the current audio being played.  Specify `current` to stop the current audio being played, and to play the next file in the queue. Specify `all` to stop the current audio file being played and to also clear all audio files from the queue.")
  @JsonProperty(JSON_PROPERTY_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStop() {
    return stop;
  }


  public void setStop(String stop) {
    this.stop = stop;
  }


  public PlayAudioUrlRequest targetLegs(String targetLegs) {
    this.targetLegs = targetLegs;
    return this;
  }

   /**
   * Specifies the leg or legs on which audio will be played. If supplied, the value must be either &#x60;self&#x60;, &#x60;opposite&#x60; or &#x60;both&#x60;.
   * @return targetLegs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "self", value = "Specifies the leg or legs on which audio will be played. If supplied, the value must be either `self`, `opposite` or `both`.")
  @JsonProperty(JSON_PROPERTY_TARGET_LEGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetLegs() {
    return targetLegs;
  }


  public void setTargetLegs(String targetLegs) {
    this.targetLegs = targetLegs;
  }


  public PlayAudioUrlRequest clientState(String clientState) {
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


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public PlayAudioUrlRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore commands with the same `command_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Return true if this PlayAudioUrlRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayAudioUrlRequest playAudioUrlRequest = (PlayAudioUrlRequest) o;
    return Objects.equals(this.audioUrl, playAudioUrlRequest.audioUrl) &&
        Objects.equals(this.loop, playAudioUrlRequest.loop) &&
        Objects.equals(this.overlay, playAudioUrlRequest.overlay) &&
        Objects.equals(this.stop, playAudioUrlRequest.stop) &&
        Objects.equals(this.targetLegs, playAudioUrlRequest.targetLegs) &&
        Objects.equals(this.clientState, playAudioUrlRequest.clientState) &&
        Objects.equals(this.commandId, playAudioUrlRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioUrl, loop, overlay, stop, targetLegs, clientState, commandId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayAudioUrlRequest {\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    loop: ").append(toIndentedString(loop)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    targetLegs: ").append(toIndentedString(targetLegs)).append("\n");
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

