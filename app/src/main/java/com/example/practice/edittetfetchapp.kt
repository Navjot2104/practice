package com.example.practice

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.collection.emptyLongSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practice.databinding.ActivityEdittetfetchappBinding
import com.example.practice.databinding.ActivitySpinnerpracBinding

class edittetfetchapp : AppCompatActivity() {
    lateinit var binding: ActivityEdittetfetchappBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityEdittetfetchappBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_edittetfetchapp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btn6.setOnClickListener{
            if (binding.edtxt.text.toString().isNullOrEmpty()){
                binding.edtxt.error="Enter Correct name"

            }
            else{
                Toast.makeText(this,binding.edtxt2.text.toString(),Toast.LENGTH_SHORT).show()
            }
            if (binding.edtxt2.text.toString().isNullOrEmpty()){
                binding.edtxt2.error="Enter Phone number"

            }
            else{
                Toast.makeText(this,binding.edtxt2.text.toString(),Toast.LENGTH_SHORT).show()
            }
            if (binding.edtxt3.text.toString().isNullOrEmpty()){
                binding.edtxt3.error="Enter Email"
//                useifladder

            }
            else{
                Toast.makeText(this,binding.edtxt3.text.toString(),Toast.LENGTH_SHORT).show()
            }

        }
    }
}
