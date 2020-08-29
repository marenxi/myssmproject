package com.itszt.dao;

import com.itszt.entity.Member;

import java.util.List;

public interface MemberMapper {
    //根据id查询会员信息
    public List<Member> findById(Integer id);

}
