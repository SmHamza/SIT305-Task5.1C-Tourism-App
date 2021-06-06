package com.example.a51ctourismapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView horizontalRecyclerView, verticalRecylerView;
    HorizontalAdapter horizontalAdapter;
    VerticalAdapter verticalAdapter;
    List<horizontalPlaces> horizontalPlacesList = new ArrayList<>();
    List<Places> verticalPlacesList = new ArrayList<>();

    Integer[] imageList = {R.drawable.melbourne, R.drawable.bangkok, R.drawable.karachi, R.drawable.tokyo, R.drawable.kathmandu, R.drawable.venice};
    String[] placesNames = {"Melbourne", "Bangkok", "Karachi", "Tokyo", "Kathmandu", "Venice"};
    String[] placesDescription = {"Melbourne is the capital and most-populous city of the Australian state of Victoria, " +
            "and the second-most populous city in Australia and Oceania Its name refers to an urban agglomeration of 9,993 km2 (3,858 sq mi),[10] comprising a metropolitan area with 31 municipalities,[11] and is also a common name for its city centre.",
            "Bangkok is the capital and most populous city of Thailand. It is known in Thai as Krung Thep Maha Nakhon or simply Krung Thep",
            "Karachi is the largest city in Pakistan and the twelfth largest city in the world. It is the capital of the Pakistani province of Sindh. Ranked as a beta-global city,[18][19] the city is Pakistan's premier industrial and financial centre",
            "Tokyo is the de facto capital and most populous prefecture of Japan. Located at the head of Tokyo Bay the prefecture forms part of the Kantō region on the central Pacific coast of Japan's main island of Honshu",
            "Kathmandu is the capital and largest city of Nepal, with a population of around 1 million. Also known as the city of temples, the city stands at an elevation of approximately 1,400 metres (4,600 feet) above sea level in the bowl-shaped Kathmandu Valley in central Nepal",
            "Venice is a city in northeastern Italy and the capital of the Veneto region. It is built on a group of 118 small islands that are separated by canals and linked by over 400 bridges."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizontalRecyclerView = findViewById(R.id.horizontalRecylerView);
        horizontalAdapter = new HorizontalAdapter(horizontalPlacesList, MainActivity.this);
        horizontalRecyclerView.setAdapter(horizontalAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        horizontalRecyclerView.setLayoutManager(layoutManager);

        for(int i = 0; i < imageList.length; i++)
        {
            horizontalPlaces places = new horizontalPlaces(i, imageList[i]);
            horizontalPlacesList.add(places);
        }

        verticalRecylerView = findViewById(R.id.verticalReclyerView);
        verticalAdapter = new VerticalAdapter(verticalPlacesList, MainActivity.this);
        verticalRecylerView.setAdapter(verticalAdapter);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        verticalRecylerView.setLayoutManager(layoutManager1);

        for(int i = 0; i < imageList.length; i++)
        {
            Places places1 = new Places(i, imageList[i], placesNames[i], placesDescription[i]);
            verticalPlacesList.add(places1);
        }
    }
}