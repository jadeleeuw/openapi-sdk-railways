package sdk.railways.api;

import sdk.railways.ApiClient;

import sdk.railways.model.Route;
import sdk.railways.model.SubmissionResult;
import sdk.railways.model.Task;

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
public class TaskApi {
    private ApiClient apiClient;

    public TaskApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Origin and destination station
     * Retrieves the ids of the origin and destination station from which the shortest path has to be found.
     * <p><b>200</b> - The ids of the origin and destination station.
     * @return Task
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Task> getTask() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/task").build().toUriString();
        
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

        ParameterizedTypeReference<Task> returnType = new ParameterizedTypeReference<Task>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Submit
     * Submits the given shortest route and validates whether it indeed is the shortest route.
     * <p><b>200</b> - The correctness of the submission.
     * <p><b>400</b> - Two subsequent stations on the route are not connected through a railway.
     * <p><b>404</b> - One of the stations on the route could not be found.
     * @param route The stations that together form the shortest route.
     * @return SubmissionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<SubmissionResult> submit(Route route) throws HttpClientErrorException {
        Object postBody = route;
        
        // verify the required parameter 'route' is set
        if (route == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'route' when calling submit");
        }
        
        String path = UriComponentsBuilder.fromPath("/task/submit").build().toUriString();
        
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

        ParameterizedTypeReference<SubmissionResult> returnType = new ParameterizedTypeReference<SubmissionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
