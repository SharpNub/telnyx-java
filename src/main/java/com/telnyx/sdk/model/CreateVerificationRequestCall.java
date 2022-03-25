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
  CreateVerificationRequestCall.JSON_PROPERTY_PHONE_NUMBER,
  CreateVerificationRequestCall.JSON_PROPERTY_VERIFY_PROFILE_ID,
  CreateVerificationRequestCall.JSON_PROPERTY_TIMEOUT_SECS,
  CreateVerificationRequestCall.JSON_PROPERTY_CALL_TIMEOUT_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVerificationRequestCall {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_VERIFY_PROFILE_ID = "verify_profile_id";
  private UUID verifyProfileId;

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Integer timeoutSecs;

  public static final String JSON_PROPERTY_CALL_TIMEOUT_SECS = "call_timeout_secs";
  private Integer callTimeoutSecs;

  public CreateVerificationRequestCall() { 
  }

  public CreateVerificationRequestCall phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * +E164 formatted phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+13035551234", required = true, value = "+E164 formatted phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CreateVerificationRequestCall verifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
    return this;
  }

   /**
   * The identifier of the associated Verify profile.
   * @return verifyProfileId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", required = true, value = "The identifier of the associated Verify profile.")
  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getVerifyProfileId() {
    return verifyProfileId;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
  }


  public CreateVerificationRequestCall timeoutSecs(Integer timeoutSecs) {
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


  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
  }


  public CreateVerificationRequestCall callTimeoutSecs(Integer callTimeoutSecs) {
    this.callTimeoutSecs = callTimeoutSecs;
    return this;
  }

   /**
   * Must be less than the profile&#39;s default_verification_timeout_secs or timeout_secs, whichever is lesser.
   * @return callTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "Must be less than the profile's default_verification_timeout_secs or timeout_secs, whichever is lesser.")
  @JsonProperty(JSON_PROPERTY_CALL_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCallTimeoutSecs() {
    return callTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_CALL_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallTimeoutSecs(Integer callTimeoutSecs) {
    this.callTimeoutSecs = callTimeoutSecs;
  }


  /**
   * Return true if this CreateVerificationRequestCall object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerificationRequestCall createVerificationRequestCall = (CreateVerificationRequestCall) o;
    return Objects.equals(this.phoneNumber, createVerificationRequestCall.phoneNumber) &&
        Objects.equals(this.verifyProfileId, createVerificationRequestCall.verifyProfileId) &&
        Objects.equals(this.timeoutSecs, createVerificationRequestCall.timeoutSecs) &&
        Objects.equals(this.callTimeoutSecs, createVerificationRequestCall.callTimeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, verifyProfileId, timeoutSecs, callTimeoutSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerificationRequestCall {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verifyProfileId: ").append(toIndentedString(verifyProfileId)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
    sb.append("    callTimeoutSecs: ").append(toIndentedString(callTimeoutSecs)).append("\n");
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

