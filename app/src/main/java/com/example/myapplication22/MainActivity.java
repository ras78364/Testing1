package com.example.myapplication22;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] bookList = {
            "Health and Dietary System",
            "Mental Health",
            "Sports",
            "Religious Studies",
            "Self Development",
            "History and Politics",
            "Literature and Novels",
            "Management and Entrepreneurship",
            "Various Books"
    };

    String[] layoutNames = {
            "health_and_dietary_system",
            "mental_health",
            "sports",
            "religious_studies",
            "self_development",
            "history_and_politics",
            "literature_and_novels",
            "management_and_entrepreneurship",
            "various_books"
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.List1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bookList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("layoutName", layoutNames[position]);
                startActivity(intent);
            }
        });
    }
}
