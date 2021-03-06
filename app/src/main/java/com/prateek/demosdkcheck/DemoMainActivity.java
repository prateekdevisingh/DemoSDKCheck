package com.prateek.demosdkcheck;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.videotap.android.player.smart.SmartPlayerView;
import com.videotap.android.player.smart.VideoTapSmartPlayer;
import com.videotap.android.player.util.Util;

public class DemoMainActivity extends AppCompatActivity implements VideoTapSmartPlayer.SmartPlayerHandler{
    private String userAgent;
    VideoTapSmartPlayer videoTapSmartPlayer;

    String videoId = "";
    String videoJsonId = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            videoId = getIntent().getStringExtra("VIDEOID");
            videoJsonId = getIntent().getStringExtra("VIDEOJSONID");
        }catch (Exception e){

        }
        makeImmersive();
        String uToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJfaWQiOiJhYmM0OTQwNi1lZDFhLTRmYmUtYjA2NS1jY2RhMzk1ZDU5ZmEiLCJpYXQiOjE1MDA4OTA5NDE0NjMsImV4cCI6MTU2Mzk2Mjk0MTQ2M30.2wGl9yxaJZr4gFGaxN-H4lpbYI9xxWLtyoNHmSp-WSE";


        userAgent = Util.getUserAgent(this, getResources().getString(R.string.app_name));
        videoTapSmartPlayer = new VideoTapSmartPlayer((SmartPlayerView) findViewById(R.id.smartPlayerView),
                uToken/*usertoken bearer vala*/,
                userAgent,
                this,
                this,
                /*"466f2b20-7473-43c8-8bfb-aed212ca329f"*/videoId,
                /*"58876fc8e501077c7b86ff87"*/videoJsonId);

        videoTapSmartPlayer.prepareAndStartPlayer();
    }

    private void makeImmersive() {
        try {
            final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hideController nav bar
                    | View.SYSTEM_UI_FLAG_FULLSCREEN // hideController status bar
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            final int flags_portrait = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_FULLSCREEN // hideController status bar
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        /*int flag = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE;
*/

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                View decorView = getWindow().getDecorView();
                decorView.setSystemUiVisibility(flags);
            }else {
                View decorView = getWindow().getDecorView();
                decorView.setSystemUiVisibility(flags_portrait);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        makeImmersive();
        videoTapSmartPlayer.onConfigurationChanged(newConfig);
    }

    @Override
    public void showOnDoubleClick() {

    }

    @Override
    public void hideOnDoubleClick() {

    }

    @Override
    public void onPlayerStart() {

    }

    @Override
    public void saveBitRateValue(int i) {

    }

    @Override
    public int getBitRateValue() {
        return 0;
    }

    @Override
    public void savePlayDurationToServer(long l, String s, long l1, String s1) {

    }

    @Override
    public void tabletLandscapeMinimize() {

    }

    @Override
    public void tabletLandscapeMaximize() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        videoTapSmartPlayer.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        videoTapSmartPlayer.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        videoTapSmartPlayer.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoTapSmartPlayer.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        videoTapSmartPlayer.onBackPressed();
    }

}
