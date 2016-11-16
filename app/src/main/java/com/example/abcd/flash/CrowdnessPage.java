package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CrowdnessPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crowdness_page);

        final Button buttoncr = (Button) findViewById(R.id.buttoncr);



        buttoncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttoncr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(CrowdnessPage.this, Selection1Page.class);
                        CrowdnessPage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
