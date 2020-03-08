package com.example.exploresubang

object WisataData {
    private val wisataNames = arrayOf("Sari Ater",
        "Wisata Alam Capolaga",
        "Wisata Alam Bukit Pamoyanan",
        "Curug Cileat",
        "Curug Cijalu",
        "Gunung Tangkuban Parahu",
        "Ciater Highland Resort",
        "Paralayang Santiong",
        "Peternakan Buaya",
        "Pantai Pondok Bali")

    private val wisataDetails = arrayOf(
        "Jl. Sariater, Ciater, Kec. Ciater, Kabupaten Subang, Jawa Barat 41281.",
        "Kp. Panaruban Desa, Jl. Raya Cicadas, Cicadas, Sagalaherang, Kabupaten Subang, Jawa Barat 41282",
        "Kawungluwuk, Tanjungsiang, Kabupaten Subang, Jawa Barat 41284",
        "Cibogo, Cupunagara, Gardusayang, Cisalak, Kabupaten Subang, Jawa Barat 41283",
        "Cipancar, Serangpanjang, Pusakamulya, Kiarapedes, Kabupaten Subang, Jawa Barat 41282",
        "Jl. Jend. Ahmad Yani Gg. Gn.Tangkuban Perahu",
        "Jl. Raya Ciater, Nagrak, Ciater, Kabupaten Subang",
        "Cicadas, Sagalaherang, Kabupaten Subang",
        "Blanakan, Kabupaten Subang, Jawa Barat 41259",
        "Mayangan, Legonkulon, Kabupaten Subang, Jawa Barat 41254"
        )

    private val wisataImages = intArrayOf(R.drawable.sariater,
        R.drawable.capolaga,
        R.drawable.pamoyanan,
        R.drawable.curug_cileat,
        R.drawable.curug_cijalu,
        R.drawable.tangkuban_parahu,
        R.drawable.chr,
        R.drawable.santiong,
        R.drawable.buaya,
        R.drawable.pondok_bali)

    private val wisataAdalah = arrayOf(
        "     Ciater adalah desa di kecamatan Ciater, Subang, Jawa Barat, Indonesia. Di Desa Ciater berlokasi objek wisata pemandian air panas alam.",
        "     Capolaga adalah salah satu wisata alam yang berada di Kabupaten Subang, Jawa Barat. Tepatnya berada di Kp. Panaruban, Cicadas, Sagalaherang..",
        "     Bukit Pamoyanan merupakan sebuah perbukitan yang hijau. Panorama apik pemandangan Bukit Pamoyanan membuat banyak traveller berdatangan ke bukit yang juga disebut bukit TanjungSiang.",
        "     Curug Cileat adalah sebuah curug atau air terjun yang terletak di Kabupaten Subang bagian Selatan, Provinsi Jawa Barat, Indonesia.",
        "     Curug Cijalu merupakan wisata air terjun yang berada dalam kawasan cagar alam Gunung Burangrang. Ketinggian curahan air terjun ini mencapai 70 meter.",
        "     Gunung Tangkuban Parahu adalah salah satu gunung yang terletak di Provinsi Jawa Barat, Indonesia. Sekitar 20 km ke arah utara Kota Bandung, dengan rimbun pohon pinus dan hamparan kebun teh di sekitarnya.",
        "     Ciater Highland Resort adalah sebuah Resort di sekitar Lembang Bandung Barat yang dikenal merupakan salah satu Lokasi terbaik dari Tempat Wisata Alam di Subang yang sangat eksotis dan Romantis.",
        "     Bukit Santiong merupakan destinasi wisata baru di wilayah Subang yang sedang naik daun karena menawarkan sensasi liburan seru yang memacu adrenalin.",
        "     Penangkaran buaya Blanakan ini dikelola oleh Perum Perhutani Unit III Jawa Barat. Di wana wisata ini pengunjung dapat melihat ratusan buaya dalam berbagai ukuran yang ditempatkan pada kolam-kolam.",
        "     Obyek Wisata Pantai Pondok Bali Pamanukan di Mayangan Subang Jawa Barat memiliki pesona keindahan yang sangat menarik untuk dikunjungi."
    )

    private val wisataImages2 = intArrayOf(R.drawable.sariater2,
        R.drawable.capolaga2,
        R.drawable.pamoyanan2,
        R.drawable.curug_cileat2,
        R.drawable.curug_cijalu2,
        R.drawable.tangkuban_perahu2,
        R.drawable.chr2,
        R.drawable.santiong2,
        R.drawable.buaya2,
        R.drawable.pondok_bali2
    )
    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataImages[position]
                wisata.adalah = wisataAdalah[position]
                wisata.photo2 = wisataImages2[position]
                list.add(wisata)
            }
            return list
        }
}