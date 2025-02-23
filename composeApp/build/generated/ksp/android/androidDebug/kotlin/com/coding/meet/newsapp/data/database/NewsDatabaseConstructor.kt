package com.coding.meet.newsapp.`data`.database

import androidx.room.RoomDatabaseConstructor

public actual object NewsDatabaseConstructor : RoomDatabaseConstructor<NewsDatabase> {
  actual override fun initialize(): NewsDatabase =
      com.coding.meet.newsapp.`data`.database.NewsDatabase_Impl()
}
