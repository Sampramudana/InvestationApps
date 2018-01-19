package com.pramudana.sam.investationapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInvest;
    Button btnCount;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInvest = (EditText)findViewById(R.id.etInvest);
        btnCount = (Button)findViewById(R.id.btnCount);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sInvest = etInvest.getText().toString();
                Double dInvest = Double.parseDouble(sInvest);
                Double bunga = 0.027;
                Double hasil = dInvest * bunga;
                Double result = (dInvest * bunga) * 2;

                txtResult.setText("Investation Point in 1 Year is : " + hasil + " Invetation Point In 2 Year : " + result);
            }
        });
    }
}
