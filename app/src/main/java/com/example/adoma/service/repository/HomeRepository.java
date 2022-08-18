package com.example.adoma.service.repository;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.adoma.service.model.Agent;
import com.example.adoma.service.model.Customer;
import com.example.adoma.service.model.Manager;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeRepository {
    private static final String TAG = HomeRepository.class.getSimpleName();
    private static AdomaService adomaService;
    private static HomeRepository homeRepository;

    // implementing singleton
    public static HomeRepository getInstance(){
        Log.d(TAG, "getInstance: called");
        adomaService = RetroClient.getInstance().create(AdomaService.class);
        if(homeRepository == null){
            homeRepository = new HomeRepository();
        }
        return homeRepository;
    }



    // TODO CUSTOMER

    // find all customers
    public MutableLiveData<List<Customer>> findAllCustomers(){
        final MutableLiveData<List<Customer>> customers = new  MutableLiveData<>();
        Call<List<Customer>> call = adomaService.findAllCustomers();
        call.enqueue(new Callback<List<Customer>>() {
            @Override
            public void onResponse(Call<List<Customer>> call, Response<List<Customer>> response) {
                if(response.isSuccessful()) customers.setValue(response.body());
                else {
                    Log.d(TAG, "onResponse: find all customers error");
                }
            }

            @Override
            public void onFailure(Call<List<Customer>> call, Throwable t) {
                Log.d(TAG, "onFailure: findAllCustomers failure");
            }
        });
        return customers;
    }

    // create customer
    public MutableLiveData<Customer> createCustomer(HashMap<String, String> body){
        final MutableLiveData<Customer> customer = new MutableLiveData<>();
        Call<Customer> call = adomaService.createCustomer(body);
        call.enqueue(new Callback<Customer>() {
            @Override
            public void onResponse(Call<Customer> call, Response<Customer> response) {
                if(response.isSuccessful()){
                    customer.setValue(response.body());
                }else {
                    Log.d(TAG, "onResponse: create customer error");
                }
            }

            @Override
            public void onFailure(Call<Customer> call, Throwable t) {
                Log.d(TAG, "onFailure: create customer failure");
            }
        });
        return customer;
    }


    public MutableLiveData<Customer> signInCustomer(String routerNo){
        final MutableLiveData<Customer> customer = new MutableLiveData<>();
        Call<Customer> call = adomaService.signInCustomer(routerNo);
        call.enqueue(new Callback<Customer>() {
            @Override
            public void onResponse(Call<Customer> call, Response<Customer> response) {
                if(response.isSuccessful()){
                    customer.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: singInCustomer error");
                }
            }

            @Override
            public void onFailure(Call<Customer> call, Throwable t) {
                Log.d(TAG, "onFailure: singInCustomer failure");
            }
        });
        return customer;
    }

    public MutableLiveData<Customer> updateCustomer(String routerNo, HashMap<String, String> body){
        final MutableLiveData<Customer> customer = new MutableLiveData<>();
        Call<Customer> call = adomaService.updateCustomer(routerNo, body);
        call.enqueue(new Callback<Customer>() {
            @Override
            public void onResponse(Call<Customer> call, Response<Customer> response) {
                if(response.isSuccessful()){
                    customer.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: updateCustomer Error");
                }
            }

            @Override
            public void onFailure(Call<Customer> call, Throwable t) {
                Log.d(TAG, "onFailure: update customer error");
            }
        });
        return customer;
    }

    public MutableLiveData<String> deleteCustomer(String routerNo){
        final MutableLiveData<String> delMsg = new MutableLiveData<>();
        Call<String> call = adomaService.deleteCustomer(routerNo);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.isSuccessful()){
                    delMsg.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: deleteCustomer error");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure: deleteCustomer failure");
            }
        });
        return delMsg;
    }



    // TODO AGENT

    // find all agents
    public MutableLiveData<List<Agent>> findAllAgents(){
        final MutableLiveData<List<Agent>> agents = new MutableLiveData<>();
        Call<List<Agent>> call = adomaService.findAllAgents();
        call.enqueue(new Callback<List<Agent>>() {
            @Override
            public void onResponse(Call<List<Agent>> call, Response<List<Agent>> response) {
                if(response.isSuccessful()){
                    agents.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: findAll agents error");
                }
            }

            @Override
            public void onFailure(Call<List<Agent>> call, Throwable t) {
                Log.d(TAG, "onFailure: findAllAgents failure");
            }
        });
        return agents;
    }

    // create agent
    public MutableLiveData<Agent> createAgent(HashMap<String, String> body){
        final MutableLiveData<Agent> agent = new MutableLiveData<>();
        Call<Agent> call = adomaService.createAgent(body);
        call.enqueue(new Callback<Agent>() {
            @Override
            public void onResponse(Call<Agent> call, Response<Agent> response) {
                if(response.isSuccessful()){
                    agent.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<Agent> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return agent;
    }

    // sing in agent
    public MutableLiveData<Agent> singInAgent(String id){
        final MutableLiveData<Agent> agent = new MutableLiveData<>();
        Call<Agent> call = adomaService.signInAgent(id);
        call.enqueue(new Callback<Agent>() {
            @Override
            public void onResponse(Call<Agent> call, Response<Agent> response) {
                if(response.isSuccessful()){
                    agent.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<Agent> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return agent;
    }

    // update agent
    public MutableLiveData<Agent> updateAgent(String id, HashMap<String, String> body){
        final MutableLiveData<Agent> agent = new MutableLiveData<>();
        Call<Agent> call = adomaService.updateAgent(id, body);
        call.enqueue(new Callback<Agent>() {
            @Override
            public void onResponse(Call<Agent> call, Response<Agent> response) {
                if(response.isSuccessful()){
                    agent.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<Agent> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return agent;
    }

    // delete agent
    public MutableLiveData<String> deleteAgent(String id){
        final MutableLiveData<String> delMsg = new MutableLiveData<>();
        Call<String> call = adomaService.deleteAgent(id);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.isSuccessful()){
                    delMsg.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return delMsg;
    }



    // TODO ADMIN
    public MutableLiveData<Manager> createManager(HashMap<String, String> body){
        final MutableLiveData<Manager> manager = new MutableLiveData<>();
        Call<Manager> call = adomaService.createManager(body);
        call.enqueue(new Callback<Manager>() {
            @Override
            public void onResponse(Call<Manager> call, Response<Manager> response) {
                if(response.isSuccessful()){
                    manager.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<Manager> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return manager;
    }

    public MutableLiveData<Manager> signInManager(String id){
        final MutableLiveData<Manager> manager = new MutableLiveData<>();
        Call<Manager> call = adomaService.signInManager(id);
        call.enqueue(new Callback<Manager>() {
            @Override
            public void onResponse(Call<Manager> call, Response<Manager> response) {
                if(response.isSuccessful()){
                    manager.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: ");
                }
            }

            @Override
            public void onFailure(Call<Manager> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return manager;
    }

    // update manager
    public MutableLiveData<Manager> updateManager(String id, HashMap<String, String> body){
        final MutableLiveData<Manager> manager = new MutableLiveData<>();
        Call<Manager> call = adomaService.updateManager(id, body);
        call.enqueue(new Callback<Manager>() {
            @Override
            public void onResponse(Call<Manager> call, Response<Manager> response) {
                if(response.isSuccessful()){
                    manager.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<Manager> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return manager;
    }


    public MutableLiveData<String> delManager(String id){
        final MutableLiveData<String> delMsg = new MutableLiveData<>();
        Call<String> call = adomaService.deleteManager(id);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.isSuccessful()){
                    delMsg.setValue(response.body());
                } else {
                    Log.d(TAG, "onResponse: called");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure: called");
            }
        });
        return delMsg;
    }

}
