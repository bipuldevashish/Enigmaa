package com.example.android.enigma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

/**
 * Created by Bipul Devashish on 20-03-2018.
 */

public class profile extends AppCompatActivity {
    TextView tvEmail;
    TextView tvName;
    ImageView profPik;
    FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        firebaseAuth = FirebaseAuth.getInstance();
        tvEmail = (TextView) findViewById(R.id.textViewEmail);
        tvName = (TextView) findViewById(R.id.textViewName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Profile");


        profPik=(ImageView)findViewById(R.id.profilePik);
        String url=firebaseAuth.getCurrentUser().getPhotoUrl().toString();
        Picasso.with(profile.this).load(url).centerCrop().resize(140,140).into(profPik);
        tvEmail.setText(firebaseAuth.getCurrentUser().getEmail());
        tvName.setText(firebaseAuth.getCurrentUser().getDisplayName());
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}