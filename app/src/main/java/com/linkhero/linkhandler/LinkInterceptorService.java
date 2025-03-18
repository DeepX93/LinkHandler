package com.linkhero.linkhandler;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Log;

public class LinkInterceptorService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && Intent.ACTION_VIEW.equals(intent.getAction())) {
            Uri data = intent.getData();
            if (data != null) {
                String interceptedLink = data.toString();
                Log.d("LinkInterceptor", "Intercepted Link: " + interceptedLink);

                // Send link to MacroDroid
                Intent macroIntent = new Intent("com.twofortyfouram.locale.intent.action.FIRE_SETTING");
                macroIntent.putExtra("clickedlink", interceptedLink);
                sendBroadcast(macroIntent);
            }
        }
        stopSelf(); // Stop service after processing
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

