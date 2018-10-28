package com.example.alina.last_login_ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    Button you_do_not;
    Button forgot_password;
    Button sign_up;
    Button log_in;
    FrameLayout frame_Layout3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        you_do_not = (Button) findViewById(R.id.button_You_do_not);
        forgot_password = (Button) findViewById(R.id.button_forgot_password);
        sign_up = (Button) findViewById(R.id.button_SIGN_UP);
        log_in = (Button) findViewById(R.id.button_log_in);
        frame_Layout3 = (FrameLayout) findViewById(R.id.frameLayout3);

      final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        View.OnClickListener push_you_do_not = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                you_do_not.startAnimation(animAlpha);
                sign_up.startAnimation(animAlpha);

            }
        };

        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        View.OnClickListener push_forgot_password = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgot_password.startAnimation(animRotate);

            }
        };

      final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.alpha);
        View.OnClickListener push_sign_up = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_up.startAnimation(animScale);
                you_do_not.startAnimation(animAlpha);

            }
        };

        final Animation animAlpha2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        View.OnClickListener push_frame_Layout3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame_Layout3.startAnimation(animAlpha2);

            }
        };

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.translate);
        View.OnClickListener push_log_in = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log_in.startAnimation(animTranslate);

            }
        };

        you_do_not.setOnClickListener(push_you_do_not); // присваиваем  обработчик кнопке
        forgot_password.setOnClickListener(push_forgot_password); // присваиваем  обработчик кнопке
        sign_up.setOnClickListener(push_sign_up); // присваиваем  обработчик кнопке
        log_in.setOnClickListener(push_log_in); // присваиваем  обработчик кнопке
        frame_Layout3.setOnClickListener(push_frame_Layout3); // присваиваем  обработчик кнопке




    };

}