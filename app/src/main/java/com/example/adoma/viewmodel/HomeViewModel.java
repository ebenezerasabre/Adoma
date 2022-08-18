package com.example.adoma.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.adoma.service.model.Agent;
import com.example.adoma.service.model.Customer;
import com.example.adoma.service.model.Manager;
import com.example.adoma.service.repository.HomeRepository;

import java.util.HashMap;
import java.util.List;

public class HomeViewModel extends ViewModel {

    private HomeRepository mHomeRepository;
    private MutableLiveData<Customer> mCustomer;
    private MutableLiveData<List<Customer>> mCustomerList;

    private MutableLiveData<Agent> mAgent;
    private MutableLiveData<List<Agent>> mAgentList;

    private MutableLiveData<Manager> mManager;
    private MutableLiveData<List<Manager>> mManagerList;


    public void init(){
        mHomeRepository = HomeRepository.getInstance();
    }


    // TODO Customer
    public void findAllCustomers(){
        mCustomerList = mHomeRepository.findAllCustomers();
    }
    public LiveData<List<Customer>> getAllCustomers(){
        return mCustomerList;
    }
    public void createCustomer(HashMap<String, String> body){
        mCustomer = mHomeRepository.createCustomer(body);
    }
    public LiveData<Customer> getCustomer(){
        return mCustomer;
    }
    public void signInCustomer(String routerNo){
        mCustomer = mHomeRepository.signInCustomer(routerNo);
    }
    public void updateCustomer(String routerNo,HashMap<String, String> body){
        mCustomer = mHomeRepository.updateCustomer(routerNo, body);
    }
    public LiveData<String> delCustomer(String routerNo){
        return mHomeRepository.deleteCustomer(routerNo);
    }

    // TODO Agent
    public void findAllAgents(){

    }

    // TODO Manager


}
