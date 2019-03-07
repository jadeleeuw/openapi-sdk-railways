# DistanceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistanceBetweenStations**](DistanceApi.md#getDistanceBetweenStations) | **GET** /distance/stations | Distance between stations
[**getDistanceOfRoute**](DistanceApi.md#getDistanceOfRoute) | **POST** /distance/route | Distance of route


<a name="getDistanceBetweenStations"></a>
# **getDistanceBetweenStations**
> DistanceResponse getDistanceBetweenStations(from, to)

Distance between stations

Returns the distance (in meters) between two stations.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.DistanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

DistanceApi apiInstance = new DistanceApi();
Integer from = 2600319; // Integer | The id of the first station
Integer to = 2600307; // Integer | The id of the other station
try {
    DistanceResponse result = apiInstance.getDistanceBetweenStations(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistanceApi#getDistanceBetweenStations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **Integer**| The id of the first station |
 **to** | **Integer**| The id of the other station |

### Return type

[**DistanceResponse**](DistanceResponse.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistanceOfRoute"></a>
# **getDistanceOfRoute**
> DistanceResponse getDistanceOfRoute(route)

Distance of route

Returns the total distance of the route in meters.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.DistanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

DistanceApi apiInstance = new DistanceApi();
Route route = new Route(); // Route | The route of which the distance needs to be calculated.
try {
    DistanceResponse result = apiInstance.getDistanceOfRoute(route);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistanceApi#getDistanceOfRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route** | [**Route**](Route.md)| The route of which the distance needs to be calculated. |

### Return type

[**DistanceResponse**](DistanceResponse.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

