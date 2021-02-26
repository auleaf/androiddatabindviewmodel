package com.yyzq.mytv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");

        TextView textView = findViewById(R.id.textView);
        textView.setText(msg);
    }
}