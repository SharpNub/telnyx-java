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
import java.util.ArrayList;
import java.util.List;
/**
 * ConferenceUnholdRequest
 */


public class ConferenceUnholdRequest {
  @SerializedName("call_control_ids")
  private List<String> callControlIds = new ArrayList<>();

  public ConferenceUnholdRequest callControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
    return this;
  }

  public ConferenceUnholdRequest addCallControlIdsItem(String callControlIdsItem) {
    this.callControlIds.add(callControlIdsItem);
    return this;
  }

   /**
   * List of unique identifiers and tokens for controlling the call. Enter each call control ID to be unheld.
   * @return callControlIds
  **/
  @Schema(required = true, description = "List of unique identifiers and tokens for controlling the call. Enter each call control ID to be unheld.")
  public List<String> getCallControlIds() {
    return callControlIds;
  }

  public void setCallControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceUnholdRequest conferenceUnholdRequest = (ConferenceUnholdRequest) o;
    return Objects.equals(this.callControlIds, conferenceUnholdRequest.callControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceUnholdRequest {\n");
    
    sb.append("    callControlIds: ").append(toIndentedString(callControlIds)).append("\n");
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
