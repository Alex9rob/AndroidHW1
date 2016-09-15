package com.sasha.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void buttonBackToMainActivityOnclick(View v) {
        //Button b = (Button) v;
        onBackPressed();
    }

    public void buttonAddOnclick(View v) {
        //Button b = (Button) v;

        EditText text = (EditText)findViewById(R.id.editTextSend);
        String dd = text.getText().toString();




        Intent i = new Intent(SecondActivity.this, MainActivity.class);
        i.putExtra("data", dd);
        startActivity(i);
       // onBackPressed();
    }
  /*  @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(i);
    }*/
}
