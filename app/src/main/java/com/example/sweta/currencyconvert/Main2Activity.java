package com.example.sweta.currencyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String info=getIntent().getExtras().getString("message");
        Double num=Double.parseDouble(info);

        Double dollar=num/64.84;
        Double Euro=num/80.066;
        Double pound=num/90.64;
        Double yen=num/0.605;
        EditText ed1=(EditText)findViewById(R.id.dollar);
        EditText ed2=(EditText)findViewById(R.id.euro);
        EditText ed3=(EditText)findViewById(R.id.pound);
        EditText ed4=(EditText)findViewById(R.id.yen);
        ed1.setText(dollar.toString()+" dollar");
        ed2.setText(Euro.toString()+" euro");
        ed3.setText(pound.toString()+" pound");
        ed4.setText(yen.toString()+" yen");
    }
}
