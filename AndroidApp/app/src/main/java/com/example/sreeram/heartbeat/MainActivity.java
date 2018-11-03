package com.example.sreeram.heartbeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseInstallation;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UcHj1aEORkIIuaSkgnn3yIXnxN0ocKh0aCKXj879")
                .clientKey("Kc3AVCFKvKl5toySN0cYQPknnUpPlZCztfVAIzyA")
                .server("https://parseapi.back4app.com/").build()
        );

// This is the installation part
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("GCMSenderId", "249670415353");
        installation.saveInBackground();

    }
}
