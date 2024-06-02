package com.example.lenscorpsassignment.ui.theme.data.repository

import com.example.lenscorpsassignment.R
import com.example.lenscorpsassignment.ui.theme.data.DisplayData

/**
 * Data Source for the App to fetch all data required in UI
 */
class DataRepository {
    fun getActivityHeaderList(): List<String> {
        return listOf(
            "Home",
            "Organisation",
            "DITS/Panel",
            "IRMS",
            "Events",
            "Seniority",
            "Circular",
            "News/Article",
            "IRPOBF"
        )
    }

    fun getContentDataList(): List<DisplayData> {
        return listOf(
            DisplayData(
                "Indian Railway Promotee Officers Federation (IRPOF)",
                "Indian Railways Promotee Officers Federation (IRPOF) is an organization of Promotee officers having its Head Quarter at New Delhi. It functions through its member associations. Zonal Associations functions through divisional bodies across all the 69 divisions of Indian Railways. The aim of the federation is to safeguard interests of promotee officers and provide better career opportunities and working conditions. It works for development and promoting overall efficiency in the working of Railways in the best interest of common people, the nation and the Railway Men.\n" +
                        "\n" +
                        "IRPOF Has Launched This Site To Keep Its Member Informed About The, Latest Activities And Share Views On Topics Of Importance. All The Members Are Requested To Kindly Contribute To Make The Site Useful And Meaningful."
            ),
            DisplayData(
                "Our Mission",
                "Indian Railways Promotee Officers Federation (IRPOF) is an organization of Promotee officers having its Head Quarter at New Delhi. It functions through its member associations. Zonal Associations functions through divisional bodies across all the 69 divisions of Indian Railways."
            ),
            DisplayData(
                "Our Vision",
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways."
            ),
            DisplayData(
                "Image",
                "Following are the images from the recent event held on Friday, 19th January regarding ECM/AGM."
            ),
            DisplayData(
                "Video",
                "Following are the images from the recent event held on Friday, 19th January regarding ECM/AGM."
            )
        )
    }

    fun getTopicList(): List<String> {
        return listOf(
            "Who we are: IRPOF",
            "Mission & Vision",
            "Recent Events",
            "Images",
            "Videos"
        )
    }

    fun getImageList(): List<Int> {
        return listOf(
            R.drawable.homeimage1,
            R.drawable.homeimage2,
            R.drawable.homeimage3
        )
    }
}