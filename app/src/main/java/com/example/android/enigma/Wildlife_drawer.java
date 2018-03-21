package com.example.android.enigma;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Wildlife_drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;

    CardView cv1,cv2,cv3,cv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer);

        final int[] a1 = {0};
        final int[] a2 = {0};
        final int[] a3 = {0};
        final int[] a4 = {0};
        final int[] a5 = {0};
        final int[] a6 = {0};
        final int[] a7 = {0};
        final int[] a8 = {0};
        final int[] a9 = {0};
        final int[] a10 = {0};
        final int[] a11 = {0};
        final int[] a12 = {0};
        final int[] a13 = {0};
        final int[] a14 = {0};
        final int[] a15 = {0};


        cv1 = (CardView) findViewById(R.id.cv1);
        cv2 = (CardView) findViewById(R.id.cv2);
        cv3 = (CardView) findViewById(R.id.cv3);
        cv4 = (CardView) findViewById(R.id.cv4);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);


        //onclick listeners for FAVOURITES
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a1[0] == 0) {
                    img1.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a1[0] = 1;
                } else {
                    img1.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a1[0] = 0;
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a2[0] == 0) {
                    img2.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a2[0] = 1;
                } else {
                    img2.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a2[0] = 0;
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a3[0] == 0) {
                    img3.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a3[0] = 1;
                } else {
                    img3.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a3[0] = 0;
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a4[0] == 0) {
                    img4.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a4[0] = 1;
                } else {
                    img4.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a4[0] = 0;
                }
            }
        });


        //ends here
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(Wildlife_drawer.this, Individual.class);
                ab.putExtra("name", "Aralam Wildlife Sanctuary");
                startActivity(ab);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(Wildlife_drawer.this, Individual.class);
                ab.putExtra("name", "Parambikulam Wildlife Sanctuary");
                startActivity(ab);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(Wildlife_drawer.this, Individual.class);
                ab.putExtra("name", "Dandeli Wildlife Sanctuary");
                startActivity(ab);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(Wildlife_drawer.this, Individual.class);
                ab.putExtra("name", "Wayanand Wildlife Sanctuary");
                startActivity(ab);
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
