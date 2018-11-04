package com.sensorem.overwatch;

import android.content.Context;
import android.content.SharedPreferences;

public class SensorsStatus {

    // this class is made to store the status of the sensors in Real-Time

    public static final String SHARED_DOOR = "sharedDoorOpened";
    public static final String SHARED_MOTION = "sharedMotionDetection";

    protected SharedPreferences sharedPreferences;

    public SensorsStatus(Context context){
        sharedPreferences = context.getSharedPreferences("SensorsPreferences",
                Context.MODE_PRIVATE );
    }

    public Boolean getDoorOpened() {
        return sharedPreferences.getBoolean(SHARED_DOOR, true);
    }

    public void setDoorOpened(Boolean isDoorOpened) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(SHARED_DOOR, isDoorOpened);
        editor.apply();
    }

    public Boolean getMotionDetected() {
        return sharedPreferences.getBoolean(SHARED_MOTION, true);
    }

    public void setMotionDetected(Boolean isMotionDetected) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(SHARED_MOTION, isMotionDetected);
        editor.apply();
    }
}