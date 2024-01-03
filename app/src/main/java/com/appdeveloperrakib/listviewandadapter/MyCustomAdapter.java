package com.appdeveloperrakib.listviewandadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<PlanetModel> {

    // Using Custom Layouts --> MyCustomAdapter
    // Using Custom Objects --> extends ArrayAdapter<Planet>
    private ArrayList<PlanetModel> planetsArrayList;
    Context context;

    public MyCustomAdapter( ArrayList<PlanetModel> planetsArrayList, Context context) {
        super(context, R.layout.item_list,planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }

    // View Holder Class: used to cache references to the views within
    //                    an item layout, so that they don't need to be
    //                    repeatedly looked up during scrolling
    private static class MyViewHolder{

        TextView planetName;
        TextView moonCount;
        ImageView planetImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1- Get the planet object for the current position

        PlanetModel planets = getItem(position);

        // 2- Inflate Layout :

        MyViewHolder myViewHolder;
        final  View result;


        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list,
                    parent,
                    false
            );


            //Finding Views :
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.tv_planetName);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.tv_moon_of_plannet);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.image_planet);


            result = convertView;

            convertView.setTag(myViewHolder);
        }else {

            //the view is recycled

            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        //Getting the data from PlanetModel Class

        myViewHolder.planetName.setText(planets.getPlanetName());
        myViewHolder.moonCount.setText(planets.getMoonCount());
        myViewHolder.planetImg.setImageResource(planets.getPlanetImage());

        return result;

    }
}
