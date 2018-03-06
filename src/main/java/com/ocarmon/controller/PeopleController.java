/**
 * 
 */
package com.ocarmon.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocarmon.entity.People;
import com.ocarmon.repository.PeopleRepository;

/**
 * @author 李浩铭
 * @since 2018年3月6日 上午9:50:57
 */
@RestController
public class PeopleController {
	
	private static final Logger LOGGER = Logger.getLogger(PeopleController.class);
	@Autowired
	private PeopleRepository peopleRepository;

	@RequestMapping("find")
	public List<People> find() {
		LOGGER.info("123");
		return peopleRepository.findAll();
	}
	
	@RequestMapping("save")
	public void save() {
		People people=new People();
		people.setAge(20);
		people.setGrade("四年级");
		people.setName("李大大");
		peopleRepository.save(people);
	}
}
