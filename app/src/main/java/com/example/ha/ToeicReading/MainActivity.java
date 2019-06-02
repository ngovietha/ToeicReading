package com.example.ha.ToeicReading;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.ha.ToeicReading.monhoc.CDKFragment;
import com.example.ha.ToeicReading.monhoc.GioiThieuToeicFragment;
import com.example.ha.ToeicReading.monhoc.MDQHFragment;
import com.example.ha.ToeicReading.monhoc.ThiFragment;
import com.example.ha.ToeicReading.monhoc.TuLoaiFragment;
import com.example.ha.ToeicReading.question.DBHelper;
import com.example.ha.ToeicReading.score.ScoreFragment;

import java.io.IOException;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        tabLayout=(TabLayout)findViewById(R.id.tabs);
//        ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);
//        tabPagerAdapter tabPagerAdapter=new tabPagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(tabPagerAdapter);
//        tabLayout.setupWithViewPager(viewPager);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = new HomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.content_main, homeFragment, homeFragment.getTag()).commit();

        DBHelper db = new DBHelper(this);

        try {
            db.createDataBase();
//            Toast.makeText(this, "Coppy thành công", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
       //     super.onBackPressed();
            int count=getSupportFragmentManager().getBackStackEntryCount();
            if(count==0){super.onBackPressed();}
            else {getSupportFragmentManager().popBackStack();}
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.home) {
            HomeFragment homeFragment = new HomeFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, homeFragment, homeFragment.getTag()).addToBackStack(null).commit();
//            tabLayout.setVisibility(View.GONE);
//        }else if (id == R.id.tv) {
//            Intent intent = new Intent(MainActivity.this, TuVungActivity.class);
//            startActivity(intent);

        } else if (id == R.id.thi) {
            ThiFragment thiFragment = new ThiFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, thiFragment, thiFragment.getTag()).addToBackStack(null).commit();
           // tabLayout.setVisibility(View.GONE);

        }else if (id == R.id.gioi_thieu) {
            GioiThieuToeicFragment gioiThieuToeicFragmentFragment = new GioiThieuToeicFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, gioiThieuToeicFragmentFragment, gioiThieuToeicFragmentFragment.getTag()).addToBackStack(null).commit();
            //tabLayout.setVisibility(View.GONE);

        } else if (id == R.id.tuloai) {
            TuLoaiFragment tuloaiFragment = new TuLoaiFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, tuloaiFragment, tuloaiFragment.getTag()).addToBackStack(null).commit();
            //tabLayout.setVisibility(View.GONE);

        } else if (id == R.id.mdqh) {
            MDQHFragment mdqhFragment = new MDQHFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, mdqhFragment, mdqhFragment.getTag()).addToBackStack(null).commit();
            //tabLayout.setVisibility(View.GONE);
        } else if (id == R.id.cdk) {
            CDKFragment cdkFragment = new CDKFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, cdkFragment, cdkFragment.getTag()).addToBackStack(null).commit();
            //tabLayout.setVisibility(View.GONE);
        } else if (id == R.id.score) {
            ScoreFragment scoreFragment = new ScoreFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main, scoreFragment, scoreFragment.getTag()).addToBackStack(null).commit();
           // tabLayout.setVisibility(View.GONE);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
