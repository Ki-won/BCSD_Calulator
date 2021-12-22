package com.example.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

class CalculatorFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        return inflater.inflate(R.layout.fragment_calculator, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val expressionTextView: TextView by lazy {
            view.findViewById<TextView>(R.id.txt_expression)
        }
        val resultTextView: TextView by lazy {
            view.findViewById<TextView>(R.id.txt_result)
        }

        var isOperator = false
        var hasOperator = false
    }
    fun buttonClicked(v: View){
    }
    fun resultButtonClicked(v: View){
    }
    fun historyButtonClicked(v: View){
    }
    fun clearButtonClicked(v: View){

    }
}