package soloProject.company.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soloProject.company.member.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {
}
