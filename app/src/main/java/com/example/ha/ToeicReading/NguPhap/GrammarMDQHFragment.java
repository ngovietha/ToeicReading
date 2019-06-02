package com.example.ha.ToeicReading.NguPhap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ha.ToeicReading.MainActivity;
import com.example.ha.ToeicReading.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrammarMDQHFragment extends Fragment {

TextView tvMDQH=null;
    public GrammarMDQHFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Mệnh đề quan hệ");
        View view= inflater.inflate(R.layout.fragment_grammar_mdqh, container, false);
        tvMDQH=(TextView)view.findViewById(R.id.tvMDQH);
        tvMDQH.setText(R.string.MDQH);
        return view ;
    }

}
