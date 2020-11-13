package co.com.eci.ieti.kingboo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button acceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText user = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText pass = (EditText) findViewById(R.id.editTextTextPassword);

        acceder = (Button) findViewById(R.id.accederButton);

        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProveedorActivity.class);
                startActivity(intent);
            }
        });
    }
}