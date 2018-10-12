package com.example.hieuniverse.cjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tasks extends AppCompatActivity {
    private ImageView imgv_detailTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        imgv_detailTask = (ImageView) findViewById(R.id.imageView11);
        imgv_detailTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailTask();
            }
        });
    }

    private void openDetailTask(){
        Intent intent = new Intent(this,TaskDetail.class);
        startActivity(intent);
    }
}
