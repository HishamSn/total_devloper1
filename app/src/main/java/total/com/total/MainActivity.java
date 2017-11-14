package total.com.total;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import total.com.total.fragments.*;

/**
 * Created by Hisham Snaimeh on 11/14/2017.
 */
public class MainActivity extends GenericActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_scatch:
                    openFragmentWithBundle(new ScatchFragment());
                    return true;
                case R.id.navigation_map:
                    openFragmentWithBundle(new MapFragment());
                    return true;
                case R.id.navigation_profile:
                    openFragmentWithBundle(new ProfileFragment());
                    return true;
                case R.id.navigation_more:
                    openFragmentWithBundle(new MoreFragment());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragmentWithBundle(new ScatchFragment());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private void openFragmentWithBundle(final Fragment fragment) {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container_fragment, fragment)
                .commit();
    }

}
