package com.example.memorise_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class revision_memocard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revision_memocard)

        // Dans une autre activité
        val buttonPageMain = findViewById<Button>(R.id.buttonRevenirHome1)
        buttonPageMain.setOnClickListener {
            (applicationContext as Main_DEBUT_APP).goToMain_debut_appActivity()
        }
        val buttonLogo = findViewById<Button>(R.id.buttonLogoMemorise2)
        buttonLogo.setOnClickListener {
            (applicationContext as Main_DEBUT_APP).goToMain_debut_appActivity()
        }


    }
}