package com.example.adoma.view.ui.fragment.sign;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adoma.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AgentSignInFragment extends Fragment {
    private static final String TAG = "AgentSignInFragment";
    private TextInputEditText agentSignInId;
    private TextInputEditText agentSignInEmail;
    private MaterialButton agentSignInBut;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_agent_sing_in, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        agentSignInId = view.findViewById(R.id.agentSignInId);
        agentSignInEmail = view.findViewById(R.id.agentSignInEmail);
        agentSignInBut = view.findViewById(R.id.agentSignInBut);
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


    private void listeners(){

    }

}
