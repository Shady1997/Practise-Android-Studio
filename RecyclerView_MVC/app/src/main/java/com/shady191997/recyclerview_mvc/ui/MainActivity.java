package com.shady191997.recyclerview_mvc.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.shady191997.recyclerview_mvc.R;
import com.shady191997.recyclerview_mvc.RvAdapter;
import com.shady191997.recyclerview_mvc.models.MovieNames;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovie;
    List<MovieNames> movieNamesList=new ArrayList<>();
    RvAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie=findViewById(R.id.rv_movie_names);

        rvAdapter=new RvAdapter(MainActivity.this,movieNamesList);


        MovieNames movieNames=new MovieNames("shady1",R.drawable.download1,1990);
        MovieNames movieNames2=new MovieNames("shady2",R.drawable.download2,1991);
        MovieNames movieNames3=new MovieNames("shady3",R.drawable.download3,1992);
        MovieNames movieNames4=new MovieNames("shady4",R.drawable.download4,1993);
        MovieNames movieNames5=new MovieNames("shady5",R.drawable.download5,1994);

        movieNamesList.add(movieNames);
        movieNamesList.add(movieNames2);
        movieNamesList.add(movieNames3);
        movieNamesList.add(movieNames4);
        movieNamesList.add(movieNames5);
        movieNamesList.add(movieNames);
        movieNamesList.add(movieNames2);
        movieNamesList.add(movieNames3);
        movieNamesList.add(movieNames4);
        movieNamesList.add(movieNames5);
        movieNamesList.add(movieNames);
        movieNamesList.add(movieNames2);
        movieNamesList.add(movieNames3);
        movieNamesList.add(movieNames4);
        movieNamesList.add(movieNames5);



        //LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        //LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this, GridLayoutManager.VERTICAL,false);
        //LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this, GridLayoutManager.HORIZONTAL,false);



        rvMovie.setItemAnimator(new DefaultItemAnimator());
        rvMovie.addItemDecoration(new DividerItemDecoration(rvMovie.getContext(),linearLayoutManager.getOrientation()));

        rvMovie.setLayoutManager(linearLayoutManager);

        rvMovie.setAdapter(rvAdapter);




        //add listener to recycler view as a whole
//       rvMovie.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
//           @Override
//           public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
//               return false;
//           }
//
//           @Override
//           public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
//
//           }
//
//           @Override
//           public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//           }
//       });


    }
}
