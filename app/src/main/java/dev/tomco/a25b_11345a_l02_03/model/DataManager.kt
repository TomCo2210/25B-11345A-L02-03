package dev.tomco.a25b_11345a_l02_03.model

import dev.tomco.a25b_11345a_l02_03.R

class DataManager {
    companion object {
        private val names = arrayOf(
            "Mauritius",
            "Austria",
            "Nicaragua",
            "Estonia",
            "Italy",
            "Lebanon",
            "Iraq",
            "Syria",
            "Qatar",
            "American Samoa",
            "China",
            "Micronesia",
            "South Korea",
            "Albania",
            "Pakistan",
            "Venezuela",
            "Ukraine",
            "Czech Republic",
            "Germany",
            "Bulgaria",
            "South Africa",
            "Libya"
        )

        private val flagImages = arrayOf(
            R.drawable._001_mauritius,
            R.drawable._003_austria,
            R.drawable._007_nicaragua,
            R.drawable._008_estonia,
            R.drawable._013_italy,
            R.drawable._018_lebanon,
            R.drawable._020_iraq,
            R.drawable._022_syria,
            R.drawable._026_qatar,
            R.drawable._027_american_samoa,
            R.drawable._034_china,
            R.drawable._046_micronesia,
            R.drawable._094_south_korea,
            R.drawable._099_albania,
            R.drawable._100_pakistan,
            R.drawable._139_venezuela,
            R.drawable._145_ukraine,
            R.drawable._149_czech_republic,
            R.drawable._162_germany,
            R.drawable._168_bulgaria,
            R.drawable._200_south_africa,
            R.drawable._231_libya
        )

        private val canEnter = arrayOf(
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            false
        )

        fun getAllCountries(): List<Country>{
            val allCountries = mutableListOf<Country>()
            for (i in names.indices){
                allCountries.add(
                    Country(
                        canEnter = canEnter[i],
                        name = names[i],
                        flagImage = flagImages[i]
                    )
                )
            }
            allCountries.shuffle()
            return allCountries
        }
    }
}