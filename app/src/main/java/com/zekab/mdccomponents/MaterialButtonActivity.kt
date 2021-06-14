package com.zekab.mdccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MaterialButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_button)
    }

    fun onClickMethod(view: View) {
        when(view.id){
            R.id.btn_text -> showMessage("Text Button")
            R.id.btn_outlined -> showMessage("Outlined Button")
            R.id.btn_contained -> showMessage("Contained Button")
            R.id.btn_customised1 -> showMessage("Customised Button")
            R.id.btn_customised2 -> showMessage("Customised Button")
        }
    }

    private fun showMessage(message:String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}