package com.demo.home.repository;


import com.demo.home.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

    Home findHomeById(Long id);
}
