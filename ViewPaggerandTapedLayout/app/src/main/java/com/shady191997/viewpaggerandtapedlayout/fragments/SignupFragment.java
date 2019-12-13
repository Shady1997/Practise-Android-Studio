package com.shady191997.viewpaggerandtapedlayout.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.shady191997.viewpaggerandtapedlayout.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignupFragment extends Fragment {

    Button btnSignup;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getContext(),LoginFragment.class);
//                startActivity(intent);
            }
        });
        super.onActivityCreated(savedInstanceState);
    }

    public SignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_signup, container, false);
        btnSignup=(Button)view.findViewById(R.id.btn_signup);
        return view;
    }

}
