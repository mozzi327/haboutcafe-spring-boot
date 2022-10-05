package com.haboutcafe.controller;

import com.haboutcafe.dto.AccessDto;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
public class UserApiController {
    private 

    @PostMapping("/api/users/join")
    public void createUser(@RequestBody AccessDto.Join join) {

    }
}
