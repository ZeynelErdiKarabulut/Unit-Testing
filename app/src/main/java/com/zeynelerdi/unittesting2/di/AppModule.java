package com.zeynelerdi.unittesting2.di;

import android.app.Application;

import androidx.room.Room;

import com.zeynelerdi.unittesting2.persistence.NoteDao;
import com.zeynelerdi.unittesting2.persistence.NoteDatabase;
import com.zeynelerdi.unittesting2.repository.NoteRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static com.zeynelerdi.unittesting2.persistence.NoteDatabase.DATABASE_NAME;

@Module
class AppModule {

    @Singleton
    @Provides
    static NoteDatabase provideNoteDatabase(Application application){
        return Room.databaseBuilder(
                application,
                NoteDatabase.class,
                DATABASE_NAME
        ).build();
    }

    @Singleton
    @Provides
    static NoteDao provideNoteDao(NoteDatabase noteDatabase){
        return noteDatabase.getNoteDao();
    }


    @Singleton
    @Provides
    static NoteRepository provideNoteRepository(NoteDao noteDao){
        return new NoteRepository(noteDao);
    }
}















