package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/viewAll")
	@ResponseBody
	public List<Student> viewStudent()
	{
		return repo.findAll(); 
	}
	@RequestMapping("/view/{id}")
	@ResponseBody
	public Optional<Student> viewStudent(@PathVariable int id)
	{
		return repo.findById(id); 
	}
	@RequestMapping("/add")
	public ModelAndView addStudent()
	{
		ModelAndView mv=new ModelAndView("add");
		return mv;
	}
	@RequestMapping("/submitForm")
	public Student addRecord(@RequestParam int id, @RequestParam String name,@RequestParam String dept, @RequestParam String addr, Student s)
	{
		s.setId(id);
		s.setName(name);
		s.setDept(dept);
		s.setAddr(addr);
		return repo.save(s);
	}
	@RequestMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id,@RequestParam String name,@RequestParam String dept, @RequestParam String addr, Student s) {
	
		s.setId(id);
		s.setName(name);
		s.setDept(dept);
		s.setAddr(addr);
		return repo.save(s);

		
	}
	@RequestMapping("/delete/{id}")
	public String deleteEntry(@PathVariable int id)
	{
		repo.deleteById(id);
		return "deleted";
	}
}
