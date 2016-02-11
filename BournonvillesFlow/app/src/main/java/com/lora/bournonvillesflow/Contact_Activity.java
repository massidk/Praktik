package com.lora.bournonvillesflow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Contact_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void OnClickRing(View view) {
        Button ringBtn = (Button) findViewById(R.id.ring_Button);
        ringBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ring = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+4531531926"));


                startActivity(ring);
            }
        });
    }

    public void OnClickMail(View view) {
        Button mailBtn = (Button) findViewById(R.id.mail_Button);
        mailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mailIntent = new Intent(Intent.ACTION_SEND);
                mailIntent.putExtra(Intent.EXTRA_EMAIL, Uri.parse("email:lotteravn@live.dk"));
                mailIntent.setType("message/rfc822");
                startActivity(mailIntent);
            }
        });
    }

    public void onClickFindUs(View view) {
        Uri uri = Uri.parse("google.navigation:q= Vordingborgvej 441,4690 Haslev");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        i.setPackage("com.google.android.apps.maps");
        startActivity(i);
    }
}
