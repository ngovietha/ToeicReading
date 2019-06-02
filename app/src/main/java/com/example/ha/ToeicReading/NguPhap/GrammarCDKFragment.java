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
public class GrammarCDKFragment extends Fragment {

TextView tvCDK=null;
    public GrammarCDKFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Câu điều kiện");
        View v=inflater.inflate(R.layout.fragment_grammar_cdk, container, false);
        tvCDK=(TextView)v.findViewById(R.id.tvCDK);
        tvCDK.setText(R.string.CDK);
        return v;
    }

}
