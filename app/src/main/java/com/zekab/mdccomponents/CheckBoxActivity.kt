package com.zekab.mdccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        val favoriteItem:CheckBox = findViewById(R.id.favorite_item)
        favoriteItem.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) showMessage("Add to favorite") else showMessage("Removed from favorite")
        }
    }

    private fun showMessage(message:String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}