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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The quality of the fax. The &#x60;ultra&#x60; settings provides the highest quality available, but also present longer fax processing times. &#x60;ultra_light&#x60; is best suited for images, wihle &#x60;ultra_dark&#x60; is best suited for text.
 */
public enum Quality {
  
  NORMAL("normal"),
  
  HIGH("high"),
  
  VERY_HIGH("very_high"),
  
  ULTRA_LIGHT("ultra_light"),
  
  ULTRA_DARK("ultra_dark");

  private String value;

  Quality(String value) {
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
  public static Quality fromValue(String value) {
    for (Quality b : Quality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
