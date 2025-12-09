package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Subject;
import com.demo.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	SubjectService subservice;

	@GetMapping("/showSubject")
	public ModelAndView getAllSubject(HttpSession session) {
		Student stu = (Student) session.getAttribute("stu");
		if (stu != null) {
			List<Subject> slist = subservice.findAllSubject();
			for (Subject s : slist)
				System.out.println(s);
			session.setAttribute("slist", slist);
			System.out.println(slist);
			return new ModelAndView("displaySubject");
		}
		return new ModelAndView("showLogin", "message", "No Product Found");
	}

	@GetMapping("/addSubject")
	public String addSubjectForm(Model m) {
		m.addAttribute("s1", new Subject());
		return "insertSubject";
	}

	@PostMapping("/addNewSubject")
	public ModelAndView addNewSubject(@ModelAttribute Subject s1) {

		boolean status = subservice.addNewSub(s1);
		if (status) {
			return new ModelAndView("displaySubject", "message", "Subject Added Successfully");
		}
		return new ModelAndView("displaySubject", "message", "Subject Not Added...!");
	}

	@GetMapping("/deletesubject/{sid}")
	public ModelAndView deleteSubject(@PathVariable("sid") int sid) {
		boolean status = subservice.deleteSub(sid);
		if (status) {
			return new ModelAndView("redirect:/subject/showSubject");
		}
		return new ModelAndView("displaySubject", "message", "Subject Not deleted...!");
	}

	@GetMapping("editsubject/{sid}")
	public ModelAndView editSubject(@PathVariable int sid) {
		Subject s = subservice.getById(sid);
		if (s != null) {
			return new ModelAndView("updateSubject", "sub", s);
		} else {
			return new ModelAndView("redirect:/subject/showSubject");
		}
	}

	@PostMapping("/modifySubject")
	public ModelAndView modifySubject(@ModelAttribute Subject s) {
		boolean status = subservice.editSubject(s);
		if (status) {
			return new ModelAndView("redirect:/subject/showSubject");
		}
		return new ModelAndView("displaySubject", "message", "Subject Not deleted...!");
	}

}
