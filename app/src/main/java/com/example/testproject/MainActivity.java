package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.testproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.button.setText("Button 1");
        binding.button2.setText("Button 2");
        binding.button3.setText("Button 3");
    }
}
