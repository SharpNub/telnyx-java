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
 * UpdateRegulatoryRequirement
 */
@JsonPropertyOrder({
  UpdateRegulatoryRequirement.JSON_PROPERTY_REQUIREMENT_ID,
  UpdateRegulatoryRequirement.JSON_PROPERTY_FIELD_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateRegulatoryRequirement {
  public static final String JSON_PROPERTY_REQUIREMENT_ID = "requirement_id";
  private UUID requirementId;

  public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
  private String fieldValue;

  public UpdateRegulatoryRequirement() { 
  }

  public UpdateRegulatoryRequirement requirementId(UUID requirementId) {
    this.requirementId = requirementId;
    return this;
  }

   /**
   * Unique id for a requirement.
   * @return requirementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8ffb3622-7c6b-4ccc-b65f-7a3dc0099576", value = "Unique id for a requirement.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRequirementId() {
    return requirementId;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirementId(UUID requirementId) {
    this.requirementId = requirementId;
  }


  public UpdateRegulatoryRequirement fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * The value of the requirement, this could be an id to a resource or a string value.
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45f45a04-b4be-4592-95b1-9306b9db2b21", value = "The value of the requirement, this could be an id to a resource or a string value.")
  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldValue() {
    return fieldValue;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  /**
   * Return true if this UpdateRegulatoryRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegulatoryRequirement updateRegulatoryRequirement = (UpdateRegulatoryRequirement) o;
    return Objects.equals(this.requirementId, updateRegulatoryRequirement.requirementId) &&
        Objects.equals(this.fieldValue, updateRegulatoryRequirement.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementId, fieldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegulatoryRequirement {\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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

