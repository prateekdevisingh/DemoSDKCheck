package com.prateek.demosdkcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by prateek on 28/7/17.
 */

public class TenButtonUrlMainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btExplore, btMummy, btFilipino, btMovie, btRange, btEdu, btUS, btZoobi, btZara, btCookery, btBmw;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_url);
        initilizeView();

    }

    private void initilizeView() {
        btBmw = (Button) findViewById(R.id.btBmw);
        btCookery = (Button) findViewById(R.id.btCookery);
        btEdu = (Button) findViewById(R.id.btEdu);
        btExplore = (Button) findViewById(R.id.btExplore);
        btFilipino = (Button) findViewById(R.id.btFilipino);
        btMovie = (Button) findViewById(R.id.btMovie);
        btMummy = (Button) findViewById(R.id.btMummy);
        btRange = (Button) findViewById(R.id.btRange);
        btUS = (Button) findViewById(R.id.btUS);
        btZara = (Button) findViewById(R.id.btZara);
        btZoobi = (Button) findViewById(R.id.btZoobi);

        btBmw.setOnClickListener(this);
        btCookery.setOnClickListener(this);
        btEdu.setOnClickListener(this);
        btExplore.setOnClickListener(this);
        btFilipino.setOnClickListener(this);
        btMovie.setOnClickListener(this);
        btMummy.setOnClickListener(this);
        btRange.setOnClickListener(this);
        btUS.setOnClickListener(this);
        btZara.setOnClickListener(this);
        btZoobi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btBmw:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "5a9551ce-ad5e-4960-b2a2-fe129ba6a968");
                    intent.putExtra("VIDEOJSONID", "596e035f5b8d424d30ad25c4");
                    startActivity(intent);

                }catch (Exception e){

                }
                break;
            case R.id.btCookery:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "313ab4d8-7989-42b4-8a36-6b08ef39cf2a");
                    intent.putExtra("VIDEOJSONID", "597aebb32d11433a1aa672f8");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btEdu:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "65cdb893-b0e5-4e25-8161-b6b4a374d0e6");
                    intent.putExtra("VIDEOJSONID", "596e04155b8d424d30ad25c6");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btExplore:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "48dad5bf-e684-430a-9778-f97ba46f86d6");
                    intent.putExtra("VIDEOJSONID", "597aecb92d11433a1aa672fb");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btFilipino:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "c2b0cef4-c8a3-4c1a-b658-4b4afc62ed15");
                    intent.putExtra("VIDEOJSONID", "597af5ce2d11433a1aa67323");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btMovie:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "7b8ea745-e037-47d0-bbd0-a6bf95b7fbcb");
                    intent.putExtra("VIDEOJSONID", "597b10992d11433a1aa6734d");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btMummy:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "c5a9c2ed-671e-4e4b-a08a-5f8a65d8e7e3");
                    intent.putExtra("VIDEOJSONID", "597af6182d11433a1aa67325");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btRange:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "5c8b5079-2884-4be9-ba0d-ae24cc3eaf81");
                    intent.putExtra("VIDEOJSONID", "58ece7e18fd56cf81e0bb009");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btUS:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "5ee18864-7eca-4cdb-9b50-ff806cd91b9d");
                    intent.putExtra("VIDEOJSONID", "59105b9400b0c09d37fcd475");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btZara:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "5d14beae-4554-4c40-9d0f-f3e379bb8260");
                    intent.putExtra("VIDEOJSONID", "589b208551aa6f3a04f96e1d");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
            case R.id.btZoobi:
                try {
                    intent = new Intent(this, DemoMainActivity.class);
                    intent.putExtra("VIDEOID", "9e40e93d-f852-4659-9efe-0c47b8cff3e5");
                    intent.putExtra("VIDEOJSONID", "597b14552d11433a1aa67356");
                    startActivity(intent);

                }catch (Exception e){

                }

                break;
        }
    }
}
