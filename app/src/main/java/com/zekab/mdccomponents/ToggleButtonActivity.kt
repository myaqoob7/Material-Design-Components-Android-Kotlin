package com.zekab.mdccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButtonToggleGroup

class ToggleButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        val toggleButtonGroup: MaterialButtonToggleGroup = findViewById(R.id.toggleButtonGroup)
        toggleButtonGroup.addOnButtonCheckedListener { toggleGroup, checkedId, isChecked ->
            if (isChecked){
                when(checkedId){
                    R.id.btnAndroid -> showMessage("Android is Selected")
                    R.id.btnFlutter -> showMessage("Flutter is Selected")
                    R.id.btnWeb -> showMessage("Web is Selected")

                }
            }else{
                if (toggleGroup.checkedButtonId == View.NO_ID){
                    showMessage("Nothing Selected")
                }
            }
        }

        val toggleButtonGroupIcon: MaterialButtonToggleGroup = findViewById(R.id.toggleButtonGroupIcon)
        toggleButtonGroupIcon.addOnButtonCheckedListener { toggleGroup, checkedId, isChecked ->
            if (isChecked){
                when(checkedId){
                    R.id.btnWifiOn -> showMessage("Wifi On")
                    R.id.btnWifiOff -> showMessage("Wifi Off")
                    R.id.btnWifiLocked -> showMessage("Wifi Locked")

                }
            }else{
                if (toggleGroup.checkedButtonId == View.NO_ID){
                    showMessage("Nothing Selected")
                }
            }
        }

    }


    private fun showMessage(message:String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}