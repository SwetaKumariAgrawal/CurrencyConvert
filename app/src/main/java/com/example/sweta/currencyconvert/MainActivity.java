package com.example.sweta.currencyconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view)
    {
        EditText ed=(EditText)findViewById(R.id.ed1);
        String s=ed.getText().toString();
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("message",s);
        startActivity(i);
    }
}
