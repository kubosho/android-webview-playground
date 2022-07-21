package com.kubosho.webviewplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myWebView = WebView(applicationContext)

        myWebView.loadUrl("http://10.0.2.2:9000")
        myWebView.settings.javaScriptEnabled = true
        setContentView(myWebView)
    }
}
