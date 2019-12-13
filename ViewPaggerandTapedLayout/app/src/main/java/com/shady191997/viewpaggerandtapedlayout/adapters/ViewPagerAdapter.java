package com.shady191997.viewpaggerandtapedlayout.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shady191997.viewpaggerandtapedlayout.fragments.LoginFragment;
import com.shady191997.viewpaggerandtapedlayout.fragments.SignupFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {

            case 0:
                return new LoginFragment();

            case 1:
                return new SignupFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {
            case 0:
                return "Sign In";

            case 1:
                return "Sign Up";
        }

        return super.getPageTitle(position);
    }
}
