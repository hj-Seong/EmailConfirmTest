package com.sen.gittest.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PageControllerTest {

	@GetMapping("/test/board/imageForm")
	public String imageForm() {
		return "board/imageForm";
	}
}
