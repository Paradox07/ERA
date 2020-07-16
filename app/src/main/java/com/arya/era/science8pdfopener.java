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

public class science8pdfopener extends AppCompatActivity {

    WebView science8pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science8pdfopener);
        science8pdfViewer = findViewById(R.id.science8pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. CROP PRODUCTION AND MANAGEMENT")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1kDYGqesHB37vKhfHTXflS95Mlw2Nw-BE/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 2. MICROORGANISMS: FRIEND AND FOE")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1lmOWPfaDQ_yUI9nBImdz-YGkQKZr-SBC/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. SYNTHETIC FIBRES AND PLASTICS")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1JkwY5pPc03WO6IwfF6mt9aKLQ-Fnm3DZ/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. MATERIALS: METALS AND NON-METALS")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1jLDewHFd2W_3OTcsK0lW_lGxZzvuz5wY/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. COAL AND PETROLEUM")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1TNemvxJuPtvJWPZZJVYRlehd_e43A0NB/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. COMBUSTION AND FLAME")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1U-y8Nin-Dq6dUD7yPd9oVUlVxS2i2vr0/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. CONSERVATION OF PLANTS AND ANIMALS")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1uMrKhiDk603GsveLqZVhgT_KRBCsKk0A/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. CELL STRUCTURE AND FUNCTIONS")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/139KwPtV69x65L8jTtqOwQC0PFw1IxPLd/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. REPRODUCTION IN ANIMALS")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/10abK2XWF-v7AcsUXCMF_5JmxzMGAHwHT/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. REACHING THE AGE OF ADOLESCENCE")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1r9DsIiPy9GdNiTKzs9SmysoPsi1oECrQ/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. FORCE AND PRESSURE")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1X0QRLkAThfVIX1ChVoGjL_r7aMH9DgOz/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. FRICTION")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/11QwR5wyonKAoGnxtMuW2XJ2yafqw-lHb/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. SOUND")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1AqjV1WbAI23S8FO-FBifdqYQJMFb6Yc0/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. CHEMICAL EFFECTS OF ELECTRIC CURRENT")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1yRNhAWnedt23WvHu-qNCQ3pnE9spEtP0/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. SOME NATURAL PHENOMENA")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1WCv8Wd97s1yjiyUWqINKuVgSc5rdbF0H/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 16. LIGHT")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1MyM_zdgh7q25eoIApMxi_TKRadYBtrpm/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 17. STARS AND THE SOLAR SYSTEM")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1mhv_fHB745izjnfwYxzKBwrvzQp_M6ne/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 18. POLLUTION OF AIR AND WATER")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1AsS_cvCZnUS55WBXK_sshga6mqfXmqgn/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1y1yBLpfVNi4olZtHmH5Ms4q_d9OdY4sY/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-2")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1OoqSALg_KjrXYbn3AeX5XPZqNgs5Rn-7/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-3")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1jS3Xu6NXS-oA0dwfNAiTIv1lZYD4SJrE/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-4")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1cLzz0iM81cMY8iPvt2goTwuVDCCg_Ojv/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-5")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1I4_FqaIQIJXMTvzVtNVParSra8lgtGuD/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-6")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1PFDwsQJAQE5ahJAone27civoK83miQao/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-7")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1SBg_0reHW4jYLUkQ1Owrk-XH-4v3gviV/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-8")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1-66Euynf6CubmUSIrQ0QqNqUwSlUJi0k/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-9")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1QetwtC1Sq5SEDDChRetj9Xtais_4s5zk/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-10")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1RGee90mlbMQ8ib75hCFiA5ccYMMl8tuq/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-11")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1LVJHU5UnD0qBzlKvp04XNFdPgbtZWk1O/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-12")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1LjlyYy4gn_DAr6HS6I0ThDE3MUt4N-aL/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-13")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1dwFQzXYh_Lgm2eLVuOdSmMdzd-hm2HfV/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-14")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1R2tUFbJY04yL4CEAkZS4qO7qBig2YbT9/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-15")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1aSabJzi-0DdxOm_z5w79GJGo_VLSdbOx/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-16")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1drXFldalUeetxM2Zsl0xTkgpCUWe0eDz/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-17")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1Fe8Nw_HWwooKtjW5LT4H_AswndosyUwy/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-18")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1P8ihPF88JDkWt3kthXMGo9O8Ym0zdqkd/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }

        if (getItem.equals("ANSWERS")){

            science8pdfViewer.loadUrl("https://drive.google.com/file/d/1iVqcXt9OqaCrH-27tUyDImaz3I2y4sVW/view?usp=sharing");
            science8pdfViewer.getSettings().setJavaScriptEnabled(true);
            science8pdfViewer.setWebViewClient(new WebViewClient());
            science8pdfViewer.setWebContentsDebuggingEnabled(true);
            science8pdfViewer.setDownloadListener(new DownloadListener() {
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
