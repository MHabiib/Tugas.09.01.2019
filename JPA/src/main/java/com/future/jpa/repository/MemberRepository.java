package com.future.jpa.repository;

import com.future.jpa.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    Member findById(int id);
    Member findByName(String name);
}
