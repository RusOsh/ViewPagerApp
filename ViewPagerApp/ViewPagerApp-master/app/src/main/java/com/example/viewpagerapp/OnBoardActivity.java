package com.example.viewpagerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class OnBoardActivity extends AppCompatActivity {
    DotsIndicator dotsIndicator;

    ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private TextView txtSKip, txtNext;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        initPager();
    }

    private void initPager() {
        dotsIndicator = findViewById(R.id.dots_indicator);
        viewPager = findViewById(R.id.vp_on_board);
        txtNext = findViewById(R.id.txt_next);
        txtSKip = findViewById(R.id.txt_skip);

        List<ItemOnBoardFragment> fragments = new ArrayList<>();
        fragments.add(ItemOnBoardFragment.newInstance("welcome to NGO AIR Support", "You are expected visitor"));
        fragments.add(ItemOnBoardFragment.newInstance("We are making social projects", "Gender,Mass Media, Rights of Youth"));
        fragments.add(ItemOnBoardFragment.newInstance("We are happy to see you", "Join to us, together we can do more than you will be alone"));

        adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        dotsIndicator.setViewPager(viewPager);


    }

}