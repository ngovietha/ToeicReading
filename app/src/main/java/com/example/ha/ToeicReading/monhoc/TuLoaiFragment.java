package com.example.ha.ToeicReading.monhoc;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


import com.example.ha.ToeicReading.MainActivity;
import com.example.ha.ToeicReading.R;
import com.example.ha.ToeicReading.slide.ScreenSlideActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TuLoaiFragment extends Fragment {

    ExamAdapter examAdapter;
    GridView gvExam;
    ArrayList<Exam> arr_exam= new ArrayList<Exam>();

    public TuLoaiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Từ Loại");
        return inflater.inflate(R.layout.fragment_tu_loai, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gvExam=(GridView) getActivity().findViewById(R.id.gvExam);
        arr_exam.add(new Exam("Đề số 1"));
        arr_exam.add(new Exam("Đề số 2"));


        examAdapter=new ExamAdapter(getActivity(),arr_exam);
        gvExam.setAdapter(examAdapter);
        gvExam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(getActivity(), ScreenSlideActivity.class);
                intent.putExtra("num_exam",i+1);
                intent.putExtra("subject","tuloai");
                intent.putExtra("test","yes");
                startActivity(intent);
            }
        });

    }
}
