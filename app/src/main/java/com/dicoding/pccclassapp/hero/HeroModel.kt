package com.dicoding.pccclassapp.hero

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HeroModel (
    var photo: Int,
    var name: String,
    var desc: String
) : Parcelable