/*
 * Railways API Game!
 * Find your way in the Tokyo railway system!
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sdk.railways.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Station
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-07T13:28:26.133495+01:00[Europe/Amsterdam]")
public class Station {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lat")
  private Double lat;

  @JsonProperty("lng")
  private Double lng;

  @JsonProperty("connectedRailways")
  private List<Integer> connectedRailways = new ArrayList<>();

  public Station id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Station name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Station lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Station lng(Double lng) {
    this.lng = lng;
    return this;
  }

   /**
   * Get lng
   * @return lng
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public Station connectedRailways(List<Integer> connectedRailways) {
    this.connectedRailways = connectedRailways;
    return this;
  }

  public Station addConnectedRailwaysItem(Integer connectedRailwaysItem) {
    this.connectedRailways.add(connectedRailwaysItem);
    return this;
  }

   /**
   * Get connectedRailways
   * @return connectedRailways
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getConnectedRailways() {
    return connectedRailways;
  }

  public void setConnectedRailways(List<Integer> connectedRailways) {
    this.connectedRailways = connectedRailways;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Station station = (Station) o;
    return Objects.equals(this.id, station.id) &&
        Objects.equals(this.name, station.name) &&
        Objects.equals(this.lat, station.lat) &&
        Objects.equals(this.lng, station.lng) &&
        Objects.equals(this.connectedRailways, station.connectedRailways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lat, lng, connectedRailways);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Station {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    connectedRailways: ").append(toIndentedString(connectedRailways)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
