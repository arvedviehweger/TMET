package com.arved95.tmet;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import java.net.URL;


public class MainActivity extends AppCompatActivity {

    WebView ourbrowser;
    Menu mymenu;
    MenuItem progress_menu_item;
    MenuItem website_starter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourbrowser = (WebView) findViewById(R.id.web1);
        ourbrowser.getSettings().setJavaScriptEnabled(true);
        String url = "http://tmet-homework.jimdo.com/";
        ourbrowser.loadUrl(url);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        mymenu = menu;
        progress_menu_item = mymenu.findItem(R.id.refresh_button);
        website_starter = mymenu.findItem(R.id.activity_starter);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.refresh_button) {

            ourbrowser.reload();

        }

        if (id == R.id.activity_starter) {

            startActivity(new Intent(MainActivity.this, WebsiteActivity.class));
        }


        return super.onOptionsItemSelected(item);
    }


}


