package com.example.myrecyclerview

import android.os.Parcel
import android.os.Parcelable

data class Hero(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Hero

        if (name != other.name) return false
        if (detail != other.detail) return false
        if (photo != other.photo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + detail.hashCode()
        result = 31 * result + photo
        return result
    }
}