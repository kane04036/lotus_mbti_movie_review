package com.example.lotus_kproject2;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class MovieDetailActivity extends AppCompatActivity {
    ImageView imageMovieDetail;
    TextView tvMovieNameOfTopBar, tvMovieName, tvYearOfMovie, tvGenre1, tvGenre2, tvGenre3;
    ImageButton btnBackOfDetailPage, btnMovieBookmark;
    MaterialToolbar detailTopBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        overridePendingTransition(R.anim.none, R.anim.none);

        detailTopBar = findViewById(R.id.detailTopBar);
        imageMovieDetail = findViewById(R.id.imageMovieDetail);
        tvMovieName = findViewById(R.id.tvMovieName);
//        tvMovieNameOfTopBar = findViewById(R.id.tvMovieNameOfTopBar);
        tvYearOfMovie = findViewById(R.id.tvYearOfMovie);
//        btnBackOfDetailPage = findViewById(R.id.btnBackOfDetailPage);
//        btnMovieBookmark = findViewById(R.id.btnMovieBookMark);

        imageMovieDetail.setClipToOutline(true);

        detailTopBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnMovieBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMovieBookmark.setImageResource(R.drawable.bookmark_filled_small);
                Log.d(TAG, "onClick: bookmark: "+ String.valueOf(btnMovieBookmark.getResources()));
            }
        });
    }

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_detail, container, false);
//
//
//        return view;
//    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.none, R.anim.none);
    }
}
