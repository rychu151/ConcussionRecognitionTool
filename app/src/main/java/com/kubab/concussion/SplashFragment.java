package com.kubab.concussion;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SplashFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_splash, container, false);
        Handler handler = new Handler();
        handler.postDelayed(() -> {
                Navigation.findNavController(v).navigate(R.id.action_splashFragment_to_redFlagFragment);

        }, 6000);
        return v;
    }


}