package ru.msokolov.weatherapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.msokolov.weatherapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}