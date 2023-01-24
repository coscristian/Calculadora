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
            buttonAC, buttonErase, buttonResult;
    Boolean canDigitSecondNumber;

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

            case R.id.buttonAC:
                presenter.pressedButtonAC();
                break;
            case R.id.buttonErase:
                presenter.pressedButtonEraseLastDigit();
                break;
            case R.id.buttonResult:
                presenter.pressedButtonResult();
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

        textViewNum1 = (TextView) findViewById(R.id.num1);
        textViewNum2 = (TextView) findViewById(R.id.num2);
        textViewResult = (TextView) findViewById(R.id.resultado);
        textViewOperation = (TextView) findViewById(R.id.operacion);
/*
        Clase anonima ya que View.OnClickListener es una interface y se le da un cuerpo
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1Vista.isEmpty() || canDigitSecondNumber)
                    num1Vista += "0";
                else
                    num2Vista += "0";
                updateView();
            }
        }); */
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

    public void presionadoPunto(View vista) {
        if(!this.num1Vista.isEmpty() && !this.num1Vista.contains(".")) {
            this.num1Vista += ".";
            updateView();
        }

        if (!this.num2Vista.isEmpty() && !this.num2Vista.contains(".")) {
            this.num2Vista += ".";
            updateView();
        }
    }

    public void presionadoBoton0(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "0";
        else
            this.num2Vista += "0";
        updateView();
    }

    public void presionadoBoton1(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "1";
        else
            this.num2Vista += "1";
        updateView();
    }

    public void presionadoBoton2(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "2";
        else
            this.num2Vista += "2";
        updateView();
    }

    public void presionadoBoton3(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "3";
        else
            this.num2Vista += "3";
        updateView();
    }

    public void presionadoBoton4(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "4";
        else
            this.num2Vista += "4";
        updateView();
    }

    public void presionadoBoton5(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "5";
        else
            this.num2Vista += "5";
        updateView();
    }

    public void presionadoBoton6(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "6";
        else
            this.num2Vista += "6";
        updateView();
    }

    public void presionadoBoton7(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "7";
        else
            this.num2Vista += "7";
        updateView();
    }

    public void presionadoBoton8(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "8";
        else
            this.num2Vista += "8";
        updateView();
    }

    public void presionadoBoton9(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "9";
        else
            this.num2Vista += "9";
        updateView();
    }

    public void presionadoModulo(View vista) {
        if (!this.num1Vista.isEmpty()){
            this.operacion = "%";
            updateView();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoDiv(View vista) {
        if (!this.num1Vista.isEmpty()){
            this.operacion = "/";
            updateView();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoMult(View vista) {
        if (!this.num1Vista.isEmpty()) {
            this.operacion = "*";
            updateView();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoResta(View vista) {
        if (!this.num1Vista.isEmpty()){
            this.operacion = "-";
            updateView();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoSuma(View vista) {
        if (!this.num1Vista.isEmpty()) {
            this.operacion = "+";
            canDigitSecondNumber = true;
            updateView();
        }
    }
}