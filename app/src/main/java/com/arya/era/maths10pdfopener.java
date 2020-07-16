package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class maths10pdfopener extends AppCompatActivity {

    WebView maths10pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_maths10pdfopener);
        maths10pdfViewer = findViewById(R.id.maths10pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. REAL NUMBERS")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1xw4EubdoEujG50FYaK9WNc5SjPi5V5b1/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 2. POLYNOMIALS")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1OE_UleVj0Q65cFawRYfGKdl66ixxkEp2/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. PAIR OF LINEAR EQUATIONS IN TWO VARIABLE")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1LZvIrHJstdqMwtkINsEsh9UlHveFvQeG/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. QUADRATIC EQUATIONS")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1_tSw0bz5rcavfWL6mPKgabZLReoqlIuT/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. ARITHMETIC PROGRESSIONS")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1NltkL0e4nXjHFNaGnqtWebV9gbv89egt/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. TRIANGLES")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1P8pdhqqLZCHrq0fAfyHdM7vZyGWVrWLL/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. COORDINATE GEOMETRY")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1l2mWMVdCYdfirmP9oqJ517esKcwA2JzZ/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. INTRODUCTION TO TRIGONOMETRY")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1JROH7WI5RANT3GbK9jGSg5pvIYMJ1YON/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. SOME APPLICATIONS OF TRIGONOMETRY")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1WxDdQXiFs-LTwVSCNwFiyqNcoSTGMbEg/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. CIRCLES")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1KfLJeLE3c5QcHScgk-Qwhd-f_Zi1p9jO/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. CONSTRUCTIONS")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1n-CGgd0a6biyrOxpVRM881cSmGJog8oL/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. AREAS RELATED TO CIRCLES")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1qUB0OHVFbAGWtxqV3upNYcGk7gjJg_lK/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. SURFACE AREAS AND VOLUMES")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1xlNgFMQaDTHCfR7ETDISUMOfcvIthLUD/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. STATISTICS")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/14cZHpKxKVjDnnhMzhU4UB-jMxc79AZ5T/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. PROBABILITY")){

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1vcVPEjpPPnSZKdy8HUiH7-CEWf1ZDv_H/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1471bUC3uOTWJxHZI4fM24mvNsmVvZ-vF/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-2")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1UdJSTXiHxLCxuUx3h65_k5YzFpdU7GOH/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-3")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/15IE4ErRoyaPTH90_7XeCFnvJhTDj9gn6/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-4")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1i5yBPv1n-lTr6i3EugVGNOW1NinKVCZO/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-5")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1ohOdyMDZPOgfO6Dl1EzcRVHpfieCOyou/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-6")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1FkncjVBQ5R4NfmdVe_vq2LncWVElyD8e/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-7")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1Za2MPAZExXwxxp0Y-rpxYL0116KTOAYS/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-8 & 9")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1V-WjxTqo0jL74YuZ5PXmCXcUfP933kWf/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }

        if (getItem.equals("Exemplar : Chapter-10")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1kFWe0XP8GVip7lKQBza6Nrsv-DT2NM0X/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-11")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1wImRP8bHUwt0rii39uXNGJ0aAOIr-AnB/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-12")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1ENu9gw7r8mXkIdaNJ9nTlhP5lbsVYlfv/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-13")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1LDDHf3hKmUtkrXkABY2j1SrKa3WY1nR_/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-14 & 15")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1CckiWXQBAFE3IR6jIlrb3Hn4NpLeS5YP/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("ANSWERS")) {

            maths10pdfViewer.loadUrl("https://drive.google.com/file/d/1YP1vzbHMkTuNOtyT0KCMmYJ9z82jqUh4/view?usp=sharing");
            maths10pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths10pdfViewer.setWebViewClient(new WebViewClient());
            maths10pdfViewer.setWebContentsDebuggingEnabled(true);
            maths10pdfViewer.setDownloadListener(new DownloadListener() {
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

