package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.Tencent;
import com.mian.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * com.mian.controller
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/14.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;
    private Account account;

    @RequestMapping(value = "/findByOpenId")
    public Account findByOpenId(@RequestBody Tencent tencent){
        account = accountRepository.findByOpenId(tencent.getOpenId());
        if (account == null) {
            account = new Account();
            account.setOpenId(tencent.getOpenId());
            account.setAccountUuid(UUID.randomUUID().toString());
            account.setHeadPortrait(tencent.getProfilePhoto());
            account.setUserName(tencent.getNickname());
            accountRepository.save(account);
        }
        return account;
    }

    @RequestMapping(value = "/findByUuid")
    public Account findByAccountUuid (@RequestBody String uuid){
        account = accountRepository.findByOpenId(uuid);
        if (account == null) {
            account = new Account();
        }
        return account;
    }

}
