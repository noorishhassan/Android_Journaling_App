package com.example.splash_screen.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.splash_screen.AddNewToDo;
import com.example.splash_screen.R;
import com.example.splash_screen.adapters.MyRecyclerViewAdapter;
import com.example.splash_screen.add_new_story;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    MyRecyclerViewAdapter adapter;

    public HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // data to populate the RecyclerView with
        String[] data = {"1st November 2019", "2nd November 2019", "3rd November 2019", "4th November 2019", "5th November 2019"};

        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recycler);
        int numberOfColumns = 6;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        adapter = new MyRecyclerViewAdapter(this.getActivity(), data);
        recyclerView.setAdapter(adapter);

        //button
        ImageButton button = (ImageButton) root.findViewById(R.id.add_btn);
        final Context context = getContext();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, add_new_story.class);
                startActivity(intent);
            }
        });

        //button2
        ImageButton button2 = (ImageButton) root.findViewById(R.id.add_btn_new);
        final Context context2 = getContext();
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(context2, AddNewToDo.class);
                startActivity(intent2);
            }
        });

        return root;
    }





}