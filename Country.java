package com.example.admin.ticketbooking;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Country extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    EditText txtDate, txtTime;

    Spinner sp1,sp2,sp3,sp4;
    Button btnDatePicker, btnTimePicker,b3,b4;
    String[] Type={"Any","A/c","Non A/c"};
    String[] Seat={"Any","Seater","Sleeper"};
    String[] From = {"Coimbatore", "Chennai", "Thirupr", "Velure","Palani","Madhurai","Selam","Ooty","Palakad","Erode","kunnur","Valpari","KodaiKanal","Kodumudi"};
    String[] To = {"Palani","Madhurai","Selam","Ooty","Palakad","Erode","kunnur","Valpari","KodaiKanal","Kodumudi","Coimbatore", "Chennai", "Thirupr", "Velure"};
   private int mYear, mMonth, mDay, mHour, mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country);
        txtDate = (EditText) findViewById(R.id.editText);
        txtTime = (EditText) findViewById(R.id.editText2);
        sp1 = (Spinner) findViewById(R.id.spinner);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        sp3 = (Spinner) findViewById(R.id.spinner5);
        sp4 = (Spinner) findViewById(R.id.spinner6);
        btnDatePicker = (Button) findViewById(R.id.button);
        btnTimePicker = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button8);
        sp1.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, From);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(aa);

        sp2.setOnItemSelectedListener(this);
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_spinner_item, To);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(a);

        sp3.setOnItemSelectedListener(this);
        ArrayAdapter b = new ArrayAdapter(this, android.R.layout.simple_spinner_item,Type );
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(b);

        sp4.setOnItemSelectedListener(this);
        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Seat);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp4.setAdapter(bb);


        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);
    }

    public void onClick(View v) {

        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == btnTimePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
      b3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

             Intent intent=new Intent(Country.this,Bus.class);
              startActivity(intent);

          }
      });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Txt2=sp2.getSelectedItem().toString();
                String Text=sp1.getSelectedItem().toString();
                String edit= String.valueOf(btnDatePicker.callOnClick());
                Intent i=new Intent(Country.this,Payment.class);
                i.putExtra("a",Text);
                i.putExtra("aa",Txt2);
                i.putExtra("b",edit);
                i.getData().toString();
                Toast.makeText(getApplicationContext(),"datas saved",Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
