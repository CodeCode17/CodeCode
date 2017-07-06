package com.xiaohong.codecode.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaohong.codecode.R;

public class Test0Fragment extends BaseFragment {


    public Test0Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test0, container, false);
    }

    @Override
    public void setTitle(String fragmentTitle) {
        myFragmentTitle = fragmentTitle;
    }

    @Override
    public CharSequence getTitle() {
        return myFragmentTitle;
    }
}
