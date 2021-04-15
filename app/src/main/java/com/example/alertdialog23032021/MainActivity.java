package com.example.alertdialog23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Person;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlertDialog = findViewById(R.id.buttonAlertDialog);

        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Bạn có thông báo mới");
                builder.setMessage("Có phiên bản update mới");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.show();
            }
        });

    }
}