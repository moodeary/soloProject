package soloProject.company.member.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import soloProject.company.member.dto.MemberDto;
import soloProject.company.member.entity.Member;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {

    Member memberPostToMember(MemberDto.Post requestBody);

    Member memberPatchToMember(MemberDto.Patch requestBody);

    MemberDto.Response memberToMemberResponse(Member member);

    List<MemberDto.Response> membersToMemberResponses(List<Member> members);
}
