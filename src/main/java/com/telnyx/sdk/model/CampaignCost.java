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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * CampaignCost
 */
@JsonPropertyOrder({
  CampaignCost.JSON_PROPERTY_CAMPAIGN_USECASE,
  CampaignCost.JSON_PROPERTY_MONTHLY_COST,
  CampaignCost.JSON_PROPERTY_UP_FRONT_COST,
  CampaignCost.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CampaignCost {
  public static final String JSON_PROPERTY_CAMPAIGN_USECASE = "campaignUsecase";
  private String campaignUsecase;

  public static final String JSON_PROPERTY_MONTHLY_COST = "monthlyCost";
  private String monthlyCost;

  public static final String JSON_PROPERTY_UP_FRONT_COST = "upFrontCost";
  private String upFrontCost;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public CampaignCost() { 
  }

  public CampaignCost campaignUsecase(String campaignUsecase) {
    this.campaignUsecase = campaignUsecase;
    return this;
  }

   /**
   * Get campaignUsecase
   * @return campaignUsecase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_USECASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCampaignUsecase() {
    return campaignUsecase;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_USECASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCampaignUsecase(String campaignUsecase) {
    this.campaignUsecase = campaignUsecase;
  }


  public CampaignCost monthlyCost(String monthlyCost) {
    this.monthlyCost = monthlyCost;
    return this;
  }

   /**
   * Get monthlyCost
   * @return monthlyCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MONTHLY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMonthlyCost() {
    return monthlyCost;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonthlyCost(String monthlyCost) {
    this.monthlyCost = monthlyCost;
  }


  public CampaignCost upFrontCost(String upFrontCost) {
    this.upFrontCost = upFrontCost;
    return this;
  }

   /**
   * Get upFrontCost
   * @return upFrontCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UP_FRONT_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUpFrontCost() {
    return upFrontCost;
  }


  @JsonProperty(JSON_PROPERTY_UP_FRONT_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpFrontCost(String upFrontCost) {
    this.upFrontCost = upFrontCost;
  }


  public CampaignCost description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this CampaignCost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCost campaignCost = (CampaignCost) o;
    return Objects.equals(this.campaignUsecase, campaignCost.campaignUsecase) &&
        Objects.equals(this.monthlyCost, campaignCost.monthlyCost) &&
        Objects.equals(this.upFrontCost, campaignCost.upFrontCost) &&
        Objects.equals(this.description, campaignCost.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignUsecase, monthlyCost, upFrontCost, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCost {\n");
    sb.append("    campaignUsecase: ").append(toIndentedString(campaignUsecase)).append("\n");
    sb.append("    monthlyCost: ").append(toIndentedString(monthlyCost)).append("\n");
    sb.append("    upFrontCost: ").append(toIndentedString(upFrontCost)).append("\n");
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
