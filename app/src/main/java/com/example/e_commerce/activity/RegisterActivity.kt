package com.example.e_commerce.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.e_commerce.R
import com.example.e_commerce.databinding.ActivityRegisterBinding
import com.example.e_commerce.model.UserModel
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater) // inflate the layout
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            openLogin()
        }

        binding.button3.setOnClickListener {
            validateUser()
        }
    }

    private fun validateUser() {
        if (binding.userName.text!!.isEmpty() || binding.userNumber.text!!.isEmpty())
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
        else
            storeData()
    }

    private fun storeData() {
        val builder = AlertDialog.Builder(this)
            .setTitle("Loading...")
            .setMessage("Please wait...")
            .setCancelable(false)
            .create()
        builder.show()

        val data = UserModel(userName = binding.userName.text.toString(),
            userPhoneNumber = binding.userNumber.text.toString())


        Firebase.firestore.collection("users").document(binding.userName.text.toString())
            .set(data).addOnSuccessListener {
                Toast.makeText(this, "User Registered Successfully", Toast.LENGTH_SHORT).show()
                builder.dismiss()
                openLogin()
            }

            .addOnFailureListener{
                builder.dismiss()
                Toast.makeText(this, "Failed to register user", Toast.LENGTH_SHORT).show()
            }
    }

    private fun openLogin() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}