package com.sunday.trybc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sunday.trybc.bean.MachineBean;
import com.sunday.trybc.model.Machine;
import com.sunday.trybc.service.MachineService;


@Controller
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
		//model.put("machine", prepareMachineBean(machineService.getMachine(machineBean.getPHY_SER_ID())));
		model.put("machine", null);
		model.put("machines",  prepareListofBean(machineService.listMachiness()));
		return new ModelAndView("addMachine", model);
	}
	
	private Machine prepareModel(MachineBean machineBean){
		Machine machine = new Machine();
		//machine.setSL_NO(machineBean.getSL_NO());
		machine.setPHY_SER_ID(machineBean.getPHY_SER_ID());
		machine.setNO_OF_PROCESSORS(machineBean.getNO_OF_PROCESSORS());
		machine.setIP_ADDR(machineBean.getIP_ADDR());
		machine.setDEPT_ID(machineBean.getDEPT_ID());
		machine.setHDD(machineBean.getHDD());
		machine.setHARD_DRIVE_QTY(machineBean.getHARD_DRIVE_QTY());
		machine.setMEMORY(machineBean.getMEMORY());
		machine.setHOST_NAME(machineBean.getHOST_NAME());
		machine.setSTP_BOND_NO(machineBean.getSTP_BOND_NO());
		machine.setHBA_TYPE(machineBean.getHBA_TYPE());
		machine.setRACK_ID(machineBean.getRACK_ID());
		machine.setOS(machineBean.getOS());
		machine.setREMARKS(machineBean.getREMARKS());
		
		//machineBean.setSL_NO(null);
		return machine;
	}
	
	private List<MachineBean> prepareListofBean(List<Machine> machines){
		List<MachineBean> beans = null;
		if(machines != null && !machines.isEmpty()){
			beans = new ArrayList<MachineBean>();
			MachineBean bean = null;
			for(Machine machine : machines){
				bean = new MachineBean();
				//bean.setSL_NO(machine.getSL_NO());
				bean.setPHY_SER_ID(machine.getPHY_SER_ID());
				bean.setNO_OF_PROCESSORS(machine.getNO_OF_PROCESSORS());
				bean.setIP_ADDR(machine.getIP_ADDR());
				bean.setDEPT_ID(machine.getDEPT_ID());
				bean.setHDD(machine.getHDD());
				bean.setHARD_DRIVE_QTY(machine.getHARD_DRIVE_QTY());
				bean.setMEMORY(machine.getMEMORY());
				bean.setHOST_NAME(machine.getHOST_NAME());
				bean.setSTP_BOND_NO(machine.getSTP_BOND_NO());
				bean.setHBA_TYPE(machine.getHBA_TYPE());
				bean.setRACK_ID(machine.getRACK_ID());
				bean.setOS(machine.getOS());
				bean.setREMARKS(machine.getREMARKS());
				
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private MachineBean prepareMachineBean(Machine machine){
		MachineBean bean = new MachineBean();
		//bean.setSL_NO(machine.getSL_NO());
		bean.setPHY_SER_ID(machine.getPHY_SER_ID());
		bean.setNO_OF_PROCESSORS(machine.getNO_OF_PROCESSORS());
		bean.setIP_ADDR(machine.getIP_ADDR());
		bean.setDEPT_ID(machine.getDEPT_ID());
		bean.setHDD(machine.getHDD());
		bean.setHARD_DRIVE_QTY(machine.getHARD_DRIVE_QTY());
		bean.setMEMORY(machine.getMEMORY());
		bean.setHOST_NAME(machine.getHOST_NAME());
		bean.setSTP_BOND_NO(machine.getSTP_BOND_NO());
		bean.setHBA_TYPE(machine.getHBA_TYPE());
		bean.setRACK_ID(machine.getRACK_ID());
		bean.setOS(machine.getOS());
		bean.setREMARKS(machine.getREMARKS());
		
		return bean;
	}


	
}

