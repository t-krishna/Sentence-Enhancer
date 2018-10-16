package com.example.ana.sentenceenhancerandoidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText txt = findViewById(R.id.editText);
        final TextView txtview = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                Log.i("tag", txt.getText().toString());
                txtview.setText(txt.getText().toString());

            }
        });
    }
}
