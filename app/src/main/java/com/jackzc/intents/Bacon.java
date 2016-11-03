package com.jackzc.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    private static String APPLES_BUNDLE_KEY = "applesMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        String applesMessage = "There is nothing passed.";

        Bundle applesData = getIntent().getExtras();
        if (applesData != null) {
            if (applesData.containsKey(APPLES_BUNDLE_KEY)) {
                applesMessage = applesData.getString(APPLES_BUNDLE_KEY);
            }
        }

        final TextView label = (TextView) findViewById(R.id.baconText);
        label.setText(applesMessage);

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Apples.class);
        startActivity(intent);
    }
}
