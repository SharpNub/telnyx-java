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
import com.telnyx.sdk.model.RoomParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * RoomSession
 */
@JsonPropertyOrder({
  RoomSession.JSON_PROPERTY_ID,
  RoomSession.JSON_PROPERTY_ROOM_ID,
  RoomSession.JSON_PROPERTY_ACTIVE,
  RoomSession.JSON_PROPERTY_CREATED_AT,
  RoomSession.JSON_PROPERTY_UPDATED_AT,
  RoomSession.JSON_PROPERTY_ENDED_AT,
  RoomSession.JSON_PROPERTY_PARTICIPANTS,
  RoomSession.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoomSession {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ROOM_ID = "room_id";
  private UUID roomId;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private String endedAt;

  public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
  private List<RoomParticipant> participants = null;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public RoomSession() { 
  }

  public RoomSession id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the room session.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "A unique identifier for the room session.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public RoomSession roomId(UUID roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Identify the room hosting that room session.
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777b0", value = "Identify the room hosting that room session.")
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomId(UUID roomId) {
    this.roomId = roomId;
  }


  public RoomSession active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Shows if the room session is active or not.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Shows if the room session is active or not.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public RoomSession createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room session was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room session was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public RoomSession updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room session was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room session was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RoomSession endedAt(String endedAt) {
    this.endedAt = endedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room session has ended.
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room session has ended.")
  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndedAt() {
    return endedAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }


  public RoomSession participants(List<RoomParticipant> participants) {
    this.participants = participants;
    return this;
  }

  public RoomSession addParticipantsItem(RoomParticipant participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RoomParticipant> getParticipants() {
    return participants;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipants(List<RoomParticipant> participants) {
    this.participants = participants;
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "room_session", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  /**
   * Return true if this RoomSession object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomSession roomSession = (RoomSession) o;
    return Objects.equals(this.id, roomSession.id) &&
        Objects.equals(this.roomId, roomSession.roomId) &&
        Objects.equals(this.active, roomSession.active) &&
        Objects.equals(this.createdAt, roomSession.createdAt) &&
        Objects.equals(this.updatedAt, roomSession.updatedAt) &&
        Objects.equals(this.endedAt, roomSession.endedAt) &&
        Objects.equals(this.participants, roomSession.participants) &&
        Objects.equals(this.recordType, roomSession.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roomId, active, createdAt, updatedAt, endedAt, participants, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

