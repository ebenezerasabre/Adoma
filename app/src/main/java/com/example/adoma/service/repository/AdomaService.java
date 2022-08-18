package com.example.adoma.service.repository;

import com.example.adoma.service.model.Agent;
import com.example.adoma.service.model.Customer;
import com.example.adoma.service.model.Manager;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AdomaService {

    @GET("customer")
    Call<List<Customer>> findAllCustomers();

    // TODO Customer
    @POST("customer")
    Call<Customer> createCustomer(@Body HashMap<String, String> body);

    // signing customer with router numbers
    @GET("customer/sign/{id}")
    Call<Customer> signInCustomer(@Path("id") String routerNo);

    @PUT("customer/{id}")
    Call<Customer> updateCustomer(@Path("id") String routerNo, @Body HashMap<String, String> body);

    @DELETE("customer/{id}")
    Call<String> deleteCustomer(@Path("id") String routerNo);


    // TODO Agent
    @GET("agent")
    Call<List<Agent>> findAllAgents();

    @POST("agent")
    Call<Agent> createAgent(@Body HashMap<String, String> body);

    // signing agent with id
    @GET("agent/sign/{id}")
    Call<Agent> signInAgent(@Path("id") String id);

    @PUT("agent/{id}")
    Call<Agent> updateAgent(@Path("id") String id, @Body HashMap<String, String> body);

    @DELETE("agent/{id}")
    Call<String> deleteAgent(@Path("id") String id);



    // TODO Manager

    @POST("agent")
    Call<Manager> createManager(@Body HashMap<String, String> body);

    // signing Manager with id
    @GET("agent/sign/{id}")
    Call<Manager> signInManager(@Path("id") String id);

    @PUT("agent/{id}")
    Call<Manager> updateManager(@Path("id") String id, @Body HashMap<String, String> body);

    @DELETE("agent/{id}")
    Call<String> deleteManager(@Path("id") String id);
}
