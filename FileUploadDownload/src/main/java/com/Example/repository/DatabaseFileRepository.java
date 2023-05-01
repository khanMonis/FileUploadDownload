package com.Example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Example.model.DatabaseFile;
@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String>{

}
