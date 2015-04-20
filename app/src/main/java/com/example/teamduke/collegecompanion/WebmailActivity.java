package com.example.teamduke.collegecompanion;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class WebmailActivity extends ActionBarActivity {

    private WebView emailWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle);
        emailWebView  = new WebView(this);

        emailWebView.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        emailWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        emailWebView.loadUrl("https://eu-fed02.federate365.com/adfs/ls/?wa=wsignin1.0&wtrealm=urn:federation:MicrosoftOnline&IACcustid=C002906&wctx=wa%3Dwsignin1%252E0%26wreply%3Dhttps%253A%252F%252Foutlook%252Eoffice365%252Ecom%252Fowa"); // accesses link to then display
        setContentView(emailWebView );
    }


}
