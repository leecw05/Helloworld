package com.cookandroid.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Button button1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  /*      button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_SHORT).show(); }
        });
*/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }
}
