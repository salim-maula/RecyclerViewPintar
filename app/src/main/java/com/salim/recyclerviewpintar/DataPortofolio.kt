package com.salim.recyclerviewpintar

object DataPortofolio {

    val namaPortofolio = arrayOf(
        "Membuat Aplikasi Running",
        "Membuat Aplikasi Recipe",
        "Membuat Aplikasi Todo List",
        "Membuat Aplikasi Quran",
        "Membuat Aplikasi Restaurant"
    )

    val imagePortofolio = intArrayOf(
        R.drawable.image_satu,
        R.drawable.image_dua,
        R.drawable.iamge_tiga,
        R.drawable.image_empat,
        R.drawable.image_lima
    )

    val detailPortofolio = arrayOf(
        "Membuat Aplikasi Arimatika perhitungan matematika dll",
        "Membuat Aplikasi Portofolio untuk menampung portofolio pernah dibuat",
        "Membuat Aplikasi Portofolio untuk menampung portofolio pernah dibuat",
        "Membuat Aplikasi News, menampilkan data-data berita",
        "Membuat Aplikasi News, menampilkan data-data sehat"
    )

    val listData : ArrayList<ModelPortofolio>
        get() {
            val list =ArrayList<ModelPortofolio>()
            for(posisi in namaPortofolio.indices){
                val modelPortofolio = ModelPortofolio()
                modelPortofolio.namaPortofolio = namaPortofolio[posisi]
                modelPortofolio.detail = detailPortofolio[posisi]
                modelPortofolio.imagePortofolio = imagePortofolio[posisi]
                list.add(modelPortofolio)
            }
                return list
        }

}