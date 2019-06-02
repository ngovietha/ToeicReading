package com.example.ha.ToeicReading.NguPhap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ha.ToeicReading.MainActivity;
import com.example.ha.ToeicReading.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThiTLGFragment extends Fragment {


    public ThiTLGFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Thì tương lai gần"); // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_thi_tlg, container, false);
    }

}
