package soloProject.company.member.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import soloProject.company.member.dto.MemberDto;
import soloProject.company.member.entity.CompanyLocation;
import soloProject.company.member.entity.CompanyType;
import soloProject.company.member.entity.Member;
import soloProject.company.member.entity.Sex;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-17T15:52:50+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostToMember(MemberDto.Post requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        Member member = new Member();

        member.setMemberId( requestBody.getMemberId() );
        member.setName( requestBody.getName() );
        member.setPassword( requestBody.getPassword() );
        member.setCompanyName( requestBody.getCompanyName() );
        member.setSex( requestBody.getSex() );

        return member;
    }

    @Override
    public Member memberPatchToMember(MemberDto.Patch requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        Member member = new Member();

        member.setMemberId( requestBody.getMemberId() );
        member.setName( requestBody.getName() );
        member.setPassword( requestBody.getPassword() );
        member.setCompanyName( requestBody.getCompanyName() );
        member.setSex( requestBody.getSex() );
        member.setCompanyType( requestBody.getCompanyType() );
        member.setCompanyLocation( requestBody.getCompanyLocation() );

        return member;
    }

    @Override
    public MemberDto.Response memberToMemberResponse(Member member) {
        if ( member == null ) {
            return null;
        }

        long memberId = 0L;
        String name = null;
        String password = null;
        String companyName = null;
        Sex sex = null;
        CompanyType companyType = null;
        CompanyLocation companyLocation = null;

        memberId = member.getMemberId();
        name = member.getName();
        password = member.getPassword();
        companyName = member.getCompanyName();
        sex = member.getSex();
        companyType = member.getCompanyType();
        companyLocation = member.getCompanyLocation();

        MemberDto.Response response = new MemberDto.Response( memberId, name, password, companyName, sex, companyType, companyLocation );

        return response;
    }

    @Override
    public List<MemberDto.Response> membersToMemberResponses(List<Member> members) {
        if ( members == null ) {
            return null;
        }

        List<MemberDto.Response> list = new ArrayList<MemberDto.Response>( members.size() );
        for ( Member member : members ) {
            list.add( memberToMemberResponse( member ) );
        }

        return list;
    }
}
