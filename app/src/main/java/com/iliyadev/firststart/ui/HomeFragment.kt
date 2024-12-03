package com.iliyadev.firststart.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.iliyadev.firststart.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // بارگذاری فایل XML مربوط به HomeFragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}
