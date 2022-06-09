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
import com.telnyx.sdk.model.AccessControlIpIpAddressType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * AccessControlIpUpdate
 */
@JsonPropertyOrder({
  AccessControlIpUpdate.JSON_PROPERTY_IP_ADDRESS,
  AccessControlIpUpdate.JSON_PROPERTY_IP_ADDRESS_TYPE,
  AccessControlIpUpdate.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlIpUpdate {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_IP_ADDRESS_TYPE = "ip_address_type";
  private AccessControlIpIpAddressType ipAddressType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public AccessControlIpUpdate() { 
  }

  public AccessControlIpUpdate ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address for which you are saving an access control IP record. Must be a single IPv4 address. Cannot be a range of IP addresses or use CIDR notation.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.101.102.103", value = "The IP address for which you are saving an access control IP record. Must be a single IPv4 address. Cannot be a range of IP addresses or use CIDR notation.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public AccessControlIpUpdate ipAddressType(AccessControlIpIpAddressType ipAddressType) {
    this.ipAddressType = ipAddressType;
    return this;
  }

   /**
   * Get ipAddressType
   * @return ipAddressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessControlIpIpAddressType getIpAddressType() {
    return ipAddressType;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddressType(AccessControlIpIpAddressType ipAddressType) {
    this.ipAddressType = ipAddressType;
  }


  public AccessControlIpUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User-supplied freeform textual description field. Maximum length of 150 characters is enforced.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Signaling IP for system1", value = "User-supplied freeform textual description field. Maximum length of 150 characters is enforced.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this AccessControlIpUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControlIpUpdate accessControlIpUpdate = (AccessControlIpUpdate) o;
    return Objects.equals(this.ipAddress, accessControlIpUpdate.ipAddress) &&
        Objects.equals(this.ipAddressType, accessControlIpUpdate.ipAddressType) &&
        Objects.equals(this.description, accessControlIpUpdate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, ipAddressType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControlIpUpdate {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipAddressType: ").append(toIndentedString(ipAddressType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
