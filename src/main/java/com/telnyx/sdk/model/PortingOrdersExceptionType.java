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
 * PortingOrdersExceptionType
 */
@JsonPropertyOrder({
  PortingOrdersExceptionType.JSON_PROPERTY_CODE,
  PortingOrdersExceptionType.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortingOrdersExceptionType {
  /**
   * Identifier of an exception type
   */
  public enum CodeEnum {
    ACCOUNT_NUMBER_MISMATCH("ACCOUNT_NUMBER_MISMATCH"),
    
    AUTH_PERSON_MISMATCH("AUTH_PERSON_MISMATCH"),
    
    BTN_ATN_MISMATCH("BTN_ATN_MISMATCH"),
    
    ENTITY_NAME_MISMATCH("ENTITY_NAME_MISMATCH"),
    
    FOC_EXPIRED("FOC_EXPIRED"),
    
    FOC_REJECTED("FOC_REJECTED"),
    
    LOCATION_MISMATCH("LOCATION_MISMATCH"),
    
    LSR_PENDING("LSR_PENDING"),
    
    MAIN_BTN_PORTING("MAIN_BTN_PORTING"),
    
    OSP_IRRESPONSIVE("OSP_IRRESPONSIVE"),
    
    OTHER("OTHER"),
    
    PASSCODE_PIN_INVALID("PASSCODE_PIN_INVALID"),
    
    PHONE_NUMBER_HAS_SPECIAL_FEATURE("PHONE_NUMBER_HAS_SPECIAL_FEATURE"),
    
    PHONE_NUMBER_MISMATCH("PHONE_NUMBER_MISMATCH"),
    
    PHONE_NUMBER_NOT_PORTABLE("PHONE_NUMBER_NOT_PORTABLE"),
    
    PORT_TYPE_INCORRECT("PORT_TYPE_INCORRECT"),
    
    PORTING_ORDER_SPLIT_REQUIRED("PORTING_ORDER_SPLIT_REQUIRED"),
    
    PORTING_ORDER_SPLIT_REQUIRED("PORTING_ORDER_SPLIT_REQUIRED"),
    
    POSTAL_CODE_MISMATCH("POSTAL_CODE_MISMATCH"),
    
    RATE_CENTER_NOT_PORTABLE("RATE_CENTER_NOT_PORTABLE"),
    
    SV_CONFLICT("SV_CONFLICT"),
    
    SV_UNKNOWN_FAILURE("SV_UNKNOWN_FAILURE");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CODE = "code";
  private CodeEnum code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public PortingOrdersExceptionType() { 
  }

  public PortingOrdersExceptionType code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Identifier of an exception type
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTITY_NAME_MISMATCH", value = "Identifier of an exception type")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CodeEnum getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public PortingOrdersExceptionType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of an exception type
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Entity name does not match that on the CSR", value = "Description of an exception type")
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
   * Return true if this PortingOrdersExceptionType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrdersExceptionType portingOrdersExceptionType = (PortingOrdersExceptionType) o;
    return Objects.equals(this.code, portingOrdersExceptionType.code) &&
        Objects.equals(this.description, portingOrdersExceptionType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrdersExceptionType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
