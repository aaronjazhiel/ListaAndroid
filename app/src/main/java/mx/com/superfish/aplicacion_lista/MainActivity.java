package mx.com.superfish.aplicacion_lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    ListView listaCitas;
    String[] valores = new String[]{"Aaron Jazhiel 12_20 04-08-2018", "Juan Torres Venegas 20 04-08-2018 ", "Pedro Garcia 20 04-08-2018"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList listadias = new ArrayList();

        Day dia_tiempo = new Day();

        dia_tiempo.setDia("Lunes");
        dia_tiempo.setDescripcion("Bonito dia");


        listadias.add("Lunes");
        listadias.add("Martes");
        listadias.add("Miercoles");
        listadias.add("Jueves");
        listadias.add("Viernes");





        listaCitas = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, listadias);
        listaCitas.setAdapter(adaptador);






        listaCitas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Posicion" + position, Toast.LENGTH_SHORT).show();

            }
        });




    }



}


