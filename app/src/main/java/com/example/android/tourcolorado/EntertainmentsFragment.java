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
public class EntertainmentsFragment extends Fragment {


    public EntertainmentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.entertainment_botanic), getString(R.string.botanic_location),R.drawable.entbotanic));
        details.add(new Details(getString(R.string.entertainment_waterworld), getString(R.string.waterworld_location),R.drawable.entwater));
        details.add(new Details(getString(R.string.entertainment_wildanimal), getString(R.string.wildanimal_location),R.drawable.entwild));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
