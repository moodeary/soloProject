package soloProject.company.member.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public enum Sex {
    Female("여성"),
    Male("남성");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }
}
