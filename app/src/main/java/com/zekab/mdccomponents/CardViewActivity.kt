package com.zekab.mdccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.card.MaterialCardView

class CardViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        val cardPakistan:MaterialCardView = findViewById(R.id.cardPakistan)
        cardPakistan.setOnLongClickListener {
            cardPakistan.isChecked = !cardPakistan.isChecked
            true
        }

        val cardTurkey:MaterialCardView = findViewById(R.id.cardTurkey)
        cardTurkey.setOnLongClickListener {
            cardTurkey.isChecked = !cardTurkey.isChecked
            true
        }

        val btnWhatsSelected:Button = findViewById(R.id.btnWhatsSelected)
        btnWhatsSelected.setOnClickListener {
            var message = ""

            if (cardPakistan.isChecked){
                message += "Pakistan "
            }
            if (cardTurkey.isChecked){
                message += "Turkey "
            }

            showMessage(message)

        }

    }

    private fun showMessage(message:String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}