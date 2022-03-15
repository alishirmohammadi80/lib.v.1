package com.rasha.WarehouseProject.member;

import com.rasha.WarehouseProject.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
  public Member addMember(Member member){
      return memberRepository.save(member);
  }
    public Member delitMember(Long id){
       memberRepository.deleteById(id);
        return null;
    }
    public Member editeMember(Member member){
        return memberRepository.save(member);

    }
    public Iterable<Member>getAllMembers(){
        return memberRepository.findAll();

    }
    public Member getMemberById(Long id) {
        return memberRepository.findById(id).get();
    }

}



