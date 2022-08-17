package soloProject.company.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import soloProject.company.member.entity.Member;
import soloProject.company.member.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createMember(Member member) {
        return null;
    }

    public Member updateMember(Member member) {
        return null;
    }

    public Member findMember (long memberId) {
        return null;
    }

    public Page<Member> findMembers(int page, int size) {
        return null;
    }

    public void deleteMember(long memberId) {

    }



}
