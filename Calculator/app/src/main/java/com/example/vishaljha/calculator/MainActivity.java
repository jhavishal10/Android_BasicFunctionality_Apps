package com.example.vishaljha.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;

    TextView textView;
    TextView textView1;
    int i = 0;
    String str = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder al = new AlertDialog.Builder(this);
        al.setIcon(R.drawable.ic_launcher_background);
        al.setTitle("welcome");
        al.setMessage("this is not build by professional so answers may vary at some extent");
        al.setPositiveButton("yes", null);
        al.setNegativeButton("no", null);
        al.setCancelable(false);
        al.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        al.show();

        textView = findViewById(R.id.txtInput);
        textView1 = findViewById(R.id.txtSolution);
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonDivision = (Button) findViewById(R.id.btnDivide);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonMul = (Button) findViewById(R.id.btnMultiply);
        buttonSub = (Button) findViewById(R.id.btnSubtract);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        button10.setOnClickListener(this);
        buttonC.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn0: {
                textView.setText(textView.getText() + "0");
                str = textView.getText().toString();
                i = Integer.parseInt(str);
                break;
            }
            case R.id.btn1: {

                textView.setText(textView.getText() + "1");
                break;
            }
            case R.id.btnAdd: {

                textView.setText("+");
                textView1.setText(i);
                break;
            }

        }
    }
}


