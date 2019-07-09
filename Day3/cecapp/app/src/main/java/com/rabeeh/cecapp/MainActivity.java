package com.rabeeh.cecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etFirst, etSecond;
    Button btnAdd, btnMinus, btnMultiply, btnDivide, btnClear;
    TextView tvResult;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.et_first);
        etSecond = findViewById(R.id.et_second);

        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnClear = findViewById(R.id.btn_clear);

        tvResult = findViewById(R.id.tv_result);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Integer.parseInt(etFirst.getText().toString());
                    b = Integer.parseInt(etSecond.getText().toString());
                    tvResult.setText(Integer.toString(a + b));
                } catch (Exception e) {
                    showErrorToast("Enter a number");
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Integer.parseInt(etFirst.getText().toString());
                    b = Integer.parseInt(etSecond.getText().toString());
                    tvResult.setText(Integer.toString(a - b));
                } catch (Exception e) {
                    showErrorToast("Enter a number");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Integer.parseInt(etFirst.getText().toString());
                    b = Integer.parseInt(etSecond.getText().toString());
                    tvResult.setText(Integer.toString(a * b));
                } catch (Exception e) {
                    showErrorToast("Enter a number");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Integer.parseInt(etFirst.getText().toString());
                    b = Integer.parseInt(etSecond.getText().toString());
                    if (b == 0) {
                        showErrorToast("Division by 0 is not possible");
                    } else {
                        tvResult.setText(Integer.toString(a / b));
                    }
                } catch (Exception e) {
                    showErrorToast("Enter a number");
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etFirst.setText("");
                etSecond.setText("");
                tvResult.setText("");
                showErrorToast("Cleared!");
            }
        });
    }

    public void showErrorToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
