package br.com.myappcrudandroid;

/**
 * Created by Diego Pereira on 08/05/2020.
 */

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaInicial extends AppCompatActivity {

    private Button btnNovo, btnConulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_inicial);

        btnNovo = (Button) findViewById(R.id.btnNovo);
        btnNovo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CadastrarCliente.class);
                startActivity(intent);
            }
        });

        btnConulta = (Button) findViewById(R.id.btnConulta);
        btnConulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ListaClientes.class);
                startActivity(intent);
            }
        });
    }
}