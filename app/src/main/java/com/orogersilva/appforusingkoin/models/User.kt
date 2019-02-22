package com.orogersilva.appforusingkoin.models

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("id") val id: Long,
                @SerializedName("name") val name: String
)