package com.example.adoma.view.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adoma.R;
import com.example.adoma.view.ui.fragment.sign.AgentSignInFragment;
import com.example.adoma.view.ui.fragment.sign.CustomerSignInFragment;
import com.google.android.material.button.MaterialButton;


public class HomeFragment extends Fragment {
    private static final String TAG = HomeFragment.class.getSimpleName();

    private MaterialButton signInAsAgent;
    private MaterialButton signInAsCustomer;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        init(view);
        listeners();
        return view;
    }

    public void init(View view){
        signInAsAgent = view.findViewById(R.id.sign_in_as_agent);
        signInAsCustomer = view.findViewById(R.id.sign_in_as_customer);
    }

    private void listeners(){
        signInAsAgent.setOnClickListener(view -> loadSignInAsAgent());
        signInAsCustomer.setOnClickListener(view -> loadSignInAsCustomer());
    }

    private void loadSignInAsAgent(){
        assert getActivity() != null;

        AgentSignInFragment agentSignInFragment = new AgentSignInFragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        transaction.replace(R.id.flFragment, agentSignInFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void loadSignInAsCustomer(){
        assert getActivity() != null;

        CustomerSignInFragment customerSignInFragment = new CustomerSignInFragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        transaction.replace(R.id.flFragment, customerSignInFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: called");
    }
}