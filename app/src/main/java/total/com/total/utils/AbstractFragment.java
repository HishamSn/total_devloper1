package total.com.total.utils;

import android.app.Fragment;
import android.content.Context;

import total.com.total.*;
import total.com.total.utils.*;


public abstract class AbstractFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!NetworkDetector.isConnected(context)) {
            NotificationUtil.showError(context, R.string.no_internet);
            return;
        }
        initView();
    }
    protected abstract void initView();

}
