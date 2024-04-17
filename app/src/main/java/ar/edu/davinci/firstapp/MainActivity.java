package ar.edu.davinci.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import calculator.Calculator;

public class MainActivity extends AppCompatActivity {

    public void sumar(View view) {
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.sumar);

    }
    public void restar(View view) {
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.restar);
    }
    public void multiplicar(View view) {
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.multiplicar);
    }
    public void dividir(View view) {
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.dividir);
    }

    public void escribir(View view) {
        Log.i("app", "funciona");
        Button boton = (Button)view;
        TextView displayText = findViewById(R.id.displayText);

        String concatenado = (String) displayText.getText();

        displayText.setText(concatenado + boton.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator();
        int resultadoResta = calculator.restar(2,1);
        // TODO: feat: imprimir resultado
        float resultadoDivision = calculator.dividir(2,1);
        // TODO: feat: imprimir resultado
    }
}