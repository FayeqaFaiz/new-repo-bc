package com.myibm.bc.dao;

import java.util.List;


import com.myibm.bc.model.Machine;

public interface MachineDao {
	public void addMachine(Machine machine);

	public List<Machine> listMachiness();
	
	public Machine getMachine(String serial_no);
	
	public void deleteMachine(Machine machines);

}
