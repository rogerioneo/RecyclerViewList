package br.edu.ifsp.scl.sdm.recyclerviewlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAdapter
        extends RecyclerView.Adapter<ListaAdapter.GuardadorItemLista>{

    private ArrayList<Itens> listaItens;

    public ListaAdapter(ArrayList<Itens> listaItens){
        this.listaItens = listaItens;
    }

    @NonNull
    @Override
    public GuardadorItemLista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from (parent.getContext());

        View itemLista = li.inflate(R.layout.item_da_lista , parent, false );

        return new GuardadorItemLista(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull GuardadorItemLista holder, int position) {
        holder.tvTitulo.setText(listaItens.get(position).getTitulo());
        holder.tvSubTitulo.setText(listaItens.get(position).getSubTitulo());
        holder.tvValor.setText(String.format("R$ %.2f",listaItens.get(position).getValor()));
        holder.imImagem.setImageResource(listaItens.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return listaItens.size();
    }

    public class GuardadorItemLista extends RecyclerView.ViewHolder {

        private TextView tvTitulo;
        private TextView tvSubTitulo;
        private TextView tvValor;
        private ImageView imImagem;

        // O construtor recebe o objeto que representa o item da lista:
        public GuardadorItemLista(View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvSubTitulo = itemView.findViewById(R.id.tvSubTitulo);
            tvValor = itemView.findViewById(R.id.tvValor);
            imImagem = itemView.findViewById(R.id.imageView);
        }
    }

}
