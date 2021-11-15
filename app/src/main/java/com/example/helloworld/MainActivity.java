package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView)findViewById(R.id.text));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the color of the text
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.slate_gray));
            }
        });
        // User can tap on a button to change the background color
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the color of the background
                findViewById((R.id.parent)).setBackgroundColor(getResources().getColor(R.color.pale_sky));
            }
        });
        // User can tap a button to change the text string of the label
        findViewById(R.id.changeTextButton).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        }));
        // USer can tap on the background to reset all views
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Reset the text
                textView.setText("Hello from Quan!");
                // 2. Reset the text color
                textView.setTextColor(getResources().getColor(R.color.black));
                // 3. Reset the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.cararra));
            }
        });
        // User can tap the button to update label
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}