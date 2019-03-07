package sdk.railways.api;

import sdk.railways.ApiClient;

import sdk.railways.model.Railway;

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
public class RailwayApi {
    private ApiClient apiClient;

    public RailwayApi() {
        this(new ApiClient());
    }

    @Autowired
    public RailwayApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Railway by id
     * Returns the railway with the given id.
     * <p><b>200</b> - The railway with the given id.
     * <p><b>404</b> - The railway with the given id could not be found.
     * @param railwayId The id of the railway.
     * @return Railway
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Railway> getRailway(Integer railwayId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'railwayId' is set
        if (railwayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'railwayId' when calling getRailway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("railwayId", railwayId);
        String path = UriComponentsBuilder.fromPath("/railways/{railwayId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Railway> returnType = new ParameterizedTypeReference<Railway>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * All railways
     * Returns all railways on the map.
     * <p><b>200</b> - The ids of all railways on the map.
     * <p><b>401</b> - Missing identification key.
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getRailways() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/railways").build().toUriString();
        
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
     * All station on railway
     * Returns the ids of all stations connected to the given railway.
     * <p><b>200</b> - All station ids connected to the railway.
     * <p><b>404</b> - The railway with the given id could not be found.
     * @param railwayId The id of the railway.
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getStationsOnRailway(Integer railwayId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'railwayId' is set
        if (railwayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'railwayId' when calling getStationsOnRailway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("railwayId", railwayId);
        String path = UriComponentsBuilder.fromPath("/railways/{railwayId}/stations").buildAndExpand(uriVariables).toUriString();
        
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
