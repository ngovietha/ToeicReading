package com.example.ha.ToeicReading.monhoc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ha.ToeicReading.MainActivity;
import com.example.ha.ToeicReading.R;

public class GioiThieuToeicFragment extends Fragment {


    public GioiThieuToeicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Giới thiệu bài thi Toeic");
        return inflater.inflate(R.layout.fragment_gioi_thieu, container, false);

    }

}

