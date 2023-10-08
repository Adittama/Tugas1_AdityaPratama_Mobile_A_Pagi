package com.example.tugasbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tugasbaru.databinding.ActivityUntukfragmentBinding

class Untukfragment : AppCompatActivity() {
    private lateinit var binding: ActivityUntukfragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUntukfragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment11.setOnClickListener { replaceFragment(Fragmen1 ()) }
        binding.btnFragment22.setOnClickListener { replaceFragment(Fragment2()) }

    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager= supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView2, fragment)
        fragmentTransaction.commit()
    }
}