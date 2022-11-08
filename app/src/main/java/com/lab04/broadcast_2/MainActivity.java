package com.lab04.broadcast_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMensaje = findViewById(R.id.btnMensaje);
        EditText editMensaje = findViewById(R.id.editMensaje);


        btnMensaje.setOnClickListener(v -> {
            Intent intent = new Intent(MyBradcasting.BROADCASTING_ACTION);
            intent.putExtra(MyBradcasting.EXTRA_MESSAGE, editMensaje.getText().toString());
            sendBroadcast(intent);
        });
    }
}