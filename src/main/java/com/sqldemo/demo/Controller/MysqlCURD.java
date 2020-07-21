package com.sqldemo.demo.Controller;

import com.sqldemo.demo.Repo.UsersRepo;
import com.sqldemo.demo.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sql")
public class MysqlCURD {
	
	@Autowired
  	private UsersRepo usersRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
		Users n = new Users();
		n.setName(name);
		n.setEmail(email);
		usersRepository.save(n);
		return "Saved";
  }

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Users> getAllUsers() {
		return usersRepository.findAll();
	}
}