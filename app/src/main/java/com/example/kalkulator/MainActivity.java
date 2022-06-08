package com.example.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1,t2;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.t1);
    }


    public void doSum(View v) {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        try {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
            int sum = num1 + num2;
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("key1", num1);
            intent.putExtra("key2", num2);
            intent.putExtra("sum", sum);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Данные не корректные", Toast.LENGTH_LONG).show();

        }



    }
}