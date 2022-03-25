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
import com.telnyx.sdk.model.NumberPoolSettings;
import com.telnyx.sdk.model.UrlShortenerSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MessagingProfile
 */
@JsonPropertyOrder({
  MessagingProfile.JSON_PROPERTY_RECORD_TYPE,
  MessagingProfile.JSON_PROPERTY_ID,
  MessagingProfile.JSON_PROPERTY_NAME,
  MessagingProfile.JSON_PROPERTY_ENABLED,
  MessagingProfile.JSON_PROPERTY_WEBHOOK_URL,
  MessagingProfile.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
  MessagingProfile.JSON_PROPERTY_WEBHOOK_API_VERSION,
  MessagingProfile.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
  MessagingProfile.JSON_PROPERTY_CREATED_AT,
  MessagingProfile.JSON_PROPERTY_UPDATED_AT,
  MessagingProfile.JSON_PROPERTY_V1_SECRET,
  MessagingProfile.JSON_PROPERTY_NUMBER_POOL_SETTINGS,
  MessagingProfile.JSON_PROPERTY_URL_SHORTENER_SETTINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessagingProfile {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    MESSAGING_PROFILE("messaging_profile");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private JsonNullable<String> webhookUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL = "webhook_failover_url";
  private JsonNullable<String> webhookFailoverUrl = JsonNullable.<String>undefined();

  /**
   * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.
   */
  public enum WebhookApiVersionEnum {
    _1("1"),
    
    _2("2"),
    
    _2010_04_01("2010-04-01");

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
  private WebhookApiVersionEnum webhookApiVersion;

  public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS = "whitelisted_destinations";
  private JsonNullable<List<String>> whitelistedDestinations = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_V1_SECRET = "v1_secret";
  private String v1Secret;

  public static final String JSON_PROPERTY_NUMBER_POOL_SETTINGS = "number_pool_settings";
  private JsonNullable<NumberPoolSettings> numberPoolSettings = JsonNullable.<NumberPoolSettings>undefined();

  public static final String JSON_PROPERTY_URL_SHORTENER_SETTINGS = "url_shortener_settings";
  private JsonNullable<UrlShortenerSettings> urlShortenerSettings = JsonNullable.<UrlShortenerSettings>undefined();

  public MessagingProfile() { 
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }




   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public MessagingProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user friendly name for the messaging profile.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A user friendly name for the messaging profile.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public MessagingProfile enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Specifies whether the messaging profile is enabled or not.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the messaging profile is enabled or not.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public MessagingProfile webhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
    return this;
  }

   /**
   * The URL where webhooks related to this messaging profile will be sent.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where webhooks related to this messaging profile will be sent.")
  @JsonIgnore

  public String getWebhookUrl() {
        return webhookUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookUrl_JsonNullable() {
    return webhookUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  public void setWebhookUrl_JsonNullable(JsonNullable<String> webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
  }


  public MessagingProfile webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails.
   * @return webhookFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails.")
  @JsonIgnore

  public String getWebhookFailoverUrl() {
        return webhookFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookFailoverUrl_JsonNullable() {
    return webhookFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  public void setWebhookFailoverUrl_JsonNullable(JsonNullable<String> webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }

  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
  }


  public MessagingProfile webhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
    return this;
  }

   /**
   * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.
   * @return webhookApiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.")
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


  public MessagingProfile whitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = JsonNullable.<List<String>>of(whitelistedDestinations);
    return this;
  }

  public MessagingProfile addWhitelistedDestinationsItem(String whitelistedDestinationsItem) {
    if (this.whitelistedDestinations == null || !this.whitelistedDestinations.isPresent()) {
      this.whitelistedDestinations = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.whitelistedDestinations.get().add(whitelistedDestinationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Destinations to which the messaging profile is allowed to send. If set to &#x60;null&#x60;, all destinations will be allowed. Setting a value of &#x60;[\&quot;*\&quot;]&#x60; has the equivalent effect. The elements in the list must be valid ISO 3166-1 alpha-2 country codes.
   * @return whitelistedDestinations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destinations to which the messaging profile is allowed to send. If set to `null`, all destinations will be allowed. Setting a value of `[\"*\"]` has the equivalent effect. The elements in the list must be valid ISO 3166-1 alpha-2 country codes.")
  @JsonIgnore

  public List<String> getWhitelistedDestinations() {
        return whitelistedDestinations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getWhitelistedDestinations_JsonNullable() {
    return whitelistedDestinations;
  }
  
  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  public void setWhitelistedDestinations_JsonNullable(JsonNullable<List<String>> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
  }

  public void setWhitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = JsonNullable.<List<String>>of(whitelistedDestinations);
  }


   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public MessagingProfile v1Secret(String v1Secret) {
    this.v1Secret = v1Secret;
    return this;
  }

   /**
   * Secret used to authenticate with v1 endpoints.
   * @return v1Secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret used to authenticate with v1 endpoints.")
  @JsonProperty(JSON_PROPERTY_V1_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getV1Secret() {
    return v1Secret;
  }


  @JsonProperty(JSON_PROPERTY_V1_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setV1Secret(String v1Secret) {
    this.v1Secret = v1Secret;
  }


  public MessagingProfile numberPoolSettings(NumberPoolSettings numberPoolSettings) {
    this.numberPoolSettings = JsonNullable.<NumberPoolSettings>of(numberPoolSettings);
    return this;
  }

   /**
   * Get numberPoolSettings
   * @return numberPoolSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public NumberPoolSettings getNumberPoolSettings() {
        return numberPoolSettings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_POOL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NumberPoolSettings> getNumberPoolSettings_JsonNullable() {
    return numberPoolSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_POOL_SETTINGS)
  public void setNumberPoolSettings_JsonNullable(JsonNullable<NumberPoolSettings> numberPoolSettings) {
    this.numberPoolSettings = numberPoolSettings;
  }

  public void setNumberPoolSettings(NumberPoolSettings numberPoolSettings) {
    this.numberPoolSettings = JsonNullable.<NumberPoolSettings>of(numberPoolSettings);
  }


  public MessagingProfile urlShortenerSettings(UrlShortenerSettings urlShortenerSettings) {
    this.urlShortenerSettings = JsonNullable.<UrlShortenerSettings>of(urlShortenerSettings);
    return this;
  }

   /**
   * Get urlShortenerSettings
   * @return urlShortenerSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UrlShortenerSettings getUrlShortenerSettings() {
        return urlShortenerSettings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL_SHORTENER_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UrlShortenerSettings> getUrlShortenerSettings_JsonNullable() {
    return urlShortenerSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_URL_SHORTENER_SETTINGS)
  public void setUrlShortenerSettings_JsonNullable(JsonNullable<UrlShortenerSettings> urlShortenerSettings) {
    this.urlShortenerSettings = urlShortenerSettings;
  }

  public void setUrlShortenerSettings(UrlShortenerSettings urlShortenerSettings) {
    this.urlShortenerSettings = JsonNullable.<UrlShortenerSettings>of(urlShortenerSettings);
  }


  /**
   * Return true if this MessagingProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProfile messagingProfile = (MessagingProfile) o;
    return Objects.equals(this.recordType, messagingProfile.recordType) &&
        Objects.equals(this.id, messagingProfile.id) &&
        Objects.equals(this.name, messagingProfile.name) &&
        Objects.equals(this.enabled, messagingProfile.enabled) &&
        equalsNullable(this.webhookUrl, messagingProfile.webhookUrl) &&
        equalsNullable(this.webhookFailoverUrl, messagingProfile.webhookFailoverUrl) &&
        Objects.equals(this.webhookApiVersion, messagingProfile.webhookApiVersion) &&
        equalsNullable(this.whitelistedDestinations, messagingProfile.whitelistedDestinations) &&
        Objects.equals(this.createdAt, messagingProfile.createdAt) &&
        Objects.equals(this.updatedAt, messagingProfile.updatedAt) &&
        Objects.equals(this.v1Secret, messagingProfile.v1Secret) &&
        equalsNullable(this.numberPoolSettings, messagingProfile.numberPoolSettings) &&
        equalsNullable(this.urlShortenerSettings, messagingProfile.urlShortenerSettings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, name, enabled, hashCodeNullable(webhookUrl), hashCodeNullable(webhookFailoverUrl), webhookApiVersion, hashCodeNullable(whitelistedDestinations), createdAt, updatedAt, v1Secret, hashCodeNullable(numberPoolSettings), hashCodeNullable(urlShortenerSettings));
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
    sb.append("class MessagingProfile {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
    sb.append("    whitelistedDestinations: ").append(toIndentedString(whitelistedDestinations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    v1Secret: ").append(toIndentedString(v1Secret)).append("\n");
    sb.append("    numberPoolSettings: ").append(toIndentedString(numberPoolSettings)).append("\n");
    sb.append("    urlShortenerSettings: ").append(toIndentedString(urlShortenerSettings)).append("\n");
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

