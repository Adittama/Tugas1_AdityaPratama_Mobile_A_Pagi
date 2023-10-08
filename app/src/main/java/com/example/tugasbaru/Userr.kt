package com.example.tugasbaru
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Userr (
    val username:String,
    val password:String
): Parcelable
