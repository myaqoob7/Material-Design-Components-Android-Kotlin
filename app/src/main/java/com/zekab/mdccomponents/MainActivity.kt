package com.zekab.mdccomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMethod(view:View){
        when(view.id){
            R.id.btn_material_button -> startNextActivity(Intent(this,MaterialButtonActivity::class.java))
            R.id.btn_toggle_button -> startNextActivity(Intent(this,ToggleButtonActivity::class.java))
            R.id.btn_checkbox -> startNextActivity(Intent(this,CheckBoxActivity::class.java))
            R.id.btn_cardview -> startNextActivity(Intent(this,CardViewActivity::class.java))
            R.id.btn_draggable_cardview -> startNextActivity(Intent(this,DraggableCardViewActivity::class.java))
            R.id.btn_dialog -> startNextActivity(Intent(this,DialogActivity::class.java))
        }
    }


    private fun startNextActivity(mIntent: Intent){
        startActivity(mIntent)
    }
}