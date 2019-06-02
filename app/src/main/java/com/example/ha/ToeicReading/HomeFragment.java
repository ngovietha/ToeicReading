package com.example.ha.ToeicReading;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.ha.ToeicReading.NguPhap.NguPhapFragment;
import com.example.ha.ToeicReading.tuvung.TuVungActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

ImageButton tuvung,nguphap;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Home");
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        tuvung=(ImageButton)view.findViewById(R.id.tuvung);
        nguphap=(ImageButton)view.findViewById(R.id.nguphap);


        tuvung.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TuVungActivity.class);
                startActivity(intent);

            }
        });

        nguphap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                NguPhapFragment nguPhapFragment = new NguPhapFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,nguPhapFragment,nguPhapFragment.getTag()).addToBackStack(null).commit();
            }
        });


        return view;

    }


}
