package itc_hoseo.sample.repo;

import itc_hoseo.sample.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public interface MemberRepository {
    List<Member> findAll();
    Member save(Member m);
}
