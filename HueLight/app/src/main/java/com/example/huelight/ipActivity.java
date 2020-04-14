package com.example.huelight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import io.github.zeroone3010.yahueapi.Hue;

public class ipActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);


        Intent intent = getIntent();
        String ip = intent.getStringExtra("ip");

        TextView textView  =findViewById(R.id.ip_textview);
        textView.setText(ip);




    }

    private void getApi() throws ExecutionException, InterruptedException {
        final String bridgeIp = "192.168.1.99"; // Fill in the IP address of your Bridge
        final String appName = "MyFirstHueApp"; // Fill in the name of your application
        final CompletableFuture<String> apiKey = Hue.hueBridgeConnectionBuilder(bridgeIp).initializeApiConnection(appName);
// Push the button on your Hue Bridge to resolve the apiKey future:
        final String key = apiKey.get();
        System.out.println("Store this API key for future use: " + key);
        final Hue hue = new Hue(bridgeIp, key);
        Log.e("TAG",key);
    }

    public void Submit(View view) throws ExecutionException, InterruptedException {
        getApi();
    }

//    public void Submit(View view)
//    {
//        getApi();
//    }
//    public void onChecked(View view)
//    {
//        boolean checked = ((CheckBox) view).isChecked();
//
//        switch (view.getId())
//        {
//            case R.id.warning_id:
//                if (checked)
//                    submit_id.setVisibility(View.VISIBLE);
//                else
//                    submit_id.setVisibility(View.INVISIBLE);
//
//        }
//    }
}
