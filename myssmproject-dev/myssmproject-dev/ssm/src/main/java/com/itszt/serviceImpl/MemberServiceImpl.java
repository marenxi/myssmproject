package com.itszt.serviceImpl;

import com.itszt.dao.MemberMapper;
import com.itszt.entity.Member;
import com.itszt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> findById(Integer id) {
        return memberMapper.findById(id);
    }
}
