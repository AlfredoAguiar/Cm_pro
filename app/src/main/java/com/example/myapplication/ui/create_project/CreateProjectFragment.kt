package com.example.myapplication.ui.create_project

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


import com.example.myapplication.databinding.CreateprojectBinding
import com.example.myapplication.new_project
import com.example.myapplication.see_proj
import com.example.myapplication.task_add


class CreateProjectFragment : Fragment() {

    private var _binding: CreateprojectBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(CreateProjectViewModel::class.java)

        _binding = CreateprojectBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.button?.visibility = View.VISIBLE
        binding.button?.setOnClickListener {

            val intent = Intent(requireContext(), new_project::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), see_proj::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), see_proj::class.java)
            startActivity(intent)
        }
        binding.button5.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), see_proj::class.java)
            startActivity(intent)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}