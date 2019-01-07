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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.hotels_fourseasons), getString(R.string.fourseasons_location),R.drawable.hotelfour,getString(R.string.fourseasons_phone)));
        details.add(new Details(getString(R.string.hotels_crawford), getString(R.string.crawford_location),R.drawable.hotelcrawford, getString(R.string.crawford_phone)));
        details.add(new Details(getString(R.string.hotels_ramble), getString(R.string.ramble_location),R.drawable.hotelramble,getString(R.string.ramble_phone)));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
