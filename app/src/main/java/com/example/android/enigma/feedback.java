package com.example.android.enigma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bipul Devashish on 20-03-2018.
 */
public class feedback extends AppCompatActivity {
//
//    ImageView btnSubmit;
//    EditText reviewText;
//    String rate;
//    String reviews;
//    FirebaseAuth firebaseAuth;
//    DatabaseReference root;
//    DatabaseReference reviewRoot;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_feedback);
//        setTitle("Feedback");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        btnSubmit=(ImageView)findViewById(R.id.btnReviewSubmit);
//        reviewText=(EditText)findViewById(R.id.appReviews);
//
//        firebaseAuth=FirebaseAuth.getInstance();
//      //  SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
//        root = FirebaseDatabase.getInstance().getReference().child("Reviews");
//        reviewRoot = root.child(firebaseAuth.getCurrentUser().getUid());
//
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                reviews=reviewText.getText().toString();
//                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("review", reviews);
//                reviewRoot.updateChildren(map);
//                reviewText.setText("");
//                Toast.makeText(feedback.this, "Thanks for your Response !!!", Toast.LENGTH_LONG).show();
//
//            }
//        });
//        //smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
//            @Override
//          //  public void onSmileySelected(@BaseRating.Smiley int smiley, boolean reselected) {
//                // reselected is false when user selects different smiley that previously selected one
//                // true when the same smiley is selected.
//                // Except if it first time, then the value will be false.
//            //    switch (smiley) {
//              //      case SmileRating.BAD:
//                        rate="Bad";
//                        Map<String, Object> map = new HashMap<String, Object>();
//                        map.put("feel", rate);
//                        reviewRoot.updateChildren(map);
//                //        break;
//                  //  case SmileRating.GOOD:
//                        rate="Good";
//                        map = new HashMap<String, Object>();
//                        map.put("feel", rate);
//                        reviewRoot.updateChildren(map);
//                    //    break;
//                    //case SmileRating.GREAT:
//                        rate="Great";
//                        map = new HashMap<String, Object>();
//                        map.put("feel", rate);
//                        reviewRoot.updateChildren(map);
//                      //  break;
//                   // case SmileRating.OKAY:
//                        rate="Okay";
//                        map = new HashMap<String, Object>();
//                        map.put("feel", rate);
//                        reviewRoot.updateChildren(map);
//                        break;
//                   // case SmileRating.TERRIBLE:
//                        rate="Terrible";
//                        map = new HashMap<String, Object>();
//                        map.put("feel", rate);
//                        reviewRoot.updateChildren(map);
//                     //   break;
//                }
//            }
//        });
//
//    }
//
//    @Override
//    public boolean onSupportNavigateUp()
//    {
//        finish();
//        return true;
//    }
}

