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
import com.telnyx.sdk.model.ConnectionId;
import com.telnyx.sdk.model.GCSConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CredentialsResponse
 */
@JsonPropertyOrder({
  CredentialsResponse.JSON_PROPERTY_DATA,
  CredentialsResponse.JSON_PROPERTY_CONNECTION_ID,
  CredentialsResponse.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CredentialsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private GCSConfiguration data;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private ConnectionId connectionId = null;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public CredentialsResponse() { 
  }

  public CredentialsResponse data(GCSConfiguration data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GCSConfiguration getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(GCSConfiguration data) {
    this.data = data;
  }


  public CredentialsResponse connectionId(ConnectionId connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectionId getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionId(ConnectionId connectionId) {
    this.connectionId = connectionId;
  }


  public CredentialsResponse recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies record type.
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifies record type.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  /**
   * Return true if this CredentialsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsResponse credentialsResponse = (CredentialsResponse) o;
    return Objects.equals(this.data, credentialsResponse.data) &&
        Objects.equals(this.connectionId, credentialsResponse.connectionId) &&
        Objects.equals(this.recordType, credentialsResponse.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, connectionId, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

