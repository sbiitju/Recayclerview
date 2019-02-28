package com.example.againpractiserecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    String[] name={"Shahin","Bashar","Rechard","Zilani","Tanab"};
    int[] id={R.drawable.fiver,R.drawable.fourr,R.drawable.node,R.drawable.oner,R.drawable.sixr};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recyclerView=findViewById(R.id.recyclerview);
    myAdapter=new MyAdapter(this,name,id);
    recyclerView.setAdapter(myAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    myAdapter.onItemclicklistener(new MyAdapter.A() {
        @Override
        public void onItemClick(int position, View v) {
            Toast.makeText(MainActivity.this, "Normal click", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void OnLongClick(int position, View v) {
            Toast.makeText(MainActivity.this, "Long click", Toast.LENGTH_SHORT).show();
        }
    });

    }
}
