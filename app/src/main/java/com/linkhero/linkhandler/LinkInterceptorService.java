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
    

