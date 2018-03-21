package com.example.android.enigma;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private DatabaseReference databaseReference1;
    private DatabaseReference databaseReference2;
    private ImageView i1,iv2,iv3;
    private TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.i1);
        t1 = findViewById(R.id.text1);


        iv2 = findViewById(R.id.i12);
        t2 = findViewById(R.id.tx2);


        iv3 = findViewById(R.id.i1);
        t3 = findViewById(R.id.tx3);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Bird Sanctuaries").child("Bharatpur Bird Sanctuary");

        final ValueEventListener valueEventListener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String imageUrl = (String) dataSnapshot.child("Famous For").getValue().toString();
                t1.setText(imageUrl);
                Picasso.get().load(imageUrl).into(i1);

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
//
//        databaseReference1 = FirebaseDatabase.getInstance().getReference().child("Bird Sanctuaries").child("Chilka Lake Bird Sanctuary");
//        final ValueEventListener valueEventListener2 = databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//
//                String imageUrl = (String) dataSnapshot.child("Famous For").getValue();
//                t2.setText(imageUrl);
//                //Picasso.get().load(imageUrl).into(iv2);
//
//            }
//
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
//
//        databaseReference2 = FirebaseDatabase.getInstance().getReference().child("Bird Sanctuaries").child("Kaundinya Bird Sanctuary");
//        final ValueEventListener valueEventListener3 = databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//
//                String imageUrl = (String) dataSnapshot.child("Famous For").getValue();
//                t3.setText(imageUrl);
//                //Picasso.get().load(imageUrl).into(iv3);
//
//            }
//
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
    }
}

