package com.priya.colorfragmentexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ColorFragment extends Fragment {

    public Button buttonR, buttonG, buttonB, buttonC ;
    public  RelativeLayout colorRl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragmentcolor, container, false);
       buttonR = view.findViewById(R.id.RedBt);
       buttonG = view.findViewById(R.id.GreenBt);
       buttonB = view.findViewById(R.id.BlueBt);
       colorRl= view.findViewById(R.id.colorRl);
       buttonC= view.findViewById(R.id.clearBt);

       buttonR.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               colorRl.setBackgroundColor(Color.RED);

           }
       });

       buttonG.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               colorRl.setBackgroundColor(Color.GREEN);

           }
       });

       buttonB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               colorRl.setBackgroundColor(Color.BLUE);

           }
       });

       buttonC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               colorRl.setBackgroundColor(Color.WHITE);
           }
       });

        return view;
    }
}
