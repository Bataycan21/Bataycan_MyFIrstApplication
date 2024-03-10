package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myName;
    TextView myDisplay;
    EditText myInput;
    Button myCLick;
    Button myClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.txtName);
        myDisplay = findViewById(R.id.txtDisplay);
        myCLick = findViewById(R.id.btnClick);
        myClear = findViewById(R.id.btnClear);
        myInput = findViewById(R.id.txtInputName);

        myCLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myInput.getText().toString();
                myDisplay.setText("Hello" + name + "!");
            }
        });
        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setText("Hello World!!");
            }
        });
    }
}