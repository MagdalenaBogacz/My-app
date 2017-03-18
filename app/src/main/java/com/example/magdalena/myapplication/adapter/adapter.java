package com.example.magdalena.myapplication.adapter;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.magdalena.myapplication.R;
import com.example.magdalena.myapplication.model.iteamList;

import java.util.List;

/**
 * Created by Magdalena on 2017-03-15.
 */

public class adapter extends RecyclerView.Adapter<adapter.Holder>{


    private List<iteamList> listData;
    private LayoutInflater inflater;


    public adapter (List<iteamList> listData, Context c)
    {
        this.inflater=LayoutInflater.from(c);
        this.listData=listData;
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.iteam_list, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        iteamList item = listData.get(position);
        holder.tytyl.setText(item.getTytuly());
        holder.daty.setText(item.getDaty());
        holder.opisy.setText(item.getOpisy());


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class Holder extends RecyclerView.ViewHolder{


           private TextView tytyl;
             private TextView daty;
             private TextView opisy;


        public Holder (View itemView){
            super(itemView);


            tytyl=(TextView)itemView.findViewById(R.id.Tytul);
            daty=(TextView)itemView.findViewById(R.id.datais);
            opisy=(TextView)itemView.findViewById(R.id.szczeguly);

        }

    }



}
