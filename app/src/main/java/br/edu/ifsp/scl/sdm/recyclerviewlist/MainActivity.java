package br.edu.ifsp.scl.sdm.recyclerviewlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLista;

    // Atributo tipo ArrayList para guardar strings:
    private ArrayList<Itens> listaDeItens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        geraLista();

        rvLista = findViewById(R.id.rvLista);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getApplicationContext());
        rvLista.setLayoutManager(layout);
        ListaAdapter adapter = new ListaAdapter(listaDeItens);
        rvLista.setAdapter(adapter);
    }

    private void geraLista(){
        listaDeItens.clear();
        listaDeItens.add(
                new Itens("Drácula - Edição De Luxo","Stoker,Bram", 29.90, R.drawable.dracula)
        );
        listaDeItens.add(
                new Itens("Box - Edgar Allan Poe - Histórias Extraordinárias - 3 Volumes - Acompanha Pôster",
                        "Poe,Edgar Allan", 75.90, R.drawable.poe)
        );
        listaDeItens.add(
                new Itens("As Crônicas De Nárnia - Volume Único",
                        "Lewis,Clive Staples", 34.90, R.drawable.cronica_de_narnia)
        );
        listaDeItens.add(
                new Itens("Box - HP Lovecraft - Os Melhores Contos - 3 Volumes",
                        "Lovecraft,H. P.", 55.90, R.drawable.love_craft)
        );
        listaDeItens.add(
                new Itens("A Garota do Lago",
                        "Donlea,Charlie", 11.90, R.drawable.a_garota_do_lago)
        );

    }
}
