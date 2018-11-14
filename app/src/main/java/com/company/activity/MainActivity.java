package com.company.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        String name = editText.getText().toString();
        if(name.length() == 0) {
            editText.setError("You must enter band name");
        } else {
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("name", name);
            startActivity(intent);
        }
    }
}
