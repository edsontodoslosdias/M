package com.example.movilcotizacion;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private TextView lblNumCotizacion, lblDescripcion, lblPrecio, lblPorcentaje, lblPlazo,lblDatos;
    private EditText txtNumCotizacion, txtDescripcion, txtPrecio, txtPorcentaje, txtPlazo;
    private Button btnCotizacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblNumCotizacion=(TextView) findViewById(R.id.lblNumCotizacion);
        lblDescripcion=(TextView) findViewById(R.id.lblDescripcion);
        lblPrecio=(TextView) findViewById(R.id.lblPrecio);
        lblPorcentaje=(TextView) findViewById(R.id.lblPorcentaje);
        lblPlazo=(TextView) findViewById(R.id.lblPlazo);
        lblDatos=(TextView) findViewById(R.id.lblDatos);
        txtNumCotizacion=(EditText) findViewById(R.id.txtNumCotizacion);
        txtDescripcion=(EditText) findViewById(R.id.txtDescripcion);
        txtPrecio=(EditText) findViewById(R.id.txtPrecio);
        txtPorcentaje=(EditText) findViewById(R.id.txtPorcentaje);
        txtPlazo=(EditText) findViewById(R.id.txtPlazo);
        btnCotizacion=(Button) findViewById(R.id.btnCotizacion);
        lblNumCotizacion.setText("Ingrese el numero de cotizacion");
        lblDescripcion.setText("Ingrese la descripcion del auto");
        lblPrecio.setText("Ingrese el precio del auto");
        lblPorcentaje.setText("Ingrese el porcentaje inicial del auto");
        lblPlazo.setText("Ingrese el plazo en meses del auto");

        btnCotizacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(txtNumCotizacion.getText().toString().matches("")||txtDescripcion.getText().toString().matches("")||
                        txtPrecio.getText().toString().matches("")||txtPorcentaje.getText().toString().matches("")||txtPlazo.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Favor de llenar todos los campos",Toast.LENGTH_SHORT).show();
                }
                else{
                    int numCotizacion=Integer.parseInt(txtNumCotizacion.getText().toString());
                    String descripcion=txtDescripcion.getText().toString();
                    double precio= Double.parseDouble(txtPrecio.getText().toString());
                    int porcentaje=Integer.parseInt(txtPorcentaje.getText().toString());
                    int plazo=Integer.parseInt(txtPlazo.getText().toString());
                    Cotizacion cotizacion=new Cotizacion(numCotizacion,descripcion,precio,porcentaje,plazo);
                    lblDatos.setText(cotizacion.toString()+
                            "\nCalculoInicial: "+cotizacion.calculoInicial()+ "\n Total a financiar: "+
                            cotizacion.totalFinanciar()+"\n Pago mensual: "+cotizacion.pagoMensual());
                }
            }
        });
    }
}