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


package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import java.util.*;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * API tests for NumberConfigurationsApi
 */
public class NumberConfigurationsApiTest {

    private final NumberConfigurationsApi api = new NumberConfigurationsApi();
    private final NumberSearchApi numberSearchApi = new NumberSearchApi();
    private final NumberOrdersApi numberOrdersApi = new NumberOrdersApi();
    private final String connectionId = "1476046853102371900";

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);
    }

    /**
     * List all phone numbers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get_all_of_your_phone_numbers() throws ApiException {
        ListPhoneNumbersResponse actualResponse = api.listPhoneNumbers()
                .pageNumber(0)
                .pageSize(1000)
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * Get specific phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get_a_specific_phone_number() throws ApiException {
        String phoneNumber = null;

        try {
            phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number to retrieve: " + e.getResponseBody());
        }

        ListPhoneNumbersResponse actualResponse = api.listPhoneNumbers()
                .pageNumber(0)
                .pageSize(1)
                .filterPhoneNumber(phoneNumber)
                .execute();

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * View voice settings of all phone numbers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void view_voice_settings_of_all_phone_numbers() throws ApiException {
        ListPhoneNumbersWithVoiceSettingsResponse actualResponse = api.listPhoneNumbersWithVoiceSettings()
                .pageNumber(0)
                .pageSize(100)
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * View voice settings of specific phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void view_voice_settings_of_a_specific_phone_number() throws ApiException {
        String phoneNumberId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .filterFeatures(asList("sms", "voice"))
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));

            phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number to retrieve: " + e.getResponseBody());
        }

        RetrievePhoneNumberVoiceResponse actualResponse = api.retrievePhoneNumberWithVoiceSettings(phoneNumberId);

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Enable inbound call recording on a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update_the_voice_settings_of_a_phone_number_to_enable_inbound_call_recording() throws ApiException {
        String phoneNumberId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .filterFeatures(asList("sms", "voice"))
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));

            phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number to update: " + e.getResponseBody());
        }

        RetrievePhoneNumberVoiceResponse response = api.updatePhoneNumberWithVoiceSettings(phoneNumberId,
                new UpdatePhoneNumberVoiceSettingsRequest()
                        .callRecording(new CallRecording().inboundCallRecordingEnabled(true)));

        assertNotNull(response);
        assertNotNull(response.getData());
    }

    /**
     * Attach new connection to a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update_the_voice_settings_of_a_phone_number_to_attach_the_number_to_a_new_connection() throws ApiException {
        String phoneNumberId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .filterFeatures(asList("sms", "voice"))
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber)))).getData().getId();

            phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number to update: " + e.getResponseBody());
        }

        PhoneNumberResponse actualResponse = api.updatePhoneNumber(phoneNumberId, new UpdatePhoneNumberRequest().connectionId(connectionId));

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Enable emergency on a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enable_emergency_on_a_phone_number() throws ApiException {
        String countryCode = "US";
        String phoneNumberId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterCountryCode(countryCode)
                    .filterLimit(1)
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));

            phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number: " + e.getResponseBody());
        }

        PhoneNumberEnableEmergency actualResponse = api.enableEmergencyPhoneNumber(
                phoneNumberId, new PhoneNumberEnableEmergencyRequest()
                        .emergencyAddressId(TestConfiguration.EMERGENCY_ADDRESS_ID)
                        .emergencyEnabled(true));

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * List phone number message settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void view_messaging_settings_of_all_phone_numbers() throws ApiException {
        ListMessagingSettingsResponse actualResponse = api.listPhoneNumbersWithMessagingSettings()
                .pageNumber(1)
                .pageSize(10)
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * Retrieve phone number with message settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void view_messaging_settings_of_a_specific_phone_number() throws ApiException {
        String phoneNumberId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .filterFeatures(asList("sms", "voice"))
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));

            phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number: " + e.getResponseBody());
        }

        RetrieveMessagingSettingsResponse actualResponse = api.retrievePhoneNumberWithMessagingSettings(phoneNumberId);

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Attach new messaging profile to phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update_the_messaging_settings_of_a_phone_number_to_attach_the_number_to_a_new_messaging_profile() throws ApiException {
        String targetMessagingProfileId = "400174f2-6eb8-429b-a946-a27646a94a1a";
        String phoneNumberId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .filterFeatures(asList("sms", "voice"))
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));

            phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number: " + e.getResponseBody());
        }

        RetrieveMessagingSettingsResponse actualResponse = api.updatePhoneNumberWithMessagingSettings(
                phoneNumberId,
                new UpdatePhoneNumberMessagingSettingsRequest()
                        .messagingProfileId(targetMessagingProfileId));

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Get second page of phone number results
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get_the_second_page_of_results_for_phone_numbers() throws ApiException {
        ListPhoneNumbersResponse actualResponse = api.listPhoneNumbers()
                .pageNumber(1)
                .pageSize(10)
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * Get a page of results with only 2 phone numbers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get_a_page_of_results_that_only_has_2_results_for_phone_numbers() throws ApiException {
        ListPhoneNumbersResponse actualResponse = api.listPhoneNumbers()
                .pageNumber(0)
                .pageSize(2)
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * Filter phone numbers by tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filter_phone_numbers_for_numbers_by_tag() throws ApiException {
        final String tag = "TEST_TAG";

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(new CreateNumberOrderRequest()
                    .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));

            String phoneNumberId = Objects.requireNonNull(api.retrievePhoneNumber(phoneNumber)
                    .getData())
                    .getId();

            api.updatePhoneNumber(
                    phoneNumberId,
                    new UpdatePhoneNumberRequest()
                            .tags(Collections.singletonList(tag)));
        } catch (ApiException e) {
            fail("Test Setup Failure - Unable to create phone number to with tag: " + e.getResponseBody());
        }

        ListPhoneNumbersResponse actualResponse = api.listPhoneNumbers()
                .pageNumber(0)
                .pageSize(2)
                .filterTag(tag)
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * Delete a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePhoneNumberTest() throws ApiException {
        //String id = null;
        //PhoneNumberResponse response = api.deletePhoneNumber(id);
        // TODO: test validations
    }

    /**
     * Retrieve a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrievePhoneNumberTest() throws ApiException {
        //String id = null;
        //PhoneNumberResponse response = api.retrievePhoneNumber(id);
        // TODO: test validations
    }

}
