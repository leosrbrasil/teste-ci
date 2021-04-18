package br.com.leosrbrasil.testeci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TesteController {

	@GetMapping
	public String index() {
		return "teste-ci 2";
	}
	
}
