package ru.mirea.zakharova.typelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvMirea;
    private Button btnChangeMireaText;
    private int count=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
//        tvMirea = findViewById(R.id.textViewMirea);
//        btnChangeMireaText = findViewById(R.id.buttonChangeMireaText);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                tvMirea.setText(String.format("Click number: id %d", count++));
//            }
//        };
//        btnChangeMireaText.setOnClickListener(onClickListener);
    }
    
}