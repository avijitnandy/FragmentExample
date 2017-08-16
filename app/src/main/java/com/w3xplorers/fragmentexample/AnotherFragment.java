package com.w3xplorers.fragmentexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Avijit on 8/16/2017.
 */

public class AnotherFragment extends Fragment {

    View view;
    Button firstButton;
    Button backButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_simple,container,false);
        // get the reference of Button
        firstButton = (Button) view.findViewById(R.id.firstButton);
        // perform setOnClickListener on first Button
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_LONG).show();

            }
        });

        // get the reference of Button
        backButton = (Button) view.findViewById(R.id.backButton);
        // perform setOnClickListener on first Button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                    Intent in = new Intent(getContext(),MainActivity.class);
                    startActivity(in);
                }
            }
        });
        return view;
    }
}
