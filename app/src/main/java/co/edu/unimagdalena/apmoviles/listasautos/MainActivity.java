package co.edu.unimagdalena.apmoviles.listasautos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Auto> autos =new ArrayList<Auto>();
    EditText placa, marca,modelo;
    Button agregar;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        placa = findViewById(R.id.edtPlaca);
        marca = findViewById(R.id.edtMarca);
        modelo = findViewById(R.id.edtModelo);
        agregar = findViewById(R.id.btnagregar);
        lista = findViewById(R.id.lstautos);
        final AdaptadorAuto adaptadorAuto = new AdaptadorAuto(this,autos);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Auto a = new Auto(placa.getText().toString(), marca.getText().toString(), modelo.getText().toString());
                autos.add(a);
                Toast.makeText(MainActivity.this, "Auto Agregado", Toast.LENGTH_LONG).show();

                lista.setAdapter(adaptadorAuto);

            }
        });

    }
}