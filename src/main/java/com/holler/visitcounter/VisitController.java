package com.holler.visitcounter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisitController {
	
	public int vCount;
	
	@RequestMapping ("/")
	public String index(HttpSession session) { 
		session.setAttribute("count", 0);
		return "index.jsp";
		}

	@RequestMapping ("/counter")
	public String counter(Model model) {
		model.addAttribute("count", vCount);
		vCount++;
		return "counter.jsp";
	}
	
	}

