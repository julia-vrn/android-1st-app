package com.example.lavague.firstapp1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button nupp;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nupp = findViewById(R.id.Loomad);
        nupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://tallinnzoo.ee";
                Intent zoo = new Intent(Intent.ACTION_VIEW);
                zoo.setData(Uri.parse(url));
                startActivity(zoo);
            }
        });
    }

    public void vajutus(View view) {
        Intent pildid = new Intent(MainActivity.this, PildidActivity.class);
        startActivity(pildid);
        message("Changed views");
        Log.i(TAG,  "Changed the view");
    }

// using TOAST to show messages to a user
    public void message(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
