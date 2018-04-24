package com.example.nathan.logbackpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger logger = LoggerFactory.getLogger(MainActivity.class);
        //logger.info("Hello World!3");


        String path = getApplicationContext().getFilesDir() + "/" + "log.txt";

        File file = new File(path);


        try {

            String line;

            BufferedReader reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                Log.d("POST", line);
            }

            reader.close();

        }catch(IOException e) {
            e.printStackTrace();
        }

        //Log.d("POST", path);
    }
}
