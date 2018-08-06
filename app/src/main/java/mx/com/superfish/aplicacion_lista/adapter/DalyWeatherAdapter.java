package mx.com.superfish.aplicacion_lista.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import mx.com.superfish.aplicacion_lista.Day;
import mx.com.superfish.aplicacion_lista.R;

public class DalyWeatherAdapter extends BaseAdapter{


    ArrayList listadias;
    Context context;

    public DalyWeatherAdapter(Context context,ArrayList listadias) {
        this.listadias = listadias;
        this.context = context;
    }

    @Override
    public int getCount() {



        return listadias.size();
    }

    @Override
    public Object getItem(int position) {
        return listadias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        Day day = (Day) listadias.get(position);


      view = LayoutInflater.from(context).inflate(R.id.lista_dias,null);

        TextView textodias =  (TextView)  view.findViewById(R.id.dia);
        TextView textotiempo =  (TextView)  view.findViewById(R.id.tiempo);
        TextView textoporcentaje =  (TextView)  view.findViewById(R.id.porcentaje);

        textodias.setText( day.getDia());
        textotiempo.setText(day.getDescripcion());
        textoporcentaje.setText(day.getPorcentaje_tiempo());

        return view;
    }
}
