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

public class maths9pdfopener extends AppCompatActivity {

    WebView maths9pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths9pdfopener);

        maths9pdfViewer = findViewById(R.id.maths9pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. NUMBER SYSTEM")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1UsqRR1K9B2Ztx9P5RJXFZ9mRInSDM17E/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 2. POLYNOMIALS")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1rodFg-y4qh8lUB9ib4x1c6artZb6FdJq/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. COORDINATE GEOMETRY")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1c1Siongh2lFFyxYdVQkFv0lNI7gtivR6/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. LINEAR EQUATIONS IN TWO VARIABLE")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1h6Xkd5NvQEEDQ8o9dpGzcYXtkwE2mxoo/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. INTRODUCTION TO EUCLID’S GEOMETRY")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1-SVCnFp4GAiphhETg4EbxCPW9xvome4p/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. LINES AND ANGELS")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1SYK68holC0slPVkZMp5B_30WABysMcyd/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. TRIANGLES")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1JE17JrtjBsELnF_fJHKfwYUP2OQ7e6_0/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. QUADRILATERALS")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1KAWAEh9iUwE-fu_Q4RCf8Qo1ngZbkLYd/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. AREA")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1pSApMzuHdaQ4yvYgMwKtuej_bPKfSp1s/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. CIRCLES")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1Msi2wMvET-uwJo73HAFISK1zeptbUOvW/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. CONSTRUCTIONS")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1N5R2XJQZTrrSnzDA8PNjGau7k5omEW5P/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. HERON'S FORMULA")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1kpobEHiWdWaq7otjUktoSPH0qp2852_v/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. SURFACE AREA AND VOLUMES")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1dP86G3-Hd_lcStF1o2wYhkuB223IOaa_/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. STATISTICS")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1Df65jBOfMq7wl7AIcGahNuT6kFQ7dKYA/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. PROBABILITY")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1ubNnuQ6wXJHjepslju3fqgJo01Ed3mw-/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1agisXco57-ZHQ1riFJqVdIiMXgYBK21O/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-2")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1XowH0nCV_lkAxlDS9itVpXcuHXGFHIqr/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-3")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1oz8A9BRHer4DShjdHuLo_E14Rpzg1apa/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-4")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1-yuLthLZNgoKXevN9BtGSvD7BQ2M57pA/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-5")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1pFe1VewgWmY2aRfpuX8-loZzMH5zyzzZ/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-6")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1PwWdW25LYgIr9YclWd6GDykXSLJRQ5ZB/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-7")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1vmAhLkgKZQo-TbpIO-W5RYG_VCJZw8Nw/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-8")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1hPQ8ESouWjHw4L-tH7dNO7v7U6GVRJLM/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-9")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1kdlF3THF3tL-f1AWJKJizeSXRlEUsiHX/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-10")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1dFdZjVvbR3brzXG3K6YoK3dX0_cJs69t/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-11")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1GjC4IPTV1FbR_9sZSgFABZf-eUGWWbZ_/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-12")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1BkqbHL7h-swnyO1opNyNK2pWDr-Ak58x/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }if (getItem.equals("Exemplar : Chapter-13")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1FeUGVinZEQDwHqIJdfQGNdQaoHrMMIcW/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-14 & 15")){

            maths9pdfViewer.loadUrl("https://drive.google.com/file/d/1w7-LVAA8jhgPzSKcBcLvNZL4zRDfecCl/view?usp=sharing");
            maths9pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths9pdfViewer.setWebViewClient(new WebViewClient());
            maths9pdfViewer.setWebContentsDebuggingEnabled(true);
            maths9pdfViewer.setDownloadListener(new DownloadListener() {
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
