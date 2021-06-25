package com.example.informationdepartmentphonebook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7;
    public TextView t1,t2,t3,t4,t5,t6,t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(" ISE Department Phonebook");
        getSupportActionBar().setIcon(R.drawable.ic_sah);

        ib1 = findViewById(R.id.imageButton);
        ib2 = findViewById(R.id.imageButton8);
        ib3 = findViewById(R.id.imageButton10);
        ib4 = findViewById(R.id.imageButton9);
        ib5 = findViewById(R.id.imageButton13);
        ib6 = findViewById(R.id.imageButton12);
        ib7 = findViewById(R.id.imageButton11);
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView16);
        t3 = findViewById(R.id.textView17);
        t4 = findViewById(R.id.textView19);
        t5 = findViewById(R.id.textView22);
        t6 = findViewById(R.id.textView23);
        t7 = findViewById(R.id.textView26);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t1.getText().toString();
                    String s = "tel: +91" + phone;
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t2.getText().toString();
                String s = "tel: +91" + phone;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t3.getText().toString();
                String s = "tel: +91" + phone;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t4.getText().toString();
                String s = "tel: +91" + phone;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t5.getText().toString();
                String s = "tel: +91" + phone;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t6.getText().toString();
                String s = "tel: +91" + phone;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = t7.getText().toString();
                String s = "tel: +91" + phone;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
    }
}