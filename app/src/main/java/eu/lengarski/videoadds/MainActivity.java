package eu.lengarski.videoadds;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class MainActivity
        extends AppCompatActivity
{
    private ConstraintSet set;
    private ConstraintLayout layout;
    private WebView webView;

    private ImageView iv;
    private int PIC_WIDTH = 1024;
    @RequiresApi (api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.img);

        iv.setImageResource(R.drawable.img123);
        layout = (ConstraintLayout) findViewById(R.id.test_layout);
        webView = new WebView(MainActivity.this);
        webView.setId(R.id.webview_ad);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);

        webView.loadUrl("https://recognified.com/Showroom/adops/assets/preview/creatives/2020/03/12/4711_RemixCologne_In-Image_Wrap_a2/v1/index.html?t=0");

        webView.setBackgroundColor(Color.TRANSPARENT);

        webView.setInitialScale(1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        Toast.makeText(getApplicationContext(), " " + webView.getWidth() + " width ", Toast.LENGTH_SHORT).show();

        webView.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Toast.makeText(getApplicationContext(), "Asdf", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        set = new ConstraintSet();
        set.clone(layout);

        layout.addView(webView);

        set.applyTo(layout);

        addListener();
    }

    private void addListener()
    {
        final ImageView iv = (ImageView) findViewById(R.id.img);
        ViewTreeObserver vto = iv.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
            public boolean onPreDraw()
            {
                iv.getViewTreeObserver().removeOnPreDrawListener(this);
                int finalHeight = iv.getMeasuredHeight();
                int finalWidth = iv.getMeasuredWidth();

                updateWebView(finalHeight, finalWidth);

                return true;
            }

        });
    }

    private void updateWebView(int finalHeight, int finalWidth)
    {
//        set.constrainMaxHeight(webView.getId(), finalHeight);
        set.constrainMaxWidth(webView.getId(), finalWidth);
        set.constrainMaxHeight(webView.getId(), (int) (finalWidth / 9 * 6));

//        webView.set

        set.connect(webView.getId(), ConstraintSet.TOP, iv.getId(), ConstraintSet.TOP, 0);
        set.connect(webView.getId(), ConstraintSet.BOTTOM, iv.getId(), ConstraintSet.BOTTOM, 0);
        set.connect(webView.getId(), ConstraintSet.LEFT, iv.getId(), ConstraintSet.LEFT, 0);
        set.connect(webView.getId(), ConstraintSet.RIGHT, iv.getId(), ConstraintSet.RIGHT, 0);

        set.applyTo(layout);
    }

}
