package com.FirebaseAutenticacao.service;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;


public class MyFirebaseInstanceIDService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String token) {
        Log.d("teste", "Refreshed token: " + token);


    }
}