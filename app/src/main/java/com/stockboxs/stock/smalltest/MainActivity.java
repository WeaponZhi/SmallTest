package com.stockboxs.stock.smalltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.btn);
        mButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("main",MainActivity.this);
            }
        });
    }
}
