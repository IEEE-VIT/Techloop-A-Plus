package com.albharath.session3.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.albharath.session3.Adapters.HomeAdapter;
import com.albharath.session3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        HomeAdapter homeAdapter = new HomeAdapter(getSupportFragmentManager());

        viewPager.setAdapter(homeAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
