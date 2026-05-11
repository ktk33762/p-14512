package com.back.domain.member.controller;

import com.back.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class MemberController {
    private final MemberService memberService;
}
