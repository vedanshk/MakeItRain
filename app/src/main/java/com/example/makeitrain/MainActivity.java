package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView   txtMoney;
    private Button btnAdd , btnTag;

    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        btnAdd.setOnClickListener(v -> {
            Log.d(TAG, "onCreate: btnAddMoney");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

            moneyCounter += 10000;

            txtMoney.setText(String.valueOf(numberFormat.format(moneyCounter)));
             switch (moneyCounter){
                 case 20000:
                     txtMoney.setTextColor(Color.BLACK);
                     break;
                 case 40000:
                     txtMoney.setTextColor(Color.YELLOW);
                     break;
                 case 60000:
                     txtMoney.setTextColor(Color.GREEN);
                     break;
                 default:
                     txtMoney.setTextColor(Color.GRAY);
             }
        });


    }

    private void initViews() {
        txtMoney = findViewById(R.id.txtMoney);

        btnAdd = findViewById(R.id.btnAdd);
        btnTag = findViewById(R.id.btnShowTag);
    }

    public void showTag(View view) {
        Toast.makeText(this, (R.string.app_name), Toast.LENGTH_SHORT).show();
        Log.d(TAG, "showTag: Show Tag");

    }
}