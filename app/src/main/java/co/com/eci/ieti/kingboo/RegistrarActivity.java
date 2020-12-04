package co.com.eci.ieti.kingboo;

import androidx.appcompat.app.AppCompatActivity;
import co.com.eci.ieti.kingboo.services.OurRetrofit;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class RegistrarActivity extends AppCompatActivity {
    Button volverLogin, registrarProveedor;
    EditText usuario, email, password, telefono;
    String user, correo, pass, tele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        volverLogin = (Button) findViewById(R.id.volverloginbtn);
        registrarProveedor = (Button) findViewById(R.id.registroproveedorbtn);
        usuario = (EditText)findViewById(R.id.usuarioregistro);
        email = (EditText)findViewById(R.id.emailregistro);
        password = (EditText)findViewById(R.id.passwordregistro);
        telefono = (EditText)findViewById(R.id.telefonoProveedor);

        volverLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    public void postData(View view){
        String url ="https://kingboooback.herokuapp.com/users/newuser";
        user = usuario.getText().toString();
        correo = email.getText().toString();
        pass = password.getText().toString();
        tele = telefono.getText().toString();

        Retrofit retrofit = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        OurRetrofit ourRetrofit = retrofit.create(OurRetrofit.class);

        RegistrarData registrarData = new RegistrarData(user,correo,pass,tele);
        Call<RegistrarData> call = ourRetrofit.PostData(registrarData);
    }

}