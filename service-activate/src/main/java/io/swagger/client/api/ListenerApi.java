/*
 * MobileAccess v1.3.0
 *  ##### **NaaS API Version:** 2.4.0 ##### **mobileAccess service version:** 1.2.3 ## OVERVIEW TMF 640 - Activation and Configuration API. This is a strategic mobileAccess service aiming to provide network capabilities to products.   **Note: Enum values are case sensitive**
 *
 * OpenAPI spec version: 2.4.5
 * Contact: D1701045@team.telstra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.swagger.client.ApiCallback;
import com.swagger.client.ApiClient;
import com.swagger.client.ApiException;
import com.swagger.client.ApiResponse;
import com.swagger.client.Configuration;
import com.swagger.client.Pair;
import com.swagger.client.ProgressRequestBody;
import com.swagger.client.ProgressResponseBody;

import io.swagger.client.model.ListenerPrimary;

public class ListenerApi {
    private ApiClient apiClient;

    public ListenerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListenerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listenerMobileAccess
     * @param body Notification Resource Models. pub/sub paradigm using callback (received as part of /hub subscriptions to deliver Events to subscribers.
 (required)
     * @param authorization A header in NaaS API calls to provide token details. Format: **Bearer** ***access_token*** (required)
     * @param xGroupID Unique String (or mnemonic) representing the group to which a consumer belongs. (required)
     * @param serviceType Unique name of the Service. Also known as &#x27;Service Mnemonic&#x27; or &#x27;Service Specification Name&#x27; (required)
     * @param xCorrelationID UUID. Used for business transaction correlation in the Logs. (optional)
     * @param xLatestVersion NaaS TMF API Version &lt;a href&#x3D;&#x27;https://wiki.proteuscd.corp.telstra.com/display/NIIM/TMF+OpenAPI+Version+vs+Network+Service+Specification+Version&#x27;&gt;Learn more about versions&lt;/a&gt; (optional)
     * @param xSubGroupID Unique String that will be used in conjunction with X-Group-ID to identify unique client by NAL. This is to support NAL for applying fine-grained filtering of event notifications published by WDM. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listenerMobileAccessCall(ListenerPrimary body, String authorization, String xGroupID, String serviceType, String xCorrelationID, String xLatestVersion, String xSubGroupID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/activationAndConfiguration/v2/listener/{service_type}"
            .replaceAll("\\{" + "service_type" + "\\}", apiClient.escapeString(serviceType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (xCorrelationID != null)
        localVarHeaderParams.put("X-Correlation-ID", apiClient.parameterToString(xCorrelationID));
        if (xLatestVersion != null)
        localVarHeaderParams.put("X-LatestVersion", apiClient.parameterToString(xLatestVersion));
        if (xGroupID != null)
        localVarHeaderParams.put("X-Group-ID", apiClient.parameterToString(xGroupID));
        if (xSubGroupID != null)
        localVarHeaderParams.put("X-SubGroup-ID", apiClient.parameterToString(xSubGroupID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listenerMobileAccessValidateBeforeCall(ListenerPrimary body, String authorization, String xGroupID, String serviceType, String xCorrelationID, String xLatestVersion, String xSubGroupID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling listenerMobileAccess(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling listenerMobileAccess(Async)");
        }
        // verify the required parameter 'xGroupID' is set
        if (xGroupID == null) {
            throw new ApiException("Missing the required parameter 'xGroupID' when calling listenerMobileAccess(Async)");
        }
        // verify the required parameter 'serviceType' is set
        if (serviceType == null) {
            throw new ApiException("Missing the required parameter 'serviceType' when calling listenerMobileAccess(Async)");
        }
        
        com.squareup.okhttp.Call call = listenerMobileAccessCall(body, authorization, xGroupID, serviceType, xCorrelationID, xLatestVersion, xSubGroupID, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Events Publication
     * 
     * @param body Notification Resource Models. pub/sub paradigm using callback (received as part of /hub subscriptions to deliver Events to subscribers.
 (required)
     * @param authorization A header in NaaS API calls to provide token details. Format: **Bearer** ***access_token*** (required)
     * @param xGroupID Unique String (or mnemonic) representing the group to which a consumer belongs. (required)
     * @param serviceType Unique name of the Service. Also known as &#x27;Service Mnemonic&#x27; or &#x27;Service Specification Name&#x27; (required)
     * @param xCorrelationID UUID. Used for business transaction correlation in the Logs. (optional)
     * @param xLatestVersion NaaS TMF API Version &lt;a href&#x3D;&#x27;https://wiki.proteuscd.corp.telstra.com/display/NIIM/TMF+OpenAPI+Version+vs+Network+Service+Specification+Version&#x27;&gt;Learn more about versions&lt;/a&gt; (optional)
     * @param xSubGroupID Unique String that will be used in conjunction with X-Group-ID to identify unique client by NAL. This is to support NAL for applying fine-grained filtering of event notifications published by WDM. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void listenerMobileAccess(ListenerPrimary body, String authorization, String xGroupID, String serviceType, String xCorrelationID, String xLatestVersion, String xSubGroupID) throws ApiException {
        listenerMobileAccessWithHttpInfo(body, authorization, xGroupID, serviceType, xCorrelationID, xLatestVersion, xSubGroupID);
    }

    /**
     * Events Publication
     * 
     * @param body Notification Resource Models. pub/sub paradigm using callback (received as part of /hub subscriptions to deliver Events to subscribers.
 (required)
     * @param authorization A header in NaaS API calls to provide token details. Format: **Bearer** ***access_token*** (required)
     * @param xGroupID Unique String (or mnemonic) representing the group to which a consumer belongs. (required)
     * @param serviceType Unique name of the Service. Also known as &#x27;Service Mnemonic&#x27; or &#x27;Service Specification Name&#x27; (required)
     * @param xCorrelationID UUID. Used for business transaction correlation in the Logs. (optional)
     * @param xLatestVersion NaaS TMF API Version &lt;a href&#x3D;&#x27;https://wiki.proteuscd.corp.telstra.com/display/NIIM/TMF+OpenAPI+Version+vs+Network+Service+Specification+Version&#x27;&gt;Learn more about versions&lt;/a&gt; (optional)
     * @param xSubGroupID Unique String that will be used in conjunction with X-Group-ID to identify unique client by NAL. This is to support NAL for applying fine-grained filtering of event notifications published by WDM. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> listenerMobileAccessWithHttpInfo(ListenerPrimary body, String authorization, String xGroupID, String serviceType, String xCorrelationID, String xLatestVersion, String xSubGroupID) throws ApiException {
        com.squareup.okhttp.Call call = listenerMobileAccessValidateBeforeCall(body, authorization, xGroupID, serviceType, xCorrelationID, xLatestVersion, xSubGroupID, null, null);
        return apiClient.execute(call);
    }

    /**
     * Events Publication (asynchronously)
     * 
     * @param body Notification Resource Models. pub/sub paradigm using callback (received as part of /hub subscriptions to deliver Events to subscribers.
 (required)
     * @param authorization A header in NaaS API calls to provide token details. Format: **Bearer** ***access_token*** (required)
     * @param xGroupID Unique String (or mnemonic) representing the group to which a consumer belongs. (required)
     * @param serviceType Unique name of the Service. Also known as &#x27;Service Mnemonic&#x27; or &#x27;Service Specification Name&#x27; (required)
     * @param xCorrelationID UUID. Used for business transaction correlation in the Logs. (optional)
     * @param xLatestVersion NaaS TMF API Version &lt;a href&#x3D;&#x27;https://wiki.proteuscd.corp.telstra.com/display/NIIM/TMF+OpenAPI+Version+vs+Network+Service+Specification+Version&#x27;&gt;Learn more about versions&lt;/a&gt; (optional)
     * @param xSubGroupID Unique String that will be used in conjunction with X-Group-ID to identify unique client by NAL. This is to support NAL for applying fine-grained filtering of event notifications published by WDM. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listenerMobileAccessAsync(ListenerPrimary body, String authorization, String xGroupID, String serviceType, String xCorrelationID, String xLatestVersion, String xSubGroupID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listenerMobileAccessValidateBeforeCall(body, authorization, xGroupID, serviceType, xCorrelationID, xLatestVersion, xSubGroupID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
