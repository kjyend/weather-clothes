package clothes.clothesproject.domain.service;

import clothes.clothesproject.domain.entiry.Member;
import clothes.clothesproject.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Member login(String loginId, String password){
        return memberRepository.findByLoginId(loginId).filter(m->m.getPassword().equals(password)).orElse(null);
    }
}