package com.kubab.concussion.ui.diag.steps.screens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kubab.concussion.R;

public class FirstNeckPainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_neck_pain, container, false);

        Button btn_next = v.findViewById(R.id.btn_next);
        ViewPager2 viewPager2 = getActivity().findViewById(R.id.viewPager);
        btn_next.setOnClickListener(v1 -> viewPager2.setCurrentItem(1));
        return v;
    }
}