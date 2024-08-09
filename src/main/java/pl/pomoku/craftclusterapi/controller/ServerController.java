package pl.pomoku.craftclusterapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/servers")
@Validated
public class ServerController {
    @PostMapping("/add")
    public ResponseEntity<Void> createNewServer() {

    }
}
