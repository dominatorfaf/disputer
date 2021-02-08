package com.android.disputer.schema

import com.android.disputer.enums.Avatar

class User {
    var username: String

    var firstName: String

    var lastName: String

    var email: String

    var avatar: Avatar

    constructor(username: String, email: String, firstName: String, lastName: String, avatar: Avatar)  {
        this.username = username
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.avatar = avatar
    }

    constructor() {
        this.email = "bossfaf.vdovicenco@gmail.com"
        this.lastName = "Vdovicenco"
        this.firstName = "Alexandru"
        this.avatar = Avatar.GIVE_ME_COFFEE
        this.username = "a_vdovicenco"
    }
}