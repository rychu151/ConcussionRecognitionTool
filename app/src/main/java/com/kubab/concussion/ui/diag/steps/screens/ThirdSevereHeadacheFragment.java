package com.kubab.concussion.ui.diag.steps.screens;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import com.kubab.concussion.R;

public class ThirdSevereHeadacheFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_severe_headache, container, false);

        Button btn_finish = v.findViewById(R.id.btn_finish);
        btn_finish.setOnClickListener(v1 -> getActivity().finish());

        return v;
    }


}