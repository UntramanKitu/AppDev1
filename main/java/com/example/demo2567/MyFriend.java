package com.example.demo2567;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyFriend extends AppCompatActivity {
    private TextView tvChat;
    private EditText etInputText;
    private Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String friendName = intent.getStringExtra("friendName");
        String friendImg = intent.getStringExtra("friendImg");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (friendImg){
            //แล้วดูว่า fruitImg จะส่งค่าอะไรเข้ามา แล้วเซ็ทใส่มันซะ

            case "hack": imageView.setImageResource(R.drawable.hack); break;
            case "leo": imageView.setImageResource(R.drawable.leo); break;
            case "not": imageView.setImageResource(R.drawable.not); break;
            case "nut": imageView.setImageResource(R.drawable.nat); break;
            case "plume": imageView.setImageResource(R.drawable.pluem); break;
            case "tle" :imageView.setImageResource(R.drawable.tle); break;

            default: imageView.setImageResource(R.drawable.tle);
        }

        TextView textView = (TextView) findViewById(R.id.nameFriend);
        textView.setText(friendName);

        tvChat = findViewById(R.id.TvChat);
        etInputText = findViewById(R.id.etInputText);
        bSend = findViewById(R.id.bSend);

        // เขียนแบบ Lambda
        bSend.setOnClickListener(view -> getInputTextToChat());
    }

    // Method ต้องอยู่นอก onCreate()
    private void getInputTextToChat() {
        tvChat.setText(etInputText.getText());
        etInputText.setText("");
    }
}