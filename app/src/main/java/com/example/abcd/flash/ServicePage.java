package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ServicePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_page);

        final Button imageButtontr = (ImageButton) findViewById(R.id.imageButtontr);
        final Button imageButtonbs = (ImageButton) findViewById(R.id.imageButtonbs);



        imageButtontr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageButtontr
                        .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(ServicePage.this, Selection1Page.class);
                        ServicePage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );




        imageButtonbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageButtonbs.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(ServicePage.this, Selection1Page.class);
                        ServicePage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
