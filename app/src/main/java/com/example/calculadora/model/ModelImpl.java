package com.example.calculadora.model;

import com.example.calculadora.interfaces.InterfacesMainActivity;

public class ModelImpl implements InterfacesMainActivity.Model {
    String num1, num2, result, operation;
    Boolean canDigitSecondNumber;

    InterfacesMainActivity.Presenter presenter;

    public ModelImpl(InterfacesMainActivity.Presenter presenter) {
        this.presenter = presenter;
        this.initValues();
    }

    @Override
    public void button0(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "0");
        else
            presenter.sendSecondNumber(num2 += "0");
    }

    @Override
    public void button1(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "1");
        else
            presenter.sendSecondNumber(num2 += "1");
    }

    @Override
    public void button2(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "2");
        else
            presenter.sendSecondNumber(num2 += "2");
    }

    @Override
    public void button3(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "3");
        else
            presenter.sendSecondNumber(num2 += "3");
    }

    @Override
    public void button4(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "4");
        else
            presenter.sendSecondNumber(num2 += "4");
    }

    @Override
    public void button5(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "5");
        else
            presenter.sendSecondNumber(num2 += "5");
    }

    @Override
    public void button6(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "6");
        else
            presenter.sendSecondNumber(num2 += "6");
    }

    @Override
    public void button7(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "7");
        else
            presenter.sendSecondNumber(num2 += "7");
    }

    @Override
    public void button8(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "8");
        else
            presenter.sendSecondNumber(num2 += "8");
    }

    @Override
    public void button9(Boolean firstNumber) {
        if(firstNumber)
            presenter.sendFirstNumber(num1 += "9");
        else
            presenter.sendSecondNumber(num2 += "9");
    }

    @Override
    public void initValues() {
        num1 = "";
        num2 = "";
        operation = "Operación";
        result = "Resultado";

        presenter.sendFirstNumber(num1);
        presenter.sendSecondNumber(num2);
        presenter.sendOperation(operation);
        presenter.sendResult(result);
    }

    @Override
    public void removeNum1LastDigit() {
        num1 = num1.substring(0, num1.length() - 1);
        presenter.sendFirstNumber(num1);
    }

    @Override
    public void removeNum2LastDigit() {
        num2 = num2.substring(0, num2.length() - 1);
        presenter.sendSecondNumber(num2);
    }

    @Override
    public void calculateResult(Boolean isInteger) {
        if(isInteger) {
            Integer intNum1 = Integer.parseInt(num1);
            Integer intNum2 = Integer.parseInt(num2);
            switch (operation) {
                case "%":
                    result = String.valueOf(intNum1 % intNum2); break;
                case "/":
                    result = String.valueOf(intNum1 / intNum2); break;
                case "*":
                    result = String.valueOf(intNum1 * intNum2); break;
                case "-":
                    result = String.valueOf(intNum1 - intNum2); break;
                case "+":
                    result = String.valueOf(intNum1 + intNum2); break;
            }
        }else {
            Float floatNum1 = Float.parseFloat(num1);
            Float floatNum2 = Float.parseFloat(num2);
            switch (operation) {
                case "%":
                    result = String.valueOf(floatNum1 % floatNum2); break;
                case "/":
                    result = String.valueOf(floatNum1 / floatNum2); break;
                case "*":
                    result = String.valueOf(floatNum1 * floatNum2); break;
                case "-":
                    result = String.valueOf(floatNum1 - floatNum2); break;
                case "+":
                    result = String.valueOf(floatNum1 + floatNum2); break;
            }
        }
        presenter.sendResult(result);
    }

    @Override
    public String getNum1() {
        return num1;
    }

    @Override
    public String getNum2() {
        return num2;
    }

    @Override
    public String getOperation() {
        return operation;
    }

    @Override
    public void canDigitSecondNumber(Boolean value) {
        canDigitSecondNumber = value;
    }

    @Override
    public void initOperation() {
        operation = "Operación";
        presenter.sendOperation(operation);
    }
}
