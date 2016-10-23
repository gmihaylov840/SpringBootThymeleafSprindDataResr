package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.TeamDao;
import com.example.domain.Team;

@Controller
public class TeamController {

	@Autowired 
	private TeamDao teamDao;

	@RequestMapping("/hi/{name}")
	public @ResponseBody Team hiThere(@PathVariable String name) {
		return teamDao.findByName(name);
	}
}
