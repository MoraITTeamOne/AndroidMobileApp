package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accident extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accident);

        final Button buttonac = (Button) findViewById(R.id.buttonac);



        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(Accident.this, Selection1Page.class);
                        Accident.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
