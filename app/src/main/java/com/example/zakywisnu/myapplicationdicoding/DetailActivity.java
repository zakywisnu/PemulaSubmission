package com.example.zakywisnu.myapplicationdicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static String PHOTO = "PHOTO";
    public static String DESCRIPTION = "DESCRIPTION";

    ImageView photo;
    TextView description, name, from, league;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_detail);
        name = findViewById(R.id.item_club_name_2);
        from = findViewById(R.id.item_club_from_2);
        league = findViewById(R.id.item_club_league_2);
        
        setupEnv();
    }

    private void setupEnv() {
        String image = getIntent().getStringExtra(PHOTO);
        String desc = getIntent().getStringExtra(DESCRIPTION);

        if (getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            name.setText(bundle.getString("name"));
            from.setText(bundle.getString("from"));
            league.setText(bundle.getString("league"));
        }else {
            name.setText(getIntent().getStringExtra("name"));
            from.setText(getIntent().getStringExtra("from"));
            league.setText(getIntent().getStringExtra("league"));
        }

        photo = findViewById(R.id.img_photo_club_2);
        description = findViewById(R.id.detail_description);

        Glide.with(this)
                .load(image)
                .into(photo);
        description.setText(desc);
    }
}
