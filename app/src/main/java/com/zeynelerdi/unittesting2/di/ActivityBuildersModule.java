package com.zeynelerdi.unittesting2.di;

import com.zeynelerdi.unittesting2.ui.note.NoteActivity;
import com.zeynelerdi.unittesting2.ui.noteslist.NotesListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract NotesListActivity contributeNotesListActivity();

    @ContributesAndroidInjector
    abstract NoteActivity contributeNotesActivity();
}
