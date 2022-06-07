package com.example.scrolltextimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private boolean isVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "inside onCreate method");
    }

    public void showHideImage(View view) {
        Log.d(TAG, "inside showHideImage method");
        ImageView imageView = findViewById(R.id.image_law);


        if(isVisible) {
            imageView.setVisibility(View.INVISIBLE);
            imageView.setImageDrawable(null);
            Log.d(TAG, "hid the image");
        }
        else {
            imageView.setImageDrawable(getDrawable(R.drawable.law));
            imageView.setVisibility(View.VISIBLE);
            Log.d(TAG, "showed the image");
        }
        isVisible = !isVisible;
        Log.d(TAG, "end of showHideImage method");
    }
}