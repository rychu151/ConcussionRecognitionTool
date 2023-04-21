package com.kubab.concussion.ui.diag.steps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kubab.concussion.R;
import com.kubab.concussion.ui.diag.steps.screens.SecondDoubleVisionFragment;
import com.kubab.concussion.ui.diag.steps.screens.FirstNeckPainFragment;
import com.kubab.concussion.ui.diag.steps.screens.ThirdSevereHeadacheFragment;

import java.util.ArrayList;

public class ViewPagerFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v =  inflater.inflate(R.layout.fragment_view_pager, container, false);

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new FirstNeckPainFragment());
        fragments.add(new SecondDoubleVisionFragment());
        fragments.add(new ThirdSevereHeadacheFragment());

        ViewPager2 viewPager = v.findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(fragments, getActivity().getSupportFragmentManager(),getLifecycle()));

        return v;
    }
}