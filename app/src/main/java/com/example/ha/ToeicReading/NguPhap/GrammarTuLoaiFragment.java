package com.example.ha.ToeicReading.NguPhap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ha.ToeicReading.MainActivity;
import com.example.ha.ToeicReading.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrammarTuLoaiFragment extends Fragment {

Button danhtu,tinhtu,dongtu,trangtu,gioitu;

    public GrammarTuLoaiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Từ loại");
        View v=inflater.inflate(R.layout.fragment_grammar_tu_loai, container, false);
        danhtu=(Button)v.findViewById(R.id.danhtu);
        tinhtu=(Button)v.findViewById(R.id.tinhtu);
        dongtu=(Button)v.findViewById(R.id.dongtu);
        trangtu=(Button)v.findViewById(R.id.trangtu);
        gioitu=(Button)v.findViewById(R.id.gioitu);
        danhtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DanhTuFragment danhTuFragment=new DanhTuFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,danhTuFragment,danhTuFragment.getTag()).addToBackStack(null).commit();
            }
        });
        tinhtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              TinhTuFragment tinhTuFragment=new TinhTuFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,tinhTuFragment,tinhTuFragment.getTag()).addToBackStack(null).commit();
            }
        });
        dongtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DongTuFragment DongTuFragment=new DongTuFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,DongTuFragment,DongTuFragment.getTag()).addToBackStack(null).commit();
            }
        });
        trangtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TrangTuFragment TrangTuFragment=new TrangTuFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,TrangTuFragment,TrangTuFragment.getTag()).addToBackStack(null).commit();
            }
        });
        gioitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GioiTuFragment GioiTuFragment=new GioiTuFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,GioiTuFragment,GioiTuFragment.getTag()).addToBackStack(null).commit();
            }
        });
        return v;
    }

}
