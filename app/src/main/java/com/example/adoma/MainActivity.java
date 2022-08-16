package com.example.adoma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.adoma.view.ui.fragment.HomeFragment;
import com.example.adoma.view.ui.fragment.Records;
import com.example.adoma.view.ui.fragment.Settings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements    NavigationBarView.OnItemSelectedListener {
    private static final String TAG = "MainActivity";
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBottomNavigationView();
//        setNavHostFragment();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        String title = item.getTitle().toString();
        switch (title){
            case "home": loadHomeFragment(); break;
            case "records": loadRecordsFragment(); break;
            case "settings": loadSettingsFragment(); break;
            default: break;

        }
        return false;
    }

    private void setBottomNavigationView(){
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        loadHomeFragment();
    }

    private void setNavHostFragment(){
//        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
//        assert navHostFragment != null;
//        NavController navController = navHostFragment.getNavController();

    }

    private void loadHomeFragment(){
        Log.d(TAG, "loadHomeFragment: called");
        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        transaction.replace(R.id.flFragment, homeFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    private void loadRecordsFragment(){
        Log.d(TAG, "loadRecordsFragment: called");
//        Navigation.findNavController(this, R.id.action_homeFragment_to_records);
        Records recordsFragment = new Records();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        transaction.replace(R.id.flFragment, recordsFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
    private void loadSettingsFragment(){
        Log.d(TAG, "loadSettingsFragment: called");
//        Navigation.findNavController(this, R.id.action_homeFragment_to_settings);
        Settings settingsFragment = new Settings();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        transaction.replace(R.id.flFragment, settingsFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


}