package br.fecap.ads.projeton1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class AbaixoDoPesoActivity extends AppCompatActivity {

    private Button btnFechar;
    private TextView textPeso, textAltura, textImc, textClassificacao, textMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abaixo_do_peso);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Instanciar os elementos e vincular ao id:
        textPeso = findViewById(R.id.textPeso);
        textAltura = findViewById(R.id.textAltura);
        textImc = findViewById(R.id.textImc);
        textClassificacao = findViewById(R.id.textClassificacao);
        btnFechar = findViewById(R.id.btnFechar);

        btnFechar.setOnClickListener(view -> {
            finish();
        });


        // Recebendo os dados da Tela que foram enviados pelo Intent:
        Bundle bundle = getIntent().getExtras();

        // Decomposição dos dados do objeto enviado:

        Double altura             = bundle.getDouble("altura");
        Double peso               = bundle.getDouble("peso");
        Double imc                = bundle.getDouble("imc");
        String classificacao      = bundle.getString("classificacao");

        // Mostrar os dados:

        // Converter o resultado
        DecimalFormat df = new DecimalFormat("##.##");
        String alturaF = df.format(altura);
        String imcF = df.format(imc);
        String pesoF = df.format(peso);

        textPeso.setText(alturaF);
        textAltura.setText(pesoF);
        textImc.setText(imcF);
        textClassificacao.setText(classificacao);
        textMensagem.setText("Esta abaixo do peso, coma mais");




    }
}