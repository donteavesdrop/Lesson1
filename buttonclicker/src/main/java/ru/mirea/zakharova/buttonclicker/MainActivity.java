package ru.mirea.zakharova.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewSt;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox myCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewSt = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        myCheckBox = findViewById(R.id.checkBoxStudent);
        btnWhoAmI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCheckBox.setText("text has changed");
                textViewSt.setText("My number on the list №8 ");
            }
        });
    }
    public void onMyButtonClick(View view) {
        Toast.makeText(this, "Это сделал не я!", Toast.LENGTH_SHORT).show();
    }
}
