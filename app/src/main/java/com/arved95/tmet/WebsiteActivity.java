package com.arved95.tmet;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class WebsiteActivity extends AppCompatActivity {

    WebView ourbrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        ourbrowser = (WebView) findViewById(R.id.webView_webviewActivity);
        ourbrowser.getSettings().setJavaScriptEnabled(true);
        String url = "http://www.trivenimemorialtrust.com/";
        ourbrowser.loadUrl(url);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_website, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.refresh_button) {

            ourbrowser.reload();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
