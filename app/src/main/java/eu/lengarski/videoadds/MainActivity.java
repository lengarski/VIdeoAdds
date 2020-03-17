package eu.lengarski.videoadds;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
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

    private WebView wv;
    private ConstraintLayout layout;

    private ImageView iv;

    @RequiresApi (api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.img);

//        Bitmap image = new Bitmap();

//        iv.setImageBitmap(image);

        iv.setImageResource(R.drawable.img123);
        layout = (ConstraintLayout) findViewById(R.id.test_layout);
        WebView webView = new WebView(MainActivity.this);
        webView.setId(R.id.webview_ad);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);

        webView.setScaleX(.7f);
        webView.setScaleY(.7f);
//webView.getSettings().set

        webView.loadUrl("https://recognified.com/Showroom/adops/assets/preview/creatives/2020/03/12/4711_RemixCologne_In-Image_Wrap_a2/v1/index.html?t=0");

        webView.setBackgroundColor(Color.TRANSPARENT);


        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

                Toast.makeText(getApplicationContext()," "+ webView.getWidth() + " width ", Toast.LENGTH_SHORT).show();

//        webView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Toast.makeText(getApplicationContext(),"Asdf", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });

        ConstraintSet set = new ConstraintSet();
        set.clone(layout);
        set.connect(webView.getId(), ConstraintSet.TOP, iv.getId(), ConstraintSet.TOP, 0);
        set.connect(webView.getId(), ConstraintSet.BOTTOM, iv.getId(), ConstraintSet.BOTTOM, 0);
        set.connect(webView.getId(), ConstraintSet.LEFT, iv.getId(), ConstraintSet.LEFT, 0);
        set.connect(webView.getId(), ConstraintSet.RIGHT, iv.getId(), ConstraintSet.RIGHT, 0);


        set.setScaleX(webView.getId(),.4f);
        set.setScaleY(webView.getId(),.4f);
//        ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        lp.leftToLeft = iv.getId();
//        lp.topToTop = iv.getId();
//        lp.rightToLeft =iv.getId();
//        lp.bottomToBottom = iv.getId();
//
//        webView.setLayoutParams(lp);

        layout.addView(webView,640,360);

        set.applyTo(layout);



//        layout.addView();


    }
}
