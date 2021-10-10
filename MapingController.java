package com.maping.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.maping.dto.SaveMapingData;
import com.maping.entity.Maping;
import com.maping.services.MapingServices;

@Controller
public class MapingController {
	
@Autowired
private MapingServices mapingServices;

	
@RequestMapping("/showSaveMaping")
public String showSaveMaping() {
	return "savemaping";
}
//@RequestMapping("/savemaping")
//public String savemapinginfo(@RequestParam("id") Long id,@RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("type") String type) {
//	Maping maping = new Maping();
//	 maping.setId(id);
//	 maping.setName(name);
//	 maping.setCode(code);
//	 maping.setType(type);
//	 mapingServices.saveHemanth(maping);
//	return "savemaping";
//}
//@RequestMapping("/savemaping")
//public String savemapinginfo(SaveMapingData mapingData) {
//	Maping maping= new Maping();
//	maping.setId(mapingData.getId());
//	maping.setCode(mapingData.getCode());
//	maping.setName(mapingData.getName());
//	maping.setType(mapingData.getType());
//	
//	mapingServices.saveHemanth(maping);
//	
//	return "savemaping";
//}
@RequestMapping("/savemaping")
public String savemapinginfo(@ModelAttribute("xxx") Maping abc) {
	
	
	mapingServices.saveHemanth(abc);
	
	return"welcome";
}
}
