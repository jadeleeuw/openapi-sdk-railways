# StationApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRailwaysConnectedToStation**](StationApi.md#getRailwaysConnectedToStation) | **GET** /stations/{stationId}/railways | All railways on station
[**getStation**](StationApi.md#getStation) | **GET** /stations/{stationId} | Station by id
[**getStationByName**](StationApi.md#getStationByName) | **GET** /stations/findbyname | Station by name
[**getStationName**](StationApi.md#getStationName) | **GET** /stations/{stationId}/name | Name of station
[**getStations**](StationApi.md#getStations) | **GET** /stations | All stations


<a name="getRailwaysConnectedToStation"></a>
# **getRailwaysConnectedToStation**
> List&lt;Integer&gt; getRailwaysConnectedToStation(stationId)

All railways on station

Returns the ids of all railways connected to the given station.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.StationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

StationApi apiInstance = new StationApi();
Integer stationId = 56; // Integer | The id of the station.
try {
    List<Integer> result = apiInstance.getRailwaysConnectedToStation(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationApi#getRailwaysConnectedToStation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationId** | **Integer**| The id of the station. |

### Return type

**List&lt;Integer&gt;**

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStation"></a>
# **getStation**
> Station getStation(stationId)

Station by id

Returns a station with the given id.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.StationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

StationApi apiInstance = new StationApi();
Integer stationId = 56; // Integer | The id of the station.
try {
    Station result = apiInstance.getStation(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationApi#getStation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationId** | **Integer**| The id of the station. |

### Return type

[**Station**](Station.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStationByName"></a>
# **getStationByName**
> Station getStationByName(name)

Station by name

Returns the station with the given name.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.StationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

StationApi apiInstance = new StationApi();
String name = "name_example"; // String | The name of the station to be found.
try {
    Station result = apiInstance.getStationByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationApi#getStationByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the station to be found. |

### Return type

[**Station**](Station.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStationName"></a>
# **getStationName**
> NameResponse getStationName(stationId)

Name of station

Gets the name of the station with the given id.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.StationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

StationApi apiInstance = new StationApi();
Integer stationId = 56; // Integer | The id of the station.
try {
    NameResponse result = apiInstance.getStationName(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationApi#getStationName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationId** | **Integer**| The id of the station. |

### Return type

[**NameResponse**](NameResponse.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStations"></a>
# **getStations**
> List&lt;Integer&gt; getStations()

All stations

Returns all stations on the map.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.StationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

StationApi apiInstance = new StationApi();
try {
    List<Integer> result = apiInstance.getStations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationApi#getStations");
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

