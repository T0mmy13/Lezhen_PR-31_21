package com.example.lezhen_pr31_r21

import java.util.Date
import java.util.UUID

class Crime (val id: UUID = UUID.randomUUID()) {
    val date = Date()
    val enable = false
    val string = ""
}