package com.example


import com.google.gson.annotations.SerializedName

data class Target(
    @SerializedName("namespace")
    val namespace: String,
    @SerializedName("package_name")
    val packageName: String,
    @SerializedName("sha256_cert_fingerprints")
    val sha256CertFingerprints: List<String>
)