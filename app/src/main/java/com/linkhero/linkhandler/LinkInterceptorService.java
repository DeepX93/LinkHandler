package com.linkhero.linkhandler;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LinkInterceptorService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Placeholder for link interception logic
        return START_STICKY;
    }
}
