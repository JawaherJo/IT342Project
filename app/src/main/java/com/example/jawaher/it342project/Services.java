package com.example.jawaher.it342project;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class Services extends AppCompatActivity {


    TextView textView;
    Button button;
    Calendar c;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        textView = (TextView) findViewById( R.id.textViewTD );
        button = (Button) findViewById( R.id.btnDateTime );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = Calendar.getInstance();
                int day = c.get( Calendar.DAY_OF_MONTH );
                int month = c.get( Calendar.MONTH );
                int year = c.get( Calendar.YEAR );

                dpd = new DatePickerDialog( Services.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        textView.setText( mDay + "/" + (mMonth + 1) + "/" + mYear );
                    }
                }, day, month, year );
                dpd.show();


            }
        } );
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
