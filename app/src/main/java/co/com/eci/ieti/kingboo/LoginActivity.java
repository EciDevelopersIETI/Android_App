package co.com.eci.ieti.kingboo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button acceder;
    Button registrar;
    Button cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText user = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText pass = (EditText) findViewById(R.id.editTextTextPassword);

        acceder = (Button) findViewById(R.id.accederButton);

        registrar = (Button) findViewById(R.id.registerButton);

        cliente = (Button) findViewById(R.id.clientebtn);

        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProveedorActivity.class);
                startActivity(intent);
            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrarActivity.class);
                startActivity(intent);
            }
        });

        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), nav_bienvenidaCliente.class);
                startActivity(intent);
            }
        });


    }
}