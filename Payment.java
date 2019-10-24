package com.example.admin.ticketbooking;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {


    Button b1,b2,b3;
    EditText editText;
    TextView textView, textView1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
        textView = (TextView) findViewById(R.id.textView4);
        textView1 = (TextView) findViewById(R.id.textView5);
        b1 = (Button) findViewById(R.id.button5);
        b2 = (Button) findViewById(R.id.button6);
        b3 = (Button) findViewById(R.id.button7);
        editText=(EditText)findViewById(R.id.editText3);
//        final Intent intent = getIntent();
//        Bundle bd = intent.getExtras();
//        if (bd != null) {
//            String s = (String) bd.get("a");
//            textView.setText(s);
//            String n = (String) bd.get("aa");
//            textView1.setText(n);
//            String r=(String)bd.get("b");
//            editText.setText(r);
//        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}