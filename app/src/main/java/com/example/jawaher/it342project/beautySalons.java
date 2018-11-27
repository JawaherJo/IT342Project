package com.example.jawaher.it342project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class beautySalons extends AppCompatActivity {


    int[] images={R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image, R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image};
    String[] SalonsName={"مشغل شيفون","مشغل درة نواعم","مشغل فربينيا","مشغل شيخه"
            ,"مشغل نور سين","مشغل امل","مشغل لمسات جميله","مشغل دار شهد","مشغل شور","مشغل نور"
    };

    String[] time={"مفتوح من ٣ مسادًا حتى ١١ مساءًا","مفتوح من ٣ مسادًا حتى ١١ مساءًا",
            "مفتوح من ٣ مسادًا حتى ١١ مساءًا","مفتوح من ٣ مسادًا حتى ١١ مساءًا",
            "مفتوح من ٣ مسادًا حتى ١١ مساءًا","مفتوح من ٣ مسادًا حتى ١١ مساءًا",
            "مفتوح من ٣ مسادًا حتى ١١ مساءًا"
            ,"مفتوح من ٣ مسادًا حتى ١١ مساءًا",
            "مفتوح من ٣ مسادًا حتى ١١ مساءًا","مفتوح من ٣ مسادًا حتى ١١ مساءًا"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_salons);

        ListView salonslist= (ListView) findViewById(R.id.listViewSalons);

        CustomAdapter customAdapter =new CustomAdapter();
        salonslist.setAdapter(customAdapter);

        salonslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),Services.class);
                startActivity(i);
            }
        });

    }


    class  CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view=getLayoutInflater().inflate(R.layout.salonlayout,null);

            ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_time=(TextView)view.findViewById(R.id.textView_time);
            imageView.setImageResource(images[position]);
            textView_name.setText(SalonsName[position]);
            textView_time.setText(time[position]);
            return view;
        }
    }
}
