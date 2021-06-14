package com.zekab.mdccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogActivity : AppCompatActivity() {

    var selectedIndex = 0
    var selectedRingtone = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
    }

    fun onClickMethod(view: View) {
        when (view.id) {
            R.id.btn_alert_dialog -> showAlertDialog()
            R.id.btn_list_dialog -> showListDialog()
            R.id.btn_radio_button_dialog -> showRadioDialog()
        }
    }

    private   fun showMessage(message:String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }

    private fun showAlertDialog(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Alert")
            .setMessage("Do you want to quite?")
            .setNeutralButton("Later"){dialog,which ->
                showMessage("Later")
            }
            .setPositiveButton("Yes"){dialog,which ->
                showMessage("Yes")
            }
            .setNegativeButton("Declined"){dialog,which ->
                showMessage("Declined")
            }
            .show()
    }

    private fun showListDialog(){
        val emails = arrayOf("user01@gmail.com","user02@gmail.com","user03@gmail.com")
        MaterialAlertDialogBuilder(this)
            .setTitle("Backup Emails")
            .setItems(emails){dialog, which ->
                when(which){
                    0 -> showMessage(emails[0])
                    1 -> showMessage(emails[1])
                    2 -> showMessage(emails[2])
                }
            }
            .show()

    }

    private fun showRadioDialog(){

        val ringtones = arrayOf("None", "Ringtone 1", "Ringtone 2", "Ringtone 3", "Ringtone 4", "Ringtone 5", "Ringtone 6", "Ringtone 7", "Ringtone 8")
        selectedRingtone = ringtones[selectedIndex]
        MaterialAlertDialogBuilder(this)
            .setTitle("Phone Ringtones")
            .setSingleChoiceItems(ringtones,selectedIndex){dialog,which ->
                selectedIndex = which
                selectedRingtone = ringtones[selectedIndex]
            }
            .setNeutralButton("Cancel"){dialog,which -> }
            .setPositiveButton("OK"){dialog,which ->
                showMessage(selectedRingtone)
            }
            .show()
    }

}