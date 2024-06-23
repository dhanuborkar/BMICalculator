 package com.example.ibmcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Result;
        EditText editHeightFt,editWeight,editHeightIn;
        Button txtresult;
        LinearLayout llMain;

        editWeight = findViewById(R.id.editWeight) ;
        editHeightFt = findViewById(R.id.editHeightF);
        editHeightIn = findViewById(R.id.editHeightI);
        txtresult = findViewById(R.id.txtResult);
        Result = findViewById(R.id.Result);
        llMain = findViewById(R.id.llMain);

        txtresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(editWeight.getText().toString());
                int htF = Integer.parseInt(editHeightFt.getText().toString());
                int htI = Integer.parseInt(editHeightIn.getText().toString());

                int totalIn = htF*12 + htI;

                double totalCm = totalIn/100;

                double totalM = totalCm/100;

                double bmi = wt/(totalM*totalM);


                if(bmi>25)
                {
                    Result.setText("You're OverWeight!");
                   Result.setBackgroundColor(getResources().getColor(R.color.OverWt));
                } else if (bmi<18) {
                    Result.setText("You're UnderWeight!");
                    Result.setBackgroundColor(getResources().getColor(R.color.UnderWt));
                } else{
                    Result.setText("You're Healthy!");
                    Result.setBackgroundColor(getResources().getColor(R.color.Healthy));
                }

            }
        });









    }
}