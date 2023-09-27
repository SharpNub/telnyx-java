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
import com.telnyx.sdk.model.Document1;
import com.telnyx.sdk.model.Image1;
import com.telnyx.sdk.model.Video1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * InteractiveHeader
 */
@JsonPropertyOrder({
  InteractiveHeader.JSON_PROPERTY_TYPE,
  InteractiveHeader.JSON_PROPERTY_TEXT,
  InteractiveHeader.JSON_PROPERTY_VIDEO,
  InteractiveHeader.JSON_PROPERTY_IMAGE,
  InteractiveHeader.JSON_PROPERTY_DOCUMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteractiveHeader {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private Video1 video;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private Image1 image;

  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private Document1 document;

  public InteractiveHeader() { 
  }

  public InteractiveHeader type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The header type you would like to use.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The header type you would like to use.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public InteractiveHeader text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text for the header. Formatting allows emojis, but not markdown.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text for the header. Formatting allows emojis, but not markdown.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public InteractiveHeader video(Video1 video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Video1 getVideo() {
    return video;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(Video1 video) {
    this.video = video;
  }


  public InteractiveHeader image(Image1 image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Image1 getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(Image1 image) {
    this.image = image;
  }


  public InteractiveHeader document(Document1 document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Document1 getDocument() {
    return document;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocument(Document1 document) {
    this.document = document;
  }


  /**
   * Return true if this InteractiveHeader object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveHeader interactiveHeader = (InteractiveHeader) o;
    return Objects.equals(this.type, interactiveHeader.type) &&
        Objects.equals(this.text, interactiveHeader.text) &&
        Objects.equals(this.video, interactiveHeader.video) &&
        Objects.equals(this.image, interactiveHeader.image) &&
        Objects.equals(this.document, interactiveHeader.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, video, image, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveHeader {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
