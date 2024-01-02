package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView listData;
    RecyclerDataAdapter recyclerDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listData = findViewById(R.id.listData);

//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 3);
        listData.setLayoutManager(layoutManager);

        recyclerDataAdapter = new RecyclerDataAdapter(this);
        listData.setAdapter(recyclerDataAdapter);
    }
}