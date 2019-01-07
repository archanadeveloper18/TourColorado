package com.example.android.tourcolorado;

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

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(Activity context, ArrayList<Details> pWords) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Details currentTour = getItem(position);

        TextView firstTextView = (TextView) listItemView.findViewById(R.id.first_textview);
        assert currentTour != null;
        firstTextView.setText(currentTour.getPlaceName());

        TextView secondTextView = (TextView) listItemView.findViewById(R.id.second_textview);
        secondTextView.setText(currentTour.getLocationName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTour.getImageResourceId());

        TextView textView = (TextView) listItemView.findViewById(R.id.third_textview);

        if (currentTour.hasPhone()) {
            textView.setText(currentTour.getPhoneNum());
            textView.setEnabled(true);
        } else {
            textView.setEnabled(false);
        }

        return listItemView;
    }
}
