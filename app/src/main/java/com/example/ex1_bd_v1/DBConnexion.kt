package com.example.ex1_bd_v1

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.ArrayList

class DBConnexion(context: Context) : SQLiteOpenHelper(context, "Personnes.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Admin (ID INTEGER PRIMARY KEY, Name TEXT);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS Admin")
        onCreate(db)
    }

    fun insertNewAdmin(name: String) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("Name", name)
        db.insert("Admin", null, contentValues)
    }

    fun deleteRow(id: Int) {
        val db = this.writableDatabase
        db.delete("Admin", "ID=?", arrayOf(id.toString()))
    }

    fun updateRow(name: String, id: Int) {
        val db = this.writableDatabase
        db.execSQL("UPDATE Admin SET Name='$name' WHERE ID=$id")
    }

    fun getAllRecord(): ArrayList<String> {
        val list = ArrayList<String>()
        val db = this.readableDatabase
        val res: Cursor = db.rawQuery("SELECT * FROM Admin", null)
        res.moveToFirst()
        while (!res.isAfterLast) {
            list.add(res.getString(res.getColumnIndex("ID")) + " - " + res.getString(res.getColumnIndex("Name")))
            res.moveToNext()
        }
        return list
    }
}