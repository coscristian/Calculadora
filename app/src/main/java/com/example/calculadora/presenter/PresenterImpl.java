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
            model.button0(false);
    }

    @Override
    public void pressedButton2() {

    }

    @Override
    public void pressedButton3() {

    }

    @Override
    public void pressedButton4() {

    }

    @Override
    public void pressedButton5() {

    }

    @Override
    public void pressedButton6() {

    }

    @Override
    public void pressedButton7() {

    }

    @Override
    public void pressedButton8() {

    }

    @Override
    public void pressedButton9() {

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
