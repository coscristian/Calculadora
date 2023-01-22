package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadora.interfaces.InterfacesMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfacesMainActivity.View {
    String num1Vista, num2Vista, resultadoVista, operacion;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Boolean canDigitSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.num1Vista = "";
        this.num2Vista = "";
        this.operacion = "Operación";
        this.resultadoVista = "Resultado";
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void findElement() {
        button0 = findViewById(R.id.btn0);
        //button0.setOnClickListener(this);

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

        // Clase anonima ya que View.OnClickListener es una interface y se le da un cuerpo
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1Vista.isEmpty() || canDigitSecondNumber)
                    num1Vista += "0";
                else
                    num2Vista += "0";
                actualizarVista();
            }
        });
    }

    public void presionadoAC(View vista) {
        this.num1Vista = "";
        this.num2Vista = "";
        this.operacion = "Operación";
        this.resultadoVista = "Resultado";
        actualizarVista();
    }

    public void borrarDigito(View vista) {
        if(!this.num2Vista.isEmpty())
            this.num2Vista = this.num2Vista.substring(0, this.num2Vista.length() - 1);
        else if(!this.num1Vista.isEmpty())
            this.num1Vista = this.num1Vista.substring(0, this.num1Vista.length() - 1);

        if(this.num2Vista.isEmpty())
            this.operacion = "Operación";
        actualizarVista();
    }

    private void actualizarVista() {
        TextView textViewNum1 = (TextView) findViewById(R.id.num1);
        TextView textViewNum2 = (TextView) findViewById(R.id.num2);
        TextView textViewResultado = (TextView) findViewById(R.id.resultado);
        TextView textViewOperacion = (TextView) findViewById(R.id.operacion);

        textViewNum1.setText(this.num1Vista);
        textViewNum2.setText(this.num2Vista);
        textViewResultado.setText(this.resultadoVista);
        textViewOperacion.setText(this.operacion);
    }

    private String verificarOperacion(String num1Vista, String num2Vista,Boolean esEntero) {
        if(esEntero) {
            Integer num1 = Integer.parseInt(this.num1Vista);
            Integer num2 = Integer.parseInt(this.num2Vista);
            switch (this.operacion) {
                case "%":
                    this.resultadoVista = (num1 % num2) + ""; break;
                case "/":
                    this.resultadoVista = (num1 / num2) + ""; break;
                case "*":
                    this.resultadoVista = (num1 * num2) + ""; break;
                case "-":
                    this.resultadoVista = (num1 - num2) + ""; break;
                case "+":
                    this.resultadoVista = (num1 + num2) + ""; break;
            }
        }else {
            Float num1 = Float.parseFloat(this.num1Vista);
            Float num2 = Float.parseFloat(this.num2Vista);
            switch (this.operacion) {
                case "%":
                    this.resultadoVista = (num1 % num2) + ""; break;
                case "/":
                    this.resultadoVista = (num1 / num2) + ""; break;
                case "*":
                    this.resultadoVista = (num1 * num2) + ""; break;
                case "-":
                    this.resultadoVista = (num1 - num2) + ""; break;
                case "+":
                    this.resultadoVista = (num1 + num2) + ""; break;
            }
        }
        return this.resultadoVista;
    }

    public void calcularResultado(View vista) {
        if(!this.num1Vista.isEmpty() && !this.num2Vista.isEmpty() && !this.operacion.contains("Operación")) {
            if(this.num1Vista.contains(".") || this.num2Vista.contains(".")) {
                this.resultadoVista = verificarOperacion(this.num1Vista, this.num2Vista, false);
            }else{
                this.resultadoVista = verificarOperacion(this.num1Vista, this.num2Vista, true);
            }
            actualizarVista();
            canDigitSecondNumber = false;
        }
    }

    public void presionadoPunto(View vista) {
        if(!this.num1Vista.isEmpty() && !this.num1Vista.contains(".")) {
            this.num1Vista += ".";
            actualizarVista();
        }

        if (!this.num2Vista.isEmpty() && !this.num2Vista.contains(".")) {
            this.num2Vista += ".";
            actualizarVista();
        }
    }

    public void presionadoBoton0(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "0";
        else
            this.num2Vista += "0";
        actualizarVista();
    }

    public void presionadoBoton1(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "1";
        else
            this.num2Vista += "1";
        actualizarVista();
    }

    public void presionadoBoton2(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "2";
        else
            this.num2Vista += "2";
        actualizarVista();
    }

    public void presionadoBoton3(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "3";
        else
            this.num2Vista += "3";
        actualizarVista();
    }

    public void presionadoBoton4(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "4";
        else
            this.num2Vista += "4";
        actualizarVista();
    }

    public void presionadoBoton5(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "5";
        else
            this.num2Vista += "5";
        actualizarVista();
    }

    public void presionadoBoton6(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "6";
        else
            this.num2Vista += "6";
        actualizarVista();
    }

    public void presionadoBoton7(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "7";
        else
            this.num2Vista += "7";
        actualizarVista();
    }

    public void presionadoBoton8(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "8";
        else
            this.num2Vista += "8";
        actualizarVista();
    }

    public void presionadoBoton9(View vista) {
        if (this.num1Vista.isEmpty() || this.operacion.contains("Operación"))
            this.num1Vista += "9";
        else
            this.num2Vista += "9";
        actualizarVista();
    }

    public void presionadoModulo(View vista) {
        if (!this.num1Vista.isEmpty()){
            this.operacion = "%";
            actualizarVista();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoDiv(View vista) {
        if (!this.num1Vista.isEmpty()){
            this.operacion = "/";
            actualizarVista();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoMult(View vista) {
        if (!this.num1Vista.isEmpty()) {
            this.operacion = "*";
            actualizarVista();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoResta(View vista) {
        if (!this.num1Vista.isEmpty()){
            this.operacion = "-";
            actualizarVista();
            canDigitSecondNumber = true;
        }
    }

    public void presionadoSuma(View vista) {
        if (!this.num1Vista.isEmpty()) {
            this.operacion = "+";
            canDigitSecondNumber = true;
            actualizarVista();
        }
    }



}