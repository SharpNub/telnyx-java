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
 * Call
 */


public class Call {
  /**
   * Gets or Sets recordType
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    CALL("call");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RecordTypeEnum fromValue(String text) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecordTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("record_type")
  private RecordTypeEnum recordType = null;

  @SerializedName("call_session_id")
  private String callSessionId = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_control_id")
  private String callControlId = null;

  @SerializedName("is_alive")
  private Boolean isAlive = null;

  public Call recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(example = "call", required = true, description = "")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  public Call callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events
   * @return callSessionId
  **/
  @Schema(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", required = true, description = "ID that is unique to the call session and can be used to correlate webhook events")
  public String getCallSessionId() {
    return callSessionId;
  }

  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }

  public Call callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events
   * @return callLegId
  **/
  @Schema(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", required = true, description = "ID that is unique to the call and can be used to correlate webhook events")
  public String getCallLegId() {
    return callLegId;
  }

  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }

  public Call callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Unique identifier and token for controlling the call. For Dial command it will always be &#x60;null&#x60; (dialing is asynchronous).
   * @return callControlId
  **/
  @Schema(example = "AgDIxmoRX6QMuaIj_uXRXnPAXP0QlNfXczRrZvZakpWxBlpw48KyZQ==", required = true, description = "Unique identifier and token for controlling the call. For Dial command it will always be `null` (dialing is asynchronous).")
  public String getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }

  public Call isAlive(Boolean isAlive) {
    this.isAlive = isAlive;
    return this;
  }

   /**
   * Indicates whether the call is alive or not. For Dial command it will always be &#x60;false&#x60; (dialing is asynchronous).
   * @return isAlive
  **/
  @Schema(example = "true", required = true, description = "Indicates whether the call is alive or not. For Dial command it will always be `false` (dialing is asynchronous).")
  public Boolean isIsAlive() {
    return isAlive;
  }

  public void setIsAlive(Boolean isAlive) {
    this.isAlive = isAlive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(this.recordType, call.recordType) &&
        Objects.equals(this.callSessionId, call.callSessionId) &&
        Objects.equals(this.callLegId, call.callLegId) &&
        Objects.equals(this.callControlId, call.callControlId) &&
        Objects.equals(this.isAlive, call.isAlive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, callSessionId, callLegId, callControlId, isAlive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    isAlive: ").append(toIndentedString(isAlive)).append("\n");
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
