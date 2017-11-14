package total.com.total.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
        import total.com.total.utils.AbstractFragment;
              import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import total.com.total.R;

/**
 * Created by Hisham Snaimeh on 9/14/2017.
 */

public class MapFragment extends AbstractFragment implements OnMapReadyCallback {
    private GoogleMap mMap;
    private View mapsView;

    public MapFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mapsView = inflater.inflate(R.layout.fragment_mapview, container, false);
        return mapsView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MapView mMapView = mapsView.findViewById(R.id.mapView);

        if (mMapView != null) {
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    protected void initView() {
    }
}
