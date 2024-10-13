package com.example.projetotreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetotreino.databinding.ActivityMainBinding
//PROJETO RARA TREINO DE RECYCLERVIEW
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView(binding.root)

        //PROJETO RARA TREINO DE RECYCLERVIEW
        val lista = listOf(
            Personagens(R.drawable.luffy, "Luffy", "1,72", R.drawable.brasil ),
            Personagens(R.drawable.nami, "Nami", "1,70", R.drawable.suecia ),
            Personagens(R.drawable.zoro, "Zoro", "1,81", R.drawable.japao ),
            Personagens(R.drawable.robin, "Robin", "1,88", R.drawable.russia ),
            Personagens(R.drawable.chopper, "Chopper", "0,90", R.drawable.canada ),
            Personagens(R.drawable.brook, "Brook", "2,66", R.drawable.austria ),

        )

        with(binding){
            rvPersonagens.adapter = MeuAdapter(lista)
            rvPersonagens.layoutManager = LinearLayoutManager(applicationContext)
            //rvPersonagens.addItemDecoration(DividerItemDecoration(this@MainActivity, LinearLayoutManager.VERTICAL))
        }

    }
}//PROJETO RARA TREINO DE RECYCLERVIEW