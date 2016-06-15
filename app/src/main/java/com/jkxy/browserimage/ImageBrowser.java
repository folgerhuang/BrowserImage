package com.jkxy.browserimage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageBrowser extends Activity {
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iv=new ImageView(this);
        iv.setImageURI(getIntent().getData());
        setContentView(iv);
    }
}
