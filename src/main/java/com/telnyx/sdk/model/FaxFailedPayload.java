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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * FaxFailedPayload
 */
@JsonPropertyOrder({
  FaxFailedPayload.JSON_PROPERTY_CONNECTION_ID,
  FaxFailedPayload.JSON_PROPERTY_DIRECTION,
  FaxFailedPayload.JSON_PROPERTY_FAX_ID,
  FaxFailedPayload.JSON_PROPERTY_ORIGINAL_MEDIA_URL,
  FaxFailedPayload.JSON_PROPERTY_MEDIA_NAME,
  FaxFailedPayload.JSON_PROPERTY_TO,
  FaxFailedPayload.JSON_PROPERTY_FROM,
  FaxFailedPayload.JSON_PROPERTY_USER_ID,
  FaxFailedPayload.JSON_PROPERTY_FAILURE_REASON,
  FaxFailedPayload.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FaxFailedPayload {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  /**
   * The direction of the fax.
   */
  public enum DirectionEnum {
    INBOUND("inbound"),
    
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_FAX_ID = "fax_id";
  private UUID faxId;

  public static final String JSON_PROPERTY_ORIGINAL_MEDIA_URL = "original_media_url";
  private String originalMediaUrl;

  public static final String JSON_PROPERTY_MEDIA_NAME = "media_name";
  private String mediaName;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  /**
   * Cause of the sending failure
   */
  public enum FailureReasonEnum {
    REJECTED("rejected");

    private String value;

    FailureReasonEnum(String value) {
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
    public static FailureReasonEnum fromValue(String value) {
      for (FailureReasonEnum b : FailureReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FAILURE_REASON = "failure_reason";
  private FailureReasonEnum failureReason;

  /**
   * The status of the fax.
   */
  public enum StatusEnum {
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public FaxFailedPayload() { 
  }

  public FaxFailedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The ID of the connection that was used to send the fax.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234423", value = "The ID of the connection that was used to send the fax.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public FaxFailedPayload direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the fax.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound", value = "The direction of the fax.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public FaxFailedPayload faxId(UUID faxId) {
    this.faxId = faxId;
    return this;
  }

   /**
   * Identifies the fax.
   * @return faxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "Identifies the fax.")
  @JsonProperty(JSON_PROPERTY_FAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getFaxId() {
    return faxId;
  }


  @JsonProperty(JSON_PROPERTY_FAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaxId(UUID faxId) {
    this.faxId = faxId;
  }


  public FaxFailedPayload originalMediaUrl(String originalMediaUrl) {
    this.originalMediaUrl = originalMediaUrl;
    return this;
  }

   /**
   * The original URL to the PDF used for the fax&#39;s media. If media_name was supplied, this is omitted
   * @return originalMediaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf", value = "The original URL to the PDF used for the fax's media. If media_name was supplied, this is omitted")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalMediaUrl() {
    return originalMediaUrl;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalMediaUrl(String originalMediaUrl) {
    this.originalMediaUrl = originalMediaUrl;
  }


  public FaxFailedPayload mediaName(String mediaName) {
    this.mediaName = mediaName;
    return this;
  }

   /**
   * The media_name used for the fax&#39;s media. Must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization
   * @return mediaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_media_uploaded_to_media_storage_api", value = "The media_name used for the fax's media. Must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization")
  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaName() {
    return mediaName;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }


  public FaxFailedPayload to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The phone number, in E.164 format, the fax will be sent to or SIP URI
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13127367276", value = "The phone number, in E.164 format, the fax will be sent to or SIP URI")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(String to) {
    this.to = to;
  }


  public FaxFailedPayload from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The phone number, in E.164 format, the fax will be sent from.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13125790015", value = "The phone number, in E.164 format, the fax will be sent from.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(String from) {
    this.from = from;
  }


  public FaxFailedPayload userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identifier of the user to whom the fax belongs
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the user to whom the fax belongs")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public FaxFailedPayload failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Cause of the sending failure
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cause of the sending failure")
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }


  public FaxFailedPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the fax.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "failed", value = "The status of the fax.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this FaxFailed_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxFailedPayload faxFailedPayload = (FaxFailedPayload) o;
    return Objects.equals(this.connectionId, faxFailedPayload.connectionId) &&
        Objects.equals(this.direction, faxFailedPayload.direction) &&
        Objects.equals(this.faxId, faxFailedPayload.faxId) &&
        Objects.equals(this.originalMediaUrl, faxFailedPayload.originalMediaUrl) &&
        Objects.equals(this.mediaName, faxFailedPayload.mediaName) &&
        Objects.equals(this.to, faxFailedPayload.to) &&
        Objects.equals(this.from, faxFailedPayload.from) &&
        Objects.equals(this.userId, faxFailedPayload.userId) &&
        Objects.equals(this.failureReason, faxFailedPayload.failureReason) &&
        Objects.equals(this.status, faxFailedPayload.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, direction, faxId, originalMediaUrl, mediaName, to, from, userId, failureReason, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxFailedPayload {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    faxId: ").append(toIndentedString(faxId)).append("\n");
    sb.append("    originalMediaUrl: ").append(toIndentedString(originalMediaUrl)).append("\n");
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

