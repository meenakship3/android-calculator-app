package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btAdd, btSubtract, btMultiply, btDivide, btEquals, btClear;
    EditText primaryDisp, secondDisp;

    String operator;
    String currentValue = "";
    int firstOperand, secondOperand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btAdd = findViewById(R.id.btAdd);
        btSubtract = findViewById(R.id.btSubtract);
        btMultiply = findViewById(R.id.btMultiply);
        btDivide = findViewById(R.id.btDivide);
        btEquals = findViewById(R.id.btEquals);
        btClear = findViewById(R.id.btClear);

        primaryDisp = findViewById(R.id.primaryDisp);
        secondDisp = findViewById(R.id.secondDisp);

        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btSubtract.setOnClickListener(this);
        btMultiply.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btEquals.setOnClickListener(this);
        btClear.setOnClickListener(this);

        btEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = primaryDisp.getText().toString();
                primaryDisp.setText("");
                secondDisp.setText(s);
                secondOperand = Integer.parseInt(currentValue);
                if (operator != null) {
                    switch (operator) {
                        case "+":
                            add(firstOperand, secondOperand);
                            break;
                        case "-":
                            subtract(firstOperand, secondOperand);
                            break;
                        case "x":
                            multiply(firstOperand, secondOperand);
                            break;
                        case "÷":
                            divide((double)firstOperand, (double)secondOperand);
                            break;
                    }
                }
                currentValue = "";
                operator = null;
            }
        });

        btClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                primaryDisp.setText("");
                secondDisp.setText("");
                currentValue = "";
                operator = null;
                return true;
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = primaryDisp.getText().toString();
                if (!currentText.isEmpty()) {
                    String updatedText = currentText.substring(0, currentText.length() - 1);
                    primaryDisp.setText(updatedText);
                }
            }
        });
    }

    private void add(int a, int b) {
        int sum = a + b;
        primaryDisp.append(String.valueOf(sum));
        ;
    }

    private void subtract(int a, int b) {
        int diff = a - b;
        primaryDisp.append(String.valueOf(diff));
        ;
    }

    private void multiply(int a, int b) {
        int product = a * b;
        primaryDisp.append(String.valueOf(product));
        ;
    }

    private void divide(double a, double b) {
        if (b == 0) {
            Toast.makeText(getApplicationContext(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            secondDisp.setText("");
        } else {
            double quotient = a / b;
            primaryDisp.append(String.valueOf(quotient));
        }
    }

    private void setOperator(String op) {
        operator = op;
        if (!currentValue.isEmpty()) {
            firstOperand = Integer.parseInt(currentValue);
            currentValue = "";
        } else {
            firstOperand = 0;
        }
        primaryDisp.append(" " + operator + " ");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt0) {
            primaryDisp.append("0");
            currentValue += "0";
        } else if (v.getId() == R.id.bt1) {
            primaryDisp.append("1");
            currentValue += "1";
        } else if (v.getId() == R.id.bt2) {
            primaryDisp.append("2");
            currentValue += "2";
        } else if (v.getId() == R.id.bt3) {
            primaryDisp.append("3");
            currentValue += "3";
        } else if (v.getId() == R.id.bt4) {
            primaryDisp.append("4");
            currentValue += "4";
        } else if (v.getId() == R.id.bt5) {
            primaryDisp.append("5");
            currentValue += "5";
        } else if (v.getId() == R.id.bt6) {
            primaryDisp.append("6");
            currentValue += "6";
        } else if (v.getId() == R.id.bt7) {
            primaryDisp.append("7");
            currentValue += "7";
        } else if (v.getId() == R.id.bt8) {
            primaryDisp.append("8");
            currentValue += "8";
        } else if (v.getId() == R.id.bt9) {
            primaryDisp.append("9");
            currentValue += "9";
        } else if (v.getId() == R.id.btAdd) {
                setOperator("+");
        } else if (v.getId() == R.id.btSubtract) {
                setOperator("-");
        } else if (v.getId() == R.id.btMultiply) {
                setOperator("x");
        } else if (v.getId() == R.id.btDivide) {
                setOperator("÷");
        }
        }
    }