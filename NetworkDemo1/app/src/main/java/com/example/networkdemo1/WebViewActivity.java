package com.example.networkdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {


    private WebView mWebView;

    private EditText mWebDestEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mWebView = (WebView) findViewById(R.id.webview);
        mWebDestEditText = (EditText) findViewById(R.id.webview_edit_text);


        // Setting the WebViewClient to allow the WebView to handle
        // redirects within the WebView, as opposed to being launched in a browser.
        mWebView.setWebViewClient(new WebViewClient() {
            // Deprecated in API 24, but the alternative is not compatible with Android <19
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });


        findViewById(R.id.web_dest_button).setOnClickListener(view -> {
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.loadUrl(mWebDestEditText.getText().toString());
        });

    }
}