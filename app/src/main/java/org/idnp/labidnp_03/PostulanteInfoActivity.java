package org.idnp.labidnp_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PostulanteInfoActivity extends AppCompatActivity {
    public Button btnBuscar;
    public EditText buscPos;
    public TextView dniInf;
    public TextView nombreInfo;
    public TextView apellidosInfo;
    public TextView fecNacInfo;
    public TextView coleInfo;
    public TextView CarrInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulanteinfo);
        dniInf = findViewById(R.id.dniInfo);
        nombreInfo = findViewById(R.id.nombreInfo);
        apellidosInfo = findViewById(R.id.apellidosInfo);
        fecNacInfo = findViewById(R.id.fecNacInfo);
        coleInfo = findViewById(R.id.coleInfo);
        CarrInfo = findViewById(R.id.CarrInfo);
        buscPos = findViewById(R.id.buscPos);
        btnBuscar = findViewById(R.id.btnBuscar);
        ArrayList<Postulante> listaPostulantes2 = (ArrayList<Postulante>) getIntent().getSerializableExtra("lista");
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String buscar = buscPos.getText().toString();
                boolean encontrado = false;
                int tamanio=listaPostulantes2.size();
                if(!buscar.equals("")){
                    for(int i=0;i<tamanio && encontrado==false;i++){
                        if(buscar==listaPostulantes2.get(i).getId()){
                            encontrado=true;
                            dniInf.setText(listaPostulantes2.get(i).getId());
                            nombreInfo.setText(listaPostulantes2.get(i).getNombres());
                            apellidosInfo.setText(listaPostulantes2.get(i).getApellidoPaterno()+" "+listaPostulantes2.get(i).getApellidoMaterno());
                            fecNacInfo.setText(listaPostulantes2.get(i).getFechaNacimiento());
                            coleInfo.setText(listaPostulantes2.get(i).getColegioProcedencia());
                            CarrInfo.setText(listaPostulantes2.get(i).getCarreraPostula());
                            Toast.makeText(getApplicationContext(), "Postulante Encontrado" , Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(encontrado==false){
                        Toast.makeText(getApplicationContext(), "No se Encontró al Postulante" , Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}