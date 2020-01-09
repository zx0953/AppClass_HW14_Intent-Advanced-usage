package com.example.appclass_hw14_intent_advanced_usage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BtnCallOnclick(View view){
        Log.d("Rui","Make call");

        Intent phoneIntent = new Intent(Intent.ACTION_DIAL );
        phoneIntent.setData(Uri.parse("tel:91-800-001-0101"));

        try {
            startActivity(phoneIntent);
            finish();
            Log.d("Rui","Finished making a call...");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this,
                    "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
        }

    }
    public void btnMapOnClick(View view){
        Uri gmmIntentUri = Uri.parse("geo:24.144263, 120.732050");  //這是勤益
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public  void btnGoogle(View view){
        Intent googleIntent = new Intent(Intent.ACTION_VIEW);
        googleIntent.setData(Uri.parse("http://www.google.com"));
        startActivity(googleIntent);
    }
}

