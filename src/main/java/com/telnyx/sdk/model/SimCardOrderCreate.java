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
 * SimCardOrderCreate
 */
@JsonPropertyOrder({
  SimCardOrderCreate.JSON_PROPERTY_ADDRESS_ID,
  SimCardOrderCreate.JSON_PROPERTY_QUANTITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimCardOrderCreate {
  public static final String JSON_PROPERTY_ADDRESS_ID = "address_id";
  private String addressId;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Integer quantity;

  public SimCardOrderCreate() { 
  }

  public SimCardOrderCreate addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Uniquely identifies the address for the order.
   * @return addressId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1293384261075731499", required = true, value = "Uniquely identifies the address for the order.")
  @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddressId() {
    return addressId;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public SimCardOrderCreate quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The amount of SIM cards to order.
   * minimum: 1
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "23", required = true, value = "The amount of SIM cards to order.")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  /**
   * Return true if this SimCardOrderCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimCardOrderCreate simCardOrderCreate = (SimCardOrderCreate) o;
    return Objects.equals(this.addressId, simCardOrderCreate.addressId) &&
        Objects.equals(this.quantity, simCardOrderCreate.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimCardOrderCreate {\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

