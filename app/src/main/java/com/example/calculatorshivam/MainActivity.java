package com.example.calculatorshivam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private double first;
    private double second;
    private double result;
    private String operation;
    private String answer;

    private TextView textView1, textView2;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonClear, buttonBackSpace, buttonEqual, buttonAdd, buttonMultiply, buttonDivide, buttonSubtract, buttonPercent, buttonDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonClear = findViewById(R.id.buttonClear);
        buttonBackSpace = findViewById(R.id.buttonBackSpace);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonDot = findViewById(R.id.buttonDot);
        buttonPercent = findViewById(R.id.buttonPercent);


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(null);
                textView2.setText(null);

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button0.getText().toString();
                textView2.setText(text);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button1.getText().toString();
                textView2.setText(text);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button2.getText().toString();
                textView2.setText(text);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button3.getText().toString();
                textView2.setText(text);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button4.getText().toString();
                textView2.setText(text);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button5.getText().toString();
                textView2.setText(text);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button6.getText().toString();
                textView2.setText(text);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button7.getText().toString();
                textView2.setText(text);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button8.getText().toString();
                textView2.setText(text);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + button9.getText().toString();
                textView2.setText(text);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + buttonDot.getText().toString();
                textView2.setText(text);
            }
        });

        buttonBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Backspace = null;
                if (textView2.getText().length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(textView2.getText());
                    stringBuilder.deleteCharAt(textView2.getText().length() - 1);
                    Backspace = stringBuilder.toString();
                    textView2.setText(Backspace);
                }
            }
        });

        //operation for operator

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String) textView2.getText());
                primary = String.format(Locale.getDefault(), "%.2f", first);
                textView1.setText(primary);
                textView2.setText("");
                operation = "%";

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String) textView2.getText());
                primary = String.format(Locale.getDefault(), "%.2f", first);
                textView1.setText(primary);
                textView2.setText("");
                operation = "+";

            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String) textView2.getText());
                primary = String.format(Locale.getDefault(), "%.2f", first);
                textView1.setText(primary);
                textView2.setText("");
                operation = "-";

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String) textView2.getText());
                primary = String.format(Locale.getDefault(), "%.2f", first);
                textView1.setText(primary);
                textView2.setText("");
                operation = "*";

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String) textView2.getText());
                primary = String.format(Locale.getDefault(), "%.2f", first);
                textView1.setText(primary);
                textView2.setText("");
                operation = "/";

            }
        });
        //operation of Equal Button

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Double.parseDouble((String) textView2.getText());
                if (operation.equals("+")) {
                    result = first + second;
                    answer = String.format(Locale.getDefault(), "%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);

                }

                if (operation.equals("-")) {
                    result = first - second;
                    answer = String.format(Locale.getDefault(), "%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);

                }

                if (operation.equals("*")) {
                    result = first * second;
                    answer = String.format(Locale.getDefault(), "%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);

                }

                if (operation.equals("/")) {
                    result = first / second;
                    answer = String.format(Locale.getDefault(), "%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);

                }

                if (operation.equals("%")) {
                    result = first % second;
                    answer = String.format(Locale.getDefault(), "%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);

                }


            }
        });


    }
}