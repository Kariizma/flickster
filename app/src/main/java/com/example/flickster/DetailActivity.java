package com.example.flickster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flickster.models.Movie;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity
{
    TextView tvTitle;
    TextView tvOverview;
    RatingBar ratingBar;
    Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle.findViewById(R.id.tvTitle);
        tvOverview.findViewById(R.id.tvOverview);
        ratingBar.findViewById(R.id.ratingBar);


        movie = (Movie) Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvTitle.setText(movie.getTitle());
    }
}
