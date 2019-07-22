package com.FirebaseAutenticacao.service;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;


public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.wtf("NEW_TOKEN",s);
    }

}