package com.example.yalsaadi.fragmentsexample.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.example.yalsaadi.fragmentsexample.MainActivity;

/**
 * Created by yalsaadi on 4/6/2017.
 */

public class BaseFragment extends Fragment {
    protected MainActivity mActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            mActivity = (MainActivity) context;
        }
    }
}
