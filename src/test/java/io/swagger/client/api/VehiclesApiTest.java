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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.VehicleIdsResponse;
import io.swagger.client.model.VehicleResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import java.util.*;

/**
 * API tests for VehiclesApi
 */
@Ignore
public class VehiclesApiTest {

    private final VehiclesApi api = new VehiclesApi();
    String datasetId = "oMxj6_DR2Ag";
    // Storing all vehicle ids assigned to specific datasetID above,
    // I am storing them because I am not able to login to your database
    List<Integer> actualVehicleIDs=new ArrayList<>(Arrays.asList(
            1731569440,
            1586677399,
            1389576925,
            37861689,
            2049557771,
            609552385,
            691285632,
            1319188008,
            172122827));

    /**
     * Get a list of all vehicleids in dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdsTest() throws ApiException {
        //Making my get request
        VehicleIdsResponse response = api.getIds(datasetId);
        //Storing all my expected vehicle ids as list
        List<Integer> expectedVehicleIDs=response.getVehicleIds();
        // TODO: test validations
        //Comparing actual and expected vehicle ids list  for data validation
        System.out.println(response.toString()); // printing response body for just in case
        for(int i=0; i<expectedVehicleIDs.size();i++){
            Assert.assertEquals(expectedVehicleIDs.get(i),actualVehicleIDs.get(i));
        }
    }
    
    /**
     * Get information about a vehicle
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehicleTest() throws ApiException {

        //Getting first vehicle id from actaul list
        Integer vehicleid = actualVehicleIDs.get(0);
        //Sending my get request
        VehicleResponse response = api.getVehicle(datasetId, vehicleid);
        //Storing all actual data related first vehicle id
        Integer expectedVehicleId= 1731569440;
        Integer expectedYear= 2012;
        String expectedMake="Nissan";
        String  expectedModel= "Altima";
        Integer expectedDealerId= 537933405;
        // TODO: test validations

        //Comparing actual and expected result for data validation
        System.out.println(response.toString()); // printing response body for just in case 
        Assert.assertEquals(expectedDealerId,response.getDealerId());
        Assert.assertEquals(expectedYear,response.getYear());
        Assert.assertEquals(expectedVehicleId,response.getVehicleId());
        Assert.assertEquals(expectedMake,response.getMake());
        Assert.assertEquals(expectedModel,response.getModel());
    }
    
}


