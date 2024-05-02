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
import com.telnyx.sdk.model.CreatePortingReportRequestParams;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * The parameters for generating a new porting related report.
 */
@ApiModel(description = "The parameters for generating a new porting related report.")
@JsonPropertyOrder({
  CreatePortingReportRequest.JSON_PROPERTY_REPORT_TYPE,
  CreatePortingReportRequest.JSON_PROPERTY_PARAMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreatePortingReportRequest {
  /**
   * Identifies the type of report
   */
  public enum ReportTypeEnum {
    EXPORT_PORTING_ORDERS_CSV("export_porting_orders_csv");

    private String value;

    ReportTypeEnum(String value) {
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
    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REPORT_TYPE = "report_type";
  private ReportTypeEnum reportType;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private CreatePortingReportRequestParams params;

  public CreatePortingReportRequest() { 
  }

  public CreatePortingReportRequest reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Identifies the type of report
   * @return reportType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "export_porting_orders_csv", required = true, value = "Identifies the type of report")
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReportTypeEnum getReportType() {
    return reportType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  public CreatePortingReportRequest params(CreatePortingReportRequestParams params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreatePortingReportRequestParams getParams() {
    return params;
  }


  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParams(CreatePortingReportRequestParams params) {
    this.params = params;
  }


  /**
   * Return true if this CreatePortingReport_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePortingReportRequest createPortingReportRequest = (CreatePortingReportRequest) o;
    return Objects.equals(this.reportType, createPortingReportRequest.reportType) &&
        Objects.equals(this.params, createPortingReportRequest.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePortingReportRequest {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
