package com.example.application1;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        // Create an instance of FragmentPagerAdapter passing getSupportFragmentManager()
        // and a list of Fragments to display in ViewPager
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add your fragments here
        adapter.addFragment(new Fragment1(), "C <-> F");
        adapter.addFragment(new Fragment2(), "KILLO <-> MiLLES");

        // Set adapter to view pager
        viewPager.setAdapter(adapter);

        // Connect the TabLayout to the ViewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}