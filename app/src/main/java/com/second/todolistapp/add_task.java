package com.second.todolistapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class add_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_add);

        EditText editText = findViewById(R.id.editText);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskResult = editText.getText().toString();

                Intent resultIntent = new Intent();
                resultIntent.putExtra("taskResult", taskResult);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
