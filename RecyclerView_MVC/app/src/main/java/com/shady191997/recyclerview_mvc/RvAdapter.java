package com.shady191997.recyclerview_mvc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shady191997.recyclerview_mvc.models.MovieNames;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {
    private Context mContext;
    private List<MovieNames> mMovieNamesList;

    public RvAdapter(Context mContext, List<MovieNames> mMovieNamesList) {
        this.mContext = mContext;
        this.mMovieNamesList = mMovieNamesList;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {
        final View view= LayoutInflater.from(mContext).inflate(R.layout.rv_movie_name,parent,false);


        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, final int position) {
        MovieNames movieNames=mMovieNamesList.get(position);
       holder.mMovieName.setText(movieNames.getmMovieName());
       holder.getmMovieDate.setText(Integer.toString(movieNames.getMdate()));
       holder.mMovieImage.setImageResource(movieNames.getmMovieImage());

       holder.view.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //Toast.makeText(mContext,"you click "+Integer.toString(position),Toast.LENGTH_LONG).show();
               if(mMovieNamesList.get(position).getMdate()==1990)
               {
                   Toast.makeText(mContext,"you click facebook",Toast.LENGTH_LONG).show();
               }
               else if(mMovieNamesList.get(position).getMdate()==1991)
               {
                   Toast.makeText(mContext,"you click youtube",Toast.LENGTH_LONG).show();
               }

               else if(mMovieNamesList.get(position).getmMovieImage()==1992)
               {
                   Toast.makeText(mContext,"you click google",Toast.LENGTH_LONG).show();
               }
               else if(mMovieNamesList.get(position).getMdate()==1993)
               {
                   Toast.makeText(mContext,"you click twitter "+mMovieNamesList.get(position).getmMovieImage(),Toast.LENGTH_LONG).show();
               }
               else if(mMovieNamesList.get(position).getMdate()==1994)
               {
                   Toast.makeText(mContext,"you click instgram",Toast.LENGTH_LONG).show();
               }






           }
       });




    }

    @Override
    public int getItemCount() {
        return mMovieNamesList.size();
    }









    public class RvViewHolder extends RecyclerView.ViewHolder {

        TextView mMovieName;
        TextView getmMovieDate;
        ImageView mMovieImage;

        View view;

        public RvViewHolder(@NonNull final View itemView) {
            super(itemView);
            mMovieName=itemView.findViewById(R.id.tvMovieName);
            getmMovieDate=itemView.findViewById(R.id.tvMovieDate);
            mMovieImage=itemView.findViewById(R.id.iv_movie_image);
            this.view=itemView;


        }
    }
}
