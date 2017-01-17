package edu.uw.tacoma.tcss422.team4.lab_git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void showElephant(View view) {
        Intent intent = new Intent(this, DisplayElephantActivity.class);
        startActivity(intent);
        Log.d(TAG, "A wild elephant appears");
    }
}
