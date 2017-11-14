package total.com.total.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import total.com.total.R;
import total.com.total.utils.AbstractFragment;

/**
 * Created by Hisham Snaimeh on 11/15/2017.
 */
public class ProfileFragment extends AbstractFragment {

    public ProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    protected void initView() {

    }
}
