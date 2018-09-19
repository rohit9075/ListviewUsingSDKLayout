package com.rohit.listview;

import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // namelist to store the list of the name
        List<String> nameList = new ArrayList<>();

        // adding the constant name in the list
        for (int i = 0; i < 30; i++) {
            nameList.add("ABC");
        }


        // creating the arrayadapter object

         ArrayAdapter<String> adapter = new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1, nameList );

        // getting the reference of the listview
        ListView listView = findViewById(R.id.listview);

        // assigning the data to the listView
        listView.setAdapter(adapter);

        // Handling the click event on the listItem.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String list1 = parent.getAdapter().getItem(position).toString();
              Toast.makeText(MainActivity.this, "Tapped at Position  "  + position +  " " + "Name: " +list1, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
