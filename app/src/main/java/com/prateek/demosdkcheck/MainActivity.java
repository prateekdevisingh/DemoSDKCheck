package com.prateek.demosdkcheck;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.videotap.android.player.smart.SmartPlayerView;
import com.videotap.android.player.smart.VideoTapSmartPlayer;
import com.videotap.android.player.util.Util;

public class MainActivity extends AppCompatActivity implements VideoTapSmartPlayer.SmartPlayerHandler{
    private String userAgent;
    VideoTapSmartPlayer videoTapSmartPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String uToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJfaWQiOiJhYmM0OTQwNi1lZDFhLTRmYmUtYjA2NS1jY2RhMzk1ZDU5ZmEiLCJpYXQiOjE1MDA4OTA5NDE0NjMsImV4cCI6MTU2Mzk2Mjk0MTQ2M30.2wGl9yxaJZr4gFGaxN-H4lpbYI9xxWLtyoNHmSp-WSE";

        userAgent = Util.getUserAgent(this, getResources().getString(R.string.app_name));
        videoTapSmartPlayer = new VideoTapSmartPlayer((SmartPlayerView) findViewById(R.id.smartPlayerView),
                uToken/*usertoken bearer vala*/,
                userAgent,
                this,
                this,
                "466f2b20-7473-43c8-8bfb-aed212ca329f"/*videoid*/,
                "58876fc8e501077c7b86ff87"/*videojsonid*/);

        videoTapSmartPlayer.prepareAndStartPlayer();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        videoTapSmartPlayer.prepareAndStartPlayer();
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
}
