package com.example.adoma.view.ui.fragment.sign;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.adoma.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class CustomerSignInFragment extends Fragment {
    private static final String TAG = "CustomerSignInFragment";

    private TextInputEditText cusSignInId;
    private TextInputEditText cusRouterNo;
    private MaterialButton cusSignInBut;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_customer_sign_in, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        cusSignInId = view.findViewById(R.id.cus_SignInId);
        cusRouterNo = view.findViewById(R.id.cus_routerNo);
        cusSignInBut = view.findViewById(R.id.cusSignInBut);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: called");
    }
}
