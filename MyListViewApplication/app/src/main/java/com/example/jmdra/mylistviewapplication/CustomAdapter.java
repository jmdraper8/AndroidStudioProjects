package com.example.jmdra.mylistviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jmdra on 2/21/2016.
 */
class CustomAdapter extends ArrayAdapter<String> {

    //needs a Constructor
    CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater johnsInflater = LayoutInflater.from(getContext());
        View customView = johnsInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView johnsText = (TextView) customView.findViewById(R.id.johnsText);
        ImageView johnsImage = (ImageView) customView.findViewById(R.id.johnsImage);

        johnsText.setText(singleFoodItem);
        johnsImage.setImageResource(R.drawable.newprofile);

        return customView;
    }
}
