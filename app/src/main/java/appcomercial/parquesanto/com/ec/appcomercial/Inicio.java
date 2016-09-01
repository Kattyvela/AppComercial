package appcomercial.parquesanto.com.ec.appcomercial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    Button btnPresentacion, btnProductos, btnGaleria, btnVista360, btnJakemate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnPresentacion = (Button) findViewById(R.id.btnPresentacion);
        btnProductos = (Button) findViewById(R.id.btnProductos);
        btnGaleria = (Button) findViewById(R.id.btnGaleria);
        btnVista360 = (Button) findViewById(R.id.btnVista360);
        btnJakemate = (Button) findViewById(R.id.btnJakemateW);

        btnPresentacion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent presentacion = new Intent(Inicio.this, Presentacion.class);
                startActivity(presentacion);
            }
        });

        btnProductos.setOnClickListener(new View.OnClickListener(){
            public void onClick (View p){
                Intent productos = new Intent(Inicio.this, Productos.class);
                startActivity(productos);
            }
        });

        btnGaleria.setOnClickListener(new View.OnClickListener(){
            public void onClick(View g){
                Intent galeria = new Intent(Inicio.this, Galeria.class);
                startActivity(galeria);
            }
        });

        btnVista360.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v360){
                Intent vista = new Intent(Inicio.this, Vista360.class);
                startActivity(vista);
            }
        });


    }
}
