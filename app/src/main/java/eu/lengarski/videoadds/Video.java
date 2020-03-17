package eu.lengarski.videoadds;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Video
        extends AppCompatActivity
{


//    private VideoView videoView;

    @RequiresApi (api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        videoView = findViewById(R.id.videoView);
//
//        videoView.getCurrentPosition();
//
//        Log.d("###", "is playing " + videoView.isPlaying());
//
//        Log.d("###", " duration " + videoView.getDuration());
//
//
//        videoView.setOnFocusChangeListener(new View.OnFocusChangeListener()
//        {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus)
//            {
//                Log.d("###", " on focus change listener  " + hasFocus);
//            }
//        });
//
//        videoView.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Log.d("###", " ot click listener");
//            }
//        });
//
//        videoView.removeOnLayoutChangeListener(new View.OnLayoutChangeListener()
//        {
//            @Override
//            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom)
//            {
//                Log.d("###", left + " " + top);
//            }
//        });
//
//
//        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
//
//        Uri uri = Uri.parse(videoPath);
//
//        videoView.setVideoURI(uri);
//
//        MediaController mc = new MediaController(this);
//        videoView.setMediaController(mc);
//        mc.setAnchorView(videoView);
//
//
//        int right = videoView.getRight();
//        int top = videoView.getTop();
//
//        Log.d("###", "top " + top + " right " + right);
//
//        Log.d("###", "is playing " + videoView.isPlaying());
//
//        Log.d("###", " duration " + videoView.getDuration());
//
//
//        mc.setOnKeyListener(new View.OnKeyListener()
//        {
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event)
//            {
//                Log.d("###", "mc.onLeyListener");
//
//                return false;
//            }
//        });
//
//        videoView.setOnTouchListener(new View.OnTouchListener()
//        {
//            @Override
//            public boolean onTouch(View v, MotionEvent event)
//            {
//                Log.d("###", " on touch " + event.getAction());
//
//                Rect rect = new Rect();
//                videoView.getLocalVisibleRect(rect);
//                int arr[] = new int[2];
//
//                videoView.getLocationOnScreen(arr);
//                videoView.getLocationInWindow(arr);
//
//
//
//
//                return false;
//            }
//        });
//        videoView.setOnContextClickListener(new View.OnContextClickListener()
//        {
//            @Override
//            public boolean onContextClick(View v)
//            {
//                return false;
//            }
//        });
//
//
//        Rect rect = new Rect();
//        videoView.getLocalVisibleRect(rect);
//
//
//        Log.d("###", " top " + rect.top);

    }
}


