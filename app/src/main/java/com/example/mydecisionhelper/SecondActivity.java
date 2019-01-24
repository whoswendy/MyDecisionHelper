package com.example.mydecisionhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private String[] listChoices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText editText = findViewById(R.id.editText3);
        Button makeDec = findViewById(R.id.button2);
        makeDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChoices(editText);
                makeDecision();
                goToDecision();
            }
        });
    }

    private void getChoices(EditText editText){
        String text = editText.getText().toString();
        listChoices = text.split("/n");
    }

    public String[] getListChoices(){
        return listChoices;
    }

    private String makeDecision(){
        int len = listChoices.length;
        int random = (int) (Math.random() * len);
        return listChoices[random];
    }

    private void goToDecision(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
