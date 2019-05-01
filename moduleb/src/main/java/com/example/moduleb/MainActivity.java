package com.example.moduleb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/moduleb/activity")
public class MainActivity extends AppCompatActivity {

    @Autowired(name = "key")
    String data;
    /**
     * TextView
     */
    private TextView mTextViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleb_activity_main);
        ARouter.getInstance().inject(this);
        initView();
    }

    private void initView() {
        mTextViewB = findViewById(R.id.textViewB);
        mTextViewB.setText(data);
    }
}
