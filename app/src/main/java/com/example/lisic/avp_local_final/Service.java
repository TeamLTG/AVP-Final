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

    //nje sec se nuk paskam kaluar nje gje me duket

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


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        INITD = Calendar.getInstance();

        //data si ruhet ketu? Dmth kur vendos user ditelindjen? kur shtyp kutonin?
        //user vendos ditelindjen dhe pastaj shtyp button qe fillon kte pjesen ketu.
        //ok mire
        day = datePicker.getDayOfMonth();
        month = datePicker.getMonth();
        year = datePicker.getYear();

        writeDbFile();

        //kisha harruar te shtoja keto
        //ok, te mbaroj kete pjee dhe e probojem. po te them te drejten nuk mendoj se funksionon,
        //sps duhet qe app te aktivizohet cdo dite, ose te rri i hapur gjate gjithe kohe ne RAM, me sleep qe i ke bere ti per nje dite
        //por gjiths e shohim
        //e di qe duhet te qendroje ne ram. e ktheva ne service qe android te mos ta mbylli automatikisht. do shtoj me vone nje kod qe e ndez ne startup, prandaj me duhet data ne file
        //ok mire, ja ta mbaroj kete pjese dhe besoj se mund ta provojme

        //pjesa 1, ku vendoset data. duhet te shotj nje gej se nuk po e gjej


        INITD.set(year, month, day);

        //ketu vendoset data, ketu do e ruajme ne nje file
        //po, e kam lexuar per read/write po ishte nje gje SHUME e gjate
        ////haha ska gje se e shohim :)
        //te bej nje txt?
        //ska gje se po e shoh une. nje sek

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

        //ok
        //nqs cfare ke bere ketu funksionon, mjafton ta ruajme ne nje file sic the, kur vendoset data dhe kaq.
        //po sbesoj te mjaftoj, e provojme njehere
        //i thote calendar INITD qe data e sotme eshte data ne date picker
        //deklarimi eshte private aty lart

        //veprimet per vaksinat jan ketu

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

    //metode per te lexuar file - per te marre daten e ruajtur
    public static void readDbFile() {

    }

    //metode per te rshkruajtur file = per te ruajtur daten
    public void writeDbFile() {
       // TextView textView = (TextView) findViewById(R.id.textView);

        if (MainActivity.dbFile.exists()) {
            try {
                FileOutputStream fo = new FileOutputStream(MainActivity.dbFile);

                INITD = Calendar.getInstance();
                day = datePicker.getDayOfMonth();
                month = datePicker.getMonth();
                year = datePicker.getYear();

                String data = year + "-" + month + "-" + day;

                byte[] contentInBytes = data.getBytes();

                fo.write(contentInBytes);
                fo.flush();
                fo.close();

            } catch (IOException e) {
                //textView.setText("ERROR: DB File nuk u gjet!");
                System.out.println("ERROR: DB File nuk u gjet!");
                e.printStackTrace();
            }
        } else {
            try {
                MainActivity.dbFile.createNewFile();
                //textView.setText("DB File u krijua ne kujtesen e smartphonit.");
                System.out.println("DB File u krijua ne kujtesen e smartphonit.");
            } catch (IOException e) {
                System.out.println("ERROR: DB File nuk mund te krijohet ne kujtesen e smartphonit!");
                //textView.setText("ERROR: DB File nuk mund te krijohet ne kujtesen e smartphonit!");
            }
        }
    }

    private void vacc1() {

        Calendar caltest = Calendar.getInstance(); //kjo do jete data e ruajtur ne file??

        // po i jap run ne cel tamam dhe po te them cfare thot ok

        //direkt pa shtyper gje thot ERROR: DB File nuk mund te krijohet ne kujtesen e telefonit
        //do kete probleme me permission atehere, nje sek

        //po si ka mundesi se ne nuk i dhame butonit. apo nga if tek main
        //po do krijohet menjehere ajo, pa shtypur butonin. kjo eshte ideja. qe ta krijoje file ne fillim, dhe pastaj te kontrllohet
        //pk por ERROR: DB File nuk mund te krijohet ne kujtesen e smartphonit! eshte ne service dhe service start kur shtyp buttonin. kjo doli pa shtypur gje
        //eshte edhe ne main, ky error.

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

    //pse jane gjithe keto metoda, kalendare?
    //cdo metode eshte nje vaksine. kalendari merr diten e tanishme dhe e krahason me daten e vaksines. nqs jane = ben notification dhe kalon tek e dyta, nqs jo pret 24 ore dhe fillon prap
    //funksionon , e ke provuar, nqs e vendos daten direkt ketu, jo ne file?
    //punon po, vetem duhet ruajtur qe mbas restart ta dije. me nje if: if file == full (nis servis) else (wait for date pick)
    //restart te app apo gjithe telefonit?
    //te dyja njesoj jane besoj. prap se prap do fshihet nga RAM
    //Ok,  beje njehere run app ta shoh.
    //Tani nis servisi dhe pret.
    //dmth ti vetem vendos daten ne fillim?
    //po, vendos daten qe caktohet ne nje variable dhe pastaj punohet mbi te per te gjetur daten e vaksines
    //

    //ok, ku eshte ky variabli?
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



