package com.fnma.daos;

import com.fnma.models.Bio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BioDAO extends JpaRepository<Bio, Integer> {

    List<Bio> findAllByOrderByName();
}
