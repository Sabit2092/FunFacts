package com.issakhangmail.sabit.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private FactBook FactBooks = new FactBook();
    private ColorWheel ColorPicker = new ColorWheel();
    private TextView mFactTextView;
    private Button mButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mButton.setTextColor(Color.GREEN);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = FactBooks.getmFacts();
                int color = ColorPicker.getColor();
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mButton.setTextColor(color);
            }
        };

        mButton.setOnClickListener(listener);

        //Toast.makeText(MainActivity.this, "Hey, i finish this course", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are logging from onCreate() Method");
    }
}
