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
 * MdrUsageRecord
 */
@JsonPropertyOrder({
  MdrUsageRecord.JSON_PROPERTY_COST,
  MdrUsageRecord.JSON_PROPERTY_DIRECTION,
  MdrUsageRecord.JSON_PROPERTY_PRODUCT,
  MdrUsageRecord.JSON_PROPERTY_CONNECTION,
  MdrUsageRecord.JSON_PROPERTY_RECEIVED,
  MdrUsageRecord.JSON_PROPERTY_DELIVERED,
  MdrUsageRecord.JSON_PROPERTY_CURRENCY,
  MdrUsageRecord.JSON_PROPERTY_PARTS,
  MdrUsageRecord.JSON_PROPERTY_SENT,
  MdrUsageRecord.JSON_PROPERTY_PROFILE_ID,
  MdrUsageRecord.JSON_PROPERTY_TAGS,
  MdrUsageRecord.JSON_PROPERTY_MESSAGE_TYPE,
  MdrUsageRecord.JSON_PROPERTY_TN_TYPE,
  MdrUsageRecord.JSON_PROPERTY_CARRIER_PASSTHROUGH_FEE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MdrUsageRecord {
  public static final String JSON_PROPERTY_COST = "cost";
  private String cost;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_CONNECTION = "connection";
  private String connection;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private String received;

  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private String delivered;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private String parts;

  public static final String JSON_PROPERTY_SENT = "sent";
  private String sent;

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  private String profileId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private String tags;

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private String messageType;

  public static final String JSON_PROPERTY_TN_TYPE = "tn_type";
  private String tnType;

  public static final String JSON_PROPERTY_CARRIER_PASSTHROUGH_FEE = "carrier_passthrough_fee";
  private String carrierPassthroughFee;

  public MdrUsageRecord() { 
  }

  public MdrUsageRecord cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(String cost) {
    this.cost = cost;
  }


  public MdrUsageRecord direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound", value = "")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  public MdrUsageRecord product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound", value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(String product) {
    this.product = product;
  }


  public MdrUsageRecord connection(String connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "all", value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnection() {
    return connection;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnection(String connection) {
    this.connection = connection;
  }


  public MdrUsageRecord received(String received) {
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceived() {
    return received;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceived(String received) {
    this.received = received;
  }


  public MdrUsageRecord delivered(String delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Get delivered
   * @return delivered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDelivered() {
    return delivered;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelivered(String delivered) {
    this.delivered = delivered;
  }


  public MdrUsageRecord currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public MdrUsageRecord parts(String parts) {
    this.parts = parts;
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParts() {
    return parts;
  }


  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParts(String parts) {
    this.parts = parts;
  }


  public MdrUsageRecord sent(String sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSent() {
    return sent;
  }


  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSent(String sent) {
    this.sent = sent;
  }


  public MdrUsageRecord profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * Get profileId
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "All", value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public MdrUsageRecord tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "All", value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(String tags) {
    this.tags = tags;
  }


  public MdrUsageRecord messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMS", value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public MdrUsageRecord tnType(String tnType) {
    this.tnType = tnType;
    return this;
  }

   /**
   * Get tnType
   * @return tnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TF", value = "")
  @JsonProperty(JSON_PROPERTY_TN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTnType() {
    return tnType;
  }


  @JsonProperty(JSON_PROPERTY_TN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTnType(String tnType) {
    this.tnType = tnType;
  }


  public MdrUsageRecord carrierPassthroughFee(String carrierPassthroughFee) {
    this.carrierPassthroughFee = carrierPassthroughFee;
    return this;
  }

   /**
   * Get carrierPassthroughFee
   * @return carrierPassthroughFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_CARRIER_PASSTHROUGH_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierPassthroughFee() {
    return carrierPassthroughFee;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_PASSTHROUGH_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierPassthroughFee(String carrierPassthroughFee) {
    this.carrierPassthroughFee = carrierPassthroughFee;
  }


  /**
   * Return true if this MdrUsageRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdrUsageRecord mdrUsageRecord = (MdrUsageRecord) o;
    return Objects.equals(this.cost, mdrUsageRecord.cost) &&
        Objects.equals(this.direction, mdrUsageRecord.direction) &&
        Objects.equals(this.product, mdrUsageRecord.product) &&
        Objects.equals(this.connection, mdrUsageRecord.connection) &&
        Objects.equals(this.received, mdrUsageRecord.received) &&
        Objects.equals(this.delivered, mdrUsageRecord.delivered) &&
        Objects.equals(this.currency, mdrUsageRecord.currency) &&
        Objects.equals(this.parts, mdrUsageRecord.parts) &&
        Objects.equals(this.sent, mdrUsageRecord.sent) &&
        Objects.equals(this.profileId, mdrUsageRecord.profileId) &&
        Objects.equals(this.tags, mdrUsageRecord.tags) &&
        Objects.equals(this.messageType, mdrUsageRecord.messageType) &&
        Objects.equals(this.tnType, mdrUsageRecord.tnType) &&
        Objects.equals(this.carrierPassthroughFee, mdrUsageRecord.carrierPassthroughFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, direction, product, connection, received, delivered, currency, parts, sent, profileId, tags, messageType, tnType, carrierPassthroughFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdrUsageRecord {\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    tnType: ").append(toIndentedString(tnType)).append("\n");
    sb.append("    carrierPassthroughFee: ").append(toIndentedString(carrierPassthroughFee)).append("\n");
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
