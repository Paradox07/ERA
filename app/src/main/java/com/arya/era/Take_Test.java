package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Take_Test extends AppCompatActivity {

    WebView taketestwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_take__test);

        taketestwebview=findViewById(R.id.taketestwebview);

        taketestwebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSekAZ_XJLjbsancZTl47H9YfxEKJzpUD8kjCCZ0bRnpR576lg/viewform");
        taketestwebview.getSettings().setJavaScriptEnabled(true);
        taketestwebview.setWebViewClient(new WebViewClient());
        taketestwebview.setWebContentsDebuggingEnabled(true);
        taketestwebview.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
