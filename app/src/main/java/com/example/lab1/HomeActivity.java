package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Giả sử bạn có nút để mở ProductDetailActivity
        Button btnOpenProductDetail = findViewById(R.id.btnOpenProductDetail);
        btnOpenProductDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}