package com.appbusters.robinkamboj.prdc;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


//Our class extending fragment
public class Tab1 extends Fragment {


    Spinner sp1,sp2;

    String[] elevation = {"up to 1000 ft","1000-2000 ft","2000-4000 ft","4000-5000 ft","5000-6000 ft","6000-7000 ft",
            "7000-8000 ft","8000-9000 ft"};

    String[] string_state = {"Andra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujarat",
            "Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madya Pradesh","Maharashtra",
            "Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttaranchal",
            "Uttar Pradesh","West Bengal"};

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab1, container, false);

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        sp1 = (Spinner) v.findViewById(R.id.spinner);
        sp2 = (Spinner) v.findViewById(R.id.spinner2);


        ArrayAdapter<String> eleAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, elevation);
        eleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(eleAdapter);

        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, string_state);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(stateAdapter);

        return v;
    }
}