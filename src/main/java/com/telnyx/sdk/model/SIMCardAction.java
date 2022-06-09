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
import com.telnyx.sdk.model.SIMCardActionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * This object represents a SIM card action. It allows tracking the current status of an operation that impacts the SIM card.
 */
@ApiModel(description = "This object represents a SIM card action. It allows tracking the current status of an operation that impacts the SIM card.")
@JsonPropertyOrder({
  SIMCardAction.JSON_PROPERTY_ID,
  SIMCardAction.JSON_PROPERTY_RECORD_TYPE,
  SIMCardAction.JSON_PROPERTY_SIM_CARD_ID,
  SIMCardAction.JSON_PROPERTY_ACTION_TYPE,
  SIMCardAction.JSON_PROPERTY_STATUS,
  SIMCardAction.JSON_PROPERTY_SETTINGS,
  SIMCardAction.JSON_PROPERTY_CREATED_AT,
  SIMCardAction.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SIMCardAction {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_SIM_CARD_ID = "sim_card_id";
  private UUID simCardId;

  /**
   * The operation type. It can be one of the following: &lt;br/&gt; &lt;ul&gt;  &lt;li&gt;&lt;code&gt;enable&lt;/code&gt; - move the SIM card to the &lt;code&gt;enabled&lt;/code&gt; status&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enable_standby_sim_card&lt;/code&gt; - move a SIM card previously on the &lt;code&gt;standby&lt;/code&gt; status to the &lt;code&gt;enabled&lt;/code&gt; status after it consumes data.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disable&lt;/code&gt; - move the SIM card to the &lt;code&gt;disabled&lt;/code&gt; status&lt;/li&gt;  &lt;li&gt;&lt;code&gt;set_standby&lt;/code&gt; - move the SIM card to the &lt;code&gt;standby&lt;/code&gt; status&lt;/li&gt;  &lt;/ul&gt;
   */
  public enum ActionTypeEnum {
    ENABLE("enable"),
    
    ENABLE_STANDBY_SIM_CARD("enable_standby_sim_card"),
    
    DISABLE("disable"),
    
    SET_STANDBY("set_standby");

    private String value;

    ActionTypeEnum(String value) {
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
    public static ActionTypeEnum fromValue(String value) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION_TYPE = "action_type";
  private ActionTypeEnum actionType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SIMCardActionStatus status;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private JsonNullable<Object> settings = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public SIMCardAction() { 
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sim_card_action", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The related SIM card identifier.
   * @return simCardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The related SIM card identifier.")
  @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSimCardId() {
    return simCardId;
  }




   /**
   * The operation type. It can be one of the following: &lt;br/&gt; &lt;ul&gt;  &lt;li&gt;&lt;code&gt;enable&lt;/code&gt; - move the SIM card to the &lt;code&gt;enabled&lt;/code&gt; status&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enable_standby_sim_card&lt;/code&gt; - move a SIM card previously on the &lt;code&gt;standby&lt;/code&gt; status to the &lt;code&gt;enabled&lt;/code&gt; status after it consumes data.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disable&lt;/code&gt; - move the SIM card to the &lt;code&gt;disabled&lt;/code&gt; status&lt;/li&gt;  &lt;li&gt;&lt;code&gt;set_standby&lt;/code&gt; - move the SIM card to the &lt;code&gt;standby&lt;/code&gt; status&lt;/li&gt;  &lt;/ul&gt;
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "enable", value = "The operation type. It can be one of the following: <br/> <ul>  <li><code>enable</code> - move the SIM card to the <code>enabled</code> status</li>  <li><code>enable_standby_sim_card</code> - move a SIM card previously on the <code>standby</code> status to the <code>enabled</code> status after it consumes data.</li>  <li><code>disable</code> - move the SIM card to the <code>disabled</code> status</li>  <li><code>set_standby</code> - move the SIM card to the <code>standby</code> status</li>  </ul>")
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionTypeEnum getActionType() {
    return actionType;
  }




  public SIMCardAction status(SIMCardActionStatus status) {
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

  public SIMCardActionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(SIMCardActionStatus status) {
    this.status = status;
  }


   /**
   * A JSON object representation of the action params.
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "A JSON object representation of the action params.")
  @JsonIgnore

  public Object getSettings() {
    
    if (settings == null) {
      settings = JsonNullable.<Object>undefined();
    }
    return settings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSettings_JsonNullable() {
    return settings;
  }
  
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  private void setSettings_JsonNullable(JsonNullable<Object> settings) {
    this.settings = settings;
  }



  public SIMCardAction createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SIMCardAction updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-03T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this SIMCardAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIMCardAction siMCardAction = (SIMCardAction) o;
    return Objects.equals(this.id, siMCardAction.id) &&
        Objects.equals(this.recordType, siMCardAction.recordType) &&
        Objects.equals(this.simCardId, siMCardAction.simCardId) &&
        Objects.equals(this.actionType, siMCardAction.actionType) &&
        Objects.equals(this.status, siMCardAction.status) &&
        equalsNullable(this.settings, siMCardAction.settings) &&
        Objects.equals(this.createdAt, siMCardAction.createdAt) &&
        Objects.equals(this.updatedAt, siMCardAction.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, simCardId, actionType, status, hashCodeNullable(settings), createdAt, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIMCardAction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
