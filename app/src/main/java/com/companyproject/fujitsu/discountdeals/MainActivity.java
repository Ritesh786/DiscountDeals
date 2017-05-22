package com.companyproject.fujitsu.discountdeals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button msigninbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msigninbtn = (Button) findViewById(R.id.signin_btn);
        msigninbtn.setOnClickListener(this);


        Spinner spinner = (Spinner) findViewById(R.id.chooselogintype);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.newstype_arrays, R.layout.textcolor);
    //    spinner.setBackgroundColor(getResources().getColor(R.color.whute));

        spinner.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this,STORELIST.class);
        startActivity(intent);

    }
}
