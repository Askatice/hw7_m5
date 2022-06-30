package com.askat.hw7_m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.askat.hw7_m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initPlus();
        initDivide();
    }

    private void initDivide() {
        binding.btnDivide.setOnClickListener(v -> {
            String num1 = binding.edFirstNumber.getText().toString().trim();
            String num2 = binding.edSecondNumber.getText().toString().trim();

            binding.txtResult.setText(math.divide(num1, num2));
        });
    }

    private void initPlus() {
        binding.btnPlus.setOnClickListener(v -> {
            String num1 = binding.edFirstNumber.getText().toString().trim();
            String num2 = binding.edSecondNumber.getText().toString().trim();

            binding.txtResult.setText(math.add(num1, num2));
        });
    }
}