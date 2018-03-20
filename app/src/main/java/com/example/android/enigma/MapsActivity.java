package com.example.android.enigma;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Bipul Devashish on 20-03-2018.
 */
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    MarkerOptions options;
    LatLng position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.


        double latitude = getIntent().getDoubleExtra("lat", 0);
        double longitude = getIntent().getDoubleExtra("lng", 0);
        position = new LatLng(latitude, longitude);


        options = new MarkerOptions();
        options.position(position);
        options.title("Aralam Wildlife Sanctuary");
        options.snippet("Latitude:" + latitude + ",Longitude:" + longitude);

        SupportMapFragment fm = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        fm.getMapAsync(this);

// Getting reference to google map

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        googleMap.addMarker(options);

        CameraUpdate updatePosition = CameraUpdateFactory.newLatLng(position);

        CameraUpdate updateZoom = CameraUpdateFactory.zoomBy(4);

        googleMap.moveCamera(updatePosition);

        googleMap.animateCamera(updateZoom);

        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(position, 100.0f);
        mMap.animateCamera(yourLocation);


    }

}

