package com.kubab.concussion.ui.diag.steps;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter
{

    private final ArrayList<Fragment> _fragments;

    public ViewPagerAdapter(
            @NonNull ArrayList<Fragment> list,
            @NonNull FragmentManager fragmentManager,
            @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        _fragments = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return _fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return _fragments.size();
    }
}
