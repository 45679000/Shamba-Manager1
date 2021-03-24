package com.example.shambamanager

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class Login : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: Activity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        // Initialize Firebase Auth
        auth = Firebase.auth

        /*binding.createButton.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
            finish()
        }*/
    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser:FirebaseUser? = auth.currentUser
        //if(currentUser != null){
        //    reload();
        //}
        updateUI(currentUser)
    }

    private fun updateUI(currentUser: FirebaseUser?) {

    }
    /*private fun reload() {
        auth.currentUser!!.reload().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                updateUI(auth.currentUser)
                Toast.makeText(this@Login,
                    "Reload successful!",
                    Toast.LENGTH_SHORT).show()
            } else {
                Log.e(TAG, "reload", task.exception)
                Toast.makeText(this@Login,
                    "Failed to reload user.",
                    Toast.LENGTH_SHORT).show()
            }
        }*/

}