package com.example.libraryapplication

class Library : LibraryContent {
    override fun getLibraryActivity(): LibraryActivity {
        return LibraryActivity()
    }
}