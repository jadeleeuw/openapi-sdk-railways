package sdk.railways.api;

import sdk.railways.ApiClient;

import sdk.railways.model.NameResponse;
import sdk.railways.model.Station;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-07T15:52:27.062333+01:00[Europe/Amsterdam]")
public class StationApi {
    private ApiClient apiClient;

    public StationApi() {
        this(new ApiClient());
    }

    @Autowired
    public StationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * All railways on station
     * Returns the ids of all railways connected to the given station.
     * <p><b>200</b> - All railway ids connected to the given station.
     * <p><b>404</b> - The station with the given id could not be found.
     * @param stationId The id of the station.
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getRailwaysConnectedToStation(Integer stationId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling getRailwaysConnectedToStation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("stationId", stationId);
        String path = UriComponentsBuilder.fromPath("/stations/{stationId}/railways").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Station by id
     * Returns a station with the given id.
     * <p><b>200</b> - The station with the given id.
     * <p><b>404</b> - The station with the given id could not be found.
     * @param stationId The id of the station.
     * @return Station
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Station> getStation(Integer stationId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling getStation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("stationId", stationId);
        String path = UriComponentsBuilder.fromPath("/stations/{stationId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<Station> returnType = new ParameterizedTypeReference<Station>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Station by name
     * Returns the station with the given name.
     * <p><b>200</b> - The station with the given name.
     * <p><b>404</b> - The station with the given name could not be found.
     * @param name The name of the station to be found.
     * @return Station
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Station> getStationByName(String name) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getStationByName");
        }
        
        String path = UriComponentsBuilder.fromPath("/stations/findbyname").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<Station> returnType = new ParameterizedTypeReference<Station>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Name of station
     * Gets the name of the station with the given id.
     * <p><b>200</b> - The name of the station with the given id.
     * <p><b>404</b> - The station with the given id could not be found.
     * @param stationId The id of the station.
     * @return NameResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<NameResponse> getStationName(Integer stationId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling getStationName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("stationId", stationId);
        String path = UriComponentsBuilder.fromPath("/stations/{stationId}/name").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<NameResponse> returnType = new ParameterizedTypeReference<NameResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * All stations
     * Returns all stations on the map.
     * <p><b>200</b> - The ids of all stations on the map.
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getStations() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/stations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
