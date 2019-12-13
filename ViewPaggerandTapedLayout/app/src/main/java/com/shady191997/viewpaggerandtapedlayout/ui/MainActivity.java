package com.shady191997.viewpaggerandtapedlayout.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.shady191997.viewpaggerandtapedlayout.R;
import com.shady191997.viewpaggerandtapedlayout.adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ViewPagerAdapter mViewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(false);

        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        mTabLayout=(TabLayout)findViewById(R.id.tab_layout);

        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setAdapter(mViewPagerAdapter);

    }
}
