package com.example.testapp;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ComponentActivity {
    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentsSpinner = findViewById(R.id.studentsSpinner);

        //Now, the data has been passed aesthetically using strings.xml instead of dynamically in here

//        final ArrayList<String> students = new ArrayList<>();
//        students.add("Mario");
//        students.add("Brad");
//        students.add("Sarah");
//        students.add("Madeline");
//        students.add("Tom");
//
//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
//                this, android.R.layout.simple_spinner_dropdown_item,
//                students
//        );
//        studentsSpinner.setAdapter(studentsAdapter);

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, studentsSpinner.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //Although we cannot change the object iself after making it final, we can use all of the functions within the object.
        final ArrayList<String> cities = new ArrayList<>();
        cities.add("Zurich");
        cities.add("New York");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("Madrid");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities

        );
        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}