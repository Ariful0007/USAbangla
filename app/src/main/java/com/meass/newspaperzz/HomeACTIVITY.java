package com.meass.newspaperzz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeACTIVITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_a_c_t_i_v_i_t_y);
    }

    public void one(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://thikana.us/?fbclid=IwAR17UWGIOgU6kbyM2-Uvdb96zw4IougEV3OMpiRfCfZ3arZBh8lST2QXYkQ");
        startActivity(intent);
    }

    public void two(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://banglashangbad.com/?fbclid=IwAR2mQUdWntqEoXptFiAiEr9miDqe80OLD3WaJzwRF1PPnYpGKe7Q8hpoG6w");
        startActivity(intent);
    }

    public void three(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","http://weeklybangalee.com/?fbclid=IwAR35gGGkU9agre1-OcIUMBm-Vl-SUKQOLScPlzYGcAgeomqiC9e-58nPqiQ");
        startActivity(intent);
    }


    public void four(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://northamerica.prothomalo.com/topic/%E0%A6%89%E0%A6%A4%E0%A7%8D%E0%A6%A4%E0%A6%B0-%E0%A6%86%E0%A6%AE%E0%A7%87%E0%A6%B0%E0%A6%BF%E0%A6%95%E0%A6%BE-%E0%A6%B8%E0%A6%82%E0%A6%B8%E0%A7%8D%E0%A6%95%E0%A6%B0%E0%A6%A3?fbclid=IwAR0MdaGjxbZztPMjmi1j8Akn201OzokfY1XqUQTKYUg6SzSemetvfMsELq0");
        startActivity(intent);
    }

    public void five(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://michiganpratidin.com/?fbclid=IwAR1pul3MAxR2UGwm3kJqTuGogL4LiGP-NJAejcGSOJQrRo_paAnvZWOKLo0");
        startActivity(intent);
    }

    public void six(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://americabangla.com/?fbclid=IwAR3k87zAeR1E5VZ8_vMPlhapKNPXFIL9bvgnQJaMSIkqNQQtUGJ0ouo2nP8");
        startActivity(intent);
    }

    public void ten(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://buffalobangla.com/?fbclid=IwAR3eh_LyYSopaMEechoqb2Mk_eweUQgC9Da9UidaVkiBiH7jK6IboFE2CSk");
        startActivity(intent);
    }

    public void nine(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://www.banglapatrikausa.com/?fbclid=IwAR1b3fAccpjL_bB_G37AcjnfRxYy6N87nC1RbwoNj5VnIkvnaU2E8KoV-fQ");
        startActivity(intent);
    }

    public void eight(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://www.labanglatimes.com/?fbclid=IwAR1HyjGXn2MocWRttcVIdsSZDeC4J2drR0HyP_uscN6aA162ErN7OeDAcnQ");
        startActivity(intent);
    }

    public void seven(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://newyorkbangla.com/?fbclid=IwAR1b3fAccpjL_bB_G37AcjnfRxYy6N87nC1RbwoNj5VnIkvnaU2E8KoV-fQ");
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(HomeACTIVITY.this);
        builder.setTitle("Exit")
                .setMessage("Are you want to exit?")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();


                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finishAffinity();
            }
        });
        builder.create().show();
    }

    public void eleven(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://www.suprobhatmichigan.com/?fbclid=IwAR1g41HOisbbkxpF8g3wS563jPSOU10Q0g4mZdJkSCwvV7IaxzYL4kXxQT0");
        startActivity(intent);
    }

    public void twelve(View view) {
        Intent intent=new Intent(getApplicationContext(),WebsiteLoading.class);
        intent.putExtra("url","https://www.voabangla.com/?fbclid=IwAR0BvPb071KdNJeaKh1PW5x1aKDCMB7QenZm6wZJO4z5i2hyh97v2a734sI");
        startActivity(intent);
    }
}