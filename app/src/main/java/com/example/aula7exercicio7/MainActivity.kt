package com.example.aula7exercicio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arr: MutableList<String> = mutableListOf(
            "Isabela", "Rodrigo", "Fernanda", "Felipe", "Beatriz", "Gustavo",
            "Larissa", "Vinícius", "Camila", "Eduardo", "Raquel", "Ricardo", "Letícia", "Gabriel",
            "Juliana", "Thiago", "Natália", "Alexandre", "Vanessa", "Luiz", "Bruna", "Rafael",
            "Carolina", "Daniel", "Priscila", "Lucas", "Aline"
        )

        // Lista de objetos Pessoa inicializada com dois itens
        val pessoas: MutableList<Pessoa> = mutableListOf(
            Pessoa(android.R.drawable.ic_menu_my_calendar, "Tafarel", "tel: (17) 5555-5555"),
            Pessoa(android.R.drawable.star_on, "José", "tel: (17) 5555-8888")
        )

        // Adiciona nomes da lista `arr` à lista de pessoas
        for (nome in arr) {
            val pessoa = Pessoa(android.R.drawable.star_off, nome, "tel: (17) 7452-888")
            pessoas.add(pessoa)
        }

        // cria o objeto RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        // define a classe atual como gerenciadora do layout
        recyclerView.layoutManager = LinearLayoutManager(this)
        // define o adaptador
        val adapter = CustomAdapter(pessoas)
        // vincula a lista RecyclerView ao adaptador definido na linha anterior
        recyclerView.adapter = adapter

        // Adiciona uma linha divisória entre os itens da lista para melhorar a viibilidade.
        val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecoration)
    }




}