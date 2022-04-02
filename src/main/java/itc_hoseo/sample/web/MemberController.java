package itc_hoseo.sample.web;

import itc_hoseo.sample.domain.Member;
import itc_hoseo.sample.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/")
    public String index(ModelMap mm){

        mm.put("members",memberRepository.findAll());
        return "index";
    };

    @RequestMapping("/save")
    public String save(Member member){
        memberRepository.save(member);
        return "redirect:/";
    }
}
