package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceGvPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_gv_page);
        final Button buttonsg = (Button) findViewById(R.id.buttonsg);



        buttonsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonsg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(ServiceGvPage.this, Selection1Page.class);
                        ServiceGvPage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
