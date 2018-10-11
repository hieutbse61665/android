package com.example.hieuniverse.cjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button btn_AllAlbums;
    private Button btn_AddAlbum;
    private Button btn_AllTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_AllAlbums = (Button) findViewById(R.id.btn_AllAlbums);
        btn_AllAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlbums();
            }
        });

        btn_AddAlbum = (Button) findViewById(R.id.btn_AddAlbum);
        btn_AddAlbum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openAddAlbum();
            }
        });

        btn_AllTasks = (Button) findViewById(R.id.btn_AllTasks);
        btn_AllTasks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openTasks();
            }
        });
    }

    private void openAlbums(){
        Intent intent = new Intent(this, Albums.class);
        startActivity(intent);
    }

    private void openAddAlbum() {
        Intent intent = new Intent(this, AddAlbum.class);
        startActivity(intent);
    }

    private void openTasks() {
        Intent intent = new Intent(this, Tasks.class);
        startActivity(intent);
    }


}