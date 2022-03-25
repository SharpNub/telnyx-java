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
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.ConnectionRtcpSettings;
import com.telnyx.sdk.model.CredentialInbound;
import com.telnyx.sdk.model.CredentialOutbound;
import com.telnyx.sdk.model.DtmfType;
import com.telnyx.sdk.model.EncryptedMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateCredentialConnectionRequest
 */
@JsonPropertyOrder({
  UpdateCredentialConnectionRequest.JSON_PROPERTY_ACTIVE,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_USER_NAME,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_PASSWORD,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_CONNECTION_NAME,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_DTMF_TYPE,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_ENCRYPTED_MEDIA,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_WEBHOOK_API_VERSION,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_RTCP_SETTINGS,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_INBOUND,
  UpdateCredentialConnectionRequest.JSON_PROPERTY_OUTBOUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCredentialConnectionRequest {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

  public static final String JSON_PROPERTY_CONNECTION_NAME = "connection_name";
  private String connectionName;

  /**
   * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).
   */
  public enum SipUriCallingPreferenceEnum {
    DISABLED("disabled"),
    
    UNRESTRICTED("unrestricted"),
    
    INTERNAL("internal");

    private String value;

    SipUriCallingPreferenceEnum(String value) {
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
    public static SipUriCallingPreferenceEnum fromValue(String value) {
      for (SipUriCallingPreferenceEnum b : SipUriCallingPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE = "sip_uri_calling_preference";
  private SipUriCallingPreferenceEnum sipUriCallingPreference = SipUriCallingPreferenceEnum.DISABLED;

  public static final String JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED = "default_on_hold_comfort_noise_enabled";
  private Boolean defaultOnHoldComfortNoiseEnabled = false;

  public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
  private DtmfType dtmfType = DtmfType.RFC_2833;

  public static final String JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED = "encode_contact_header_enabled";
  private Boolean encodeContactHeaderEnabled = false;

  public static final String JSON_PROPERTY_ENCRYPTED_MEDIA = "encrypted_media";
  private JsonNullable<EncryptedMedia> encryptedMedia = JsonNullable.<EncryptedMedia>undefined();

  public static final String JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED = "onnet_t38_passthrough_enabled";
  private Boolean onnetT38PassthroughEnabled = false;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private String webhookEventUrl;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   */
  public enum WebhookApiVersionEnum {
    _1("1"),
    
    _2("2");

    private String value;

    WebhookApiVersionEnum(String value) {
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
    public static WebhookApiVersionEnum fromValue(String value) {
      for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEBHOOK_API_VERSION = "webhook_api_version";
  private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._1;

  public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS = "webhook_timeout_secs";
  private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RTCP_SETTINGS = "rtcp_settings";
  private ConnectionRtcpSettings rtcpSettings;

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private CredentialInbound inbound;

  public static final String JSON_PROPERTY_OUTBOUND = "outbound";
  private CredentialOutbound outbound;

  public UpdateCredentialConnectionRequest() { 
  }

  public UpdateCredentialConnectionRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Defaults to true
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to true")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateCredentialConnectionRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters).
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "myusername123", value = "The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters).")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public UpdateCredentialConnectionRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to be used as part of the credentials. Must be 8 to 128 characters long.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my123secure456password789", value = "The password to be used as part of the credentials. Must be 8 to 128 characters long.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateCredentialConnectionRequest anchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * Get anchorsiteOverride
   * @return anchorsiteOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverride getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public UpdateCredentialConnectionRequest connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionName() {
    return connectionName;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }


  public UpdateCredentialConnectionRequest sipUriCallingPreference(SipUriCallingPreferenceEnum sipUriCallingPreference) {
    this.sipUriCallingPreference = sipUriCallingPreference;
    return this;
  }

   /**
   * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).
   * @return sipUriCallingPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).")
  @JsonProperty(JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SipUriCallingPreferenceEnum getSipUriCallingPreference() {
    return sipUriCallingPreference;
  }


  @JsonProperty(JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipUriCallingPreference(SipUriCallingPreferenceEnum sipUriCallingPreference) {
    this.sipUriCallingPreference = sipUriCallingPreference;
  }


  public UpdateCredentialConnectionRequest defaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
    return this;
  }

   /**
   * When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
   * @return defaultOnHoldComfortNoiseEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultOnHoldComfortNoiseEnabled() {
    return defaultOnHoldComfortNoiseEnabled;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
  }


  public UpdateCredentialConnectionRequest dtmfType(DtmfType dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Get dtmfType
   * @return dtmfType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DtmfType getDtmfType() {
    return dtmfType;
  }


  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDtmfType(DtmfType dtmfType) {
    this.dtmfType = dtmfType;
  }


  public UpdateCredentialConnectionRequest encodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
    return this;
  }

   /**
   * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
   * @return encodeContactHeaderEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.")
  @JsonProperty(JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncodeContactHeaderEnabled() {
    return encodeContactHeaderEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
  }


  public UpdateCredentialConnectionRequest encryptedMedia(EncryptedMedia encryptedMedia) {
    this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
    return this;
  }

   /**
   * Get encryptedMedia
   * @return encryptedMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public EncryptedMedia getEncryptedMedia() {
        return encryptedMedia.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<EncryptedMedia> getEncryptedMedia_JsonNullable() {
    return encryptedMedia;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
  public void setEncryptedMedia_JsonNullable(JsonNullable<EncryptedMedia> encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
  }

  public void setEncryptedMedia(EncryptedMedia encryptedMedia) {
    this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
  }


  public UpdateCredentialConnectionRequest onnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    return this;
  }

   /**
   * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings.
   * @return onnetT38PassthroughEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg's settings.")
  @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnnetT38PassthroughEnabled() {
    return onnetT38PassthroughEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
  }


  public UpdateCredentialConnectionRequest webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "The URL where webhooks related to this connection will be sent. Must include a scheme, such as 'https'.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookEventUrl() {
    return webhookEventUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }


  public UpdateCredentialConnectionRequest webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://failover.example.com", value = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'.")
  @JsonIgnore

  public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
    return webhookEventFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  public void setWebhookEventFailoverUrl_JsonNullable(JsonNullable<String> webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
  }


  public UpdateCredentialConnectionRequest webhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
    return this;
  }

   /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   * @return webhookApiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Determines which webhook format will be used, Telnyx API v1 or v2.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookApiVersionEnum getWebhookApiVersion() {
    return webhookApiVersion;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }


  public UpdateCredentialConnectionRequest webhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a webhook.
   * minimum: 0
   * maximum: 30
   * @return webhookTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Specifies how many seconds to wait before timing out a webhook.")
  @JsonIgnore

  public Integer getWebhookTimeoutSecs() {
        return webhookTimeoutSecs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWebhookTimeoutSecs_JsonNullable() {
    return webhookTimeoutSecs;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  public void setWebhookTimeoutSecs_JsonNullable(JsonNullable<Integer> webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
  }

  public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
  }


  public UpdateCredentialConnectionRequest rtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
    return this;
  }

   /**
   * Get rtcpSettings
   * @return rtcpSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RTCP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionRtcpSettings getRtcpSettings() {
    return rtcpSettings;
  }


  @JsonProperty(JSON_PROPERTY_RTCP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
  }


  public UpdateCredentialConnectionRequest inbound(CredentialInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredentialInbound getInbound() {
    return inbound;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInbound(CredentialInbound inbound) {
    this.inbound = inbound;
  }


  public UpdateCredentialConnectionRequest outbound(CredentialOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredentialOutbound getOutbound() {
    return outbound;
  }


  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutbound(CredentialOutbound outbound) {
    this.outbound = outbound;
  }


  /**
   * Return true if this UpdateCredentialConnectionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCredentialConnectionRequest updateCredentialConnectionRequest = (UpdateCredentialConnectionRequest) o;
    return Objects.equals(this.active, updateCredentialConnectionRequest.active) &&
        Objects.equals(this.userName, updateCredentialConnectionRequest.userName) &&
        Objects.equals(this.password, updateCredentialConnectionRequest.password) &&
        Objects.equals(this.anchorsiteOverride, updateCredentialConnectionRequest.anchorsiteOverride) &&
        Objects.equals(this.connectionName, updateCredentialConnectionRequest.connectionName) &&
        Objects.equals(this.sipUriCallingPreference, updateCredentialConnectionRequest.sipUriCallingPreference) &&
        Objects.equals(this.defaultOnHoldComfortNoiseEnabled, updateCredentialConnectionRequest.defaultOnHoldComfortNoiseEnabled) &&
        Objects.equals(this.dtmfType, updateCredentialConnectionRequest.dtmfType) &&
        Objects.equals(this.encodeContactHeaderEnabled, updateCredentialConnectionRequest.encodeContactHeaderEnabled) &&
        equalsNullable(this.encryptedMedia, updateCredentialConnectionRequest.encryptedMedia) &&
        Objects.equals(this.onnetT38PassthroughEnabled, updateCredentialConnectionRequest.onnetT38PassthroughEnabled) &&
        Objects.equals(this.webhookEventUrl, updateCredentialConnectionRequest.webhookEventUrl) &&
        equalsNullable(this.webhookEventFailoverUrl, updateCredentialConnectionRequest.webhookEventFailoverUrl) &&
        Objects.equals(this.webhookApiVersion, updateCredentialConnectionRequest.webhookApiVersion) &&
        equalsNullable(this.webhookTimeoutSecs, updateCredentialConnectionRequest.webhookTimeoutSecs) &&
        Objects.equals(this.rtcpSettings, updateCredentialConnectionRequest.rtcpSettings) &&
        Objects.equals(this.inbound, updateCredentialConnectionRequest.inbound) &&
        Objects.equals(this.outbound, updateCredentialConnectionRequest.outbound);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, userName, password, anchorsiteOverride, connectionName, sipUriCallingPreference, defaultOnHoldComfortNoiseEnabled, dtmfType, encodeContactHeaderEnabled, hashCodeNullable(encryptedMedia), onnetT38PassthroughEnabled, webhookEventUrl, hashCodeNullable(webhookEventFailoverUrl), webhookApiVersion, hashCodeNullable(webhookTimeoutSecs), rtcpSettings, inbound, outbound);
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
    sb.append("class UpdateCredentialConnectionRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    sipUriCallingPreference: ").append(toIndentedString(sipUriCallingPreference)).append("\n");
    sb.append("    defaultOnHoldComfortNoiseEnabled: ").append(toIndentedString(defaultOnHoldComfortNoiseEnabled)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    encodeContactHeaderEnabled: ").append(toIndentedString(encodeContactHeaderEnabled)).append("\n");
    sb.append("    encryptedMedia: ").append(toIndentedString(encryptedMedia)).append("\n");
    sb.append("    onnetT38PassthroughEnabled: ").append(toIndentedString(onnetT38PassthroughEnabled)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
    sb.append("    rtcpSettings: ").append(toIndentedString(rtcpSettings)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

