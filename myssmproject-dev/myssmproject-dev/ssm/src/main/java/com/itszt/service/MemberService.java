package com.itszt.service;

import com.itszt.entity.Member;

import java.util.List;

public interface MemberService {
    //根据id查询会员信息
    public List<Member> findById(Integer id);
}
