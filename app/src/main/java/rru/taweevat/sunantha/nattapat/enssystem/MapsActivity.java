package rru.taweevat.sunantha.nattapat.enssystem;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.InputStream;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final double latCenterDOUBLE = 13.68426791;
    private static final double lngCenterDOUBLE = 101.06550694;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment);
        mapFragment.getMapAsync(this);
    }// Main Method

  public  void clickSentLocation (View view) {
      Intent intent = new Intent(MapsActivity.this, InfromActivity.class);

      String strName = getIntent().getStringExtra("nameLogin");
      intent.putExtra("nameLogin", strName);


      intent.putExtra("douLat", 123.456);
      intent.putExtra("douLng",789.123);
      startActivity(intent);
  }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Move
 LatLng centerLatLng = new LatLng(latCenterDOUBLE, lngCenterDOUBLE);
        mMap.moveCamera(CameraUpdateFactory
                .newLatLngZoom(centerLatLng, 14));
         // Add a marker in Sydney and move the camera

    }//second Method
}//Main Method
