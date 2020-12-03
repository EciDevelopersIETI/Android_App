package co.com.eci.ieti.kingboo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrarActivity extends AppCompatActivity {
    Button volverLogin;
    Button registrarProveedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        volverLogin = (Button) findViewById(R.id.volverloginbtn);

        registrarProveedor = (Button) findViewById(R.id.registroproveedorbtn);

        registrarProveedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrarProveedorActivity.class);
                startActivity(intent);
            }
        });

        volverLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}