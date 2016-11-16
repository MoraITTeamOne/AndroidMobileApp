package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoadingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        final Button button1 = (Button) findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View view) {

                                          button1.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  Intent LoadingIntent = new Intent(LoadingPage.this, LoginPage.class);
                                                  LoadingPage.this.startActivity(LoadingIntent);


                                              }
                                          });
                                      }
                                  }

        );
    }
}


