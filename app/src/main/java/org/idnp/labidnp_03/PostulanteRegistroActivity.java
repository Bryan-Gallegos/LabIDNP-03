package org.idnp.labidnp_03;
import static org.idnp.labidnp_03.MainActivity.REQUEST_CODE_POSTULANTE;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import static org.idnp.labidnp_03.MainActivity.objeto;
public class PostulanteRegistroActivity extends AppCompatActivity {

    public EditText apePat;
    public EditText apeMat;
    public EditText nombres;
    public EditText fecNac;
    public EditText colegio;
    public EditText carrera;
    public Button btnRegistro2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulanteregistro);

        apePat = findViewById(R.id.ApePat);
        apeMat = findViewById(R.id.ApeMat);
        nombres = findViewById(R.id.Nom);
        fecNac = findViewById(R.id.Nac);
        colegio = findViewById(R.id.Cole);
        carrera = findViewById(R.id.Carr);
        btnRegistro2 = findViewById(R.id.btnRegistro);


        btnRegistro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String apePaterno= apePat.getText().toString();
                String apeMaterno= apeMat.getText().toString();
                String nomAlum= nombres.getText().toString();
                String fechNaci= fecNac.getText().toString();
                String colPro= colegio.getText().toString();
                String carPos= carrera.getText().toString();

                if(!apePaterno.equals("") && !apeMaterno.equals("") && !nombres.equals("") && !fechNaci.equals("") && !colPro.equals("") && !carPos.equals("") ) {
                    Postulante nuevo = new Postulante(apePaterno, apeMaterno, nomAlum, fechNaci, colPro, carPos);
                    intent.putExtra(objeto,  nuevo);
                    setResult(RESULT_OK,intent);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Postulante registrado exitosamente" , Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Error\nLlene todos los campos para realizar su registro" , Toast.LENGTH_SHORT).show();
                }


            }
        });

        Button btnListar2 = findViewById(R.id.btnListar);

        btnListar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PostulanteInfoActivity.class);
                startActivity(intent);
                startActivityForResult(new Intent(getApplicationContext(), PostulanteRegistroActivity.class), REQUEST_CODE_POSTULANTE);
            }
        });


    }

}