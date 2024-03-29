package clothes.clothesproject.domain.dto;

import clothes.clothesproject.domain.entiry.Member;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AreaDto {

    private Long id;
    private String latitude;//위도 nx
    private String hardness;//경도 ny
    private Member member;

}
