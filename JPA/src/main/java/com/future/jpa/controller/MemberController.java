package com.future.jpa.controller;

import com.future.jpa.model.Driver;
import com.future.jpa.model.Member;
import com.future.jpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/member")
    public List<Member> loadAll (){
        return memberService.loadAll();
    }

    @PostMapping("/member/create")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @PutMapping("/member/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable("id") int id, @RequestBody Member member) {
        return memberService.updatedmember(id,member);
    }
}
