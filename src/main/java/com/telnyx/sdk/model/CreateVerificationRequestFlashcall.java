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
 * The request body when creating a verification.
 */
@ApiModel(description = "The request body when creating a verification.")
@JsonPropertyOrder({
  CreateVerificationRequestFlashcall.JSON_PROPERTY_PHONE_NUMBER,
  CreateVerificationRequestFlashcall.JSON_PROPERTY_VERIFY_PROFILE_ID,
  CreateVerificationRequestFlashcall.JSON_PROPERTY_TIMEOUT_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVerificationRequestFlashcall {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_VERIFY_PROFILE_ID = "verify_profile_id";
  private UUID verifyProfileId;

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Integer timeoutSecs;


  public CreateVerificationRequestFlashcall phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * +E164 formatted phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+13035551234", required = true, value = "+E164 formatted phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CreateVerificationRequestFlashcall verifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
    return this;
  }

   /**
   * The identifier of the associated Verify profile.
   * @return verifyProfileId
  **/
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", required = true, value = "The identifier of the associated Verify profile.")
  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getVerifyProfileId() {
    return verifyProfileId;
  }


  public void setVerifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
  }


  public CreateVerificationRequestFlashcall timeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
    return this;
  }

   /**
   * The number of seconds the verification code is valid for.
   * @return timeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "The number of seconds the verification code is valid for.")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutSecs() {
    return timeoutSecs;
  }


  public void setTimeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
  }


  /**
   * Return true if this CreateVerificationRequestFlashcall object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerificationRequestFlashcall createVerificationRequestFlashcall = (CreateVerificationRequestFlashcall) o;
    return Objects.equals(this.phoneNumber, createVerificationRequestFlashcall.phoneNumber) &&
        Objects.equals(this.verifyProfileId, createVerificationRequestFlashcall.verifyProfileId) &&
        Objects.equals(this.timeoutSecs, createVerificationRequestFlashcall.timeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, verifyProfileId, timeoutSecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerificationRequestFlashcall {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verifyProfileId: ").append(toIndentedString(verifyProfileId)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
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
