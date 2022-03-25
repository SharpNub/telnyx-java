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
 * The address of the customer service request
 */
@ApiModel(description = "The address of the customer service request")
@JsonPropertyOrder({
  CustomerServiceRequestAddress.JSON_PROPERTY_STREET_ADDRESS,
  CustomerServiceRequestAddress.JSON_PROPERTY_LOCALITY,
  CustomerServiceRequestAddress.JSON_PROPERTY_ADMINISTRATIVE_AREA,
  CustomerServiceRequestAddress.JSON_PROPERTY_POSTAL_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerServiceRequestAddress {
  public static final String JSON_PROPERTY_STREET_ADDRESS = "street_address";
  private String streetAddress;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrative_area";
  private String administrativeArea;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public CustomerServiceRequestAddress() { 
  }

  public CustomerServiceRequestAddress streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * The street address
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 Main St", value = "The street address")
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetAddress() {
    return streetAddress;
  }


  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public CustomerServiceRequestAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The city of the address
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York", value = "The city of the address")
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocality() {
    return locality;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocality(String locality) {
    this.locality = locality;
  }


  public CustomerServiceRequestAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The state of the address
   * @return administrativeArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NY", value = "The state of the address")
  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdministrativeArea() {
    return administrativeArea;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  public CustomerServiceRequestAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The zip code of the address
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "The zip code of the address")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * Return true if this CustomerServiceRequest_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceRequestAddress customerServiceRequestAddress = (CustomerServiceRequestAddress) o;
    return Objects.equals(this.streetAddress, customerServiceRequestAddress.streetAddress) &&
        Objects.equals(this.locality, customerServiceRequestAddress.locality) &&
        Objects.equals(this.administrativeArea, customerServiceRequestAddress.administrativeArea) &&
        Objects.equals(this.postalCode, customerServiceRequestAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, locality, administrativeArea, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerServiceRequestAddress {\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

