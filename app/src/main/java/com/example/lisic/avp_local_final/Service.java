package com.example.lisic.avp_local_final;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;



public class Service extends IntentService {

    //Declaration of variables

    private DatePicker datePicker;

    private Calendar INITD;

    private Calendar V1;


    private Calendar V2;


    private Calendar V3;


    private Calendar V4;


    private Calendar V5;


    private Calendar V6;


    private Calendar V7;


    private Calendar V8;


    private Calendar V9;


    private Calendar V10;

    private int day;

    private int month;

    private int year;



    public Service() {
        super("Service");
    }

//Handler
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

		//Gets current date on calendar
        INITD = Calendar.getInstance();

        //Sets selected date on calendar
        day = datePicker.getDayOfMonth();
        month = datePicker.getMonth();
        year = datePicker.getYear();

        INITD.set(year, month, day);

       //Assign birthdate on Vaccine numbers
        V1 = INITD;
        V2 = INITD;
        V3 = INITD;
        V4 = INITD;
        V5 = INITD;
        V6 = INITD;
        V7 = INITD;
        V8 = INITD;
        V9 = INITD;
        V10 = INITD;

        
//Do date calculations
        V1.add(Calendar.DATE, 62);
        V2.add(Calendar.DATE, 124);
        V3.add(Calendar.DATE, 186);
        V4.add(Calendar.DATE, 310);
        V5.add(Calendar.DATE, 372);
        V6.add(Calendar.DATE, 744);
        V7.add(Calendar.DATE, 1860);
        V8.add(Calendar.DATE, 2232);
        V9.add(Calendar.DATE, 5208);
        V10.add(Calendar.DATE, 7812);}

    //Vaccine methods begin here
   
   

    private void vacc1() {

        Calendar caltest = Calendar.getInstance(); 

        

        if (caltest == V1) {
            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc2();

        } else {

            try {
                wait(8640000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vacc1();
        }
    }

    private void vacc2() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V2) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc3();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc2();

        }


    }

    
    private void vacc3() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V3) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc4();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc3();

        }


    }

    private void vacc4() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V4) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc5();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc4();

        }


    }

    private void vacc5() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V5) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc6();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc5();

        }


    }

    private void vacc6() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V6) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc7();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc6();

        }


    }

    private void vacc7() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V7) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc8();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc7();

        }


    }

    private void vacc8() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V8) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc9();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc8();

        }


    }

    private void vacc9() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V9) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());

            vacc10();

        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc9();

        }


    }

    private void vacc10() {

        Calendar caltest = Calendar.getInstance();

        if (caltest == V10) {

            NotificationCompat.Builder notifier = new NotificationCompat.Builder(Service.this)
                    .setSmallIcon(android.R.drawable.stat_notify_error)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setContentTitle("Koha për vaksinim")
                    .setContentText("Ju lutem shkoni tek një qendër mjeksore ose spital për të bërë vaksinën");
            notifier.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
            NotificationManagerCompat notificationmanager = NotificationManagerCompat.from(Service.this);
            notificationmanager.notify(1, notifier.build());


        } else {

            try {
                wait(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            vacc10();

        }


    }
}



