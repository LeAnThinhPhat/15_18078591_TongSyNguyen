package com.example.a15_18078591_tongsynguyen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Screen1 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Coffee> list;
    RecyclerView.LayoutManager mLayoutManager;
    CustomAdapterCoffee adapterRecyclerView;
    ImageButton imgBut;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        recyclerView = findViewById(R.id.recycler);
        imgBut = findViewById(R.id.imgButSearch);
        edt = findViewById(R.id.edtFind);

        list = new ArrayList<>();

        list.add(new Coffee(R.drawable.caramel,"Stabuck Coffee","150"));
        list.add(new Coffee(R.drawable.caramel,"Black Coffee1","150"));

        adapterRecyclerView = new CustomAdapterCoffee(list);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapterRecyclerView);

        adapterRecyclerView.setOnClick(new CustomAdapterCoffee.onClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(Screen1.this, Screen2.class);
                intent.putExtra("coffee",list.get(position));
                startActivity(intent);
            }
        });
        imgBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Coffee> list1 = new ArrayList<>();
                Log.e("loi",edt.getText().toString());
                for (Coffee c: list) {
                    Log.e("co",c.getNameCoffee());
                    if(c.getNameCoffee().contains(edt.getText().toString())){
                        Log.e("dsd",c.getNameCoffee());
                        list1.add(c);
                    }
                }
                adapterRecyclerView = new CustomAdapterCoffee(list1);
                recyclerView.setAdapter(adapterRecyclerView);
                recyclerView.setLayoutManager(mLayoutManager);
            }
        });
    }
}