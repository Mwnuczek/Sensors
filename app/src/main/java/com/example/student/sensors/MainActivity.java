package com.example.student.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager manager;
    TextView text;
    List<Sensor> sensors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=(SensorManager)getSystemService(SENSOR_SERVICE);
        sensors =  manager.getSensorList(Sensor.TYPE_ALL);

        text = (TextView) findViewById(R.id.SensorsText);

        setSensorsText();

    }

    public void setSensorsText(){


        StringBuilder sb = new StringBuilder();

        for (Sensor sensor : sensors) {
            sb.append(sensor.getName()).append("\n");

        }
        text.setText(sb);
    }
}
