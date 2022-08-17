package soloProject.company.member.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    private long memberId;

    private String name;
    private String password;
    private String companyName;
    private Sex sex;

    @OneToOne(mappedBy = "member")
    private CompanyType companyType;

    @OneToOne(mappedBy = "member")
    private CompanyLocation companyLocation;


}
