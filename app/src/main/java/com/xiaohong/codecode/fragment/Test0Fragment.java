package com.xiaohong.codecode.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xiaohong.codecode.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class Test0Fragment extends BaseFragment {


    @BindView(R.id.image)
    ImageView mImage;
    Unbinder unbinder;

    public Test0Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test0, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Glide.with(this).load("https://raw.githubusercontent.com/CodeCode17/CodeCode/master/hong.gif")
                .asGif().into(mImage);
    }

    @Override
    public void setTitle(String fragmentTitle) {
        myFragmentTitle = fragmentTitle;
    }

    @Override
    public CharSequence getTitle() {
        return myFragmentTitle;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
