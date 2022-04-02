package itc_hoseo.sample.repo.impl;

import itc_hoseo.sample.domain.Member;
import itc_hoseo.sample.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class DBMemberRepository implements MemberRepository{
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Member> findAll() {
        return template.query("select * from member",
                new BeanPropertyRowMapper<>(Member.class));

    }

    @Override
    public Member save(Member m) {
        template.update("insert into member value(?,?)",
                m.getName(),m.getAge());
        return m;
    }
}
