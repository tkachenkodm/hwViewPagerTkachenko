package com.example.hwviewpager

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hwviewpager.databinding.CountryFragmentLayoutBinding

class CountryFragment(val country: Country) : Fragment() {
    lateinit var binding: CountryFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CountryFragmentLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvName.text = country.name
        binding.tvCapital.text = country.capital
        binding.tvPopulation.text = country.population.toString()
        binding.tvArea.text = getString(R.string.country_area, country.area)
        binding.tvPopDensity.text = getString(R.string.pop_density, country.populationDensity)


    }

}