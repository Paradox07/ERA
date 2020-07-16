package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class apptitude_and_logical_reasoning_take_test extends AppCompatActivity {

    WebView reasoningtaketestwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_apptitude_and_logical_reasoning_take_test);
        reasoningtaketestwebview = findViewById(R.id.reasoningtaketestwebview);

        reasoningtaketestwebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSekAZ_XJLjbsancZTl47H9YfxEKJzpUD8kjCCZ0bRnpR576lg/viewform");
        reasoningtaketestwebview.getSettings().setJavaScriptEnabled(true);
        reasoningtaketestwebview.setWebViewClient(new WebViewClient());
        reasoningtaketestwebview.setWebContentsDebuggingEnabled(true);
        reasoningtaketestwebview.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
