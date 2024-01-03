package com.appdeveloperrakib.listviewandadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<PlanetModel> planetModelArrayList;

    private  static MyCustomAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- AdapterView : a ListView
        listView = findViewById(R.id.listview);

        // 2 - Data Source : ArrayList<Planet>
        planetModelArrayList = new ArrayList<>();

        PlanetModel planet1 = new PlanetModel("Earth","1 Moon",R.drawable.earth);
        PlanetModel planet2 = new PlanetModel("Mercury","0 Moons",R.drawable.mercury);
        PlanetModel planet3 = new PlanetModel("Venus","0 Moons",R.drawable.venus);

        PlanetModel planet4 = new PlanetModel("Mars","2 Moons",R.drawable.mars);
        PlanetModel planet5 = new PlanetModel("Jupiter","79 Moons", R.drawable.jupiter);
        PlanetModel planet6 = new PlanetModel("Saturn","83 Moons",R.drawable.saturn);

        PlanetModel planet7 = new PlanetModel("Uranus","27 Moons",R.drawable.uranus);
        PlanetModel planet8 = new PlanetModel("Neptune","14 Moons",R.drawable.neptune);

        planetModelArrayList.add(planet1);
        planetModelArrayList.add(planet2);
        planetModelArrayList.add(planet3);
        planetModelArrayList.add(planet4);
        planetModelArrayList.add(planet5);
        planetModelArrayList.add(planet6);
        planetModelArrayList.add(planet7);
        planetModelArrayList.add(planet8);


        //Adapter:

        adapter = new MyCustomAdapter(planetModelArrayList,getApplicationContext());
        listView.setAdapter(adapter);






    }
}