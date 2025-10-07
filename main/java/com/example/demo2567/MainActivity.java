package com.example.demo2567;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);//เชื่อมกับ activity_main.xml

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "เพื่อนคนที่1",  Toast.LENGTH_SHORT); toast.show();
                Intent intent = new Intent(MainActivity.this, MyFriend  .class);
                intent.putExtra("friendName", "แฮ็ก");

                intent.putExtra("friendImg", "hack");
                startActivity(intent);
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "เพื่อนคนที่2",  Toast.LENGTH_SHORT); toast.show();
                Intent intent = new Intent(MainActivity.this, MyFriend  .class);
                intent.putExtra("friendName", "ลีโอ");

                intent.putExtra("friendImg", "leo");
                startActivity(intent);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "เพื่อนคนที่3",  Toast.LENGTH_SHORT); toast.show();
                Intent intent = new Intent(MainActivity.this, MyFriend  .class);
                intent.putExtra("friendName", "น็อต");

                intent.putExtra("friendImg", "not");
                startActivity(intent);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "เพื่อนคนที่4",  Toast.LENGTH_SHORT); toast.show();
                Intent intent = new Intent(MainActivity.this, MyFriend  .class);
                intent.putExtra("friendName", "นัท");

                intent.putExtra("friendImg", "nut");
                startActivity(intent);
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "เพื่อนคนท่5",  Toast.LENGTH_SHORT); toast.show();
                Intent intent = new Intent(MainActivity.this, MyFriend  .class);
                intent.putExtra("friendName", "ปลื้ม");

                intent.putExtra("friendImg", "plume");
                startActivity(intent);
            }
        });

        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "เพื่อนคนท่6",  Toast.LENGTH_SHORT); toast.show();
                Intent intent = new Intent(MainActivity.this, MyFriend  .class);
                intent.putExtra("friendName", "เติ้ล");

                intent.putExtra("friendImg", "tle");
                startActivity(intent);
            }
        });



    }
}