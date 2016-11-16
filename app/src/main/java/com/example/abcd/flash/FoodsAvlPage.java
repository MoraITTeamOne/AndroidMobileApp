package com.example.abcd.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodsAvlPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods_avl_page);

        final Button buttonfd = (Button) findViewById(R.id.buttonfd);



        buttonfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonfd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent LoadingIntent = new Intent(FoodsAvlPage.this, Selection1Page.class);
                        FoodsAvlPage.this.startActivity(LoadingIntent);


                    }
                });
            }
        } );
    }
}
