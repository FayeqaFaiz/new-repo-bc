package com.myibm.bc.service;

import java.util.List;


import com.myibm.bc.model.Machine;


public interface MachineService {
	public void addMachine(Machine machine);

	public List<Machine> listMachiness();
	
	public Machine getMachine(String serial_no);
	
	public void deleteMachine(Machine machine);

	
}
