package com.example.adoma.view.ui.fragment.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.adoma.R;
import com.example.adoma.view.ui.fragment.HomeFragment;

public class AdminSignUp extends Fragment {

    private static final String TAG = HomeFragment.class.getSimpleName();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_admin_sign_up, container, false);
    }


    public void init(){

    }
}
