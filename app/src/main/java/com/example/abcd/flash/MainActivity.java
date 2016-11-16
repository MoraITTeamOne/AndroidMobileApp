package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonbr = (Button) findViewById(R.id.buttonbr);



        buttonbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonbr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(MainActivity.this, Selection1Page.class);
                        MainActivity.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
