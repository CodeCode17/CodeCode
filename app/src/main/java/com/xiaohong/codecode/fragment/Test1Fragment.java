package com.xiaohong.codecode.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaohong.codecode.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Test1Fragment extends BaseFragment {


    public Test1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test1, container, false);
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
