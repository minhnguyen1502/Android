package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv_myRapper;
    private List<Icon> rappers;

    private void initSingers(){
        rappers = new ArrayList<>();
        rappers.add(new Icon(R.drawable.baseline_male_24, "Den vau"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "BinZ"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "Bray"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "Andree"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "Thai VG"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "Wowwy"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "BigDaddy"));
        rappers.add(new Icon(R.drawable.baseline_male_24, "MCK"));
        rappers.add(new Icon(R.drawable.baseline_female_24, "TLinh"));
        rappers.add(new Icon(R.drawable.baseline_female_24, "Phaos"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_myRapper = findViewById(R.id.lv_rapper);
        initSingers();

//        ArrayAdapter<String> adpater = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_expandable_list_item_1,
//                android.R.id.text1,
//                rappers );

        ListIconAdapter adpater = new ListIconAdapter(MainActivity.this, rappers);


        lv_myRapper.setAdapter(adpater);

        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);

        // Add header
        View header = inflater.inflate(R.layout.header, null, false);
        lv_myRapper.addHeaderView(header);

        // Add footer
        View footer = inflater.inflate(R.layout.footer, null, false);
        lv_myRapper.addFooterView(footer);
//
//        lv_myRapper.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i == rappers.size()+1){
//                    Toast.makeText(getApplicationContext(),"Footer", Toast.LENGTH_SHORT).show();
//                    return;
//                }if (i == 0){
//                    Toast.makeText(getApplicationContext(),"Header: ", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                int id2 = i-1;
//                Toast.makeText(getApplicationContext(),"position: "+ id2, Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, "Rapper: "+ rappers.get(id2), Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }
}