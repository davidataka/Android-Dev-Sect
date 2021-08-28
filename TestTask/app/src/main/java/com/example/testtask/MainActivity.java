package com.example.testtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast;
    Button btnBackColour;
    EditText txtInputField;
    ConstraintLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = (Button) findViewById(R.id.btnToast);
        btnBackColour = (Button) findViewById(R.id.btnBackColour);
        txtInputField = (EditText) findViewById(R.id.txtInputField);
        myLayout = (ConstraintLayout) findViewById(R.id.myLayout);

        btnToast.setOnClickListener(this);
        btnBackColour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnToast:
                Toast.makeText(this, txtInputField.getText(), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnBackColour:
                Random rnd = new Random();
                int randomColor = Color.rgb(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
                myLayout.setBackgroundColor(randomColor);
                break;
            default:
                break;
        }
    }
}