package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class hiring_details extends AppCompatActivity {

    WebView hiringdetailswebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_hiring_details);

        hiringdetailswebview = findViewById(R.id.hiringdetailswebview);

        hiringdetailswebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfv3xa2i_0FajjG4q-LeZJEKa7e-gVlQrJ1sWFnDARhrn5zqA/viewform?vc=0&c=0&w=1");
        hiringdetailswebview.getSettings().setJavaScriptEnabled(true);
        hiringdetailswebview.setWebViewClient(new WebViewClient());
        hiringdetailswebview.setWebContentsDebuggingEnabled(true);
        hiringdetailswebview.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
