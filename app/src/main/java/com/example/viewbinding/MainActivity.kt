package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.databinding.RecyclerLayoutBinding
import com.example.viewbinding.model.Filmes

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val listaDeFilmes = mutableListOf<Filmes>()

        val rc = binding.rc
        rc.adapter = MainAdapter(listaDeFilmes)
        rc.layoutManager = LinearLayoutManager(this)

        listaDeFilmes.add(Filmes("Vingadores"))
        listaDeFilmes.add(Filmes("Batman"))
        listaDeFilmes.add(Filmes("The Joker"))
        listaDeFilmes.add(Filmes("Vingadores"))
        listaDeFilmes.add(Filmes("Batman"))
        listaDeFilmes.add(Filmes("The Joker"))
        listaDeFilmes.add(Filmes("Vingadores"))
        listaDeFilmes.add(Filmes("Batman"))
        listaDeFilmes.add(Filmes("The Joker"))
        listaDeFilmes.add(Filmes("Vingadores"))
        listaDeFilmes.add(Filmes("Batman"))
        listaDeFilmes.add(Filmes("The Joker"))
        listaDeFilmes.add(Filmes("Vingadores"))
        listaDeFilmes.add(Filmes("Batman"))
        listaDeFilmes.add(Filmes("The Joker"))
        listaDeFilmes.add(Filmes("Vingadores"))
        listaDeFilmes.add(Filmes("Batman"))
        listaDeFilmes.add(Filmes("The Joker"))

    }

    inner class MainAdapter(private var lista: MutableList<Filmes>) :
        RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            return MainViewHolder(RecyclerLayoutBinding.inflate(layoutInflater, parent, false))
        }

        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            //holder.txt.text = lista[position].title
            val state = lista[position]
            holder.bind(state, holder.txt)
        }

        override fun getItemCount(): Int {
            return lista.size
        }


        inner class MainViewHolder(bindings: RecyclerLayoutBinding) :
            RecyclerView.ViewHolder(bindings.root) {
               // val txt = bindings.filme

               val txt = bindings.filme
                fun bind(view: Filmes, txt: TextView){
                    txt.text = view.title
                }
        }
    }
}