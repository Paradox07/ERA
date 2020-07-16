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

public class science9pdfopener extends AppCompatActivity {

    WebView science9pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science9pdfopener);
        science9pdfViewer = findViewById(R.id.science9pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. MATTER IN OUR SURROUNDINGS")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/11cOanANqSQv_JQ8QG1n9xHaviXKvSv9Y/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 2. IS MATTER AROUND US PURE?")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1lte0SaNS8eUZQFhjv2awMHlQ5bEHU58T/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. ATOMS AND MOLECULES")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/16s8A-iPNQ3ohjIw4dhmfV3togoH_kbgB/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. STRUCTURE OF ATOMS")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1rfpa6TaBty9RNiG_NfGFjjsWQJwYVFnQ/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. THE FUNDAMENTAL UNIT OF LIFE")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/19x18kXLk0npYjC7qz5Tcrgg5uB4ObW0n/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. TISSUES")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/119n0UNQ7-Pdc4pniIx22gS_D3GYvqiKP/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. DIVERSITY IN LIVING ORGANISMS")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1yT0SGzM_gb1GZ3sfyHkB7gBSbldw57Fs/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. MOTION")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1c69XAYNS9i848a21GAT1jjOfZpZRZHBW/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. FORCE AND LAWS OF MOTION")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1avazMKUVSEqxU2BioY_HbjhTGMgU3Jq4/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. GRAVITATION")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1QZsVpDLhfPzej8pdX9Re00AVBw-4hwG7/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. WORK AND ENERGY")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1VNTHtzwg7dw-G2MvKcg1gFMeb_sCHxhP/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. SOUND")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1XTTtt4VUj3hrF06VsmmfcHA34tQq12OL/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. WHY DO WE FALL ILL?")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1CvAjwFAoBfzNovMVRDuLE-eHDvBLnI6j/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. NATURAL RESOURCES")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/12RxNqv4ZmFJOsKVsBLKnzlsSR100WcQc/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. IMPROVEMENT IN FOOD RESOURCES")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/18t6YDIsY0eQHpbjegcSr6_d38KJn59ag/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/100-f9pJx06FO2crsPOEeLozaczqSeDiA/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-2")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/13rTQdjmLB5ZTBrQOZ6Ks17FiCqQwueRx/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-3")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1sIefkrj-cpSWdTqi3eHTbdvXKHgGCTxN/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-4")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1gg5Md4Y2r4eGzEaq5_6NXkc3shts1a7l/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-5")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1yrMPk2qjjij--t05dMaEGG8MQUGEbNQc/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-6")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1LtPkD9WxcqZT-iZjmMTm0VLdqgfoDNxO/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-7")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1gLfYWmQDo9f6fvDGN5DHcBKe73W9FaCn/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-8")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1NaXUv1dfTkH7Y8w6rRbumiEdWxLLU2qY/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-9")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1Xb1oHgtZXJ7uE2BZHscVZMdXIMgegYzU/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-10")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1uUJN71QVCvBik26ly6y7qnfBhe4nL_aP/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-11")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1IASX54iHYdLGKguOXTKp7CV6wIZbY_VC/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-12")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1n0_Zdvw6wfaN3JEhe_gGHlHdQNPu1Pr8/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-13")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/19gA9wpAfFI7LsFOZnNjHV1GpLSkpUSm0/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-14")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/10uYIR6NVoHvFwIY4nJZaZ08mDYI1eVzI/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-15")){

            science9pdfViewer.loadUrl("https://drive.google.com/file/d/1pp-m7h2FW9gnKGk051nAkaEbmZASkR1a/view?usp=sharing");
            science9pdfViewer.getSettings().setJavaScriptEnabled(true);
            science9pdfViewer.setWebViewClient(new WebViewClient());
            science9pdfViewer.setWebContentsDebuggingEnabled(true);
            science9pdfViewer.setDownloadListener(new DownloadListener() {
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

