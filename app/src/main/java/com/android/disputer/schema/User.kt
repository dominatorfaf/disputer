package com.android.disputer.schema

import com.android.disputer.enums.Avatar

class User {
    private var username: String = "Vdovicenco"
    private var email: String = "bossfaf.vdovicenco@gmail.com"
    private var avatar: Avatar = Avatar.GIVE_ME_COFFEE

    constructor(username: String, email: String, avatar: Avatar)  {
        this.username = username;
        this.email = email
        this.avatar = avatar
    }
}