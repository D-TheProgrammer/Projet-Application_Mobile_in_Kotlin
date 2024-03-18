package com.example.memorise_v3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main_DEBUT_APP : AppCompatActivity() {

    fun goToCreerMemoCard() {
        val intent = Intent(this, creation_memocard::class.java)
        startActivity(intent)
    }

    fun goToMain_debut_appActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_debut_app)

        //les bouton du menu, on les nom puis on leur dit vers quel pages ils doivent amener
        val buttonPageCreationMemocard = findViewById<Button>(R.id.buttonCreationMemoCard)
        buttonPageCreationMemocard.setOnClickListener {
            val intent1 = Intent( this, creation_memocard::class.java)
            startActivity(intent1)
        }

        //Ca focntionne avec "creer_memocard" car ca prend pas la modification du nom de la page
        //en compte
        val buttonPageRevisionMemocard = findViewById<Button>(R.id.buttonRevision)
        buttonPageRevisionMemocard.setOnClickListener {
            val intent1 = Intent( this, revision_memocard::class.java)
            startActivity(intent1)
        }

        val buttonPageCollectionMemocard = findViewById<Button>(R.id.buttonCollection)
        buttonPageCollectionMemocard.setOnClickListener {
            val intent1 = Intent( this, MainActivity::class.java)
            startActivity(intent1)
        }

        val buttonPageOptionMemocard = findViewById<Button>(R.id.buttonOption)
        buttonPageOptionMemocard.setOnClickListener {
            val intent1 = Intent( this, OptionMemocard::class.java)
            startActivity(intent1)
        }
    }

}