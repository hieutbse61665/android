package com.example.hieuniverse.cjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;



public class Albums extends AppCompatActivity {

    private Button btn_AddAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


        btn_AddAlbum = (Button) findViewById(R.id.btn_AddAlbum);
        btn_AddAlbum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openAddAlbum();
            }
        });
    }

    private void openAddAlbum() {
        Intent intent = new Intent(this, AddAlbum.class);
        startActivity(intent);
    }

}
