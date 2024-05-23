package com.example.myapplication.ui.slideshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.complete_task
import com.example.myapplication.databinding.FragmentSlideshowBinding
import com.example.myapplication.see_task

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        binding.button3.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), complete_task::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), complete_task::class.java)
            startActivity(intent)
        }
        binding.button5.setOnClickListener {
            // Navigate to the second activity
            val intent = Intent(requireContext(), complete_task::class.java)
            startActivity(intent)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}