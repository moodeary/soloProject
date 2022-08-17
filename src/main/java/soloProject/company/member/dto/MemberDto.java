package soloProject.company.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import soloProject.company.member.entity.CompanyLocation;
import soloProject.company.member.entity.CompanyType;
import soloProject.company.member.entity.Sex;

public class MemberDto {

    @Getter
    @AllArgsConstructor // TODO 테스트를 위해 추가됨
    public static class Post {
        private long memberId;

        private String name;
        private String password;
        private String companyName;
        private Sex sex;

    }

    @Getter
    @AllArgsConstructor
    public static class Patch {
        private long memberId;

        private String name;
        private String password;
        private String companyName;
        private Sex sex;

        private CompanyType companyType;

        private CompanyLocation companyLocation;
    }

    @AllArgsConstructor
    @Getter
    public static class Response {
        private long memberId;

        private String name;
        private String password;
        private String companyName;
        private Sex sex;
        private CompanyType companyType;
        private CompanyLocation companyLocation;

        public String getSex() {
            return sex.getSex();
        }

        public int getCompanyType() {
            return companyType.getCompanyTypeCode();
        }

        public int getCompanyLocation() {
            return companyLocation.getCompanyLocationCode();
        }
    }
}