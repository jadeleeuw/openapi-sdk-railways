# RailwayApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRailway**](RailwayApi.md#getRailway) | **GET** /railways/{railwayId} | Railway by id
[**getRailways**](RailwayApi.md#getRailways) | **GET** /railways | All railways
[**getStationsOnRailway**](RailwayApi.md#getStationsOnRailway) | **GET** /railways/{railwayId}/stations | All station on railway


<a name="getRailway"></a>
# **getRailway**
> Railway getRailway(railwayId)

Railway by id

Returns the railway with the given id.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.RailwayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

RailwayApi apiInstance = new RailwayApi();
Integer railwayId = 56; // Integer | The id of the railway.
try {
    Railway result = apiInstance.getRailway(railwayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailwayApi#getRailway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **railwayId** | **Integer**| The id of the railway. |

### Return type

[**Railway**](Railway.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRailways"></a>
# **getRailways**
> List&lt;Integer&gt; getRailways()

All railways

Returns all railways on the map.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.RailwayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

RailwayApi apiInstance = new RailwayApi();
try {
    List<Integer> result = apiInstance.getRailways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailwayApi#getRailways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Integer&gt;**

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStationsOnRailway"></a>
# **getStationsOnRailway**
> List&lt;Integer&gt; getStationsOnRailway(railwayId)

All station on railway

Returns the ids of all stations connected to the given railway.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.RailwayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

RailwayApi apiInstance = new RailwayApi();
Integer railwayId = 56; // Integer | The id of the railway.
try {
    List<Integer> result = apiInstance.getStationsOnRailway(railwayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailwayApi#getStationsOnRailway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **railwayId** | **Integer**| The id of the railway. |

### Return type

**List&lt;Integer&gt;**

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

