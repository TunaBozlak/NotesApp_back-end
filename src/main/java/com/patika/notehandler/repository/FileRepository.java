package com.patika.notehandler.repository;

import com.patika.notehandler.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
