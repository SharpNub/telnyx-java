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
 * InboundMessagePayloadFrom
 */
@JsonPropertyOrder({
  InboundMessagePayloadFrom.JSON_PROPERTY_PHONE_NUMBER,
  InboundMessagePayloadFrom.JSON_PROPERTY_STATUS,
  InboundMessagePayloadFrom.JSON_PROPERTY_CARRIER,
  InboundMessagePayloadFrom.JSON_PROPERTY_LINE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InboundMessagePayloadFrom {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RECEIVED("received"),
    
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

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  /**
   * The line-type of the sender.
   */
  public enum LineTypeEnum {
    WIRELINE("Wireline"),
    
    WIRELESS("Wireless"),
    
    VOWIFI("VoWiFi"),
    
    VOIP("VoIP"),
    
    PRE_PAID_WIRELESS("Pre-Paid Wireless"),
    
    EMPTY("");

    private String value;

    LineTypeEnum(String value) {
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
    public static LineTypeEnum fromValue(String value) {
      for (LineTypeEnum b : LineTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
  private LineTypeEnum lineType;


  public InboundMessagePayloadFrom phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public InboundMessagePayloadFrom status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public InboundMessagePayloadFrom carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The carrier of the sender.
   * @return carrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The carrier of the sender.")
  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrier() {
    return carrier;
  }


  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  public InboundMessagePayloadFrom lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * The line-type of the sender.
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The line-type of the sender.")
  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LineTypeEnum getLineType() {
    return lineType;
  }


  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }


  /**
   * Return true if this InboundMessagePayload_from object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessagePayloadFrom inboundMessagePayloadFrom = (InboundMessagePayloadFrom) o;
    return Objects.equals(this.phoneNumber, inboundMessagePayloadFrom.phoneNumber) &&
        Objects.equals(this.status, inboundMessagePayloadFrom.status) &&
        Objects.equals(this.carrier, inboundMessagePayloadFrom.carrier) &&
        Objects.equals(this.lineType, inboundMessagePayloadFrom.lineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, status, carrier, lineType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessagePayloadFrom {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
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

