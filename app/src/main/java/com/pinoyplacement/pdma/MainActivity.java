package com.pinoyplacement.pdma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String strMessage=getString(R.string.message_intro);

        Toast.makeText(MainActivity.this,strMessage,Toast.LENGTH_LONG).show();
    }
}
