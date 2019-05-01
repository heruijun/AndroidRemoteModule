package com.example.modulemain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    /**
     * toA
     */
    private Button mModulemainA;
    /**
     * toB
     */
    private Button mModulemainB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulemain_activity_main);
        initView();
        initEvent();
    }

    private void initEvent() {
        mModulemainA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/modulea/activity").navigation();
            }
        });

        mModulemainB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/moduleb/activity").withString("key", "传递的数据").navigation();
            }
        });
    }

    private void initView() {
        mModulemainA = findViewById(R.id.modulemain_a);
        mModulemainB = findViewById(R.id.modulemain_b);
    }
}
