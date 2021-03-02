package com.android.disputer.model

import com.android.disputer.enums.Avatar

data class Dispute (
    var username: String,
    var name: String,
    var avatar: Avatar,
    var text: String
) {

}