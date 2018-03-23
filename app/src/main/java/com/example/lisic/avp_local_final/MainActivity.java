package com.example.lisic.avp_local_final;

import android.app.Notification;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {


   


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//Finds the button
        Button button = (Button) findViewById(R.id.button);
//Waits for a Click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//Starts the service
                Intent intent = new Intent(MainActivity.this, Service.class);

               
            }
        });
    }

   

            }
        }






