package com.android.androidtask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class LocationService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        GPSTracker gps = new GPSTracker(this);
        double latitude = gps.getLatitude();
        double longitude = gps.getLongitude();

        Log.d("LAT:LAN",""+latitude + ":" + longitude);

        return startId;
    }


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
