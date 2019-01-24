package com.example.mydecisionhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button decisionPage = findViewById(R.id.button);
        decisionPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDecisionsPage();
            }
        });
    }

    private void goToDecisionsPage(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
