package com.example.json_trial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.json_trial.MainActivity.EXTRA_CREATOR;
import static com.example.json_trial.MainActivity.EXTRA_LIKES;
import static com.example.json_trial.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        CircleImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator =findViewById(R.id.text_view_detail);
        TextView textViewLikes = findViewById(R.id.text_view_like_detail);

        Picasso.get().load(imageUrl).fit().centerInside().into(imageView);

        textViewCreator.setText(creatorName);

        textViewLikes.setText("Likes : " + likeCount);

    }
}