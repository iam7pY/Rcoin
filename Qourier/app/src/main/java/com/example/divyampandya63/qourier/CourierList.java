package com.example.divyampandya63.qourier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.divyampandya63.qourier.Adapter.Courier_Adapter;
import com.example.divyampandya63.qourier.Model.Courier_details;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CourierList extends AppCompatActivity {

FirebaseDatabase database;
DatabaseReference databaseReference;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
List<Courier_details> detailsList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_list);
        recyclerView = findViewById(R.id.recyclerview);

       layoutManager = new LinearLayoutManager(this);
       recyclerView.setLayoutManager(layoutManager);
        database=FirebaseDatabase.getInstance();
        databaseReference=database.getReference("Courier");


        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren())
                {

                    detailsList.add(dataSnapshot1.getValue(Courier_details.class));
                }
                Courier_Adapter adapter=new Courier_Adapter(CourierList.this,detailsList);
                adapter.notifyDataSetChanged();
                Log.d("Divyam",detailsList.size() + "");
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
