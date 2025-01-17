package com.tally.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tally.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

}
