package com.example.alexa.mycalculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyClass extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                TextView iv = (TextView) findViewById(R.id.textView);
                iv.setVisibility(View.VISIBLE);
            }
        });

    }
}
/**
 * Created by Alexa on 10.08.2015.
 */
