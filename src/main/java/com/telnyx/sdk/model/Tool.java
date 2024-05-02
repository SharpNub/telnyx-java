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
import com.telnyx.sdk.model.FunctionDetailOutput;
import com.telnyx.sdk.model.RetrievalDetail;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * Tool
 */
@JsonPropertyOrder({
  Tool.JSON_PROPERTY_TOOL_ID,
  Tool.JSON_PROPERTY_TYPE,
  Tool.JSON_PROPERTY_NAME,
  Tool.JSON_PROPERTY_DESCRIPTION,
  Tool.JSON_PROPERTY_FUNCTION,
  Tool.JSON_PROPERTY_RETRIEVAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Tool {
  public static final String JSON_PROPERTY_TOOL_ID = "tool_id";
  private String toolId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    RETRIEVAL("retrieval"),
    
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private FunctionDetailOutput function;

  public static final String JSON_PROPERTY_RETRIEVAL = "retrieval";
  private RetrievalDetail retrieval;

  public Tool() { 
  }

  public Tool toolId(String toolId) {
    this.toolId = toolId;
    return this;
  }

   /**
   * Get toolId
   * @return toolId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOOL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToolId() {
    return toolId;
  }


  @JsonProperty(JSON_PROPERTY_TOOL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToolId(String toolId) {
    this.toolId = toolId;
  }


  public Tool type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Tool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Tool description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Tool function(FunctionDetailOutput function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FunctionDetailOutput getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(FunctionDetailOutput function) {
    this.function = function;
  }


  public Tool retrieval(RetrievalDetail retrieval) {
    this.retrieval = retrieval;
    return this;
  }

   /**
   * Get retrieval
   * @return retrieval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETRIEVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetrievalDetail getRetrieval() {
    return retrieval;
  }


  @JsonProperty(JSON_PROPERTY_RETRIEVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetrieval(RetrievalDetail retrieval) {
    this.retrieval = retrieval;
  }


  /**
   * Return true if this Tool object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.toolId, tool.toolId) &&
        Objects.equals(this.type, tool.type) &&
        Objects.equals(this.name, tool.name) &&
        Objects.equals(this.description, tool.description) &&
        Objects.equals(this.function, tool.function) &&
        Objects.equals(this.retrieval, tool.retrieval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolId, type, name, description, function, retrieval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    retrieval: ").append(toIndentedString(retrieval)).append("\n");
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
