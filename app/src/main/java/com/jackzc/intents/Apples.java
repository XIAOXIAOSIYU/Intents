package com.jackzc.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);

        // Intent Service
        // Intent intent = new Intent(this, JackIntentService.class);
        // startService(intent);

        // Common Service
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void onClick(View view) {

        final EditText editText = (EditText) findViewById(R.id.applesInput);
        String message = editText.getText().toString();

        // Open another activity and send something <key:value> into it;
        Intent intent = new Intent(this, Bacon.class);
        intent.putExtra("applesMessage", message);
        startActivity(intent);

        // Send out broadcast to anyone which the activity who is listening
        // Intent intent = new Intent();
        // intent.setAction("com.jackzc.intents");
        // intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        // sendBroadcast(intent);

    }
}
