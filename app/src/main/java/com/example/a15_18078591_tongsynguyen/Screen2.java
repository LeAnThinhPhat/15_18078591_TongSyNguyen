package com.example.a15_18078591_tongsynguyen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2 extends AppCompatActivity {
    private ImageView imageView;
    private TextView tvName;
    private TextView tvPrice;

    private ImageButton imgMinus;
    private ImageButton imgAdd;
    private TextView tvQuan;
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        imageView = findViewById(R.id.imagesB);
        tvName = findViewById(R.id.tvNameB);
        tvPrice = findViewById(R.id.tvPriceB);

        imgMinus = findViewById(R.id.imgButMinus);
        imgAdd = findViewById(R.id.imgButAdd);
        tvQuan = findViewById(R.id.tvQuanB);
        btnAdd = findViewById(R.id.btnAdd);
        Intent intent = getIntent();
        com.example.a17_18078681_leanthinhphat.Coffee coffee = (com.example.a17_18078681_leanthinhphat.Coffee) intent.getSerializableExtra("coffee");

        imageView.setBackgroundResource(coffee.getImagesCoffee());
        tvName.setText(coffee.getNameCoffee());
        tvPrice.setText(coffee.getPriceCoffee()+"$");

        imgMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl = Integer.parseInt(tvQuan.getText().toString());
                if(sl < 1){
                    tvQuan.setText("0");
                }else{
                    sl--;
                    tvQuan.setText(String.valueOf(sl));
                }
            }
        });
        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl = Integer.parseInt(tvQuan.getText().toString());
                sl++;
                tvQuan.setText(String.valueOf(sl));
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen2.this, com.example.a17_18078681_leanthinhphat.Screen1.class);
                startActivity(intent);
            }
        });
    }
}