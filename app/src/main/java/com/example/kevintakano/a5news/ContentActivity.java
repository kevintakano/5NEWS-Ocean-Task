package com.example.kevintakano.a5news;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_layout);

        Intent intent = getIntent();


        String tittle = intent.getExtras().getString("tittle");
        String content = intent.getExtras().getString("content");
        int imageControl = intent.getExtras().getInt ("image");

        TextView titleView = (TextView) findViewById(R.id.TextViewTitle);
        TextView contentView = (TextView) findViewById(R.id.TextViewContent);

        ImageView imageContent = (ImageView) findViewById(R.id.imageViewLD);


        titleView.setText(tittle);
        contentView.setText(content);

        Log.d("Valor Image Control",""+ imageControl);

        if(imageControl == 1) // Linked List
        {
            imageContent.setImageResource(R.drawable.linked_list);
        }
        if(imageControl == 2) // Linked List
        {
            imageContent.setImageResource(R.drawable.stack);
        }
        if(imageControl == 3) // Linked List
        {
            imageContent.setImageResource(R.drawable.queue);
        }


    }

}
