package com.example.roomgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomgit.databinding.ActivityMainBinding
import com.example.roomgit.room.Location
import com.example.roomgit.room.LocationDao
import com.example.roomgit.room.MyDatabase

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var locationList: ArrayList<Location>
    lateinit var locationDao: LocationDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        locationDao = MyDatabase.getDatabase(this).locationDao

    }

    private fun showAllDate() {
        val locationData = locationDao.getAllLocations()

    }
}