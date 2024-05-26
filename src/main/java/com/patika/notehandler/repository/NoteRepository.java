package com.patika.notehandler.repository;

import com.patika.notehandler.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
