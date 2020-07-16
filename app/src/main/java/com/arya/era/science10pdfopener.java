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

public class science10pdfopener extends AppCompatActivity {

    WebView science10pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science10pdfopener);
        science10pdfViewer = findViewById(R.id.science10pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");



        if (getItem.equals("Chapter 1. CHEMICAL REACTIONS AND EQUATIONS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1w44YKky32e4aLW-x1rV7Uue1a42cBS_b/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 2. ACIDS, BASES AND SALTS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1I5stvhOYwcevRvLi4V4gl6EM_ViYa1H7/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 3. METAL AND NON-METALS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1jrb_Q3xeGIGaHKMdfNgR8zWQTU9YeOl9/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 4. CARBON AND ITS COMPOUNDS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1mgrPpsL96FURCuXm_Ryj9INuiFv-Nyo8/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 5. PERIODIC CLASSIFICATION OF ELEMENTS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1u1DvXZgG5G79i4G-j59bMF2qrlZSYMEZ/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 6. LIFE PROCESS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1T8sKCvqTFoCxjvQAcskIusCM5H3iJWMH/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 7. CONTROL AND COORDINATION")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/16tcY-hVidywA56NrYYZWn3NhdO8WkOyr/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 8. HOW DO ORGANISMS REPRODUCE?")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/10pVkvtdmcqVu-MwPe0l39QEUrTIXwTIG/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 9. HEREDITY AND EVOLUTION")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/19uPrVUPruT4FL3FFmmC83xik_esUuhuQ/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 10. LIGHT-REFLECTION AND REFRACTION")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/11e-rVxSIoU_bGUsSZStMkDDw6xjJMJQB/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 11. THE HUMAN EYE AND THE COLOURFUL WORLD")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1cmVXsHbMb3uHBJXPsGG91VYipibTqVYm/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 12. ELECTRICITY")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1XsKqd2vgGnj8vvxGPl9aJ67MwEthDmI2/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 13. MAGNETIC EFFECTS OF ELECTRIC CURRENT")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1nxvWK5O_ozvTPcvvVyP8C2cNW_U5jpgf/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 14. SOURCES OF ENERGY")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1pBWwAv8bg49w2NTfN578SUyKJrHvQn5D/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 15. OUR ENVIRONMENT")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1dzSH0HfkJkF1dmy4iH4X9aAQJvl5x1Ys/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Chapter 16. SUSTAINABLE MANAGEMENT OF NATURAL RESOURCES")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/15TVjAKXuRxI_NAUM5G4i5fOs51XXW-DH/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-1")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/10-xNGhx5PSChMJf92ZItP72kPcQVSi6x/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }

        if (getItem.equals("Exemplar : Chapter-2")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1KlW-bv3y5tZlfke-GNr4NqEPbL7beP0O/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-3")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1mVICeh4n3SsJr-g0iNFCwSMg3hPCbkRP/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-4")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1I7xZbB95KT-YdsoEYQ6cV8zT9TT-CUI4/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-5")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1cYbVnHTY2iuzConsP-JtY6LTmd8T3qK-/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-6")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1iv58vk3i3PdQWFdsZhkWBBWAiIhe41iE/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-7")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1rbr25WzwAotlFVlO7s4Nr3IhM5pf5EPc/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-8")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1v0CXokOnv46YOlOL9gvKGWDLRTraB0-G/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-9")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1blwmnZfj9OV28jeFQ2bJVgzKs4EGeOAv/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-10")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1ThXjx6WEVBlwrye-GHgGVPkXpy6Ks0yW/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-11")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1JWVOAq6SPg0CSG-nNpfLEsOugGWLxgfK/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-12")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/14FNBERLFLSmvwMbSSao2LwngphuM1TNF/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-13")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1TIy0rZSicHNXjavhTPsondY3ZDx2_g3m/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-14")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/14VIGjFZ2fRkmYdcSkviL15oDuO5gTQI4/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-15")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1N9IC5jy0I_n63ph1zZUBnC2cfn4pDNOt/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("Exemplar : Chapter-16")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1S-ietRzxAaxts3MPlO4jgpjG_NcC_yxv/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
        if (getItem.equals("ANSWERS")){

            science10pdfViewer.loadUrl("https://drive.google.com/file/d/1PQCsJHV8xhubL2rUOx1g5i7HzTVxq8IF/view?usp=sharing");
            science10pdfViewer.getSettings().setJavaScriptEnabled(true);
            science10pdfViewer.setWebViewClient(new WebViewClient());
            science10pdfViewer.setWebContentsDebuggingEnabled(true);
            science10pdfViewer.setDownloadListener(new DownloadListener() {
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


