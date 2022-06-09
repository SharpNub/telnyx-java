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
import com.telnyx.sdk.model.CreateDocServiceDocumentRequest;
import com.telnyx.sdk.model.DocServiceDocument;
import com.telnyx.sdk.model.DocServiceDocumentResponse;
import com.telnyx.sdk.model.Errors;
import java.io.File;
import com.telnyx.sdk.model.ListDocServiceDocumentLinksResponse;
import com.telnyx.sdk.model.ListDocServiceDocumentsResposne;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
public class DocumentsApiTest {

    private final DocumentsApi api = new DocumentsApi();

    /**
     * Upload a document
     *
     * Upload a document.&lt;br /&gt;&lt;br /&gt;Uploaded files must be linked to a service within 30 minutes or they will be automatically deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDocumentTest() throws ApiException {
        //CreateDocServiceDocumentRequest createDocServiceDocumentRequest = null;
        //DocServiceDocumentResponse response = api.createDocument(createDocServiceDocumentRequest);
        // TODO: test validations
    }

    /**
     * Delete a document
     *
     * Delete a document.&lt;br /&gt;&lt;br /&gt;A document can only be deleted if it&#39;s not linked to a service. If it is linked to a service, it must be unlinked prior to deleting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentTest() throws ApiException {
        //UUID id = null;
        //DocServiceDocumentResponse response = api.deleteDocument(id);
        // TODO: test validations
    }

    /**
     * Download a document
     *
     * Download a document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadDocServiceDocumentTest() throws ApiException {
        //UUID id = null;
        //File response = api.downloadDocServiceDocument(id);
        // TODO: test validations
    }

    /**
     * List all document links
     *
     * List all documents links ordered by created_at descending.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDocumentLinksTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //UUID filterDocumentId = null;
        //String filterLinkedRecordType = null;
        //UUID filterLinkedResourceId = null;
        //ListDocServiceDocumentLinksResponse response = api.listDocumentLinks(pageNumber, pageSize, filterDocumentId, filterLinkedRecordType, filterLinkedResourceId);
        // TODO: test validations
    }

    /**
     * List all documents
     *
     * List all documents ordered by created_at descending.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDocumentsTest() throws ApiException {
        //String filterFilenameContains = null;
        //String filterCustomerReferenceEq = null;
        //String filterCustomerReferenceIn = null;
        //String filterCreatedAtGt = null;
        //String filterCreatedAtLt = null;
        //String sort = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListDocServiceDocumentsResposne response = api.listDocuments(filterFilenameContains, filterCustomerReferenceEq, filterCustomerReferenceIn, filterCreatedAtGt, filterCreatedAtLt, sort, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Retrieve a document
     *
     * Retrieve a document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveDocumentTest() throws ApiException {
        //UUID id = null;
        //DocServiceDocumentResponse response = api.retrieveDocument(id);
        // TODO: test validations
    }

    /**
     * Update a document
     *
     * Update a document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDocumentTest() throws ApiException {
        //UUID id = null;
        //DocServiceDocument docServiceDocument = null;
        //DocServiceDocumentResponse response = api.updateDocument(id, docServiceDocument);
        // TODO: test validations
    }

}