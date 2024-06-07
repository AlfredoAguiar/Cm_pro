package com.example.myapplication.ui.assing_tasks

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.MainActivity_user


import com.example.myapplication.databinding.ProjectAddBinding
import com.example.myapplication.task_add


class assingTaskFragment : Fragment() {

    private var _binding: ProjectAddBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(assingTaskViewModel::class.java)

        _binding = ProjectAddBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.button3.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), task_add::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), task_add::class.java)
            startActivity(intent)
        }
        binding.button5.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), task_add::class.java)
            startActivity(intent)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}