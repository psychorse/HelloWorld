package com.kalabulka2008gmail.helloworld3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                    }
    public void clBtnPush (View v){
        Toast.makeText(getApplicationContext(), "Hello EPAM!", Toast.LENGTH_LONG).show();
    }
}
