package com.saransh.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
//        ArrayList<Earthquake> earthquakes = new ArrayList<>();
//        earthquakes.add(new Earthquake("2.3","Lok Kalyan Marg","Feb 02 2018"));
//        earthquakes.add(new Earthquake("4.5","Karkaduma","Jan 19 2019"));
//        earthquakes.add(new Earthquake("7.8","Anand Vihar","Feb 15 2020"));
//        earthquakes.add(new Earthquake("7.3","Okhla Bird Sanctuary","June 09 2018"));
//        earthquakes.add(new Earthquake("4.9","Botanical Gardens","Feb 05 2017"));
//        earthquakes.add(new Earthquake("1.3","Jasola Vihar","mar 31 2014"));
//        earthquakes.add(new Earthquake("7.8","Green Park","Feb 11 2015"));
//        earthquakes.add(new Earthquake("2.3","Rajiv Chowk","Aug 22 2017"));
//        earthquakes.add(new Earthquake("3.3","Dabri Mor","Dec 18 2014"));
//        earthquakes.add(new Earthquake("5.2","Janakpuri","Feb 12 2012"));
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        // Create a new {@link ArrayAdapter} of earthquakes
        final EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);

        earthquakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Earthquake currentEarthquake = adapter.getItem(position);

                Uri earthquakeUri = Uri.parse(currentEarthquake.getUrl());

                // Create a new intent to view the earthquake URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);

                // Send the intent to launch a new activity
                startActivity(websiteIntent);
            }
        });

    }
}
