package com.itszt.contorller;

import com.itszt.dao.MemberMapper;
import com.itszt.entity.Member;
import com.itszt.service.MemberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/findMember")
    @ResponseBody
    public List<Member> findMember(@Param("id") Integer id,Model model){
        List<Member> list = memberService.findById(id);
        //model.addAttribute("list", list);
        System.out.println(list);
        return list;
    }

}
