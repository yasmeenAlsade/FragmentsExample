package com.example.yalsaadi.fragmentsexample.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yalsaadi.fragmentsexample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends BaseFragment implements View.OnClickListener {
    Button detailsButton;

    public SignUpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        detailsButton = (Button) getActivity().findViewById(R.id.detailsID);
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.detailsID).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.detailsID:
                mActivity.addFragment("detailsTag", new DetailsFragment());
                break;
        }
    }
}
