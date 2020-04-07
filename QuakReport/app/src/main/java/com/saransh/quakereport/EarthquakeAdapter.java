package com.saransh.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    EarthquakeAdapter(@NonNull Context context, List<Earthquake> resource)
    {
        super(context,0,resource );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.eartquake_list_item,parent,false);
        }
        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeView = (TextView)listItemView.findViewById(R.id.magnitude);
        //assert currentEarthquake != null;
        magnitudeView.setText(currentEarthquake.getMagnitude());

        TextView locationView = (TextView)listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getLocation());

        TextView dateView = (TextView)listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getDate());

        return listItemView;

    }
}
