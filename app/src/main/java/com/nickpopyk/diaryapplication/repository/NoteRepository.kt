package com.nickpopyk.diaryapplication.repository

import androidx.lifecycle.LiveData
import com.nickpopyk.diaryapplication.dao.NotesDao
import com.nickpopyk.diaryapplication.model.Note

class NoteRepository(private val notesDao: NotesDao) {


    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }
}