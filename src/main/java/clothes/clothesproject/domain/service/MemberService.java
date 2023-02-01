package clothes.clothesproject.domain.service;


import clothes.clothesproject.domain.dto.MemberDto;
import clothes.clothesproject.domain.entiry.Area;
import clothes.clothesproject.domain.entiry.Member;
import clothes.clothesproject.domain.entiry.Weather;
import clothes.clothesproject.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberDto memberDto){
        Member member = memberDto.toEntity();
        memberRepository.save(member);
    }

    public void saveArea(Member member, Area area){
        member.setArea(area);
        memberRepository.save(member);
    }
    public void saveWeather(Member member,Weather weather){
        member.setWeather(weather);
        memberRepository.save(member);
    }

    public String listCheck(Member member){
        Member one = memberRepository.findOne(member.getId());
        if(one.getArea()!=null) {
            return "true";
        }
        return "false";
    }


}
