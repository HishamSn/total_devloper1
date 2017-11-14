package total.com.total.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import total.com.total.R;
import total.com.total.utils.AbstractFragment;


/**
 * Created by Hisham Snaimeh on 11/15/2017.
 */
public class ScatchFragment extends AbstractFragment {

    public ScatchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scatch, container, false);
    }

    @Override
    protected void initView() {

    }
}
