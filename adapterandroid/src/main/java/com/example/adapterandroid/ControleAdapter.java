package com.example.adapterandroid;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by opet on 21/03/2018.
 */

public class ControleAdapter extends ArrayAdapter {

    private List<ItemControle> lista;
    private int resource;

    public ControleAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);

        this.lista = objects;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        View mView = contentView;

        if(mView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(resource, null);
        }

        ItemControle item = lista.get(position);

        TextView textNome = mView.findViewById(R.id.textNomeLista);
        TextView textTipo = mView.findViewById(R.id.textTipoLista);
        TextView textValor = mView.findViewById(R.id.textValorLista);

        textNome.setText(item.getNome());
        textTipo.setText(item.getTipo());
        if(item.getValor() > 0) {
            textValor.setTextColor(Color.GREEN);
        } else if(item.getValor() < 0) {
            textValor.setTextColor(Color.RED);
        }
        item.setValor(Math.abs(item.getValor()));
        textValor.setText(String.valueOf(item.getValor()));

        return mView;
    }
}
