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
import com.telnyx.sdk.model.CreateManagedAccountRequest;
import com.telnyx.sdk.model.ListManagedAccountsResponse;
import com.telnyx.sdk.model.ManagedAccountResponse;
import com.telnyx.sdk.model.UnprocessableManagedAccountEntity;
import com.telnyx.sdk.model.UpdateManagedAccountRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagedAccountsApi
 */
public class ManagedAccountsApiTest {

    private final ManagedAccountsApi api = new ManagedAccountsApi();

    /**
     * Create a new managed account.
     *
     * Create a new managed account owned by the authenticated user. You need to be explictly approved by Telnyx in order to become a manager account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createManagedAccountTest() throws ApiException {
        //CreateManagedAccountRequest createManagedAccountRequest = null;
        //ManagedAccountResponse response = api.createManagedAccount(createManagedAccountRequest);
        // TODO: test validations
    }

    /**
     * Disables a managed account
     *
     * Disables a managed account, forbidding it to use Telnyx services, including sending or receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed account and its sub-users will still be able to log in via the mission control portal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableManagedAccountTest() throws ApiException {
        //String id = null;
        //ManagedAccountResponse response = api.disableManagedAccount(id);
        // TODO: test validations
    }

    /**
     * Enables a managed account
     *
     * Enables a managed account and its sub-users to use Telnyx services.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableManagedAccountTest() throws ApiException {
        //String id = null;
        //ManagedAccountResponse response = api.enableManagedAccount(id);
        // TODO: test validations
    }

    /**
     * Lists accounts managed by the current user.
     *
     * Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx in order to become manager accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listManagedAccountsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterEmailContains = null;
        //String filterEmailEq = null;
        //String sort = null;
        //ListManagedAccountsResponse response = api.listManagedAccounts(pageNumber, pageSize, filterEmailContains, filterEmailEq, sort);
        // TODO: test validations
    }

    /**
     * Retrieve a managed account
     *
     * Retrieves the details of a single managed account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveManagedAccountTest() throws ApiException {
        //String id = null;
        //ManagedAccountResponse response = api.retrieveManagedAccount(id);
        // TODO: test validations
    }

    /**
     * Update a managed account
     *
     * Update a single managed account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateManagedAccountTest() throws ApiException {
        //String id = null;
        //UpdateManagedAccountRequest updateManagedAccountRequest = null;
        //ManagedAccountResponse response = api.updateManagedAccount(id, updateManagedAccountRequest);
        // TODO: test validations
    }

}
