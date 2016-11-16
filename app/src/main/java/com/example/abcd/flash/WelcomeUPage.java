package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeUPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_upage);
        final Button button6 = (Button) findViewById(R.id.button6);



        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(WelcomeUPage.this, NewsFeedPage.class);
                        WelcomeUPage.this.startActivity(LoadingIntent);


                    }
                });
            }
        });
    }
}
