package com.example.admin.ticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText1,editText2;
    Button button1,button2;
   // String userName,password;
    LoginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    editText1=(EditText)findViewById(R.id.name);
        editText2=(EditText)findViewById(R.id.password);
        button1=(Button)findViewById(R.id.login);
        button2=(Button)findViewById(R.id.newUser);

        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName=editText1.getText().toString();
                String password=editText2.getText().toString();
                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);

                if(password.equals(storedPassword)){
                    Toast.makeText(MainActivity.this,"Congrats :Login successfull",Toast.LENGTH_SHORT);
                    Intent intent=new Intent(MainActivity.this,Country.class);
                    startActivity(intent);
                }
                else {

                    Toast.makeText(MainActivity.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,NewUser.class);
                startActivity(i);
            }
        });

    } protected void onDestroy() {
        super.onDestroy();
        // Close The Database
        loginDataBaseAdapter.close();
    }
}
