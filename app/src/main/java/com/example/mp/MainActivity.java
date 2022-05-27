package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    //스피너에 들어가는 목록들!
    String [] items = {"동아리","과모임","소모임"};
    ArrayAdapter<String> adapter;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //board_1 화면
        setContentView(R.layout.board_1);

        spinner = findViewById(R.id.spinner);
        adapter = new ArrayAdapter<>(this,
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item,items);

        adapter.setDropDownViewResource(com.google.android.material.R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setSelection(0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
