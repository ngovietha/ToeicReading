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
public class NguPhapFragment extends Fragment {
Button btnThi,btnTuLoai,btnMĐQH,btnCDK;

    public NguPhapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Ngữ Pháp");
      View view= inflater.inflate(R.layout.fragment_ngu_phap, container, false);
      btnThi=(Button)view.findViewById(R.id.btnThi);
        btnTuLoai=(Button)view.findViewById(R.id.btnTuLoai);
        btnMĐQH=(Button)view.findViewById(R.id.btnMDQH);
        btnCDK=(Button)view.findViewById(R.id.btnCDK);

        btnThi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GrammarThiFragment grammarThiFragment = new GrammarThiFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,grammarThiFragment,grammarThiFragment.getTag()).addToBackStack(null).commit();
            }
        });
        btnTuLoai.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GrammarTuLoaiFragment grammarTuLoaiFragment = new GrammarTuLoaiFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,grammarTuLoaiFragment,grammarTuLoaiFragment.getTag()).addToBackStack(null).commit();
            }
        });
        btnMĐQH.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GrammarMDQHFragment grammarMDQHFragment = new GrammarMDQHFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,grammarMDQHFragment,grammarMDQHFragment.getTag()).addToBackStack(null).commit();
            }
        });
        btnCDK.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GrammarCDKFragment grammarCDKFragment = new GrammarCDKFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main,grammarCDKFragment,grammarCDKFragment.getTag()).addToBackStack(null).commit();
            }
        });
      return view;
    }

}
