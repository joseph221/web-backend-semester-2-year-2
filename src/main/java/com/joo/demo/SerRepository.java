package com.joo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerRepository extends JpaRepository<Service,Long> {
    
}
