package com.bignerbranch.android.pract22_2

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "books")
data class Book (
    @PrimaryKey
    val isbn: String,
    val title: String,
    val author: String,
    val coverUrl: String?,
    val description: String?
) : Serializable