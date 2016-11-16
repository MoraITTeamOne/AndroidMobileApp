package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);


        button2.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view) {

                                           button2.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent LoadingIntent = new Intent(LoginPage.this, NewsFeedPage.class);
                                                   LoginPage.this.startActivity(LoadingIntent);


                                               }
                                           });
                                       }
                                   }

        );
        button3.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view) {

                                           button3.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent LoadingIntent = new Intent(LoginPage.this, SignUpPage.class);
                                                   LoginPage.this.startActivity(LoadingIntent);


                                               }
                                           });
                                       }
                                   }

        );
        button4.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view) {

                                           button4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent LoadingIntent = new Intent(LoginPage.this, NewsFeedPage.class);
                                                   LoginPage.this.startActivity(LoadingIntent);


                                               }
                                           });
                                       }
                                   }

        );
    }
}
