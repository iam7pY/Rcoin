package com.example.divyampandya63.qourier.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.divyampandya63.qourier.Interface.ItemClickListener;
import com.example.divyampandya63.qourier.Model.Courier_details;
import com.example.divyampandya63.qourier.Paypal;
import com.example.divyampandya63.qourier.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by divyampandya63 on 1/4/18.
 */
class Courier_View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ItemClickListener itemClickListener;
    TextView name;
    TextView cityname;
    ImageView imageView;
    TextView time;
    TextView rate;

    public Courier_View_Holder(View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
       cityname=itemView.findViewById(R.id.place);
        imageView=itemView.findViewById(R.id.image);
        time=itemView.findViewById(R.id.time);
        rate =itemView.findViewById(R.id.rate);
        itemView.setOnClickListener(this);
    }



    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false );
    }
}

public class Courier_Adapter extends RecyclerView.Adapter<Courier_View_Holder> {
    private Context context;
    private List<Courier_details> finals=new ArrayList<>();

    public Courier_Adapter(Context context, List<Courier_details> finals) {
        this.context = context;
        this.finals = finals;
    }

    @Override
    public Courier_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.card_details,parent,false);
        return new Courier_View_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Courier_View_Holder holder, int position) {
        holder.name.setText(finals.get(position).getName());
        holder.cityname.setText((finals.get(position).getCityname()));
        holder.time.setText(finals.get(position).getTime());
        Picasso.with(context).load(finals.get(position).getUrl()).into(holder.imageView);
        holder.rate.setText(finals.get(position).getRate());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent i = new Intent(context, Paypal.class);
                i.putExtra("url",finals.get(position).getUrl());
                i.putExtra("name",finals.get(position).getName());
                i.putExtra("rate",finals.get(position).getRate());
                context.startActivity(i);



            }
        });
    }
    @Override
    public int getItemCount() {
        return finals.size();
    }
}

