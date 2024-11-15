package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        // Nút "Thêm vào giỏ hàng" (nếu cần)
        Button buttonAddToCart = findViewById(R.id.btnAddToCart);
        buttonAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý thêm sản phẩm vào giỏ hàng (nếu cần)
            }
        });

        // Nút chuyển sang trang hoàn thành hồ sơ
        Button buttonToCompleteProfile = findViewById(R.id.btnToCompleteProfile);
        buttonToCompleteProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetailActivity.this, CompleteProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
