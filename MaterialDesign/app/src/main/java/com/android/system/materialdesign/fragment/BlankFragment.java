package com.android.system.materialdesign.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.system.materialdesign.BookInfo;
import com.android.system.materialdesign.R;
import com.android.system.materialdesign.adapter.MyBookAdater;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    public BlankFragment() {
        // Required empty public constructor
    }
    private static List<BookInfo> mbk;
    View view;
    public static BlankFragment newInstance(List<BookInfo> mlist) {
        Bundle args = new Bundle();
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        mbk=mlist;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=  inflater.inflate(R.layout.fragment_blank, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(mbk!=null){
            RecyclerView myRecycler = (RecyclerView) view.findViewById(R.id.linearrecycler);
            myRecycler.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));
            List<BookInfo> bk=new ArrayList<>();
            for ()

            MyBookAdater mbAdapter=new MyBookAdater(this.getContext(),)
        }
    }
}
