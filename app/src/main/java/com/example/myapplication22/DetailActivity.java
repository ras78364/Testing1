package com.example.myapplication22;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get layout name from intent
        String layoutName = getIntent().getStringExtra("layoutName");

        // Get the layout resource ID
        int layoutId = getResources().getIdentifier(layoutName, "layout", getPackageName());

        // Set the layout
        if (layoutId != 0) {
            setContentView(layoutId);
        } else {
            setContentView(R.layout.activity_main); // fallback
        }

        // Enable action bar back arrow (optional if you're using the system action bar)
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Back arrow ImageView inside the layout
        ImageView backArrow = findViewById(R.id.backArrow);
        if (backArrow != null) {
            backArrow.setOnClickListener(v -> finish()); // Go back to MainActivity
        }
    }

    // Handle action bar back press
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
