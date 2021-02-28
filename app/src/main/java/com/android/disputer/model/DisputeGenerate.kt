package com.android.disputer.model

import com.android.disputer.enums.Avatar

class DisputeGenerate {

    companion object {

        fun createDataSet(): ArrayList<Dispute> {
            val list = ArrayList<Dispute>()
            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.WHAT,
                    "Don't even wanna work anymore."
                )
            )

            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.GIVE_ME_COFFEE,
                    "Don't even wanna work anymore."
                )
            )

            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.NERDY,
                    "Don't even wanna work anymore."
                )
            )

            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.WHAT,
                    "Don't even wanna work anymore."
                )
            )

            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.CLASSY,
                    "Don't even wanna work anymore."
                )
            )

            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.GIVE_ME_COFFEE,
                    "Don't even wanna work anymore."
                )
            )

            list.add(
                Dispute(
                    "ayeeitsdelilaa",
                    "lilaaaa____",
                    Avatar.DEFAULT,
                    "Don't even wanna work anymore."
                )
            )

            return list
        }
    }
}