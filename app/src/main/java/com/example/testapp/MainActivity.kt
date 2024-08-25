package com.example.testapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import android.widget.TextView
import android.widget.EditText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    @SuppressLint("SetTextI18n")
    fun onBtnClick(view: View) {
        val first: EditText = findViewById(R.id.firstName)
        val last: EditText = findViewById(R.id.lastName)
        val email: EditText = findViewById(R.id.emailText)
        val firstOutput: TextView = findViewById(R.id.fOutput)
        val lastOutput: TextView = findViewById(R.id.lOutput)
        val emailOutput: TextView = findViewById(R.id.eOutput)
        firstOutput.text = "First Name: ${first.text.toString()}"
        lastOutput.text = "Last Name: ${last.text.toString()}"
        emailOutput.text = "Email: ${email.text.toString()}"
    }
}