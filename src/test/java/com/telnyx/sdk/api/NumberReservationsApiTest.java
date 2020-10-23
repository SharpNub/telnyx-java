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
import com.telnyx.sdk.auth.HttpBearerAuth;
import com.telnyx.sdk.model.*;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * API tests for NumberReservationsApi
 */
public class NumberReservationsApiTest {

    private final NumberReservationsApi api = new NumberReservationsApi();
    private final NumberSearchApi numberSearchApi = new NumberSearchApi();

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);
    }

    /**
     * Create a number reservation
     * <p>
     * Creates a Phone Number Reservation for multiple numbers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNumberReservationTest() throws ApiException {
        List<AvailablePhoneNumber> availableNumbers = numberSearchApi
                .listAvailablePhoneNumbers()
                .filterLimit(2)
                .execute()
                .getData();

        List<ReservedPhoneNumber> numbersToReserve = availableNumbers
                .stream()
                .map(AvailablePhoneNumber::getPhoneNumber)
                .map(phoneNumber -> new ReservedPhoneNumber().phoneNumber(phoneNumber))
                .collect(Collectors.toList());

        CreateNumberReservationRequest createNumberReservationRequest = new CreateNumberReservationRequest()
                .phoneNumbers(numbersToReserve);

        NumberReservationResponse actualResponse = api.createNumberReservation(createNumberReservationRequest);

        assertEquals(numbersToReserve.size(), actualResponse.getData().getPhoneNumbers().size());
    }

    /**
     * Reserve a US phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reserve_a_US_phone_number() throws ApiException {
        String countryCode = "US";
        String phoneNumber = null;

        try {
            phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterCountryCode(countryCode)
                    .filterLimit(1)
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();
        } catch (Exception e) {
            fail("Test Setup Failure - Unable to find available number to reserve");
        }

        NumberReservationResponse actualResponse = api.createNumberReservation(
                new CreateNumberReservationRequest()
                        .addPhoneNumbersItem(new ReservedPhoneNumber().phoneNumber(phoneNumber)));

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Extend reservation of a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void extend_the_reservation_of_a_phone_number() throws ApiException {
        UUID reservationId = null;

        try {
            String phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(1)
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            reservationId = Objects.requireNonNull(api.createNumberReservation(
                    new CreateNumberReservationRequest()
                            .addPhoneNumbersItem(new ReservedPhoneNumber().phoneNumber(phoneNumber)))
                    .getData())
                    .getId();

            if(reservationId == null) {
                throw new Exception();
            }
        } catch (Exception e) {
            fail("Test Setup Failure");
        }

        NumberReservationResponse actualResponse = api.extendNumberReservationExpiryTime(reservationId.toString());

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Reserve 5 phone numbers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reserve_5_phone_numbers() throws ApiException {
        List<String> phoneNumbers = new ArrayList<>();

        try {
            phoneNumbers = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterLimit(5)
                    .execute()
                    .getData())
                    .stream()
                    .map(AvailablePhoneNumber::getPhoneNumber)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            fail("Test Setup Failure - unable to find 5 phone numbers to to reserve");
        }

        List<ReservedPhoneNumber> reservedPhoneNumbers = phoneNumbers.stream()
                .map(phoneNumber -> new ReservedPhoneNumber().phoneNumber(phoneNumber))
                .collect(Collectors.toList());
        NumberReservationResponse actualResponse = api.createNumberReservation(
                new CreateNumberReservationRequest().phoneNumbers(reservedPhoneNumbers));

        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getData());
    }

    /**
     * Extend a number reservation
     * <p>
     * Extends reservation expiry time on all phone numbers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void extendNumberReservationExpiryTimeTest() throws ApiException {
        //String numberReservationId = null;
        //NumberReservationResponse response = api.extendNumberReservationExpiryTime(numberReservationId);
        // TODO: test validations
    }

    /**
     * List number reservations
     * <p>
     * Gets a paginated list of phone number reservations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listNumberReservationsTest() throws ApiException {
        //String filterStatus = null;
        //String filterCreatedAtGt = null;
        //String filterCreatedAtLt = null;
        //String filterPhoneNumbersPhoneNumber = null;
        //String filterCustomerReference = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListNumberReservationsResponse response = api.listNumberReservations()
        //        .filterStatus(filterStatus)
        //        .filterCreatedAtGt(filterCreatedAtGt)
        //        .filterCreatedAtLt(filterCreatedAtLt)
        //        .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
        //        .filterCustomerReference(filterCustomerReference)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a number reservation
     * <p>
     * Gets a single phone number reservation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveNumberReservationTest() throws ApiException {
        //String numberReservationId = null;
        //NumberReservationResponse response = api.retrieveNumberReservation(numberReservationId);
        // TODO: test validations
    }

}
