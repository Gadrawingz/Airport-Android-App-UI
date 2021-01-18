package com.example.group20assignment4;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] dataArray = {"Price", "Detail", "Item2", "Item3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting instance of Spinner
        Spinner spin = (Spinner) findViewById(R.id.g20spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter arAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, dataArray);
        spin.setAdapter(arAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
