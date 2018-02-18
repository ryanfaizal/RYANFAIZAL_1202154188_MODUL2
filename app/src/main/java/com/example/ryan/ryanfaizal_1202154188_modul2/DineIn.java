package com.example.ryan.ryanfaizal_1202154188_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    Spinner spinner;
    Button btnpesan;
    private String[] labels_array = { "MEJA 1", "MEJA 2", "MEJA 3", "MEJA 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);


        spinner = (Spinner) findViewById(R.id.label_spinner);
        btnpesan = (Button) findViewById(R.id.button3);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, labels_array);

        spinner.setAdapter(adapter);

        Toast.makeText(getApplicationContext(), "DINE IN",Toast.LENGTH_LONG).show();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(DineIn.this, "Selected "+ adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DineIn.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}
