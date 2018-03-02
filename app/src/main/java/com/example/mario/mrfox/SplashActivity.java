package com.example.mario.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView tvTitulo;
    ImageView iv;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitulo=findViewById(R.id.tvSplash);
        iv=findViewById(R.id.ivSplash);
        rl=findViewById(R.id.rl);

        Typeface face=Typeface.createFromAsset(getAssets(),"font/AmaticSC-Regular.ttf");
        tvTitulo.setTypeface(face);

        Animation traslate = AnimationUtils.loadAnimation(this, R.anim.translate);
        tvTitulo.startAnimation(traslate);

        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale);
        iv.startAnimation(scale);

        Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        rl.startAnimation(alpha);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashActivity.this,LogInActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
