package com.example.magdalena.myapplication.test;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.magdalena.myapplication.R;
import com.example.magdalena.myapplication.adapter.adapter;
import com.example.magdalena.myapplication.model.data;

/**
 * Created by Magdalena on 2017-03-15.
 */

public class listActivity extends AppCompatActivity{

    private RecyclerView recView;
    private adapter adapter_n;


   @Override
    protected  void onCreate(Bundle savedldstanceState)
   {
       super.onCreate(savedldstanceState);
       setContentView(R.layout.activity_main2);

       recView = (RecyclerView)findViewById(R.id.przewijane);
       recView.setLayoutManager( new LinearLayoutManager(this));

       adapter_n= new adapter(data.getiteamList(), this);
       recView.setAdapter(adapter_n);
   }



}
