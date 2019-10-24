package com.example.admin.ticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Details extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4;
    CheckBox checkBox;
    Button button;
    RadioButton radioButton1,radioButton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
      editText1=(EditText)findViewById(R.id.editText8);
        editText2=(EditText)findViewById(R.id.editText10);
        editText3=(EditText)findViewById(R.id.editText12);
        editText4=(EditText)findViewById(R.id.editText13);
        button=(Button)findViewById(R.id.button4);
        checkBox=(CheckBox)findViewById(R.id.checkBox4);
        radioButton1=(RadioButton)findViewById(R.id.radioButton6);
        radioButton2=(RadioButton)findViewById(R.id.radioButton7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Details.this,Payment.class);
                startActivity(i);     }
        });}}