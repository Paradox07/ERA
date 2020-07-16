package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Maths_take_test extends AppCompatActivity {

    WebView mathstaketestwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths_take_test);
        mathstaketestwebview = findViewById(R.id.mathstaketestwebview);

        mathstaketestwebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSekAZ_XJLjbsancZTl47H9YfxEKJzpUD8kjCCZ0bRnpR576lg/viewform");
        mathstaketestwebview.getSettings().setJavaScriptEnabled(true);
        mathstaketestwebview.setWebViewClient(new WebViewClient());
        mathstaketestwebview.setWebContentsDebuggingEnabled(true);
        mathstaketestwebview.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
