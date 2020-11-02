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
 * PhoneNumberRegulatoryRequirement
 */
@JsonPropertyOrder({
  PhoneNumberRegulatoryRequirement.JSON_PROPERTY_RECORD_TYPE,
  PhoneNumberRegulatoryRequirement.JSON_PROPERTY_REQUIREMENT_ID,
  PhoneNumberRegulatoryRequirement.JSON_PROPERTY_FIELD_VALUE,
  PhoneNumberRegulatoryRequirement.JSON_PROPERTY_FIELD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumberRegulatoryRequirement {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_REQUIREMENT_ID = "requirement_id";
  private UUID requirementId;

  public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
  private String fieldValue;

  /**
   * Gets or Sets fieldType
   */
  public enum FieldTypeEnum {
    STRING("string"),
    
    DATETIME("datetime"),
    
    ADDRESS_ID("address_id"),
    
    NUMBER_ORDER_DOCUMENT_ID("number_order_document_id");

    private String value;

    FieldTypeEnum(String value) {
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
    public static FieldTypeEnum fromValue(String value) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private FieldTypeEnum fieldType;


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number_regulatory_requirement", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public PhoneNumberRegulatoryRequirement requirementId(UUID requirementId) {
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


  public void setRequirementId(UUID requirementId) {
    this.requirementId = requirementId;
  }


  public PhoneNumberRegulatoryRequirement fieldValue(String fieldValue) {
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


  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "address_id", value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldTypeEnum getFieldType() {
    return fieldType;
  }




  /**
   * Return true if this PhoneNumberRegulatoryRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberRegulatoryRequirement phoneNumberRegulatoryRequirement = (PhoneNumberRegulatoryRequirement) o;
    return Objects.equals(this.recordType, phoneNumberRegulatoryRequirement.recordType) &&
        Objects.equals(this.requirementId, phoneNumberRegulatoryRequirement.requirementId) &&
        Objects.equals(this.fieldValue, phoneNumberRegulatoryRequirement.fieldValue) &&
        Objects.equals(this.fieldType, phoneNumberRegulatoryRequirement.fieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, requirementId, fieldValue, fieldType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberRegulatoryRequirement {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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
