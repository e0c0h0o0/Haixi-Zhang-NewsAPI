package sakura.newsapi

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class WebBrowserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_browser)

        val url = intent.extras?.getString("url")
        val webView = findViewById<WebView>(R.id.u_webview)
        webView.loadUrl(url.orEmpty())

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()
    }
}