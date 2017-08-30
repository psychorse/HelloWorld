package com.kalabulka2008gmail.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPush;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPush = (Button) findViewById(R.id.btnPush);

        View.OnClickListener oclBtnPush = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello EPAM!", Toast.LENGTH_LONG).show();
            }
        };
        btnPush.setOnClickListener(oclBtnPush);
    }
}
