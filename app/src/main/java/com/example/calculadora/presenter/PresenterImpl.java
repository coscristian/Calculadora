package com.example.calculadora.presenter;

import com.example.calculadora.interfaces.InterfacesMainActivity;
import com.example.calculadora.model.ModelImpl;

public class PresenterImpl implements InterfacesMainActivity.Presenter {

    private final Boolean FIRST_NUMBER = true;

    InterfacesMainActivity.View view;
    InterfacesMainActivity.Model model;

    public PresenterImpl(InterfacesMainActivity.View view) {
        this.view = view;
        this.model = new ModelImpl(this);
    }

    @Override
    public void pressedButton0() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button0(FIRST_NUMBER);
        else
            model.button0(false);
    }

    @Override
    public void pressedButton1() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button1(FIRST_NUMBER);
        else
            model.button1(false);
    }

    @Override
    public void pressedButton2() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button2(FIRST_NUMBER);
        else
            model.button2(false);
    }

    @Override
    public void pressedButton3() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button3(FIRST_NUMBER);
        else
            model.button3(false);
    }

    @Override
    public void pressedButton4() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button4(FIRST_NUMBER);
        else
            model.button4(false);
    }

    @Override
    public void pressedButton5() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button5(FIRST_NUMBER);
        else
            model.button5(false);
    }

    @Override
    public void pressedButton6() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button6(FIRST_NUMBER);
        else
            model.button6(false);
    }

    @Override
    public void pressedButton7() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button7(FIRST_NUMBER);
        else
            model.button7(false);
    }

    @Override
    public void pressedButton8() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button8(FIRST_NUMBER);
        else
            model.button8(false);
    }

    @Override
    public void pressedButton9() {
        if (model.getNum1().isEmpty() || model.getOperation().contains("Operación"))
            model.button9(FIRST_NUMBER);
        else
            model.button9(false);
    }

    @Override
    public void pressedButtonAC() {
        model.initValues();
    }

    @Override
    public void pressedButtonEraseLastDigit() {
        if(!model.getNum2().isEmpty())
            model.removeNum2LastDigit();
        else if(!model.getNum1().isEmpty())
            model.removeNum1LastDigit();

        if(model.getNum2().isEmpty())
            model.initOperation();
    }

    @Override
    public void pressedButtonResult() {
        String num1 = model.getNum1();
        String num2 = model.getNum2();
        String operation = model.getOperation();

        if(!num1.isEmpty() && !num2.isEmpty() && !operation.contains("Operación")) {
            model.calculateResult(!num1.contains(".") && !num2.contains("."));
            model.avoidInputSecondNumber();
        }
    }

    @Override
    public void pressedButtonDecimal() {
        String num1 = model.getNum1();
        String num2 = model.getNum2();

        if(!num1.isEmpty() && !num1.contains(".")) {
            model.addDecimalFirstNumber();
        }

        if (!num2.isEmpty() && !num2.contains(".")) {
            model.addDecimalSecondNumber();
        }
    }

    @Override
    public void pressedButtonRemainder() {
        if (!model.getNum1().isEmpty()){
            model.setRemainderOperation();
            model.allowInputSecondNumber();
        }
    }

    @Override
    public void pressedButtonDivision() {
        if (!model.getNum1().isEmpty()){
            model.setDivisionOperation();
            model.allowInputSecondNumber();
        }
    }

    @Override
    public void pressedButtonMultiply() {
        if (!model.getNum1().isEmpty()) {
            model.setMultiplyOperation();
            model.allowInputSecondNumber();
        }
    }

    @Override
    public void pressedButtonSubstraction() {
        if (!model.getNum1().isEmpty()){
            model.setSubstractionOperation();
            model.allowInputSecondNumber();
        }
    }

    @Override
    public void pressedButtonAddition() {
        if (!model.getNum1().isEmpty()) {
            model.setAdditionOperation();
            model.allowInputSecondNumber();
        }
    }

    @Override
    public void sendFirstNumber(String num1) {
        view.updateFirstNumber(num1);
    }

    @Override
    public void sendSecondNumber(String num2) {
        view.updateSecondNumber(num2);
    }

    @Override
    public void sendResult(String result) {
        view.updateResult(result);
    }

    @Override
    public void sendOperation(String operation) {
        view.updateOperation(operation);
    }
}
