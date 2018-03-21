package com.example.android.tourguid;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class UniversityFragment extends Fragment {
    public UniversityFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_fragment, container, false);
        final ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.ainshams_text_name), getString(R.string.ainshams_text_description), R.drawable.ainshams, new Location(getString(R.string.ainshams_location_latitude), getString(R.string.anishams_location_longitude))));
        details.add(new Details(getString(R.string.cairouniversity_text_name), getString(R.string.cairouniverist_text_description), R.drawable.cairouniversity, new Location(getString(R.string.cairouniversity_location_latitude), getString(R.string.cairouniversity_location_longitude))));
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
