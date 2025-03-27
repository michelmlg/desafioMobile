package com.example.desafiomobile

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.desafiomobile.dao.ItemDaoImplements
import com.example.desafiomobile.model.Item
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtName: EditText = findViewById(R.id.edt_name)
        val edtValue: EditText = findViewById(R.id.edt_value)
        val edtImageLink: EditText = findViewById(R.id.edt_image)
        val btnSave: Button = findViewById(R.id.btn_register)
        val textList: TextView = findViewById(R.id.tx_list)

        val dao = ItemDaoImplements()

        btnSave.setOnClickListener{
            val name = edtName.text.toString()
            val value = edtValue.text.toString()
            val imgLink = edtImageLink.text.toString()

            val item = Item(name, value.toFloat(), imgLink)

            dao.addItem(item)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Usuário Criado Com Sucesso!")
            val dialog = builder.create()
            dialog.show()

            edtName.text.clear()
        }

        textList.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

    }
}