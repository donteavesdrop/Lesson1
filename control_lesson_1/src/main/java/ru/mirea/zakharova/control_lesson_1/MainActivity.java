package ru.mirea.zakharova.control_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView avatarImageView = findViewById(R.id.avatar_imageview);
        avatarImageView.setImageResource(R.drawable.avatar);
    }

}