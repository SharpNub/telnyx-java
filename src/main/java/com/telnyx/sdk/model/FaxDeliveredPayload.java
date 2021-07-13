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
 * FaxDeliveredPayload
 */
@JsonPropertyOrder({
  FaxDeliveredPayload.JSON_PROPERTY_CALL_DURATION_SECS,
  FaxDeliveredPayload.JSON_PROPERTY_CONNECTION_ID,
  FaxDeliveredPayload.JSON_PROPERTY_DIRECTION,
  FaxDeliveredPayload.JSON_PROPERTY_FAX_ID,
  FaxDeliveredPayload.JSON_PROPERTY_ORIGINAL_MEDIA_URL,
  FaxDeliveredPayload.JSON_PROPERTY_TO,
  FaxDeliveredPayload.JSON_PROPERTY_FROM,
  FaxDeliveredPayload.JSON_PROPERTY_USER_ID,
  FaxDeliveredPayload.JSON_PROPERTY_PAGE_COUNT,
  FaxDeliveredPayload.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FaxDeliveredPayload {
  public static final String JSON_PROPERTY_CALL_DURATION_SECS = "call_duration_secs";
  private Integer callDurationSecs;

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

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_PAGE_COUNT = "page_count";
  private Integer pageCount;

  /**
   * The status of the fax.
   */
  public enum StatusEnum {
    DELIVERED("delivered");

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


  public FaxDeliveredPayload callDurationSecs(Integer callDurationSecs) {
    this.callDurationSecs = callDurationSecs;
    return this;
  }

   /**
   * The duration of the call in seconds.
   * @return callDurationSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "The duration of the call in seconds.")
  @JsonProperty(JSON_PROPERTY_CALL_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCallDurationSecs() {
    return callDurationSecs;
  }


  public void setCallDurationSecs(Integer callDurationSecs) {
    this.callDurationSecs = callDurationSecs;
  }


  public FaxDeliveredPayload connectionId(String connectionId) {
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


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public FaxDeliveredPayload direction(DirectionEnum direction) {
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


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public FaxDeliveredPayload faxId(UUID faxId) {
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


  public void setFaxId(UUID faxId) {
    this.faxId = faxId;
  }


  public FaxDeliveredPayload originalMediaUrl(String originalMediaUrl) {
    this.originalMediaUrl = originalMediaUrl;
    return this;
  }

   /**
   * The original URL to the PDF used for the fax&#39;s media.
   * @return originalMediaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf", value = "The original URL to the PDF used for the fax's media.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalMediaUrl() {
    return originalMediaUrl;
  }


  public void setOriginalMediaUrl(String originalMediaUrl) {
    this.originalMediaUrl = originalMediaUrl;
  }


  public FaxDeliveredPayload to(String to) {
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


  public void setTo(String to) {
    this.to = to;
  }


  public FaxDeliveredPayload from(String from) {
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


  public void setFrom(String from) {
    this.from = from;
  }


  public FaxDeliveredPayload userId(UUID userId) {
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


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public FaxDeliveredPayload pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Number of transferred pages
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Number of transferred pages")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public FaxDeliveredPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the fax.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "delivered", value = "The status of the fax.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this FaxDelivered_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxDeliveredPayload faxDeliveredPayload = (FaxDeliveredPayload) o;
    return Objects.equals(this.callDurationSecs, faxDeliveredPayload.callDurationSecs) &&
        Objects.equals(this.connectionId, faxDeliveredPayload.connectionId) &&
        Objects.equals(this.direction, faxDeliveredPayload.direction) &&
        Objects.equals(this.faxId, faxDeliveredPayload.faxId) &&
        Objects.equals(this.originalMediaUrl, faxDeliveredPayload.originalMediaUrl) &&
        Objects.equals(this.to, faxDeliveredPayload.to) &&
        Objects.equals(this.from, faxDeliveredPayload.from) &&
        Objects.equals(this.userId, faxDeliveredPayload.userId) &&
        Objects.equals(this.pageCount, faxDeliveredPayload.pageCount) &&
        Objects.equals(this.status, faxDeliveredPayload.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callDurationSecs, connectionId, direction, faxId, originalMediaUrl, to, from, userId, pageCount, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxDeliveredPayload {\n");
    sb.append("    callDurationSecs: ").append(toIndentedString(callDurationSecs)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    faxId: ").append(toIndentedString(faxId)).append("\n");
    sb.append("    originalMediaUrl: ").append(toIndentedString(originalMediaUrl)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
