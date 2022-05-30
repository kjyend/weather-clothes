package clothes.clothesproject.domain.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column
    private String loginId;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String dob;



//
//    public Member(MemberDto member) {
//        this.loginId=member.getLoginId();
//        this.password=member.getPassword();
//        this.name=member.getName();
//        this.name=member.getDob();
//    }
}
