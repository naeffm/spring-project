package one.digitalinnovation.gof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "Bem-vindo!"; // Página simples de boas-vindas
    }

    @GetMapping("/user-home")
    @ResponseBody
    public String userHome() {
        return "Usuário autorizado, mas sem privilégios especiais."; // Mensagem simples para usuários
    }
}
