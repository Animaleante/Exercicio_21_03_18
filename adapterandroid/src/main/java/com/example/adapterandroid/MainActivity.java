package com.example.adapterandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<ItemControle> itens;
    private ListView listaControle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaControle = findViewById(R.id.listControle);

        itens = new ArrayList<ItemControle>();
        itens.add(new ItemControle("Mercado", "Alimentação", -100));
        itens.add(new ItemControle("Salário", "Pagamento", 2500));
        itens.add(new ItemControle("Uber", "Transporte", -15));
        itens.add(new ItemControle("Putas", "Necessidade", -300));

        ArrayAdapter adapter = new ControleAdapter(this, R.layout.item_lista, itens);
        listaControle.setAdapter(adapter);
    }
}
