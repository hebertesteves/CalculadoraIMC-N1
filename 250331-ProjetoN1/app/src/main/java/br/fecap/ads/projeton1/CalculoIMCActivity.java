package br.fecap.ads.projeton1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;


public class CalculoIMCActivity extends AppCompatActivity {

    private Button btnSet;
    private Button btnReset;
    private Button btnFechar;
    private EditText campoAltura;
    private EditText campoPeso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculo_imcactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnFechar = findViewById(R.id.btnFechar);

        btnFechar.setOnClickListener(view -> {
            finish();
        });

    }

    public void calculaIMC(View view) {

        // Vinculando os elementos com os Views
        btnSet = findViewById(R.id.btnSet);
        btnReset = findViewById(R.id.btnReset);
        campoAltura = findViewById(R.id.editTextAltura);
        campoPeso = findViewById(R.id.editTextPeso);

        // Variaveis para recuperar (get) e converter em String:
        String altura = campoAltura.getText().toString();
        String peso = campoPeso.getText().toString();

        // Converter os dados para Numerico:
        Double numAltura = Double.parseDouble(altura);
        Double numPeso = Double.parseDouble(peso);
        Double numImc = numPeso / (numAltura * numAltura);


        if (numImc < 18.5) { // Abaixo do peso

            Intent intent = new Intent(this, AbaixoDoPesoActivity.class);

            // Adicionar parametros para outra Activity:
            intent.putExtra("altura", numAltura);
            intent.putExtra("peso", numPeso);
            intent.putExtra("imc", numImc);
            intent.putExtra("classificacao", "Abaixo do peso");

            startActivity(intent);

        } else if (numImc >= 18.5 && numImc < 25) { // Peso normal

            Intent intent = new Intent(this, PesoNormalActivity.class);

            // Adicionar parametros para outra Activity:
            intent.putExtra("altura", numAltura);
            intent.putExtra("peso", numPeso);
            intent.putExtra("imc", numImc);
            intent.putExtra("classificacao", "Peso normal");

            startActivity(intent);

        } else if (numImc >= 25 && numImc < 30) { // Sobrepeso

            Intent intent = new Intent(this, SobrepesoActivity.class);

            // Adicionar parametros para outra Activity:
            intent.putExtra("altura", numAltura);
            intent.putExtra("peso", numPeso);
            intent.putExtra("imc", numImc);
            intent.putExtra("classificacao", "Sobrepeso");

            startActivity(intent);

        } else if (numImc >= 30 && numImc < 35) { // Obesidade grau 1

            Intent intent = new Intent(this, Obesidade1Activity.class);

            // Adicionar parametros para outra Activity:
            intent.putExtra("altura", numAltura);
            intent.putExtra("peso", numPeso);
            intent.putExtra("imc", numImc);
            intent.putExtra("classificacao", "Obesidade grau 1");

            startActivity(intent);

        } else if (numImc >= 35 && numImc < 40) { // Obesidade grau 2

            Intent intent = new Intent(this, Obesidade2Activity.class);

            // Adicionar parametros para outra Activity:
            intent.putExtra("altura", numAltura);
            intent.putExtra("peso", numPeso);
            intent.putExtra("imc", numImc);
            intent.putExtra("classificacao", "Obesidade grau 2");

            startActivity(intent);

        } else if (numImc >= 40) { // Obesidade grau 3

            Intent intent = new Intent(this, Obesidade3Activity.class);

            // Adicionar parametros para outra Activity:
            intent.putExtra("altura", numAltura);
            intent.putExtra("peso", numPeso);
            intent.putExtra("imc", numImc);
            intent.putExtra("classificacao", "Obesidade grau 3");

            startActivity(intent);

        }



    }

    public void limparCampo() {
        campoAltura = findViewById(R.id.editTextAltura);
        campoPeso = findViewById(R.id.editTextPeso);

        campoAltura.setText("");
        campoPeso.setText("");
    }


}
