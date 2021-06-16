package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {

  @RequestMapping("/topicos")
  public List<TopicoDto> lista() {
    Topico topico = new Topico("Dúvida", "Duvida com Spring"
        , new Curso("Spring","Programação"));

    return TopicoDto.converter(Arrays.asList(topico, topico, topico));
  }

}
