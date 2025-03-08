package com.example.ex1_bd_v1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun Enregistrer(view: View) {
        val nom = findViewById<EditText>(R.id.chName)
        val ls = findViewById<ListView>(R.id.maliste)
        val db = DBConnexion(this)

        db.insertNewAdmin(nom.text.toString())
        val arrayListe = db.getAllRecord()
        val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListe)
        ls.adapter = myAdapter
        nom.setText("")
    }

    fun Update(view: View) {
        val chNom = findViewById<EditText>(R.id.chName)
        val chID = findViewById<EditText>(R.id.chID)
        val ls = findViewById<ListView>(R.id.maliste)
        val db = DBConnexion(this)

        db.updateRow(chNom.text.toString(), chID.text.toString().toInt())
        val arrayListe = db.getAllRecord()
        val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListe)
        ls.adapter = myAdapter
        chNom.setText("")
        chID.setText("")
    }

    fun Supprimer(view: View) {
        val chID = findViewById<EditText>(R.id.chID)
        val ls = findViewById<ListView>(R.id.maliste)
        val db = DBConnexion(this)

        db.deleteRow(chID.text.toString().toInt())
        val arrayListe = db.getAllRecord()
        val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListe)
        ls.adapter = myAdapter
        chID.setText("")
    }
}