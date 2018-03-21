package com.example.android.tourguid;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaptor extends ArrayAdapter<Details> {

    public CustomAdaptor(Activity context, ArrayList<Details> detailes) {
        super(context, 0, detailes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        if (rootView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Details currentDetails = getItem(position);
        TextView textView = (TextView) rootView.findViewById(R.id.name_view);
        textView.setText(currentDetails.getName());
        ImageView imageView = (ImageView) rootView.findViewById(R.id.image_view);
        imageView.setImageResource(currentDetails.getImage());
        return rootView;
    }
}
