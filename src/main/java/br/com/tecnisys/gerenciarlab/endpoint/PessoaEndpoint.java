package br.com.tecnisys.gerenciarlab.endpoint;

import br.com.tecnisys.gerenciarlab.entity.Pessoa;
import br.com.tecnisys.gerenciarlab.service.PessoaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class PessoaEndpoint {
    private final PessoaService pessoaService;

    public PessoaEndpoint(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/listar")
    public List<Pessoa> listAll(){
        return pessoaService.listAll();
    }
}
