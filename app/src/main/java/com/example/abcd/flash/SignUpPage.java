package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        final Button button5 = (Button) findViewById(R.id.button5);



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(SignUpPage.this, WelcomeUPage.class);
                        SignUpPage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
