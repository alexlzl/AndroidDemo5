package com.example.lzl.mdanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.test_ll);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator revealAnimator = ObjectAnimator.ofFloat( //缩放X 轴的
                        ll, "scaleX", 0, 5000);
                ObjectAnimator revealAnimator1 = ObjectAnimator.ofFloat(//缩放Y 轴的
                        ll, "scaleY", 0, 5000);
                AnimatorSet set = new AnimatorSet();
                set.setDuration(5000);//设置播放时间
                set.setInterpolator(new LinearInterpolator());//设置播放模式，这里是平常模式
                set.playTogether(revealAnimator, revealAnimator1);//设置一起播放
                set.start();
            }
        });
    }
}
