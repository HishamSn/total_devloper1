package total.com.total;

import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;
import total.com.total.utils.ContextHolder;

/**
 * Created by Hisham Snaimeh on 11/15/2017.
 */
public class GenericActivity extends FragmentActivity {

    public GenericActivity() {
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        ContextHolder.setDefaultContext(this);
    }
}
