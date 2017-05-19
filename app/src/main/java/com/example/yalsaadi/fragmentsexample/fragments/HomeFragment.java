package com.example.yalsaadi.fragmentsexample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yalsaadi.fragmentsexample.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements View.OnClickListener {
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.signinID).setOnClickListener(this);
        view.findViewById(R.id.signupID).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signinID:
                mActivity.addFragment("signinTag", new SignInFragment());
                break;
            case R.id.signupID:
                mActivity.addFragment("signupTag", new SignUpFragment());
                break;
        }
    }
}
