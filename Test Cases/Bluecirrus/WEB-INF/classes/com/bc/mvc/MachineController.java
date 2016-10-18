package com.bc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.bc.mvc.Machine;

@Controller
public class MachineController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView machine_index(){
		return new ModelAndView("machine","command",new Machine());
	}
	
	@RequestMapping(value = "/machine", method = RequestMethod.GET)
	public ModelAndView machine(){
		return new ModelAndView("machine","command",new Machine());
	}
	   
	@RequestMapping(value = "/addMachine", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Machine machine, 
	   ModelMap model) {
	      model.addAttribute("serial_number", machine.getSerial_number());
	      model.addAttribute("system_family", machine.getSystem_family());
	      model.addAttribute("location", machine.getLocation());
	      
	      return "displaylist";
	   }
}
