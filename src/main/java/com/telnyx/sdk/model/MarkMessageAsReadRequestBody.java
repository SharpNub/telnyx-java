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
 * MarkMessageAsReadRequestBody
 */
@JsonPropertyOrder({
  MarkMessageAsReadRequestBody.JSON_PROPERTY_WHATSAPP_USER_ID,
  MarkMessageAsReadRequestBody.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarkMessageAsReadRequestBody {
  public static final String JSON_PROPERTY_WHATSAPP_USER_ID = "whatsapp_user_id";
  private String whatsappUserId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status = "read";

  public MarkMessageAsReadRequestBody() { 
  }

  public MarkMessageAsReadRequestBody whatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
    return this;
  }

   /**
   * The user&#39;s WhatsApp ID.
   * @return whatsappUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15125551212", required = true, value = "The user's WhatsApp ID.")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWhatsappUserId() {
    return whatsappUserId;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWhatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
  }


  public MarkMessageAsReadRequestBody status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this MarkMessageAsReadRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkMessageAsReadRequestBody markMessageAsReadRequestBody = (MarkMessageAsReadRequestBody) o;
    return Objects.equals(this.whatsappUserId, markMessageAsReadRequestBody.whatsappUserId) &&
        Objects.equals(this.status, markMessageAsReadRequestBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsappUserId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkMessageAsReadRequestBody {\n");
    sb.append("    whatsappUserId: ").append(toIndentedString(whatsappUserId)).append("\n");
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

