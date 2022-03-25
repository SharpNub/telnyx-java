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
import com.telnyx.sdk.model.SIMCardGroupDataLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SIMCardGroupCreate
 */
@JsonPropertyOrder({
  SIMCardGroupCreate.JSON_PROPERTY_NAME,
  SIMCardGroupCreate.JSON_PROPERTY_DATA_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SIMCardGroupCreate {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATA_LIMIT = "data_limit";
  private SIMCardGroupDataLimit dataLimit;

  public SIMCardGroupCreate() { 
  }

  public SIMCardGroupCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user friendly name for the SIM card group.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My Test Group", required = true, value = "A user friendly name for the SIM card group.")
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


  public SIMCardGroupCreate dataLimit(SIMCardGroupDataLimit dataLimit) {
    this.dataLimit = dataLimit;
    return this;
  }

   /**
   * Get dataLimit
   * @return dataLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SIMCardGroupDataLimit getDataLimit() {
    return dataLimit;
  }


  @JsonProperty(JSON_PROPERTY_DATA_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataLimit(SIMCardGroupDataLimit dataLimit) {
    this.dataLimit = dataLimit;
  }


  /**
   * Return true if this SIMCardGroupCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIMCardGroupCreate siMCardGroupCreate = (SIMCardGroupCreate) o;
    return Objects.equals(this.name, siMCardGroupCreate.name) &&
        Objects.equals(this.dataLimit, siMCardGroupCreate.dataLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIMCardGroupCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataLimit: ").append(toIndentedString(dataLimit)).append("\n");
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

