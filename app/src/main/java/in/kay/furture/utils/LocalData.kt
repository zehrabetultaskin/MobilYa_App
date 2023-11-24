package `in`.kay.furture.utils

import `in`.kay.furture.R
import `in`.kay.furture.models.FurnitureModel
import kotlin.random.Random

fun getCategories() = listOf(
    FurnitureModel("Dolaplar", R.drawable.hall_closet),
    FurnitureModel("Sandalyeler", R.drawable.ic_chair),
    FurnitureModel("Koltuklar", R.drawable.ic_sofa),
    FurnitureModel("Ev Dekorasyonları", R.drawable.ic_home_decor),
    FurnitureModel("Ofis Mobilyaları", R.drawable.ic_office),
    FurnitureModel("Masalar", R.drawable.ic_table),
)

fun getRecommended(): List<FurnitureModel>   {
    val list = mutableListOf<FurnitureModel>()
    list.add(getChairs()[(0 until getChairs().size).random()])
    list.add(getOffices()[(0 until getOffices().size).random()])
    list.add(getSofas()[(0 until getSofas().size).random()])
    list.add(getHomeDecors()[(0 until getHomeDecors().size).random()])
    list.add(getTables()[(0 until getTables().size).random()])
    list.add(getClosets()[(0 until getClosets().size).random()])
    return list
}

fun getChairs() = listOf(
    FurnitureModel(
        "Modern Sandalye",
        R.drawable.chair_grey,
        price = randomPrice(100, 200),
        description = randomDescription("Modern Sandalye"),
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/chair/arm_chair__furniture/scene.gltf",
        type = "chair"
    ),
    FurnitureModel(
        "Manchester Sandalye",
        R.drawable.chair_old,
        price = randomPrice(100, 200),
        description = randomDescription("Manchester Sandalye"),
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/the_matrix_red_chesterfield_chair/scene.gltf",
        type = "chair"
    ),
    FurnitureModel(
        "Turuncu Parlak Sandalye",
        R.drawable.chair_orange,
        price = randomPrice(100, 200),
        description = randomDescription("Turuncu Parlak Sandalye"),
        link = "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/SheenChair/glTF/SheenChair.gltf",
        type = "chair"
    ),
    FurnitureModel(
        "Klasik Sandalye",
        R.drawable.chair_wood,
        price = randomPrice(100, 200),
        description = randomDescription("Klasik Sandalye"),
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/chair/furniture_for_real-time_visualization_engine/scene.gltf",
        type = "chair"
    ),
)

fun getSofas() = listOf(
    FurnitureModel(
        "Kadife Koltuk",
        R.drawable.sofa1,
        price = randomPrice(400, 1000),
        description = randomDescription("Kadife Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/GlamVelvetSofa/glTF/GlamVelvetSofa.gltf"
    ),
    FurnitureModel(
        "Deri Koltuk",
        R.drawable.sofa2,
        price = randomPrice(400, 1000),
        description = randomDescription("Deri Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/sofas/sofa_game_ready__2k_pbr/scene.gltf"
    ),
    FurnitureModel(
        "Lüks Koltuk",
        R.drawable.sofa3,
        price = randomPrice(400, 1000),
        description = randomDescription("Lüks Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/victorian_lounge_sofa/scene.gltf"
    ),
    FurnitureModel(
        "Chesterfield Koltuk",
        R.drawable.sofa5,
        price = randomPrice(400, 1000),
        description = randomDescription("Chesterfield Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/sofa_02_4k.gltf/sofa_02_4k.gltf"
    ),
    FurnitureModel(
        "Modern Koltuk",
        R.drawable.sofa6,
        price = randomPrice(400, 1000),
        description = randomDescription("Modern Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/sofa_6/scene.gltf"
    ),
    FurnitureModel(
        "Lawson Koltuk",
        R.drawable.sofa8,
        price = randomPrice(400, 1000),
        description = randomDescription("Lawson Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/sofas/sofa/scene.gltf"
    ),
    FurnitureModel(
        "Kahverengi Koltuk",
        R.drawable.brown_sofa,
        price = randomPrice(400, 1000),
        description = randomDescription("Kahverengi Koltuk"),
        type = "sofa",
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/Kahverengi_derikoltuk/scene.gltf"
    )
)
fun getClosets()= listOf(
    FurnitureModel(
        "Şık Gardırop",
        R.drawable.bedroom_closet,
        price = randomPrice(100, 300),
        description = randomDescription("Şık Gardırop"),
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/scene.gltf",
        type = "closet"
    ),
    FurnitureModel(
        "Klasik Gardırop",
        R.drawable.classic_closet,
        price = randomPrice(100, 300),
        description = randomDescription("Klasik Gardırop"),
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/closet_30322/scene.gltf",
        type = "closet"
    ),
    FurnitureModel(
        "Antre Dolabı",
        R.drawable.hall_closet,
        price = randomPrice(100, 300),
        description = randomDescription("Antre Dolabı"),
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/hall_closet_t241122/scene.gltf",
        type = "closet"
    ),
)
fun randomDescription(type: String): String {
    return "Bu $type elegant ve fonksiyonel mobilyadır. Evinizi şık tasarımlarla donatmak için özel olarak tasarladık. Yoğun iş temposu sonrası dinlenmek, ailenizle keyifli vakit geçirebilmek ve en iyi partileri verip eğlenebilmek için tam size göre."
}

fun randomPrice(lowerPrice: Int, upperPrice: Int): Int {
    return (lowerPrice..upperPrice).random()
}

fun getHomeDecors() = listOf(
    FurnitureModel(
        "Lambader",
        R.drawable.floor_lamp,
        price = randomPrice(20, 50),
        description = randomDescription("Lambader"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/Beyaz_Lambader(eklenmedi)/scene.gltf"
    ),
    FurnitureModel(
        "Modern Vazo",
        R.drawable.dec1,
        price = randomPrice(20, 50),
        description = randomDescription("Modern Vazo"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/decor/lavender_vase/scene.gltf"
    ),
    FurnitureModel(
        "Lamba",
        R.drawable.dec2,
        price = randomPrice(20, 50),
        description = randomDescription("Lamba"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/decor/lamp/scene.gltf"
    ),
    FurnitureModel(
        "Çiçekler",
        R.drawable.dec3,
        price = randomPrice(20, 50),
        description = randomDescription("Çiçekler"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/decor/flower_vase%20(1)/scene.gltf"
    ),
    FurnitureModel(
        "Vazo",
        R.drawable.twin_vase,
        price = randomPrice(20, 50),
        description = randomDescription("Vazo"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/2_Vazo(eklenmedi)/scene.gltf"
    ),
    FurnitureModel(
        "Çiçek Vazo",
        R.drawable.flowers_vase,
        price = randomPrice(20, 50),
        description = randomDescription("Çiçek Vazosu"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/Cicek_vazosu(eklenmedi)/scene.gltf"
    ),
    FurnitureModel(
        "Resim Tablosu",
        R.drawable.piazza,
        price = randomPrice(20, 50),
        description = randomDescription("Resim Tablosu"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/Resim_tablosu/scene.gltf"
    ),
    FurnitureModel(
        "Lav Lambası",
        R.drawable.lava_lamp,
        price = randomPrice(20, 50),
        description = randomDescription("Lav Lambası"),
        type = "home decoration",
        link = "https://raw.githubusercontent.com/zehrabetultaskin/template/master/Lav_Lambası/scene.gltf"
    )


)

fun getOffices() = listOf(
    FurnitureModel(
        "Oyuncu Sandalyesi",
        R.drawable.office,
        price = randomPrice(50, 80),
        description = randomDescription("Oyuncu Sandalyesi"),
        type = "office",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/office%20essentials%20and%20cabinets/gaming_chair_1-_black/scene.gltf"
    ),
    FurnitureModel(
        "Klasik Sandalye",
        R.drawable.office_chair,
        price = randomPrice(50, 80),
        description = randomDescription("Klasik Sandalye "),
        type = "office",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/office%20essentials%20and%20cabinets/office_chair%20(1)/scene.gltf"
    ),
    FurnitureModel(
        "Çalışma Masası",
        R.drawable.office_desk,
        price = randomPrice(50, 80),
        description = randomDescription("Çalışma Masası"),
        type = "office",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/office%20essentials%20and%20cabinets/modern_table_set/scene.gltf"
    )
)

fun getTables() = listOf(
    FurnitureModel(
        "Masa",
        R.drawable.table1,
        price = randomPrice(50, 80),
        description = randomDescription("Masa"),
        type = "table",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/table/mahogany_table/scene.gltf"
    ),
    FurnitureModel(
        "Ahşap Masa",
        R.drawable.table2,
        price = randomPrice(50, 80),
        description = randomDescription("Ahşap Masa"),
        type = "table",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/office%20essentials%20and%20cabinets/simple_desk_free/scene.gltf"
    ),
    FurnitureModel(
        "Metal Masa",
        R.drawable.table3,
        price = randomPrice(50, 80),
        description = randomDescription("Metal Masa"),
        type = "table",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/table/industrial_table/scene.gltf"
    ),
    FurnitureModel(
        "Klasik Masa",
        R.drawable.table4,
        price = randomPrice(50, 80),
        description = randomDescription("Klasik Masa"),
        type = "table",
        link = "https://raw.githubusercontent.com/Sachinbhola/App-Templates/master/Resources/table/victorian_coffee_table/scene.gltf"
    )
)

fun getSize(idx: Int): Int {
    return when (idx) {
        0 -> getChairs().size
        1 -> getSofas().size
        2 -> getHomeDecors().size
        3 -> getOffices().size
        4 -> getTables().size
        5 -> getClosets().size

        else -> 0
    }
}

