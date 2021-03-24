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
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumberBlocksBackgroundJobsResponse;
import com.telnyx.sdk.model.PhoneNumberBlocksJob;
import com.telnyx.sdk.model.PhoneNumberBlocksJobDeletePhoneNumberBlock;
import com.telnyx.sdk.model.PhoneNumberBlocksJobDeletePhoneNumberBlockRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NumberBlocksBackgroundJobsApi
 */
public class NumberBlocksBackgroundJobsApiTest {

    private final NumberBlocksBackgroundJobsApi api = new NumberBlocksBackgroundJobsApi();

    /**
     * Deletes all numbers associated with a phone number block
     *
     * Creates a new background job to delete all the phone numbers associated with the given block. We will only consider the phone number block as deleted after all phone numbers associated with it are removed, so multiple executions of this job may be necessary in case some of the phone numbers present errors during the deletion process.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPhoneNumberBlocksJobDeletePhoneNumberBlockTest() throws ApiException {
        //PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest = null;
        //PhoneNumberBlocksJobDeletePhoneNumberBlock response = api.createPhoneNumberBlocksJobDeletePhoneNumberBlock()
        //        .phoneNumberBlocksJobDeletePhoneNumberBlockRequest(phoneNumberBlocksJobDeletePhoneNumberBlockRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Lists the phone number blocks jobs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumberBlocksJobsTest() throws ApiException {
        //String filterType = null;
        //String filterStatus = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String sort = null;
        //ListPhoneNumberBlocksBackgroundJobsResponse response = api.listPhoneNumberBlocksJobs()
        //        .filterType(filterType)
        //        .filterStatus(filterStatus)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a phone number blocks job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePhoneNumberBlocksJobTest() throws ApiException {
        //String id = null;
        //PhoneNumberBlocksJob response = api.retrievePhoneNumberBlocksJob(id)
        //        .execute();
        // TODO: test validations
    }

}