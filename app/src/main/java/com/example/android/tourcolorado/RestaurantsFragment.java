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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.restaurant_hashtag), getString(R.string.hashtag_location),R.drawable.reshashtag, getString(R.string.hashtag_phone)));
        details.add(new Details(getString(R.string.restaurant_tables), getString(R.string.tables_location),R.drawable.restable,getString(R.string.tables_phone)));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
