package com.example.alertdialog23032021;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog;
    static int a = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlertDialog = findViewById(R.id.buttonAlertDialog);



        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // ctrl + alt + l : format  code
                // ctrl + alt + o : xóa import không dùng
            }
        });

    }
    // non access modifier


    private void createAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Hãy chọn 1 con vật yêu thích");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setCancelable(false);

        // single choice

        String [] arrAnimals = {"Mèo","Chó","Rùa","Gà","Vịt"};
        boolean [] arrChecked = {false,false,false,false,false};
//                builder.setSingleChoiceItems(arrAnimals, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int position) {
//                        Toast.makeText(MainActivity.this, arrAnimals[position], Toast.LENGTH_SHORT).show();
//                    }
//                });
        builder.setMultiChoiceItems(arrAnimals, arrChecked, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

            }
        });

        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String animals = "";
                for (int j = 0; j < arrChecked.length ; j++) {
                    if (arrChecked[j]){
                        animals += arrAnimals[j] + ",";
                    }
                }
                animals = animals.substring(0 , animals.length() -1 );
                Toast.makeText(MainActivity.this, "Bạn đã chọn " + animals, Toast.LENGTH_SHORT).show();

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
}