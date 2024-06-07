package com.example.myapplication.ui.taskprogress

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.MainActivity_user



import com.example.myapplication.databinding.TasksProgBinding
import com.example.myapplication.see_task


class taskprogFragment : Fragment() {

    private var _binding: TasksProgBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(taskprogViewModel::class.java)

        _binding = TasksProgBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.button3.setOnClickListener {
            val intent = Intent(requireContext(), see_task::class.java)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(requireContext(), see_task::class.java)
            startActivity(intent)
        }
        binding.button5.setOnClickListener {
            val intent = Intent(requireContext(), see_task::class.java)
            startActivity(intent)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}