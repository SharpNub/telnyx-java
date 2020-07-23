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
/**
 * GatherUsingAudioRequest
 */


public class GatherUsingAudioRequest {
  @SerializedName("audio_url")
  private String audioUrl = null;

  @SerializedName("invalid_audio_url")
  private String invalidAudioUrl = null;

  @SerializedName("minimum_digits")
  private Integer minimumDigits = 1;

  @SerializedName("maximum_digits")
  private Integer maximumDigits = 128;

  @SerializedName("maximum_tries")
  private Integer maximumTries = 3;

  @SerializedName("timeout_millis")
  private Integer timeoutMillis = 60000;

  @SerializedName("terminating_digit")
  private String terminatingDigit = "#";

  @SerializedName("valid_digits")
  private String validDigits = "0123456789#*";

  @SerializedName("inter_digit_timeout_millis")
  private Integer interDigitTimeoutMillis = 5000;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("command_id")
  private String commandId = null;

  public GatherUsingAudioRequest audioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * The URL of a file to be played back at the beginning of each prompt. The URL can point to either a WAV or MP3 file.
   * @return audioUrl
  **/
  @Schema(example = "http://example.com/message.wav", required = true, description = "The URL of a file to be played back at the beginning of each prompt. The URL can point to either a WAV or MP3 file.")
  public String getAudioUrl() {
    return audioUrl;
  }

  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }

  public GatherUsingAudioRequest invalidAudioUrl(String invalidAudioUrl) {
    this.invalidAudioUrl = invalidAudioUrl;
    return this;
  }

   /**
   * The URL of a file to play when digits don&#x27;t match the &#x60;valid_digits&#x60; parameter or the number of digits is not between &#x60;min&#x60; and &#x60;max&#x60;. The URL can point to either a WAV or MP3 file.
   * @return invalidAudioUrl
  **/
  @Schema(example = "http://example.com/invalid.wav", description = "The URL of a file to play when digits don't match the `valid_digits` parameter or the number of digits is not between `min` and `max`. The URL can point to either a WAV or MP3 file.")
  public String getInvalidAudioUrl() {
    return invalidAudioUrl;
  }

  public void setInvalidAudioUrl(String invalidAudioUrl) {
    this.invalidAudioUrl = invalidAudioUrl;
  }

  public GatherUsingAudioRequest minimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
    return this;
  }

   /**
   * The minimum number of digits to fetch. This parameter has a minimum value of 1.
   * @return minimumDigits
  **/
  @Schema(example = "1", description = "The minimum number of digits to fetch. This parameter has a minimum value of 1.")
  public Integer getMinimumDigits() {
    return minimumDigits;
  }

  public void setMinimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
  }

  public GatherUsingAudioRequest maximumDigits(Integer maximumDigits) {
    this.maximumDigits = maximumDigits;
    return this;
  }

   /**
   * The maximum number of digits to fetch. This parameter has a maximum value of 128.
   * @return maximumDigits
  **/
  @Schema(example = "10", description = "The maximum number of digits to fetch. This parameter has a maximum value of 128.")
  public Integer getMaximumDigits() {
    return maximumDigits;
  }

  public void setMaximumDigits(Integer maximumDigits) {
    this.maximumDigits = maximumDigits;
  }

  public GatherUsingAudioRequest maximumTries(Integer maximumTries) {
    this.maximumTries = maximumTries;
    return this;
  }

   /**
   * The maximum number of times the file should be played if there is no input from the user on the call.
   * @return maximumTries
  **/
  @Schema(example = "3", description = "The maximum number of times the file should be played if there is no input from the user on the call.")
  public Integer getMaximumTries() {
    return maximumTries;
  }

  public void setMaximumTries(Integer maximumTries) {
    this.maximumTries = maximumTries;
  }

  public GatherUsingAudioRequest timeoutMillis(Integer timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
    return this;
  }

   /**
   * The number of milliseconds to wait for a DTMF response after file playback ends before a replaying the sound file.
   * @return timeoutMillis
  **/
  @Schema(example = "60000", description = "The number of milliseconds to wait for a DTMF response after file playback ends before a replaying the sound file.")
  public Integer getTimeoutMillis() {
    return timeoutMillis;
  }

  public void setTimeoutMillis(Integer timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
  }

  public GatherUsingAudioRequest terminatingDigit(String terminatingDigit) {
    this.terminatingDigit = terminatingDigit;
    return this;
  }

   /**
   * The digit used to terminate input if fewer than &#x60;maximum_digits&#x60; digits have been gathered.
   * @return terminatingDigit
  **/
  @Schema(example = "#", description = "The digit used to terminate input if fewer than `maximum_digits` digits have been gathered.")
  public String getTerminatingDigit() {
    return terminatingDigit;
  }

  public void setTerminatingDigit(String terminatingDigit) {
    this.terminatingDigit = terminatingDigit;
  }

  public GatherUsingAudioRequest validDigits(String validDigits) {
    this.validDigits = validDigits;
    return this;
  }

   /**
   * A list of all digits accepted as valid.
   * @return validDigits
  **/
  @Schema(example = "123", description = "A list of all digits accepted as valid.")
  public String getValidDigits() {
    return validDigits;
  }

  public void setValidDigits(String validDigits) {
    this.validDigits = validDigits;
  }

  public GatherUsingAudioRequest interDigitTimeoutMillis(Integer interDigitTimeoutMillis) {
    this.interDigitTimeoutMillis = interDigitTimeoutMillis;
    return this;
  }

   /**
   * The number of milliseconds to wait for input between digits.
   * @return interDigitTimeoutMillis
  **/
  @Schema(example = "10000", description = "The number of milliseconds to wait for input between digits.")
  public Integer getInterDigitTimeoutMillis() {
    return interDigitTimeoutMillis;
  }

  public void setInterDigitTimeoutMillis(Integer interDigitTimeoutMillis) {
    this.interDigitTimeoutMillis = interDigitTimeoutMillis;
  }

  public GatherUsingAudioRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @Schema(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", description = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public GatherUsingAudioRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;.
   * @return commandId
  **/
  @Schema(example = "891510ac-f3e4-11e8-af5b-de00688a4901", description = "Use this field to avoid duplicate commands. Telnyx will ignore commands with the same `command_id`.")
  public String getCommandId() {
    return commandId;
  }

  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatherUsingAudioRequest gatherUsingAudioRequest = (GatherUsingAudioRequest) o;
    return Objects.equals(this.audioUrl, gatherUsingAudioRequest.audioUrl) &&
        Objects.equals(this.invalidAudioUrl, gatherUsingAudioRequest.invalidAudioUrl) &&
        Objects.equals(this.minimumDigits, gatherUsingAudioRequest.minimumDigits) &&
        Objects.equals(this.maximumDigits, gatherUsingAudioRequest.maximumDigits) &&
        Objects.equals(this.maximumTries, gatherUsingAudioRequest.maximumTries) &&
        Objects.equals(this.timeoutMillis, gatherUsingAudioRequest.timeoutMillis) &&
        Objects.equals(this.terminatingDigit, gatherUsingAudioRequest.terminatingDigit) &&
        Objects.equals(this.validDigits, gatherUsingAudioRequest.validDigits) &&
        Objects.equals(this.interDigitTimeoutMillis, gatherUsingAudioRequest.interDigitTimeoutMillis) &&
        Objects.equals(this.clientState, gatherUsingAudioRequest.clientState) &&
        Objects.equals(this.commandId, gatherUsingAudioRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioUrl, invalidAudioUrl, minimumDigits, maximumDigits, maximumTries, timeoutMillis, terminatingDigit, validDigits, interDigitTimeoutMillis, clientState, commandId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatherUsingAudioRequest {\n");
    
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    invalidAudioUrl: ").append(toIndentedString(invalidAudioUrl)).append("\n");
    sb.append("    minimumDigits: ").append(toIndentedString(minimumDigits)).append("\n");
    sb.append("    maximumDigits: ").append(toIndentedString(maximumDigits)).append("\n");
    sb.append("    maximumTries: ").append(toIndentedString(maximumTries)).append("\n");
    sb.append("    timeoutMillis: ").append(toIndentedString(timeoutMillis)).append("\n");
    sb.append("    terminatingDigit: ").append(toIndentedString(terminatingDigit)).append("\n");
    sb.append("    validDigits: ").append(toIndentedString(validDigits)).append("\n");
    sb.append("    interDigitTimeoutMillis: ").append(toIndentedString(interDigitTimeoutMillis)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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