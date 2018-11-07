package com.example.stanho.locateme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiActivity;


public class MainActivity extends AppCompatActivity {

        private static final String TAG = "MainActivity";
        private static final int ERROR_DIALOG_REQUEST = 9001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void mapButtonPressed(View view)  {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);
    }

}
