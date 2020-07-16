package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class maths7pdfopener extends AppCompatActivity {

    WebView maths7pdfViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths7pdfopener);

        maths7pdfViewer = findViewById(R.id.maths7pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. INTEGERS")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1MjxESEd2zGnpI0dCDDpQ3YHGr8A_dqJz/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 2. FRACTIONS AND DECIMALS")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1g_PNubUA47lZgqmgQUjwCV2WKxpStO67/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. DATA HANDLING")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1iStnKkQSqsovsbg35NMI-DOK3F8uJbA_/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. SIMPLE EQUATIONS")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1ykTA5po-KMbvVrtkEdei5XppXQkBorNo/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. LINES & ANGLES")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1ZPIeLu6FywGW_cjwK8pyCahg9W7dgAYr/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. THE TRIANGLES AND ITS PROPERTIES")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/116HbcrJsbUx-ZgpciABUZPAJG3rn2VYC/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. CONGRUENCE OF TRIANGLES")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1YtJSJvK2WXp7mdfW5DXLDWwBACooDaIp/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. COMPARING QUANTITIES")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1Rc3-gCqy7DHsLiprfqj74kD82OGUE32r/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. RATIONAL NUMBERS")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1dSN13aOD1FYHiLXtLyfiSQG7kzCWUsWZ/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. PRACTICAL GEOMETRY")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1h2WGEUxppftQszxQwTU_z-vl9hyj8TQW/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. PERIMETER AND AREA")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1-gfroxGwRUqngQ7zJi7kJaq65NavsJrw/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. ALGEBRIC EXPRESSIONS")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1VXDx9nKqEI1ypsUfE_1mE_WkwWFVBTga/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. EXPONENTS AND POWERS")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1eU3wgIm073oEkf3C6OcCz4SNZP5VJ-v8/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. SYMMETRY")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1zi9ruyccpTCxYIZAPSTRNGdTJt0ry4VE/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. VISUALISING SOLID SHAPES")){

            maths7pdfViewer.loadUrl("https://drive.google.com/file/d/1siIUtkv82DCyRFltYc32n-yy1ftevjI8/view?usp=sharing");
            maths7pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths7pdfViewer.setWebViewClient(new WebViewClient());
            maths7pdfViewer.setWebContentsDebuggingEnabled(true);
            maths7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }


    }
}
