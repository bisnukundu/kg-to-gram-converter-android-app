package com.example.firstbisnu;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button submit;
TextView numValue;
TextView showValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        numValue = findViewById(R.id.numValue);
        showValue = findViewById(R.id.showValue);
    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String kg = String.valueOf(numValue.getText());
            if(!kg.isEmpty()){
                int grams = Integer.parseInt(kg) * 1000;
                showValue.setText(kg + "KG = " + grams + " Gram");
              numValue.setText("");
            }else{
                Toast.makeText(getApplicationContext(), "Fist Enter KG value...", Toast.LENGTH_SHORT).show();
            }

        }
    });

    }


}