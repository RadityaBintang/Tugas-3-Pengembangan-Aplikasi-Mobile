package com.filkom.lazylayout

import androidx.annotation.DrawableRes

data class Gadget(
    val id: Int,
    val name: String,
    val description: String,
    @DrawableRes val imageRes: Int
)


val gadgets = listOf(
    Gadget(1, "Smartphone", "Perangkat komunikasi genggam", R.drawable.smartphone),
    Gadget(2, "Laptop", "Komputer portabel untuk bekerja", R.drawable.laptop),
    Gadget(3, "Tablet", "Perangkat layar sentuh antara hp dan laptop", R.drawable.tablet),
    Gadget(4, "Smartwatch", "Jam tangan pintar pelacak kesehatan", R.drawable.smartwatch),
    Gadget(5, "Earbuds", "Perangkat audio nirkabel", R.drawable.earbuds),
    Gadget(6, "Laptop", "Perangkat komputasi portabel", R.drawable.laptop),
    Gadget(7, "Smartphone", "Perangkat komunikasi genggam", R.drawable.smartphone),
    Gadget(8, "Laptop", "Komputer portabel untuk bekerja", R.drawable.laptop),
    Gadget(9, "Tablet", "Perangkat layar sentuh antara hp dan laptop", R.drawable.tablet),
    Gadget(10, "Smartwatch", "Jam tangan pintar pelacak kesehatan", R.drawable.smartwatch),
    Gadget(11, "Earbuds", "Perangkat audio nirkabel", R.drawable.earbuds),
    Gadget(12, "Laptop", "Perangkat komputasi portabel", R.drawable.laptop)
)