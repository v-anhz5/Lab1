package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CompleteProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);

        // Nút để hoàn tất hồ sơ và quay lại màn hình Home
        Button btnCompleteProfile = findViewById(R.id.btnCompleteProfile);
        btnCompleteProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompleteProfileActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Đóng Activity hiện tại để không quay lại được khi nhấn nút back
            }
        });
    }
}
