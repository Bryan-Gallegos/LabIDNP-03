package org.idnp.labidnp_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static org.idnp.labidnp_03.MainActivity.lista;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    public Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIngresar = findViewById(R.id.btnActivityLogin);
        
        btnIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PostulanteInfoActivity.class);
                ArrayList<Postulante> listaPostulantes1 = (ArrayList<Postulante>) getIntent().getSerializableExtra("lista");
                intent.putExtra(lista,  listaPostulantes1);
                startActivity(intent);
            }
        });
    }
}