package com.example.calculadora.interfaces;

public interface InterfacesMainActivity {
    interface View {
        public void findElement();
        public void updateFirstNumber(String num1View);
        public void updateSecondNumber(String num2View);
        public void updateResult(String resultView);
        public void updateOperation(String operation);
    }

    interface Presenter {
        public void pressedButton0();
        public void pressedButton1();
        public void pressedButton2();
        public void pressedButton3();
        public void pressedButton4();
        public void pressedButton5();
        public void pressedButton6();
        public void pressedButton7();
        public void pressedButton8();
        public void pressedButton9();
        public void pressedButtonAC();
        public void pressedButtonEraseLastDigit();
        public void pressedButtonResult();
        public void pressedButtonDecimal();
        public void pressedButtonRemainder();
        public void pressedButtonDivision();
        public void pressedButtonMultiply();
        public void pressedButtonSubstraction();
        public void pressedButtonAddition();
        public void sendFirstNumber(String num1);
        public void sendSecondNumber(String num2);
        public void sendResult(String result);
        public void sendOperation(String operation);
    }

    interface Model {
        public void button0(Boolean firstNumber);
        public void button1(Boolean firstNumber);
        public void button2(Boolean firstNumber);
        public void button3(Boolean firstNumber);
        public void button4(Boolean firstNumber);
        public void button5(Boolean firstNumber);
        public void button6(Boolean firstNumber);
        public void button7(Boolean firstNumber);
        public void button8(Boolean firstNumber);
        public void button9(Boolean firstNumber);
        public void initValues();
        public void removeNum1LastDigit();
        public void removeNum2LastDigit();
        public void addDecimalFirstNumber();
        public void addDecimalSecondNumber();
        public void calculateResult(Boolean isInteger);
        public String getNum1();
        public String getNum2();
        public String getOperation();
        public void allowInputSecondNumber();
        public void avoidInputSecondNumber();
        public void initOperation();
        public void setRemainderOperation();
        public void setAdditionOperation();
        public void setSubstractionOperation();
        public void setMultiplyOperation();
        public void setDivisionOperation();
    }
}
