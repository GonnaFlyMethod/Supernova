package com.example.supernova.controllers;

import com.example.supernova.model.Note;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteAPIService {
    Note note = null;
    @GetMapping("{noteID}")
    public Note getNoteDetails(String noteID){
        return note;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        this.note = new Note(note.getTitle(), note.getContent());
        return this.note;
    }

    @PutMapping
    public Note updateNote(@RequestBody Note note){
        this.note.setTitle(note.getTitle());
        this.note.setTitle(note.getContent());
        return this.note;
    }

    @DeleteMapping("{vendorID}")
    public void deleteNote(String vendorID){
        this.note = null;
    }
}
