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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.GlobalIpAssignmentHealthMetricGlobalIp;
import com.telnyx.sdk.model.GlobalIpLatencyMetricMeanLatency;
import com.telnyx.sdk.model.GlobalIpLatencyMetricPercentileLatency;
import com.telnyx.sdk.model.GlobalIpLatencyMetricProberLocation;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpLatencyMetric
 */
@JsonPropertyOrder({
  GlobalIpLatencyMetric.JSON_PROPERTY_TIMESTAMP,
  GlobalIpLatencyMetric.JSON_PROPERTY_GLOBAL_IP,
  GlobalIpLatencyMetric.JSON_PROPERTY_PROBER_LOCATION,
  GlobalIpLatencyMetric.JSON_PROPERTY_MEAN_LATENCY,
  GlobalIpLatencyMetric.JSON_PROPERTY_PERCENTILE_LATENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GlobalIpLatencyMetric {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_GLOBAL_IP = "global_ip";
  private GlobalIpAssignmentHealthMetricGlobalIp globalIp;

  public static final String JSON_PROPERTY_PROBER_LOCATION = "prober_location";
  private GlobalIpLatencyMetricProberLocation proberLocation;

  public static final String JSON_PROPERTY_MEAN_LATENCY = "mean_latency";
  private GlobalIpLatencyMetricMeanLatency meanLatency;

  public static final String JSON_PROPERTY_PERCENTILE_LATENCY = "percentile_latency";
  private GlobalIpLatencyMetricPercentileLatency percentileLatency;

  public GlobalIpLatencyMetric() { 
  }

  public GlobalIpLatencyMetric timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the metric.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T00:00Z", value = "The timestamp of the metric.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public GlobalIpLatencyMetric globalIp(GlobalIpAssignmentHealthMetricGlobalIp globalIp) {
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpAssignmentHealthMetricGlobalIp getGlobalIp() {
    return globalIp;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalIp(GlobalIpAssignmentHealthMetricGlobalIp globalIp) {
    this.globalIp = globalIp;
  }


  public GlobalIpLatencyMetric proberLocation(GlobalIpLatencyMetricProberLocation proberLocation) {
    this.proberLocation = proberLocation;
    return this;
  }

   /**
   * Get proberLocation
   * @return proberLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROBER_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpLatencyMetricProberLocation getProberLocation() {
    return proberLocation;
  }


  @JsonProperty(JSON_PROPERTY_PROBER_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProberLocation(GlobalIpLatencyMetricProberLocation proberLocation) {
    this.proberLocation = proberLocation;
  }


  public GlobalIpLatencyMetric meanLatency(GlobalIpLatencyMetricMeanLatency meanLatency) {
    this.meanLatency = meanLatency;
    return this;
  }

   /**
   * Get meanLatency
   * @return meanLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEAN_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpLatencyMetricMeanLatency getMeanLatency() {
    return meanLatency;
  }


  @JsonProperty(JSON_PROPERTY_MEAN_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeanLatency(GlobalIpLatencyMetricMeanLatency meanLatency) {
    this.meanLatency = meanLatency;
  }


  public GlobalIpLatencyMetric percentileLatency(GlobalIpLatencyMetricPercentileLatency percentileLatency) {
    this.percentileLatency = percentileLatency;
    return this;
  }

   /**
   * Get percentileLatency
   * @return percentileLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERCENTILE_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpLatencyMetricPercentileLatency getPercentileLatency() {
    return percentileLatency;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTILE_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentileLatency(GlobalIpLatencyMetricPercentileLatency percentileLatency) {
    this.percentileLatency = percentileLatency;
  }


  /**
   * Return true if this GlobalIpLatencyMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpLatencyMetric globalIpLatencyMetric = (GlobalIpLatencyMetric) o;
    return Objects.equals(this.timestamp, globalIpLatencyMetric.timestamp) &&
        Objects.equals(this.globalIp, globalIpLatencyMetric.globalIp) &&
        Objects.equals(this.proberLocation, globalIpLatencyMetric.proberLocation) &&
        Objects.equals(this.meanLatency, globalIpLatencyMetric.meanLatency) &&
        Objects.equals(this.percentileLatency, globalIpLatencyMetric.percentileLatency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, globalIp, proberLocation, meanLatency, percentileLatency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpLatencyMetric {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    proberLocation: ").append(toIndentedString(proberLocation)).append("\n");
    sb.append("    meanLatency: ").append(toIndentedString(meanLatency)).append("\n");
    sb.append("    percentileLatency: ").append(toIndentedString(percentileLatency)).append("\n");
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
