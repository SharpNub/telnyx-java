/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Optional configuration parameters to modify &#x27;answering_machine_detection&#x27; performance.
 */
@Schema(description = "Optional configuration parameters to modify 'answering_machine_detection' performance.")

public class TransferCallRequestAnsweringMachineDetectionConfig {
  @SerializedName("total_analysis_time_millis")
  private Integer totalAnalysisTimeMillis = 3500;

  @SerializedName("after_greeting_silence_millis")
  private Integer afterGreetingSilenceMillis = 800;

  @SerializedName("between_words_silence_millis")
  private Integer betweenWordsSilenceMillis = 50;

  @SerializedName("greeting_duration_millis")
  private Integer greetingDurationMillis = 3500;

  @SerializedName("initial_silence_millis")
  private Integer initialSilenceMillis = 3500;

  @SerializedName("maximum_number_of_words")
  private Integer maximumNumberOfWords = 5;

  @SerializedName("maximum_word_length_millis")
  private Integer maximumWordLengthMillis = 3500;

  @SerializedName("silence_threshold")
  private Integer silenceThreshold = 256;

  @SerializedName("greeting_total_analysis_time_millis")
  private Integer greetingTotalAnalysisTimeMillis = 5000;

  @SerializedName("greeting_silence_duration_millis")
  private Integer greetingSilenceDurationMillis = 1500;

  public TransferCallRequestAnsweringMachineDetectionConfig totalAnalysisTimeMillis(Integer totalAnalysisTimeMillis) {
    this.totalAnalysisTimeMillis = totalAnalysisTimeMillis;
    return this;
  }

   /**
   * Maximum timeout threshold for overall detection.
   * @return totalAnalysisTimeMillis
  **/
  @Schema(example = "5000", description = "Maximum timeout threshold for overall detection.")
  public Integer getTotalAnalysisTimeMillis() {
    return totalAnalysisTimeMillis;
  }

  public void setTotalAnalysisTimeMillis(Integer totalAnalysisTimeMillis) {
    this.totalAnalysisTimeMillis = totalAnalysisTimeMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig afterGreetingSilenceMillis(Integer afterGreetingSilenceMillis) {
    this.afterGreetingSilenceMillis = afterGreetingSilenceMillis;
    return this;
  }

   /**
   * Silence duration threshold after a greeting message or voice for it be considered human.
   * @return afterGreetingSilenceMillis
  **/
  @Schema(example = "1000", description = "Silence duration threshold after a greeting message or voice for it be considered human.")
  public Integer getAfterGreetingSilenceMillis() {
    return afterGreetingSilenceMillis;
  }

  public void setAfterGreetingSilenceMillis(Integer afterGreetingSilenceMillis) {
    this.afterGreetingSilenceMillis = afterGreetingSilenceMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig betweenWordsSilenceMillis(Integer betweenWordsSilenceMillis) {
    this.betweenWordsSilenceMillis = betweenWordsSilenceMillis;
    return this;
  }

   /**
   * Maximum threshold for silence between words.
   * @return betweenWordsSilenceMillis
  **/
  @Schema(example = "100", description = "Maximum threshold for silence between words.")
  public Integer getBetweenWordsSilenceMillis() {
    return betweenWordsSilenceMillis;
  }

  public void setBetweenWordsSilenceMillis(Integer betweenWordsSilenceMillis) {
    this.betweenWordsSilenceMillis = betweenWordsSilenceMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig greetingDurationMillis(Integer greetingDurationMillis) {
    this.greetingDurationMillis = greetingDurationMillis;
    return this;
  }

   /**
   * Maximum threshold of a human greeting. If greeting longer than this value, considered machine.
   * @return greetingDurationMillis
  **/
  @Schema(example = "1500", description = "Maximum threshold of a human greeting. If greeting longer than this value, considered machine.")
  public Integer getGreetingDurationMillis() {
    return greetingDurationMillis;
  }

  public void setGreetingDurationMillis(Integer greetingDurationMillis) {
    this.greetingDurationMillis = greetingDurationMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig initialSilenceMillis(Integer initialSilenceMillis) {
    this.initialSilenceMillis = initialSilenceMillis;
    return this;
  }

   /**
   * If initial silence duration is greater than this value, consider it a machine.
   * @return initialSilenceMillis
  **/
  @Schema(example = "1800", description = "If initial silence duration is greater than this value, consider it a machine.")
  public Integer getInitialSilenceMillis() {
    return initialSilenceMillis;
  }

  public void setInitialSilenceMillis(Integer initialSilenceMillis) {
    this.initialSilenceMillis = initialSilenceMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig maximumNumberOfWords(Integer maximumNumberOfWords) {
    this.maximumNumberOfWords = maximumNumberOfWords;
    return this;
  }

   /**
   * If number of detected words is greater than this value, consder it a machine.
   * @return maximumNumberOfWords
  **/
  @Schema(example = "3", description = "If number of detected words is greater than this value, consder it a machine.")
  public Integer getMaximumNumberOfWords() {
    return maximumNumberOfWords;
  }

  public void setMaximumNumberOfWords(Integer maximumNumberOfWords) {
    this.maximumNumberOfWords = maximumNumberOfWords;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig maximumWordLengthMillis(Integer maximumWordLengthMillis) {
    this.maximumWordLengthMillis = maximumWordLengthMillis;
    return this;
  }

   /**
   * If a single word lasts longer than this threshold, consider it a machine.
   * @return maximumWordLengthMillis
  **/
  @Schema(example = "2000", description = "If a single word lasts longer than this threshold, consider it a machine.")
  public Integer getMaximumWordLengthMillis() {
    return maximumWordLengthMillis;
  }

  public void setMaximumWordLengthMillis(Integer maximumWordLengthMillis) {
    this.maximumWordLengthMillis = maximumWordLengthMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig silenceThreshold(Integer silenceThreshold) {
    this.silenceThreshold = silenceThreshold;
    return this;
  }

   /**
   * Minimum noise threshold for any analysis.
   * @return silenceThreshold
  **/
  @Schema(example = "512", description = "Minimum noise threshold for any analysis.")
  public Integer getSilenceThreshold() {
    return silenceThreshold;
  }

  public void setSilenceThreshold(Integer silenceThreshold) {
    this.silenceThreshold = silenceThreshold;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig greetingTotalAnalysisTimeMillis(Integer greetingTotalAnalysisTimeMillis) {
    this.greetingTotalAnalysisTimeMillis = greetingTotalAnalysisTimeMillis;
    return this;
  }

   /**
   * If machine already detected, maximum timeout threshold to determine the end of the machine greeting.
   * @return greetingTotalAnalysisTimeMillis
  **/
  @Schema(example = "7500", description = "If machine already detected, maximum timeout threshold to determine the end of the machine greeting.")
  public Integer getGreetingTotalAnalysisTimeMillis() {
    return greetingTotalAnalysisTimeMillis;
  }

  public void setGreetingTotalAnalysisTimeMillis(Integer greetingTotalAnalysisTimeMillis) {
    this.greetingTotalAnalysisTimeMillis = greetingTotalAnalysisTimeMillis;
  }

  public TransferCallRequestAnsweringMachineDetectionConfig greetingSilenceDurationMillis(Integer greetingSilenceDurationMillis) {
    this.greetingSilenceDurationMillis = greetingSilenceDurationMillis;
    return this;
  }

   /**
   * If machine already detected, maximum threshold for silence between words. If exceeded, the greeting is considered ended.
   * @return greetingSilenceDurationMillis
  **/
  @Schema(example = "2000", description = "If machine already detected, maximum threshold for silence between words. If exceeded, the greeting is considered ended.")
  public Integer getGreetingSilenceDurationMillis() {
    return greetingSilenceDurationMillis;
  }

  public void setGreetingSilenceDurationMillis(Integer greetingSilenceDurationMillis) {
    this.greetingSilenceDurationMillis = greetingSilenceDurationMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCallRequestAnsweringMachineDetectionConfig transferCallRequestAnsweringMachineDetectionConfig = (TransferCallRequestAnsweringMachineDetectionConfig) o;
    return Objects.equals(this.totalAnalysisTimeMillis, transferCallRequestAnsweringMachineDetectionConfig.totalAnalysisTimeMillis) &&
        Objects.equals(this.afterGreetingSilenceMillis, transferCallRequestAnsweringMachineDetectionConfig.afterGreetingSilenceMillis) &&
        Objects.equals(this.betweenWordsSilenceMillis, transferCallRequestAnsweringMachineDetectionConfig.betweenWordsSilenceMillis) &&
        Objects.equals(this.greetingDurationMillis, transferCallRequestAnsweringMachineDetectionConfig.greetingDurationMillis) &&
        Objects.equals(this.initialSilenceMillis, transferCallRequestAnsweringMachineDetectionConfig.initialSilenceMillis) &&
        Objects.equals(this.maximumNumberOfWords, transferCallRequestAnsweringMachineDetectionConfig.maximumNumberOfWords) &&
        Objects.equals(this.maximumWordLengthMillis, transferCallRequestAnsweringMachineDetectionConfig.maximumWordLengthMillis) &&
        Objects.equals(this.silenceThreshold, transferCallRequestAnsweringMachineDetectionConfig.silenceThreshold) &&
        Objects.equals(this.greetingTotalAnalysisTimeMillis, transferCallRequestAnsweringMachineDetectionConfig.greetingTotalAnalysisTimeMillis) &&
        Objects.equals(this.greetingSilenceDurationMillis, transferCallRequestAnsweringMachineDetectionConfig.greetingSilenceDurationMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAnalysisTimeMillis, afterGreetingSilenceMillis, betweenWordsSilenceMillis, greetingDurationMillis, initialSilenceMillis, maximumNumberOfWords, maximumWordLengthMillis, silenceThreshold, greetingTotalAnalysisTimeMillis, greetingSilenceDurationMillis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCallRequestAnsweringMachineDetectionConfig {\n");
    
    sb.append("    totalAnalysisTimeMillis: ").append(toIndentedString(totalAnalysisTimeMillis)).append("\n");
    sb.append("    afterGreetingSilenceMillis: ").append(toIndentedString(afterGreetingSilenceMillis)).append("\n");
    sb.append("    betweenWordsSilenceMillis: ").append(toIndentedString(betweenWordsSilenceMillis)).append("\n");
    sb.append("    greetingDurationMillis: ").append(toIndentedString(greetingDurationMillis)).append("\n");
    sb.append("    initialSilenceMillis: ").append(toIndentedString(initialSilenceMillis)).append("\n");
    sb.append("    maximumNumberOfWords: ").append(toIndentedString(maximumNumberOfWords)).append("\n");
    sb.append("    maximumWordLengthMillis: ").append(toIndentedString(maximumWordLengthMillis)).append("\n");
    sb.append("    silenceThreshold: ").append(toIndentedString(silenceThreshold)).append("\n");
    sb.append("    greetingTotalAnalysisTimeMillis: ").append(toIndentedString(greetingTotalAnalysisTimeMillis)).append("\n");
    sb.append("    greetingSilenceDurationMillis: ").append(toIndentedString(greetingSilenceDurationMillis)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
