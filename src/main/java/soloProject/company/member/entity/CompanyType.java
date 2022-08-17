package soloProject.company.member.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
public class CompanyType {

    @Id
    @GeneratedValue
    private Long companyTypeId;

    private int CompanyTypeCode;
    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    public void setMember(Member member) {
        this.member = member;
        if (member.getCompanyType() != this) {
            member.setCompanyType(this);
        }
    }
}