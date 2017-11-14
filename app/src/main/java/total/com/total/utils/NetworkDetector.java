package total.com.total.utils;

import android.content.Context;
import android.net.*;

/**
 * Created by abualzait on 9/7/17.
 */

public final class NetworkDetector {

    private static final int TYPE_WIFI = 1;
    private static final int TYPE_MOBILE = 2;
    private static final int TYPE_NOT_CONNECTED = 0;

    private NetworkDetector() {

    }

    public static boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();

    }
    //returns the int flag of the type of the connection
    public static int getConnectivityStatus(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return TYPE_WIFI;

            if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return TYPE_MOBILE;
        }
        return TYPE_NOT_CONNECTED;
    }

    public static String getConnectivityStatusString(Context context) {
        int conn = NetworkDetector.getConnectivityStatus(context);
        String status = null;
        if (conn == NetworkDetector.TYPE_WIFI) {
            status = "Wifi enabled";
        } else if (conn == NetworkDetector.TYPE_MOBILE) {
            status = "Mobile data enabled";
        } else if (conn == NetworkDetector.TYPE_NOT_CONNECTED) {
            status = "Not connected to Internet";
        }
        return status;
    }


}
