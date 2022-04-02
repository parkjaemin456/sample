package itc_hoseo.sample;

import itc_hoseo.sample.domain.Member;
import itc_hoseo.sample.repo.MemberRepository;
import itc_hoseo.sample.repo.impl.HashMapMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void contextLoads() {
        memberRepository.save(new Member("1",1));
        memberRepository.save(new Member("2",2));
        assertEquals(2,memberRepository.findAll().size());
    }

}
