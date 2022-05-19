package com.example.miniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient()
        {
            @Override



            public void onPageFinished(WebView view,String url)
            {
                String script = "var s = document.querySelectorAll(\"#list-brands ul li\");s.forEach ((element,index)=>{var a = element.querySelector('a'); a.setAttribute('onclick',`androidClick('${a.getAttribute('href')}')`);   a.setAttribute('href','javascript:void(0);')  ;}); function androidClick(link){ JS.Getlink(link)}";
                  webView.evaluateJavascript(script,null);

            }







        });
         webView.addJavascriptInterface(new JS(this),"JS");
         webView.loadUrl("https://m.gsmarena.com/samsung-phones-9.php");

    }
}