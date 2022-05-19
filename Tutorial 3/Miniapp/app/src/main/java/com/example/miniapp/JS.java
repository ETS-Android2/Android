package com.example.miniapp;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class JS
{
     private Context context;

     public JS(Context ctx)
     {
         this.context = ctx;
     }
     @JavascriptInterface
    public void Getlink(String link)
    {

        TextView textView ;
        textView = (TextView) ((Activity)context).findViewById(R.id.textView1);
        textView.setText("I'm a call from mini app: "+link);
       // Toast.makeText(context, link, Toast.LENGTH_SHORT).show();
    }







}
