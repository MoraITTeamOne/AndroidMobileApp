package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeatsAvlPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seats_avl_page);

        final Button buttonst = (Button) findViewById(R.id.buttonst);



        buttonst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonst.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(SeatsAvlPage.this, Selection1Page.class);
                        SeatsAvlPage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
