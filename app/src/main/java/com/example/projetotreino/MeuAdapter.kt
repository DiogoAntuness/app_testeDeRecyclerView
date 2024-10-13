package com.example.projetotreino

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.projetotreino.databinding.ItemListaRvBinding

class MeuAdapter(private val lista: List<Personagens>) : Adapter<MeuAdapter.PersonagensViewHolder>() {

    inner class PersonagensViewHolder(private val binding: ItemListaRvBinding) : ViewHolder( binding.root ){

        val PerImagem: ImageView = binding.imagePersonagem
        val PerNome: TextView = binding.textNome
        val PerAltura: TextView = binding.textAltura
        val PerPais: ImageView = binding.imagePais

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonagensViewHolder {
        val binding = ItemListaRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonagensViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonagensViewHolder, position: Int) {
        val item = lista[position]
        holder.PerImagem.setImageResource(item.personagem)
        holder.PerNome.setText(item.nome)
        holder.PerAltura.setText(item.altura)
        holder.PerPais.setImageResource(item.nacionalidade)


    }

    override fun getItemCount(): Int {
        return lista.size
    }
}