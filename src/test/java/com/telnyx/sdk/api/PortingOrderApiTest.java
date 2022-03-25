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
import com.telnyx.sdk.model.CreatePortingOrder;
import com.telnyx.sdk.model.CreatePortingOrderComment;
import java.io.File;
import com.telnyx.sdk.model.ListAllowedFocWindow;
import com.telnyx.sdk.model.ListDraftPortingOrderWithoutPagination;
import com.telnyx.sdk.model.ListPortingOrder;
import com.telnyx.sdk.model.ListPortingOrderDocuments;
import com.telnyx.sdk.model.ListPortingOrdersActivationJobs;
import com.telnyx.sdk.model.ListPortingOrdersComments;
import com.telnyx.sdk.model.ListPortingOrdersExceptionTypes;
import com.telnyx.sdk.model.ListPortingPhoneNumbers;
import com.telnyx.sdk.model.PortabilityStatus;
import com.telnyx.sdk.model.PortingOrderActivationStatus;
import com.telnyx.sdk.model.PortingOrderDocumentsCreated;
import com.telnyx.sdk.model.PortingOrderType;
import com.telnyx.sdk.model.ShowPortingOrder;
import com.telnyx.sdk.model.ShowPortingOrderComment;
import com.telnyx.sdk.model.ShowPortingOrdersActivationJob;
import com.telnyx.sdk.model.SubRequestByPortingOrder;
import com.telnyx.sdk.model.UNKNOWN_BASE_TYPE;
import java.util.UUID;
import com.telnyx.sdk.model.UpdatePortingOrder;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortingOrderApi
 */
public class PortingOrderApiTest {

    private final PortingOrderApi api = new PortingOrderApi();

    /**
     * Activates every number on a porting order.
     *
     * Activate every numbers of a porting order asynchronously.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activatePortingOrderTest() throws ApiException {
        //UUID id = null;
        //ShowPortingOrdersActivationJob response = api.activatePortingOrder(id);
        // TODO: test validations
    }

    /**
     * Cancel a porting order
     *
     * Cancel a porting order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelPortingOrderTest() throws ApiException {
        //UUID id = null;
        //ShowPortingOrder response = api.cancelPortingOrder(id);
        // TODO: test validations
    }

    /**
     * Submit a porting order.
     *
     * Confirm and submit your porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmPortingOrderTest() throws ApiException {
        //UUID id = null;
        //ShowPortingOrder response = api.confirmPortingOrder(id);
        // TODO: test validations
    }

    /**
     * Create a porting order
     *
     * Creates a new porting order object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPortingOrderTest() throws ApiException {
        //CreatePortingOrder createPortingOrder = null;
        //ListDraftPortingOrderWithoutPagination response = api.createPortingOrder(createPortingOrder);
        // TODO: test validations
    }

    /**
     * Create a comment for a porting order
     *
     * Creates a new comment for a porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPortingOrderCommentTest() throws ApiException {
        //UUID id = null;
        //CreatePortingOrderComment createPortingOrderComment = null;
        //ShowPortingOrderComment response = api.createPortingOrderComment(id, createPortingOrderComment);
        // TODO: test validations
    }

    /**
     * Delete a porting order
     *
     * Deletes an existing porting order. This operation is restrict to porting orders in draft state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortingOrderTest() throws ApiException {
        //UUID id = null;
        //api.deletePortingOrder(id);
        // TODO: test validations
    }

    /**
     * Retrieve a porting order
     *
     * Retrieves the details of an existing porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortingOrderTest() throws ApiException {
        //UUID id = null;
        //Boolean includePhoneNumbers = null;
        //ShowPortingOrder response = api.getPortingOrder(id, includePhoneNumbers);
        // TODO: test validations
    }

    /**
     * Download a porting order loa template
     *
     * Download a porting order loa template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortingOrderLOATemplateTest() throws ApiException {
        //UUID id = null;
        //File response = api.getPortingOrderLOATemplate(id);
        // TODO: test validations
    }

    /**
     * Retrieve the associated V1 sub_request_id and port_request_id
     *
     * Retrieve the associated V1 sub_request_id and port_request_id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortingOrderSubRequestTest() throws ApiException {
        //UUID id = null;
        //SubRequestByPortingOrder response = api.getPortingOrderSubRequest(id);
        // TODO: test validations
    }

    /**
     * Retrieve a porting activation job
     *
     * Returns a porting activation job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortingOrdersActivationJobTest() throws ApiException {
        //UUID id = null;
        //UUID activationJobId = null;
        //ShowPortingOrdersActivationJob response = api.getPortingOrdersActivationJob(id, activationJobId);
        // TODO: test validations
    }

    /**
     * List allowed FOC dates
     *
     * Returns a list of allowed FOC dates for a porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllowedFocWindowsTest() throws ApiException {
        //UUID id = null;
        //ListAllowedFocWindow response = api.listAllowedFocWindows(id);
        // TODO: test validations
    }

    /**
     * List all documents associated with a porting order
     *
     * Returns a list of all documents associated with a porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortingOrderDocumentsTest() throws ApiException {
        //UUID id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListPortingOrderDocuments response = api.listPortingOrderDocuments(id, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List all porting orders
     *
     * Returns a list of your porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortingOrdersTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //Boolean includePhoneNumbers = null;
        //String filterStatus = null;
        //String filterCustomerReference = null;
        //String filterPhoneNumbersCountryCode = null;
        //String filterPhoneNumbersCarrierName = null;
        //PortingOrderType filterMiscType = null;
        //String filterEndUserAdminEntityName = null;
        //String filterEndUserAdminAuthPersonName = null;
        //Boolean filterActivationSettingsFastPortEligible = null;
        //String filterActivationSettingsFocDatetimeRequestedGt = null;
        //String filterActivationSettingsFocDatetimeRequestedLt = null;
        //String sort = null;
        //ListPortingOrder response = api.listPortingOrders(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterCustomerReference, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, sort);
        // TODO: test validations
    }

    /**
     * List all porting activation jobs
     *
     * Returns a list of your porting activation jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortingOrdersActivationJobsTest() throws ApiException {
        //UUID id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListPortingOrdersActivationJobs response = api.listPortingOrdersActivationJobs(id, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List all comments of a porting order
     *
     * Returns a list of all comments of a porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortingOrdersCommentsTest() throws ApiException {
        //UUID id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListPortingOrdersComments response = api.listPortingOrdersComments(id, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List all exception types
     *
     * Returns a list of all possible exception types for a porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortingOrdersExceptionTypesTest() throws ApiException {
        //ListPortingOrdersExceptionTypes response = api.listPortingOrdersExceptionTypes();
        // TODO: test validations
    }

    /**
     * List all porting phone numbers
     *
     * Returns a list of your porting phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortingPhoneNumbersTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //UUID filterPortingOrderId = null;
        //List<UUID> filterPortingOrderIdIn = null;
        //String filterSupportKeyEq = null;
        //List<String> filterSupportKeyIn = null;
        //String filterPhoneNumber = null;
        //List<String> filterPhoneNumberIn = null;
        //String filterPortingOrderStatus = null;
        //PortingOrderActivationStatus filterActivationStatus = null;
        //PortabilityStatus filterPortabilityStatus = null;
        //ListPortingPhoneNumbers response = api.listPortingPhoneNumbers(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus);
        // TODO: test validations
    }

    /**
     * Edit a porting order
     *
     * Edits the details of an existing porting order.  Any or all of a porting order’s attributes may be included in the resource object included in a PATCH request.  If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePortingOrderTest() throws ApiException {
        //UUID id = null;
        //UpdatePortingOrder updatePortingOrder = null;
        //ShowPortingOrder response = api.updatePortingOrder(id, updatePortingOrder);
        // TODO: test validations
    }

    /**
     * Associate a list of documents with a porting order
     *
     * Associate a list of documents with a porting order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadPortingOrderDocumentsTest() throws ApiException {
        //UUID id = null;
        //UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = null;
        //PortingOrderDocumentsCreated response = api.uploadPortingOrderDocuments(id, UNKNOWN_BASE_TYPE);
        // TODO: test validations
    }

}
