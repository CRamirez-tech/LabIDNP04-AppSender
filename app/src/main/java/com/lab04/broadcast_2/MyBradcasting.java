package com.lab04.broadcast_2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBradcasting extends BroadcastReceiver {

    public static final String BROADCASTING_ACTION = "org.idnp.idnp2022lab04";
    public static final String EXTRA_MESSAGE = "mensaje";
    private String contMensaje = "";

    @Override
    public void onReceive(Context context, Intent intent) {
        contMensaje = intent.getStringExtra(EXTRA_MESSAGE);
    }

    public String getContMensaje() {
        return contMensaje;
    }
}