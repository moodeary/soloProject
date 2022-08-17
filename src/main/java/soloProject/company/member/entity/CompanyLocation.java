package soloProject.company.member.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class CompanyLocation {

    @Id
    @GeneratedValue
    private Long companyLocationId;

    private int CompanyLocationCode;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    public void setMember(Member member) {
        this.member = member;
        if (member.getCompanyLocation() != this) {
            member.setCompanyLocation(this);
        }
    }
}
