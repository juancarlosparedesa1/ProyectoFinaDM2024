package com.paredes.proyectofinaldm2024

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.paredes.proyectofinaldm2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIngresar.setOnClickListener {
            if (binding.editTextUser.text.toString() == "user" && binding.editTextPassword.text.toString()=="password") {
                Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Usuario y/o contraseña mal ingresados", Toast.LENGTH_SHORT).show()

            }

        }
    }
}