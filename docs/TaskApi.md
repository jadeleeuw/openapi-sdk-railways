# TaskApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTask**](TaskApi.md#getTask) | **GET** /task | Origin and destination station
[**submit**](TaskApi.md#submit) | **POST** /task/submit | Submit


<a name="getTask"></a>
# **getTask**
> Task getTask()

Origin and destination station

Retrieves the ids of the origin and destination station from which the shortest path has to be found.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

TaskApi apiInstance = new TaskApi();
try {
    Task result = apiInstance.getTask();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTask");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Task**](Task.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submit"></a>
# **submit**
> SubmissionResult submit(route)

Submit

Submits the given shortest route and validates whether it indeed is the shortest route.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

TaskApi apiInstance = new TaskApi();
Route route = new Route(); // Route | The stations that together form the shortest route.
try {
    SubmissionResult result = apiInstance.submit(route);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#submit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route** | [**Route**](Route.md)| The stations that together form the shortest route. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

