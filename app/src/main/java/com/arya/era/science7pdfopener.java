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

public class science7pdfopener extends AppCompatActivity {
    WebView science7pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_science7pdfopener);
        science7pdfViewer = findViewById(R.id.science7pdfopener);

        String getItem = getIntent().getStringExtra("pdfFileName");


        if (getItem.equals("Chapter 1. NUTRITION IN PLANTS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/13GkOx7U8LKN0fqDsM3qzeS7IFmqjN9CB/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Chapter 2. NUTRITION IN ANIMALS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1Egh1YXM4d0RbHsbelktCFbKLdz2wisCs/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 3. FIBRE TO FABRIC")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1azCLGVESzrkQm-7dmcguqej1jNeaDG6P/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. HEAT")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1UIGmCmEnsRiCP63RSYecK-ttuPO7F_kP/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 5. ACIDS, BASES AND SALTS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1Fh8RysqsoO-tlxBQjAvm7Jr-axdgMYg0/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 6. PHYSICAL AND CHEMICAL CHANGES")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1D2mfx-eJ8c4kvHnEGa1XwruUZghV_bo6/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 7. WEATHER, CLIMATE AND ADAPTATIONS OF ANIMALS OF CLIMATE")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/18eX8WHsND52e-kXQ8A6rAaEwEkUBupEi/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 8. WINDS, STORMS AND CYCLONES")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1X5MCJQ2c-c5YpXSiiSte0iGvBT6r78uB/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 9. SOIL")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1ouUPpff6ooaxkcNn-kPR7mIA2lr6LInq/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 10. RESPIRATION IN ORGANISMS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1UWyA_N5LCkiRFQpnJtjaaSo08NQbH_hU/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. TRANSPORTATION IN ANIMALS AND PLANTS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1XjmgCjRktRqc5rXlw6ghmrXrK3Z8cCxd/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 12. REPRODUCTION IN PLANTS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1VL3nz5e0tsDrDyX4jaB2NBRpxsNlUa0Y/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 13. MOTION AND TIME")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1DYjrYAwwJiEJXDOHtd0HVtBnLUjS0Bna/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 14. ELECTRIC CURRENT AND ITS EFFECTS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/14LsIVO5Zlu_HJMzn2IEuyQqfaHQ-wOXu/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 15. LIGHT")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/149RPE2gmrKqitD3EBaXt5WNeMrK3k__U/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 16. WATER: A PRECIOUS RESOURCE")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1drMBBHQ0yDulP64z6aNTfF2OmjXUXjNP/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 17. FORESTS: OUR LIFELINE")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1Fy5YTqnac2AiRuBftAgUBi3XoYIT1Wbg/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });

        }
        if (getItem.equals("Chapter 18. WASTE WATER STORY")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1EZBEtteiaeDTYnyuIe2SFw_N8-Nh-RGV/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1mPx_axdhSQaiQUQWrEr0YhAGWYDZQOyT/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-2")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1GmNT-sXgJE6Od32cjAWjSR30y6Xo0_1O/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-3")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/17y_JQ6noYWR0Qf2k9G12RLjbao393E-E/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-4")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1ZTtXW0iiId2f2wEigWEjKLuh0Z9dLfKs/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-5")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1HFwOzjwStlZ22clYSqDD0cfrrEswFpXV/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-6")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1QFSMsCfw2kVoGV63KhcTDowkeabuN1-H/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-7")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1pZnT3mMNPqERaWN517fIh3rZ1TdYsUbx/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-8")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1rOeRC4MKQYdkbYvYbjSySO1QkGXzio1X/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-9")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1szU0lT3jFfwesO57OkmAx-fwVM2TITAo/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-10")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1m139JM6CyzeJKAYM7OK_f3Rm73-QmkhV/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-11")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1RE7CU0jWG81pVdOq54j-MG2Gwof6aQUR/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-12")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1QgITIcD3mEyp18P8ipMoB1OR8_o9uUqC/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-13")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/12LOouTfLC-LaAAJ2-tnk1CdZ1OjH7VD_/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-14")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1dmDYVVXIZJ0bn3InCqEczoQoQxQu0u64/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-15")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1AhJeWkHFboTmz5oZ_rQTOtm977Q2oq7F/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-16")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1uSGfg4aDxK8pt4Vy06ZcbWuW7kc8f1Rq/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-17")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1iuwR8Jm9pQdNmEWA_NIUNp58Nena8oQv/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("Exemplar : Chapter-18")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1sU-TJ4Q0H6MsS6eaVkYOnRc54g824Z4N/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });


        }
        if (getItem.equals("ANSWERS")){

            science7pdfViewer.loadUrl("https://drive.google.com/file/d/1YWF5QP7TUcCWEXBFMjmXLUzSvBKB2osV/view?usp=sharing");
            science7pdfViewer.getSettings().setJavaScriptEnabled(true);
            science7pdfViewer.setWebViewClient(new WebViewClient());
            science7pdfViewer.setWebContentsDebuggingEnabled(true);
            science7pdfViewer.setDownloadListener(new DownloadListener() {
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
