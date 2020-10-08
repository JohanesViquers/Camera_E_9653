package com.example.camera_e_9653;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Camera mCamera = null;
    private CameraView mCameraView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mCamera = Camera.open();
        }catch (Exception e){
            Log.d(TAG "Error", "Failed to get Camera" + e.getMessage());
        }
        if (mCamera !=null);
        mCameraView = new CameraView(this,mCamera);
        FrameLayout camera_view = (FrameLayout) findViewById(R.id.FLCamera);
        camera_view.addView(mCameraView);
    }

    ImageButton imageClose = (ImageButton) findViewById(R.id.imgClose);
    imageClose.setOnClickListener(())
}