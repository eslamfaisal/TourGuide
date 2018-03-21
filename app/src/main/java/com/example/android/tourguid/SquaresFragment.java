package com.example.android.tourguid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SquaresFragment extends Fragment {
    public SquaresFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_fragment, container, false);
        final ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.tahrir_square_text), getString(R.string.tahrir_description), R.drawable.tahrir, new Location(getString(R.string.tahrir_location_latitude), getString(R.string.tahrir_location_longitude))));
        details.add(new Details(getString(R.string.rabaa_square_text), getString(R.string.rabaa_square_description), R.drawable.rabaa, new Location(getString(R.string.rabaa_location_latitude), getString(R.string.rabaa_location_longitude))));
        CustomAdaptor adaptor = new CustomAdaptor(getActivity(), details);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ScrollingDetailsActivity.class);
                i.putExtra("details", details.get(position));
                startActivity(i);
            }
        });
        return rootView;
    }
}
