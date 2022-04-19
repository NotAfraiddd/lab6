package com.example.lab3_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Shoes> listShoes = new ArrayList<>();
        listShoes.add(new Shoes(R.drawable.w1,"Nike shoes - discount 50%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.blue,"Nike shoes - discount 80%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.purple,"Nike bicyle shoes - discount 50%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.red,"Yonex shoes - discount 50%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.bm,"Binh Minh shoes - discount 90%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.w1,"Nike shoes - discount 50%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.blue,"Nike shoes - discount 80%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.purple,"Nike bicyle shoes - discount 50%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.red,"Yonex shoes - discount 50%","Pls touch to see detail"));
        listShoes.add(new Shoes(R.drawable.bm,"Binh Minh shoes - discount 90%","Pls touch to see detail"));
    }
}