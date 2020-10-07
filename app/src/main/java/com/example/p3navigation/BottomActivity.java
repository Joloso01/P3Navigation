package com.example.p3navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.p3navigation.databinding.ActivityBottomBinding;

public class BottomActivity extends AppCompatActivity {
    ActivityBottomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding=ActivityBottomBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController =((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController);
    }
}