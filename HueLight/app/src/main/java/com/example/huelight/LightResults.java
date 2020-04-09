package com.example.huelight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class LightResults extends AppCompatActivity {

    TextView light_tv;
    SwitchCompat switch_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_results);

        light_tv = findViewById(R.id.light_tv);
        switch_button = findViewById(R.id.switch_button);

        Button refresh = findViewById(R.id.refresh);

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Log.e("TAG","search");
                try {
                    uiJSON();
                } catch (JSONException e) {
                    Log.e("TAG",e.getMessage());
                    e.printStackTrace();
                }

            }
        });



    }

    private void uiJSON() throws JSONException {
        Log.e("TAG","inside UIJSON");
        String fetchData ="{\n" +
                "\"1\": {\n" +
                "        \"state\": {\n" +
                "            \"on\": false,\n" +
                "            \"bri\": 1,\n" +
                "            \"hue\": 33761,\n" +
                "            \"sat\": 254,\n" +
                "            \"effect\": \"none\",\n" +
                "            \"xy\": [\n" +
                "                0.3171,\n" +
                "                0.3366\n" +
                "            ],\n" +
                "            \"ct\": 159,\n" +
                "            \"alert\": \"none\",\n" +
                "            \"colormode\": \"xy\",\n" +
                "            \"mode\": \"homeautomation\",\n" +
                "            \"reachable\": true\n" +
                "        },\n" +
                "        \"swupdate\": {\n" +
                "            \"state\": \"noupdates\",\n" +
                "            \"lastinstall\": \"2018-01-02T19:24:20\"\n" +
                "        },\n" +
                "        \"type\": \"Extended color light\",\n" +
                "        \"name\": \"Hue color lamp 7\",\n" +
                "        \"modelid\": \"LCT007\",\n" +
                "        \"manufacturername\": \"Philips\",\n" +
                "        \"productname\": \"Hue color lamp\",\n" +
                "        \"capabilities\": {\n" +
                "            \"certified\": true,\n" +
                "            \"control\": {\n" +
                "                \"mindimlevel\": 5000,\n" +
                "                \"maxlumen\": 600,\n" +
                "                \"colorgamuttype\": \"B\",\n" +
                "                \"colorgamut\": [\n" +
                "                    [\n" +
                "                        0.675,\n" +
                "                        0.322\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        0.409,\n" +
                "                        0.518\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        0.167,\n" +
                "                        0.04\n" +
                "                    ]\n" +
                "                ],\n" +
                "                \"ct\": {\n" +
                "                    \"min\": 153,\n" +
                "                    \"max\": 500\n" +
                "                }\n" +
                "            },\n" +
                "            \"streaming\": {\n" +
                "                \"renderer\": true,\n" +
                "                \"proxy\": false\n" +
                "            }\n" +
                "        },\n" +
                "        \"config\": {\n" +
                "            \"archetype\": \"sultanbulb\",\n" +
                "            \"function\": \"mixed\",\n" +
                "            \"direction\": \"omnidirectional\"\n" +
                "        },\n" +
                "        \"uniqueid\": \"00:17:88:01:00:bd:c7:b9-0b\",\n" +
                "        \"swversion\": \"5.105.0.21169\"\n" +
                "    },\n" +
                "\"2\":{\n" +
                "        \"state\": {\n" +
                "            \"on\": false,\n" +
                "            \"bri\": 1,\n" +
                "            \"hue\": 33761,\n" +
                "            \"sat\": 254,\n" +
                "            \"effect\": \"none\",\n" +
                "            \"xy\": [\n" +
                "                0.3171,\n" +
                "                0.3366\n" +
                "            ],\n" +
                "            \"ct\": 159,\n" +
                "            \"alert\": \"none\",\n" +
                "            \"colormode\": \"xy\",\n" +
                "            \"mode\": \"homeautomation\",\n" +
                "            \"reachable\": true\n" +
                "        },\n" +
                "        \"swupdate\": {\n" +
                "            \"state\": \"noupdates\",\n" +
                "            \"lastinstall\": \"2018-01-02T19:24:20\"\n" +
                "        },\n" +
                "        \"type\": \"Extended color light\",\n" +
                "        \"name\": \"Hue color lamp 7\",\n" +
                "        \"modelid\": \"LCT007\",\n" +
                "        \"manufacturername\": \"Philips\",\n" +
                "        \"productname\": \"Hue color lamp\",\n" +
                "        \"capabilities\": {\n" +
                "            \"certified\": true,\n" +
                "            \"control\": {\n" +
                "                \"mindimlevel\": 5000,\n" +
                "                \"maxlumen\": 600,\n" +
                "                \"colorgamuttype\": \"B\",\n" +
                "                \"colorgamut\": [\n" +
                "                    [\n" +
                "                        0.675,\n" +
                "                        0.322\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        0.409,\n" +
                "                        0.518\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        0.167,\n" +
                "                        0.04\n" +
                "                    ]\n" +
                "                ],\n" +
                "                \"ct\": {\n" +
                "                    \"min\": 153,\n" +
                "                    \"max\": 500\n" +
                "                }\n" +
                "            },\n" +
                "            \"streaming\": {\n" +
                "                \"renderer\": true,\n" +
                "                \"proxy\": false\n" +
                "            }\n" +
                "        },\n" +
                "        \"config\": {\n" +
                "            \"archetype\": \"sultanbulb\",\n" +
                "            \"function\": \"mixed\",\n" +
                "            \"direction\": \"omnidirectional\"\n" +
                "        },\n" +
                "        \"uniqueid\": \"00:17:88:01:00:bd:c7:b9-0b\",\n" +
                "        \"swversion\": \"5.105.0.21169\"\n" +
                "    },\n" +
                "\"3\":{\n" +
                "        \"state\": {\n" +
                "            \"on\": false,\n" +
                "            \"bri\": 1,\n" +
                "            \"hue\": 33761,\n" +
                "            \"sat\": 254,\n" +
                "            \"effect\": \"none\",\n" +
                "            \"xy\": [\n" +
                "                0.3171,\n" +
                "                0.3366\n" +
                "            ],\n" +
                "            \"ct\": 159,\n" +
                "            \"alert\": \"none\",\n" +
                "            \"colormode\": \"xy\",\n" +
                "            \"mode\": \"homeautomation\",\n" +
                "            \"reachable\": true\n" +
                "        },\n" +
                "        \"swupdate\": {\n" +
                "            \"state\": \"noupdates\",\n" +
                "            \"lastinstall\": \"2018-01-02T19:24:20\"\n" +
                "        },\n" +
                "        \"type\": \"Extended color light\",\n" +
                "        \"name\": \"Hue color lamp 7\",\n" +
                "        \"modelid\": \"LCT007\",\n" +
                "        \"manufacturername\": \"Philips\",\n" +
                "        \"productname\": \"Hue color lamp\",\n" +
                "        \"capabilities\": {\n" +
                "            \"certified\": true,\n" +
                "            \"control\": {\n" +
                "                \"mindimlevel\": 5000,\n" +
                "                \"maxlumen\": 600,\n" +
                "                \"colorgamuttype\": \"B\",\n" +
                "                \"colorgamut\": [\n" +
                "                    [\n" +
                "                        0.675,\n" +
                "                        0.322\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        0.409,\n" +
                "                        0.518\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        0.167,\n" +
                "                        0.04\n" +
                "                    ]\n" +
                "                ],\n" +
                "                \"ct\": {\n" +
                "                    \"min\": 153,\n" +
                "                    \"max\": 500\n" +
                "                }\n" +
                "            },\n" +
                "            \"streaming\": {\n" +
                "                \"renderer\": true,\n" +
                "                \"proxy\": false\n" +
                "            }\n" +
                "        },\n" +
                "        \"config\": {\n" +
                "            \"archetype\": \"sultanbulb\",\n" +
                "            \"function\": \"mixed\",\n" +
                "            \"direction\": \"omnidirectional\"\n" +
                "        },\n" +
                "        \"uniqueid\": \"00:17:88:01:00:bd:c7:b9-0b\",\n" +
                "        \"swversion\": \"5.105.0.21169\"\n" +
                "    }\n" +
                "}";

        //root
        JSONObject    jsonObject = new JSONObject(fetchData);
        Log.e("TAG", String.valueOf(jsonObject.length()));


        JSONObject lightSerial = jsonObject.getJSONObject("1");

        JSONObject lightState = lightSerial.getJSONObject("state");
        Boolean lightStatus = lightState.getBoolean("on");

        String lightName = lightSerial.getString("name");
        Log.e("Tag", String.valueOf(lightStatus) + lightName);
        light_tv.setText(lightName);
        switch_button.setChecked(lightStatus);

    }

}
