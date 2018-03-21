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


    public static File dbFile = new File(Environment.getExternalStorageDirectory()
            + File.separator + "calendarApp_dbFile.txt");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.textView);
        readDbFile();




        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Service.class);

                //si mund ta kaloj nje vlere nga njera kalse ne tjeteren. sepse kur te shtypet butoni ketu, pervec hapjes se servisit, duhet ruajtur edhe te dhenat e date picker
            //ka disa menyra si kalone variabla midis klasave, po per kete rast nuk besoj se te duhet, sepse do te sherbeje dbFile
                //per te ruajtur lkete info, dhe dbFile mund te lexohet nga te dy klasat.

                //dmth ne klasen SERVICE vendoset data Picker ne file
                //dhe ne MAIN lexohet po nga dbFile. ok, ta shtoj kete atehere

                //atehere i bie ta ruajme ketu daten, te ky eventi ketu. po
                //jo po ne fakt besoj se duhet ruajtur pasi merret nga service, sepse ne service jan deklaruar te gjitha. (date picker, dhe var)

            }
        });
    }

    //metode per te lexuar file - per te marre daten e ruajtur
    public void readDbFile() {
        TextView textView = (TextView) findViewById(R.id.textView);

        if (dbFile.exists()) {
            try {
                DataInputStream textFileStream = new DataInputStream(getAssets().open(String.format("dbfile.txt")));
                Scanner sc = new Scanner(textFileStream);
                if (sc.hasNextLine()) {
                    String firstLine = sc.nextLine();
                    textView.setText("Data e regjistruar ne DB File: "+firstLine);
                } else {
                    textView.setText("DB File eshte bosh, nuk ka date te regjistruar!");
                }
                sc.close();
            } catch (IOException e) {
                textView.setText("ERROR: DB File nuk u gjet!");
                e.printStackTrace();
            }
        } else {
            try {
                dbFile.createNewFile();
                textView.setText("DB File u krijua ne kujtesen e smartphonit.");
            } catch (IOException e) {
                textView.setText("ERROR: DB File nuk mund te krijohet ne kujtesen e smartphonit!");
                //nje sek ta ekz ne emulator se dua te shoh ca errori ka
                e.printStackTrace();


                //pbeuje pak run ne emulator. ok
                //punojme deri n 10:45 dhe e vazhdojme nsr. un po e hedh ne git projektin sonte

            }
        }

    }

    //metode per te shkruajtur file = per te ruajtur daten
    public void writeDbFile() {
        TextView textView = (TextView) findViewById(R.id.textView);

        if (dbFile.exists()) {
            try {
                FileOutputStream fo = new FileOutputStream(dbFile);
                String data = "calendar";

                byte[] contentInBytes = data.getBytes();

                fo.write(contentInBytes);
                fo.flush();
                fo.close();

            } catch (IOException e) {
                textView.setText("ERROR: DB File nuk u gjet!");
                e.printStackTrace();
            }
        } else {
            try {
                dbFile.createNewFile();
                textView.setText("DB File u krijua ne kujtesen e smartphonit.");
            } catch (IOException e) {
                textView.setText("ERROR: DB File nuk mund te krijohet ne kujtesen e smartphonit!");
            }
        }
    }

    }

    // main eshte vetem per te nisur servisin


/* Kam bere nje OnClickListener qe me intent hap Service.java
//ok prit te shoh pak gjithe projektin
 */






