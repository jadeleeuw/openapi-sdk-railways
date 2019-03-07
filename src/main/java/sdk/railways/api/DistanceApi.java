package sdk.railways.api;

import sdk.railways.ApiClient;

import sdk.railways.model.DistanceResponse;
import sdk.railways.model.Route;

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
public class DistanceApi {
    private ApiClient apiClient;

    public DistanceApi() {
        this(new ApiClient());
    }

    @Autowired
    public DistanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Distance between stations
     * Returns the distance (in meters) between two stations.
     * <p><b>200</b> - Distance (in meters) between the two stations.
     * <p><b>404</b> - Unable to find (one of) the stations.
     * @param from The id of the first station
     * @param to The id of the other station
     * @return DistanceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DistanceResponse> getDistanceBetweenStations(Integer from, Integer to) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling getDistanceBetweenStations");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling getDistanceBetweenStations");
        }
        
        String path = UriComponentsBuilder.fromPath("/distance/stations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<DistanceResponse> returnType = new ParameterizedTypeReference<DistanceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Distance of route
     * Returns the total distance of the route in meters.
     * <p><b>200</b> - Total distance (in meters) of the route.
     * <p><b>400</b> - The given route is empty.
     * @param route The route of which the distance needs to be calculated.
     * @return DistanceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DistanceResponse> getDistanceOfRoute(Route route) throws HttpClientErrorException {
        Object postBody = route;
        
        // verify the required parameter 'route' is set
        if (route == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'route' when calling getDistanceOfRoute");
        }
        
        String path = UriComponentsBuilder.fromPath("/distance/route").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<DistanceResponse> returnType = new ParameterizedTypeReference<DistanceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
