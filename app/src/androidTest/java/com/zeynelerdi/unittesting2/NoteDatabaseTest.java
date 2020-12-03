package com.zeynelerdi.unittesting2;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;

import com.zeynelerdi.unittesting2.models.Note;
import com.zeynelerdi.unittesting2.persistence.NoteDao;
import com.zeynelerdi.unittesting2.persistence.NoteDatabase;
import com.zeynelerdi.unittesting2.util.TestUtil;

import org.junit.After;
import org.junit.Before;

public abstract class NoteDatabaseTest {

    // system under test
    private NoteDatabase noteDatabase;


    public NoteDao getNoteDao(){
        return noteDatabase.getNoteDao();
    }

    @Before
    public void init(){
        noteDatabase = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                NoteDatabase.class
        ).build();
    }

    @After
    public void finish(){
        noteDatabase.close();
    }
}






