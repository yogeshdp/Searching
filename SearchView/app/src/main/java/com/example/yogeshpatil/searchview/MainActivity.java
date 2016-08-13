package com.example.yogeshpatil.searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    ListView listView;
    SearchView sv;

    String[] myFriends={"Yogesh","Ashok","Asha","Aarya","Abhijit","Ashwini","Kamini","Pallu","Shobha","Kalpana","Vilas","Suresh"
    ,"Dilip","Indubai","Shivram","Vinu","Sagar","Kundan","Dipak"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);
        sv = (SearchView) findViewById(R.id.searchView);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriends);

        listView.setAdapter(arrayAdapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });


    }
}
