package total.com.total.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import static android.content.ContentValues.TAG;

public final class NotificationUtil {
    private NotificationUtil() {
    }

    public static void showError(Context context, int msgId) {
        Log.e(TAG, context.toString());
        Toast.makeText(context, msgId, Toast.LENGTH_SHORT).show();
    }
}
