package com.meass.newspaperzz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.multidex.MultiDex;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    private TextView appname;

    private String userID;
    int totall;
    int main_total;
    String ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // session =new UserSession(MainActivity.this);
        MultiDex.install(this);
        // new CheckInternetConnection(this).checkConnection();
        Long tsLong = System.currentTimeMillis()/1000;



        appname = findViewById(R.id.appname);





        YoYo.with(Techniques.Bounce)
                .duration(7000)
                .playOn(findViewById(R.id.logo));


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {


                startActivity(new Intent(getApplicationContext(), HomeACTIVITY.class));
                finish();



            }
        }, 1000);
    }
}