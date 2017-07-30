package com.example.trantung.hoclistviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.trantung.adapter.DanhBaAdapter;
import com.example.trantung.model.DanhBa;

import java.util.ArrayList;
import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhBa;
    ArrayList<DanhBa>dsDanhBa;
    DanhBaAdapter danhBaAdapter;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControls();
        addEvents();
    }

    private void addControls() {
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);
        dsDanhBa = new ArrayList<>();
        dsDanhBa.add(new DanhBa(1, "Tran Van Tung", "0168729565"));
        dsDanhBa.add(new DanhBa(2, "Nguyen Van B", "0123876493"));
        dsDanhBa.add(new DanhBa(3, "Bui The C", "098123354"));

        danhBaAdapter= new DanhBaAdapter(MainActivity.this, R.layout.item, dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);
    }

    private void addEvents() {
    }
}
