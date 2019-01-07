package com.example.android.tourcolorado;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.attractions_redrock), getString(R.string.redrock_location),R.drawable.redrock));
        details.add(new Details(getString(R.string.attractions_royalgorge), getString(R.string.royalgorge_location),R.drawable.royalgorge));
        details.add(new Details(getString(R.string.attractions_gardenofgods), getString(R.string.gardenofgods_location),R.drawable.gardenofgod));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
