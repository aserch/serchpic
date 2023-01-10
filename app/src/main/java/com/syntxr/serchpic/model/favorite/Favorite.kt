package com.syntxr.serchpic.model.favorite

import com.google.gson.annotations.SerializedName

data class Favorite(
    @SerializedName("post_id")
    val postId: Int,
    @SerializedName("user_id")
    val userId: Int
)
