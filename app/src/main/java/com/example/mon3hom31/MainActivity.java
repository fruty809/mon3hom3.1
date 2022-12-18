package com.example.mon3hom31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactRecyclerView;
    private ArrayList<String> contactList = new ArrayList<>();
    private ContactAdapter adapter = new ContactAdapter(contactList);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        contactRecyclerView.setAdapter(adapter);
    }
    private void loadData(){
        contactList.add("Саша бравл старс");
        contactList.add("Виталий поровоз");
        contactList.add("Александр провайдер");
        contactList.add("Петя сантехник");
        contactList.add("Вася конденсатор");
        contactList.add("Инь и Ян");
        contactList.add("Тослтой наелся");
        contactList.add("Дед седой");
        contactList.add("Бабка на ветер");
        contactList.add("мама");
        contactList.add("папа");
        contactList.add("сестра ");
        contactList.add("брат");
    }}
