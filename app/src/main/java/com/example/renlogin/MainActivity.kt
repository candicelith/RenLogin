package com.example.renlogin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.renlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun submitData(view : View) {
        val email = binding.email.text
        val name = binding.name.text
        val uname = binding.uname.text
        val pass = binding.pass.text
        Toast.makeText(this, "$email, $name, $uname, $pass", Toast.LENGTH_SHORT).show()
    }
}