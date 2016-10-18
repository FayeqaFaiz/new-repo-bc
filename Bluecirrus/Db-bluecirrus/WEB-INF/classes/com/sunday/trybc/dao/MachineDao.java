package com.sunday.trybc.dao;

import java.util.List;

import com.sunday.trybc.model.Machine;

public interface MachineDao {
	public void addMachine(Machine machine);

	public List<Machine> listMachiness();
	
	public Machine getMachine(long PHY_SER_ID);
	
	public void deleteMachine(Machine machines);

}