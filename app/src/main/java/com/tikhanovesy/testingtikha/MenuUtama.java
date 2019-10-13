package com.tikhanovesy.testingtikha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
private Button btnBelajar;
private Button btnBermain;
private Button btnKuis;
private Button btnKeluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnBelajar = findViewById(R.id.menuBelajar);
        btnBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MenuUtama.this, MenuBelajar.class);
                startActivity(next);
            }
        });
        btnBermain = findViewById(R.id.menuBermain);
        btnBermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MenuUtama.this, MenuBermain.class);
                startActivity(next);
            }
        });
        btnKuis = findViewById(R.id.menuKuis);
        btnKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MenuUtama.this, MenuKuis.class);
                startActivity(next);
            }
        });

        btnKeluar = findViewById(R.id.menuKeluar);
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
