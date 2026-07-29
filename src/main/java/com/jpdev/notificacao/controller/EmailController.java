package com.jpdev.notificacao.controller;

import com.jpdev.notificacao.business.EmailService;
import com.jpdev.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviaEmail(@RequestBody TarefasDTO dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
