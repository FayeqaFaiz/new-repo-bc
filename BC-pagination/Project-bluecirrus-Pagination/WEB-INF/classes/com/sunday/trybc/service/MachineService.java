package com.sunday.trybc.service;

import java.util.List;

import com.sunday.trybc.model.Machine;

public interface MachineService {
	public void addMachine(Machine machine);

	public List<Machine> listMachiness();
	
	/*public Machine getMachine(int result,int offsetreal);*/
	public List<Machine> getMachine(int result,int offsetreal);
	
	
	public void deleteMachine(Machine machine);

	
}