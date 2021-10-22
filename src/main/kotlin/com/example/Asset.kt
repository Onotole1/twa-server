package com.example


import com.google.gson.annotations.SerializedName

data class Asset(
    @SerializedName("relation")
    val relation: List<String>,
    @SerializedName("target")
    val target: Target
)