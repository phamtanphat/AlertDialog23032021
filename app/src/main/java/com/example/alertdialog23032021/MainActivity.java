package com.example.alertdialog23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Person;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                builder.setTitle("Hãy chọn 1 con vật yêu thích");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                // single choice

                String [] arrAnimals = {"Mèo","Chó","Rùa","Gà","Vịt"};

                builder.setSingleChoiceItems(arrAnimals, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Toast.makeText(MainActivity.this, arrAnimals[position], Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Bạn chọn có", Toast.LENGTH_SHORT).show();

                    }
                });
//
//                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "Bạn chọn không", Toast.LENGTH_SHORT).show();
//                    }
//                });

                builder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Bạn chọn hủy", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });

    }
}