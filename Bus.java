package com.example.admin.ticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Bus extends Activity {

    ListView listView;
    String BusName[]={"SPS travels ","RKR travels","Vj travels","PK Travels","NS Travles","MVS Travels"};
    int imgid[]={R.drawable.bus1, R.drawable.bus2, R.drawable.b3,R.drawable.bus4,R.drawable.bus5,R.drawable.bus6};
    String BusType[]={"  A/c","  A/C","  A/C & non A/C","  non A/C","  A/C","  A/C & non A/C"};
    String Price[]={"  $34","  $40","  $36","  $28","  $43","  $45"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus);
        CustomListAdapter adapter=new CustomListAdapter(this,BusName,imgid,BusType,Price);
        listView=(ListView)findViewById(R.id.list_item);

        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue=(String)listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Position:"+itemPosition+"ListItem:"+itemValue,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Bus.this,Details.class);
                startActivity(intent);


            }
        });
    }

}