package com.example.mydecisionhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.design.widget.Snackbar;


import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private String[] listChoices;
    String decision;

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
                decision = makeDecision();
                goToDecision(decision);
            }
        });
    }

    private void getChoices(EditText editText){
        String text = editText.getText().toString();
        Log.d("Input",text);
        listChoices = text.split("\n");
    }

    public String[] getListChoices(){
        return listChoices;
    }

    private String makeDecision(){
        int len = listChoices.length;
        int random = (int) (Math.random() * len);
        return listChoices[random];
    }

    private void goToDecision(String decision) {
        Snackbar mySnackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout), decision, Snackbar.LENGTH_LONG);
        mySnackbar.show();
    }
}
