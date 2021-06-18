package org.zerock.controller.lecture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex09/*")
@Log4j

public class Ex09Controller {

	@RequestMapping("/sub01")
	public String method01(RedirectAttributes rttr) {
		log.info("ex03, sub01 method");

		return ("redirct:sub02");
	}

	@RequestMapping("/sub02")
	public void method() {
		log.info("ex03, sub02 method");

	}
}
