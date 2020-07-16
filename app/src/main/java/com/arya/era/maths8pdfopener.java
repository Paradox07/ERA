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

public class maths8pdfopener extends AppCompatActivity {

    WebView maths8pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths8pdfopener);
        maths8pdfViewer = findViewById(R.id.maths8pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. RATIONAL NUMBERS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1o27jmve3_6M0rsGHGD-mt3pq54huVR1f/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 2. LINEAR EQUATIONS IN ONE VARIABLE")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1vfCYFXYYvTynY6BE8hkSsN2HqDYhyI_5/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. UNDERSTANDING QUADRILATERALS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1xoH4Z9ZhWiPtUE8HUQ4pPyR3F_JBJv-Y/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. PRACTICAL GEOMETRY")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1RYOKdhHnI41R_uLQQuqo8GEWFY_kAeaW/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. DATA HANDLING")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1KSazwY7pCKrFoR2h96-S5UwvNkDVWisV/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. SQUARES AND SQUARE ROOTS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1B9n_fFC23EJspuA43GVISfeePBG3k63d/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. CUBES AND CUBE ROOTS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1vWdr4iWm6NqLXAGXXobFNsK3esq6CXI_/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. COMPARING QUANTITIES")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1mOE88eaK_Upa5LgGjwTgEnnM8um2hoIS/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. ALGEBRIC EXPRESSIONS AND IDENTITIES")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1qs9Ui13vvOgzQnUWzIRH-n-ooti31yMY/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. VISUALISING SOLID SHAPES")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1ymuBtz1dWdQ1Zy_cyzks0gWzh7FpDrgA/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. MENSURATION")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1mgXUzQ-47C1_Gqo5xC2fY4TYgh0_TFQ4/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. EXPONENTS AND POWERS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1DMmhLTOn4OhoB22AMRVNkwT73W82IGtt/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. DIRECT AND INVERSE PROPORTIONS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1tVQOedfH1vjzNCH9I2JbBBwkkXfbCljh/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. FACTORISATION")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1pNVSwIsY7yWBmfQgfn0eTN3f2kJyW3S4/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. INTRODUCTION TO GRAPHS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1Imnp5ifRW6SV9tASU0t1JjhmsIbltiLs/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 16. PLAYING WITH NUMBERS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1uEB31VN1ZQTP5IS4UzbukHm-vpgv93vO/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1wpfi7iK2roj9kOoz_bwqKER8MKPG5bfo/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-3 & 4")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1goyxox1jS0QXnm36EsrnGIorIRV6Na4i/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-5")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1ASnqZd4AbGhy2VXXBJxiMbpK0dzjScUr/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-6 & 7")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1wTyiYns65VJIZ9C0wOozNFcqUt3NwqjH/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-8")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1-JwSz2thsK3kdhca0iVnVmxF_w-OYCH5/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-9 & 14")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1f1ATFH7ITp4ALMwKxupMj_F4t00PZel8/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-10")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1hJgGw5fgCNvJbLAzRkqAQKBuX06fQ1OR/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-11")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1fAeORcW_LGKCuMZDrdw7HXbUUa0Tlyl0/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-12")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/11Y2yTEsyeiQN9sKUEArv2ygOoh_wjPa2/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-13")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1GGi7VSu1qWfWlQly_wsmpQYxPMsIV_KT/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-15")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1aLxuaYpI3nZjlc4t6n1L-0DZRnb00A6S/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }

        if (getItem.equals("ANSWERS")){

            maths8pdfViewer.loadUrl("https://drive.google.com/file/d/1hgY3cBkR44L-jvxBBNuqHk93o4XVBeNi/view?usp=sharing");
            maths8pdfViewer.getSettings().setJavaScriptEnabled(true);
            maths8pdfViewer.setWebViewClient(new WebViewClient());
            maths8pdfViewer.setWebContentsDebuggingEnabled(true);
            maths8pdfViewer.setDownloadListener(new DownloadListener() {
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
