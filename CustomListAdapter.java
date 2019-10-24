package com.example.admin.ticketbooking;

import android.app.Activity;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.ViewGroup;

public class CustomListAdapter extends ArrayAdapter<String> {

    Activity context;
    TextView textView1,textView2,textView,textView4;
    ImageView imageView;
    String[] Busname;
    String[] BusType;
    String[] Price;
    int[] imgid;

    public CustomListAdapter(Activity context, String[] Busname, int[] imgid , String[] Price, String[] BusType ) {

        super(context,R.layout.imagetext,Busname);
        this.context=context;
        this.Busname=Busname;
        this.imgid=imgid;
        this.BusType=BusType;
        this.Price=Price;

    }



    public View getView(int position,View view,ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.imagetext,null,true);

        textView=(TextView)rowView.findViewById(R.id.text);
        textView1=(TextView)rowView.findViewById(R.id.text1);
        textView2=(TextView)rowView.findViewById(R.id.text2);
        imageView=(ImageView)rowView.findViewById(R.id.image);
        textView.setText(Busname[position]);
        textView1.setText(BusType[position]);
        textView2.setText(Price[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;
    };


}