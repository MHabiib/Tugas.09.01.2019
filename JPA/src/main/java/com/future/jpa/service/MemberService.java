package com.future.jpa.service;
import com.future.jpa.model.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MemberService {
    List<Member> loadAll();

    Member createMember(Member member);
    ResponseEntity<Member> updatedmember(@PathVariable("id") int id, @RequestBody
            Member member);
}
