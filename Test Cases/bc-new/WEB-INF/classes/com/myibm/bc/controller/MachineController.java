package com.myibm.bc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myibm.bc.bean.MachineBean;
import com.myibm.bc.model.Machine;
import com.myibm.bc.service.MachineService;;

public class MachineController {

	@Autowired
	private MachineService machineService;
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveMachine(@ModelAttribute("command") MachineBean machineBean, 
			BindingResult result) {
		Machine machine = prepareModel(machineBean);
		machineService.addMachine(machine);
		return new ModelAndView("redirect:/add.html");
	}

	@RequestMapping(value="/machines", method = RequestMethod.GET)
	public ModelAndView listMachines() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("machines",  prepareListofBean(machineService.listMachiness()));
		return new ModelAndView("machinesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addMachine(@ModelAttribute("command")  MachineBean machineBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("machines",  prepareListofBean(machineService.listMachiness()));
		return new ModelAndView("addMachine", model);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editMachine(@ModelAttribute("command")  MachineBean machineBean,
			BindingResult result) {
		machineService.deleteMachine(prepareModel(machineBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("machine", null);
		model.put("machines",  prepareListofBean(machineService.listMachiness()));
		return new ModelAndView("addMachine", model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteMachine(@ModelAttribute("command")  MachineBean machineBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("machine", prepareMachineBean(machineService.getMachine(machineBean. getSerial_no())));
		model.put("machines",  prepareListofBean(machineService.listMachiness()));
		return new ModelAndView("addMachine", model);
	}
	
	private Machine prepareModel(MachineBean machineBean){
		Machine machine = new Machine();
		machine.setSerial_no(machineBean.getSerial_no());
		machine.setSystem_family(machineBean.getSystem_family());
		machine.setIpaddress(machineBean.getIpaddress());
		machine.setDepartment_code(machineBean.getDepartment_code());
		machine.setLocation(machineBean.getLocation());
		/*machineBean.setSerial_no(null);*/
		return machine;
	}
	
	private List<MachineBean> prepareListofBean(List<Machine> machines){
		List<MachineBean> beans = null;
		if(machines != null && !machines.isEmpty()){
			beans = new ArrayList<MachineBean>();
			MachineBean bean = null;
			for(Machine machine : machines){
				bean = new MachineBean();
				bean.setSerial_no(machine.getSerial_no());
				bean.setSystem_family(machine.getSystem_family());
				bean.setIpaddress(machine.getIpaddress());
				bean.setDepartment_code(machine.getDepartment_code());
				bean.setLocation(machine.getLocation());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private MachineBean prepareMachineBean(Machine machine){
		MachineBean bean = new MachineBean();
		bean.setSerial_no(machine.getSerial_no());
		bean.setSystem_family(machine.getSystem_family());
		bean.setIpaddress(machine.getIpaddress());
		bean.setDepartment_code(machine.getDepartment_code());
		bean.setLocation(machine.getLocation());
		return bean;
	}


	
}
