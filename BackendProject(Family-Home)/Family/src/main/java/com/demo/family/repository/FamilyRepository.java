package com.demo.family.repository;

import com.demo.family.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family,Long> {

    Family findFamilyById(Long id);
}
