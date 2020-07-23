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
 * StopForkingRequest
 */


public class StopForkingRequest {
  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("command_id")
  private String commandId = null;

  public StopForkingRequest clientState(String clientState) {
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

  public StopForkingRequest commandId(String commandId) {
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
    StopForkingRequest stopForkingRequest = (StopForkingRequest) o;
    return Objects.equals(this.clientState, stopForkingRequest.clientState) &&
        Objects.equals(this.commandId, stopForkingRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientState, commandId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopForkingRequest {\n");
    
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
