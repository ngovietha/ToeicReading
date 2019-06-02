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
public class GrammarThiFragment extends Fragment {

Button thi1,thi2,thi3,thi4,thi5,thi6,thi7,thi8,thi9,thi10,thi11,thi12,thi13;
    public GrammarThiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Các thì của động từ");
        View view= inflater.inflate(R.layout.fragment_grammar_thi, container, false);
        thi1=(Button)view.findViewById(R.id.thi1);
        thi2=(Button)view.findViewById(R.id.thi2);
        thi3=(Button)view.findViewById(R.id.thi3);
        thi4=(Button)view.findViewById(R.id.thi4);
        thi5=(Button)view.findViewById(R.id.thi5);
        thi6=(Button)view.findViewById(R.id.thi6);
        thi7=(Button)view.findViewById(R.id.thi7);
        thi8=(Button)view.findViewById(R.id.thi8);
        thi9=(Button)view.findViewById(R.id.thi9);
        thi10=(Button)view.findViewById(R.id.thi10);
        thi11=(Button)view.findViewById(R.id.thi11);
        thi12=(Button)view.findViewById(R.id.thi12);
        thi13=(Button)view.findViewById(R.id.thi13);

        thi1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiHTDFragment thiHTDFragment = new ThiHTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, thiHTDFragment, thiHTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiHTTDFragment thiHTTDFragment = new ThiHTTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, thiHTTDFragment, thiHTTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiHTHTFragment thiHTHTFragment = new ThiHTHTFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, thiHTHTFragment, thiHTHTFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiHTHTTDFragment ThiHTHTTDFragment = new ThiHTHTTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiHTHTTDFragment, ThiHTHTTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiQKDFragment ThiQKDFragment = new ThiQKDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiQKDFragment, ThiQKDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiQKTDFragment ThiQKTDFragment = new ThiQKTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiQKTDFragment, ThiQKTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiQKHTFragment ThiQKHTFragment = new ThiQKHTFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiQKHTFragment, ThiQKHTFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiQKHTTDFragment ThiQKHTTDFragment = new ThiQKHTTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiQKHTTDFragment, ThiQKHTTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiTLDFragment ThiTLDFragment = new ThiTLDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiTLDFragment, ThiTLDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiTLTDFragment ThiTLTDFragment = new ThiTLTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiTLTDFragment, ThiTLTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiTLHTFragment ThiTLHTFragment = new ThiTLHTFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiTLHTFragment, ThiTLHTFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiTLHTTDFragment ThiTLHTTDFragment = new ThiTLHTTDFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiTLHTTDFragment, ThiTLHTTDFragment.getTag()).addToBackStack(null).commit();
            }
        });
        thi13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ThiTLGFragment ThiTLGFragment = new ThiTLGFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_main, ThiTLGFragment, ThiTLGFragment.getTag()).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
