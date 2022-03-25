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
 * CallEvent
 */
@JsonPropertyOrder({
  CallEvent.JSON_PROPERTY_RECORD_TYPE,
  CallEvent.JSON_PROPERTY_CALL_LEG_ID,
  CallEvent.JSON_PROPERTY_CALL_SESSION_ID,
  CallEvent.JSON_PROPERTY_EVENT_TIMESTAMP,
  CallEvent.JSON_PROPERTY_NAME,
  CallEvent.JSON_PROPERTY_TYPE,
  CallEvent.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallEvent {
  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    CALL_EVENT("call_event");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "event_timestamp";
  private String eventTimestamp;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Event type
   */
  public enum TypeEnum {
    COMMAND("command"),
    
    WEBHOOK("webhook");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public CallEvent() { 
  }

  public CallEvent recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "call_event", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public CallEvent callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * Uniquely identifies an individual call leg.
   * @return callLegId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "308fe500-5213-11e9-ace7-02420a0f0668", required = true, value = "Uniquely identifies an individual call leg.")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallLegId() {
    return callLegId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallEvent callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * Uniquely identifies the call control session. A session may include multiple call leg events.
   * @return callSessionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "308fec30-5213-11e9-9d3f-02420a0f0668", required = true, value = "Uniquely identifies the call control session. A session may include multiple call leg events.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallSessionId() {
    return callSessionId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallEvent eventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

   /**
   * Event timestamp
   * @return eventTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-03-29T11:10:19.127783Z", required = true, value = "Event timestamp")
  @JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventTimestamp() {
    return eventTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }


  public CallEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Event name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "call.hangup", required = true, value = "Event name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CallEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Event type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "webhook", required = true, value = "Event type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CallEvent metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Event metadata, which includes raw event, and extra information based on event type
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Event metadata, which includes raw event, and extra information based on event type")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this CallEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallEvent callEvent = (CallEvent) o;
    return Objects.equals(this.recordType, callEvent.recordType) &&
        Objects.equals(this.callLegId, callEvent.callLegId) &&
        Objects.equals(this.callSessionId, callEvent.callSessionId) &&
        Objects.equals(this.eventTimestamp, callEvent.eventTimestamp) &&
        Objects.equals(this.name, callEvent.name) &&
        Objects.equals(this.type, callEvent.type) &&
        Objects.equals(this.metadata, callEvent.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, callLegId, callSessionId, eventTimestamp, name, type, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallEvent {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

