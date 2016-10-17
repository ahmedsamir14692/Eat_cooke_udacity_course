package com.example.android.trial2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void change (){
        TextView New = (TextView) findViewById(R.id.d);
        New.setText("iam not hungry");
        ImageView New2= (ImageView)findViewById(R.id.im);
        New2.setImageResource(R.drawable.after_cookie);
        LinearLayout l = (LinearLayout)findViewById(R.id.l);
        l.setBackgroundColor(Color.blue(3));
        Log.i("EnterpriseActivity.java", "Captain's Log, Stardate 43125.8. We have entered a spectacular binary star system in the Kavis Alpha sector on a most critical mission of astrophysical research.");

    }
    public void makechange (View v)
    {
        change();

    }
}
