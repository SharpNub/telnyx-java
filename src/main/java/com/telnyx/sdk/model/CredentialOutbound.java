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
 * CredentialOutbound
 */
@JsonPropertyOrder({
  CredentialOutbound.JSON_PROPERTY_CALL_PARKING_ENABLED,
  CredentialOutbound.JSON_PROPERTY_ANI_OVERRIDE,
  CredentialOutbound.JSON_PROPERTY_ANI_OVERRIDE_TYPE,
  CredentialOutbound.JSON_PROPERTY_CHANNEL_LIMIT,
  CredentialOutbound.JSON_PROPERTY_INSTANT_RINGBACK_ENABLED,
  CredentialOutbound.JSON_PROPERTY_GENERATE_RINGBACK_TONE,
  CredentialOutbound.JSON_PROPERTY_LOCALIZATION,
  CredentialOutbound.JSON_PROPERTY_T38_REINVITE_SOURCE,
  CredentialOutbound.JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CredentialOutbound {
  public static final String JSON_PROPERTY_CALL_PARKING_ENABLED = "call_parking_enabled";
  private Boolean callParkingEnabled = false;

  public static final String JSON_PROPERTY_ANI_OVERRIDE = "ani_override";
  private String aniOverride = "";

  /**
   * Specifies when we apply your ani_override setting. Only applies when ani_override is not blank.
   */
  public enum AniOverrideTypeEnum {
    ALWAYS("always"),
    
    NORMAL("normal"),
    
    EMERGENCY("emergency");

    private String value;

    AniOverrideTypeEnum(String value) {
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
    public static AniOverrideTypeEnum fromValue(String value) {
      for (AniOverrideTypeEnum b : AniOverrideTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANI_OVERRIDE_TYPE = "ani_override_type";
  private AniOverrideTypeEnum aniOverrideType = AniOverrideTypeEnum.ALWAYS;

  public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
  private Integer channelLimit;

  public static final String JSON_PROPERTY_INSTANT_RINGBACK_ENABLED = "instant_ringback_enabled";
  private Boolean instantRingbackEnabled = true;

  public static final String JSON_PROPERTY_GENERATE_RINGBACK_TONE = "generate_ringback_tone";
  private Boolean generateRingbackTone = false;

  public static final String JSON_PROPERTY_LOCALIZATION = "localization";
  private String localization = "US";

  /**
   * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.&lt;br/&gt;&lt;br/&gt; By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite.
   */
  public enum T38ReinviteSourceEnum {
    TELNYX("telnyx"),
    
    CUSTOMER("customer"),
    
    DISABLED("disabled"),
    
    PASSTHRU("passthru"),
    
    CALLER_PASSTHRU("caller-passthru"),
    
    CALLEE_PASSTHRU("callee-passthru");

    private String value;

    T38ReinviteSourceEnum(String value) {
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
    public static T38ReinviteSourceEnum fromValue(String value) {
      for (T38ReinviteSourceEnum b : T38ReinviteSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_T38_REINVITE_SOURCE = "t38_reinvite_source";
  private T38ReinviteSourceEnum t38ReinviteSource = T38ReinviteSourceEnum.TELNYX;

  public static final String JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID = "outbound_voice_profile_id";
  private String outboundVoiceProfileId;

  public CredentialOutbound() { 
  }

  public CredentialOutbound callParkingEnabled(Boolean callParkingEnabled) {
    this.callParkingEnabled = callParkingEnabled;
    return this;
  }

   /**
   * Forces all SIP calls originated on this connection to be \&quot;parked\&quot; instead of \&quot;bridged\&quot; to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next.
   * @return callParkingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Forces all SIP calls originated on this connection to be \"parked\" instead of \"bridged\" to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next.")
  @JsonProperty(JSON_PROPERTY_CALL_PARKING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallParkingEnabled() {
    return callParkingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_CALL_PARKING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallParkingEnabled(Boolean callParkingEnabled) {
    this.callParkingEnabled = callParkingEnabled;
  }


  public CredentialOutbound aniOverride(String aniOverride) {
    this.aniOverride = aniOverride;
    return this;
  }

   /**
   * Set a phone number as the ani_override value to override caller id number on outbound calls.
   * @return aniOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set a phone number as the ani_override value to override caller id number on outbound calls.")
  @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAniOverride() {
    return aniOverride;
  }


  @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAniOverride(String aniOverride) {
    this.aniOverride = aniOverride;
  }


  public CredentialOutbound aniOverrideType(AniOverrideTypeEnum aniOverrideType) {
    this.aniOverrideType = aniOverrideType;
    return this;
  }

   /**
   * Specifies when we apply your ani_override setting. Only applies when ani_override is not blank.
   * @return aniOverrideType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies when we apply your ani_override setting. Only applies when ani_override is not blank.")
  @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AniOverrideTypeEnum getAniOverrideType() {
    return aniOverrideType;
  }


  @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAniOverrideType(AniOverrideTypeEnum aniOverrideType) {
    this.aniOverrideType = aniOverrideType;
  }


  public CredentialOutbound channelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
    return this;
  }

   /**
   * When set, this will limit the total number of outbound calls to phone numbers associated with this connection.
   * @return channelLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set, this will limit the total number of outbound calls to phone numbers associated with this connection.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannelLimit() {
    return channelLimit;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
  }


  public CredentialOutbound instantRingbackEnabled(Boolean instantRingbackEnabled) {
    this.instantRingbackEnabled = instantRingbackEnabled;
    return this;
  }

   /**
   * When set, ringback will not wait for indication before sending ringback tone to calling party.
   * @return instantRingbackEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set, ringback will not wait for indication before sending ringback tone to calling party.")
  @JsonProperty(JSON_PROPERTY_INSTANT_RINGBACK_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInstantRingbackEnabled() {
    return instantRingbackEnabled;
  }


  @JsonProperty(JSON_PROPERTY_INSTANT_RINGBACK_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstantRingbackEnabled(Boolean instantRingbackEnabled) {
    this.instantRingbackEnabled = instantRingbackEnabled;
  }


  public CredentialOutbound generateRingbackTone(Boolean generateRingbackTone) {
    this.generateRingbackTone = generateRingbackTone;
    return this;
  }

   /**
   * Generate ringback tone through 183 session progress message with early media.
   * @return generateRingbackTone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Generate ringback tone through 183 session progress message with early media.")
  @JsonProperty(JSON_PROPERTY_GENERATE_RINGBACK_TONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGenerateRingbackTone() {
    return generateRingbackTone;
  }


  @JsonProperty(JSON_PROPERTY_GENERATE_RINGBACK_TONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenerateRingbackTone(Boolean generateRingbackTone) {
    this.generateRingbackTone = generateRingbackTone;
  }


  public CredentialOutbound localization(String localization) {
    this.localization = localization;
    return this;
  }

   /**
   * A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to &#x60;US&#x60; then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default.
   * @return localization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to `US` then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default.")
  @JsonProperty(JSON_PROPERTY_LOCALIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalization() {
    return localization;
  }


  @JsonProperty(JSON_PROPERTY_LOCALIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalization(String localization) {
    this.localization = localization;
  }


  public CredentialOutbound t38ReinviteSource(T38ReinviteSourceEnum t38ReinviteSource) {
    this.t38ReinviteSource = t38ReinviteSource;
    return this;
  }

   /**
   * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.&lt;br/&gt;&lt;br/&gt; By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite.
   * @return t38ReinviteSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default, Telnyx will send the re-invite. If set to `customer`, the caller is expected to send the t.38 reinvite.")
  @JsonProperty(JSON_PROPERTY_T38_REINVITE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public T38ReinviteSourceEnum getT38ReinviteSource() {
    return t38ReinviteSource;
  }


  @JsonProperty(JSON_PROPERTY_T38_REINVITE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setT38ReinviteSource(T38ReinviteSourceEnum t38ReinviteSource) {
    this.t38ReinviteSource = t38ReinviteSource;
  }


  public CredentialOutbound outboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
    return this;
  }

   /**
   * Identifies the associated outbound voice profile.
   * @return outboundVoiceProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the associated outbound voice profile.")
  @JsonProperty(JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutboundVoiceProfileId() {
    return outboundVoiceProfileId;
  }


  @JsonProperty(JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
  }


  /**
   * Return true if this CredentialOutbound object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialOutbound credentialOutbound = (CredentialOutbound) o;
    return Objects.equals(this.callParkingEnabled, credentialOutbound.callParkingEnabled) &&
        Objects.equals(this.aniOverride, credentialOutbound.aniOverride) &&
        Objects.equals(this.aniOverrideType, credentialOutbound.aniOverrideType) &&
        Objects.equals(this.channelLimit, credentialOutbound.channelLimit) &&
        Objects.equals(this.instantRingbackEnabled, credentialOutbound.instantRingbackEnabled) &&
        Objects.equals(this.generateRingbackTone, credentialOutbound.generateRingbackTone) &&
        Objects.equals(this.localization, credentialOutbound.localization) &&
        Objects.equals(this.t38ReinviteSource, credentialOutbound.t38ReinviteSource) &&
        Objects.equals(this.outboundVoiceProfileId, credentialOutbound.outboundVoiceProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callParkingEnabled, aniOverride, aniOverrideType, channelLimit, instantRingbackEnabled, generateRingbackTone, localization, t38ReinviteSource, outboundVoiceProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialOutbound {\n");
    sb.append("    callParkingEnabled: ").append(toIndentedString(callParkingEnabled)).append("\n");
    sb.append("    aniOverride: ").append(toIndentedString(aniOverride)).append("\n");
    sb.append("    aniOverrideType: ").append(toIndentedString(aniOverrideType)).append("\n");
    sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
    sb.append("    instantRingbackEnabled: ").append(toIndentedString(instantRingbackEnabled)).append("\n");
    sb.append("    generateRingbackTone: ").append(toIndentedString(generateRingbackTone)).append("\n");
    sb.append("    localization: ").append(toIndentedString(localization)).append("\n");
    sb.append("    t38ReinviteSource: ").append(toIndentedString(t38ReinviteSource)).append("\n");
    sb.append("    outboundVoiceProfileId: ").append(toIndentedString(outboundVoiceProfileId)).append("\n");
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

