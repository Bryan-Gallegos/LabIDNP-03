package org.idnp.labidnp_03;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.GetContent;
import java.util.ArrayList;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_POSTULANTE = 1;
    public Postulante postulante;
    private TextView txtTabla;
    public static final String objeto = "objeto";
    ArrayList<Postulante> listaPostulantes = new ArrayList<Postulante>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLogin = findViewById(R.id.btnLogin1);
        txtTabla =findViewById(R.id.textTabla);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), LoginActivity.class),REQUEST_CODE_POSTULANTE);
            }
        });

        Button btnRegistro = findViewById(R.id.btnActivityMenu);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), PostulanteRegistroActivity.class), REQUEST_CODE_POSTULANTE);
            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_POSTULANTE) {
            if(resultCode == RESULT_OK){
                postulante = (Postulante)data.getExtras().getSerializable(objeto);
                txtTabla.setText(listaPostulantes.get(0).getApellidoMaterno());
            }


        }
    }
}