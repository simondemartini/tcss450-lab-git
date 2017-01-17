package edu.uw.tacoma.tcss422.team4.lab_git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayElephantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_elephant);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.eleph);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_elephant);
        layout.addView(imageView);

    }

}
