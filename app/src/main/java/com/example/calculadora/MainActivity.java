package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadora.interfaces.InterfacesMainActivity;
import com.example.calculadora.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfacesMainActivity.View {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAC, buttonErase, buttonResult, buttonDecimal, buttonRemainder, buttonDivision,
            buttonMultiply, buttonSubstraction, buttonAddition;
    TextView textViewNum1, textViewNum2, textViewResult, textViewOperation;
    InterfacesMainActivity.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findElement();
        this.presenter = new PresenterImpl(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn0:
                presenter.pressedButton0();
                break;
            case R.id.btn1:
                presenter.pressedButton1();
                break;
            case R.id.btn2:
                presenter.pressedButton2();
                break;
            case R.id.btn3:
                presenter.pressedButton3();
                break;
            case R.id.btn4:
                presenter.pressedButton4();
                break;
            case R.id.btn5:
                presenter.pressedButton5();
                break;
            case R.id.btn6:
                presenter.pressedButton6();
                break;
            case R.id.btn7:
                presenter.pressedButton7();
                break;
            case R.id.btn8:
                presenter.pressedButton8();
                break;
            case R.id.btn9:
                presenter.pressedButton9();
                break;
            case R.id.buttonAC:
                presenter.pressedButtonAC();
                break;
            case R.id.buttonErase:
                presenter.pressedButtonEraseLastDigit();
                break;
            case R.id.buttonResult:
                presenter.pressedButtonResult();
                break;
            case R.id.buttonDecimal:
                presenter.pressedButtonDecimal();
                break;
            case R.id.buttonRemainder:
                presenter.pressedButtonRemainder();
                break;
            case R.id.buttonDivision:
                presenter.pressedButtonDivision();
                break;
            case R.id.buttonMultiply:
                presenter.pressedButtonMultiply();
                break;
            case R.id.buttonSubstraction:
                presenter.pressedButtonSubstraction();
                break;
            case R.id.buttonAddition:
                presenter.pressedButtonAddition();
                break;
        }
    }

    @Override
    public void findElement() {
        button0 = findViewById(R.id.btn0);
        button0.setOnClickListener(this);

        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(this);

        button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(this);

        button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(this);

        button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(this);

        button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(this);

        button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(this);

        button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(this);

        button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(this);

        buttonAC = findViewById(R.id.buttonAC);
        buttonAC.setOnClickListener(this);

        buttonErase = findViewById(R.id.buttonErase);
        buttonErase.setOnClickListener(this);

        buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);

        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonDecimal.setOnClickListener(this);

        buttonRemainder = findViewById(R.id.buttonRemainder);
        buttonRemainder.setOnClickListener(this);

        buttonDivision = findViewById(R.id.buttonDivision);
        buttonDivision.setOnClickListener(this);

        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(this);

        buttonSubstraction = findViewById(R.id.buttonSubstraction);
        buttonSubstraction.setOnClickListener(this);

        buttonAddition = findViewById(R.id.buttonAddition);
        buttonAddition.setOnClickListener(this);

        textViewNum1 = (TextView) findViewById(R.id.num1);
        textViewNum2 = (TextView) findViewById(R.id.num2);
        textViewResult = (TextView) findViewById(R.id.resultado);
        textViewOperation = (TextView) findViewById(R.id.operacion);
    }

    @Override
    public void updateFirstNumber(String num1View) {
        textViewNum1.setText(num1View);
    }

    @Override
    public void updateSecondNumber(String num2View) {
        textViewNum2.setText(num2View);
    }

    @Override
    public void updateResult(String resultView) {
        textViewResult.setText(resultView);
    }

    @Override
    public void updateOperation(String operation) {
        textViewOperation.setText(operation);
    }
}