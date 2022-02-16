/*
 * DealersAndVehicles
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.VehicleAnswer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DealerAnswer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-15T20:39:31.736Z")
public class DealerAnswer {
  @SerializedName("dealerId")
  private Integer dealerId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("vehicles")
  private List<VehicleAnswer> vehicles = null;

  public DealerAnswer dealerId(Integer dealerId) {
    this.dealerId = dealerId;
    return this;
  }

   /**
   * Get dealerId
   * @return dealerId
  **/
  @ApiModelProperty(value = "")
  public Integer getDealerId() {
    return dealerId;
  }

  public void setDealerId(Integer dealerId) {
    this.dealerId = dealerId;
  }

  public DealerAnswer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DealerAnswer vehicles(List<VehicleAnswer> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public DealerAnswer addVehiclesItem(VehicleAnswer vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<VehicleAnswer>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * Get vehicles
   * @return vehicles
  **/
  @ApiModelProperty(value = "")
  public List<VehicleAnswer> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<VehicleAnswer> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealerAnswer dealerAnswer = (DealerAnswer) o;
    return Objects.equals(this.dealerId, dealerAnswer.dealerId) &&
        Objects.equals(this.name, dealerAnswer.name) &&
        Objects.equals(this.vehicles, dealerAnswer.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealerId, name, vehicles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealerAnswer {\n");
    
    sb.append("    dealerId: ").append(toIndentedString(dealerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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
