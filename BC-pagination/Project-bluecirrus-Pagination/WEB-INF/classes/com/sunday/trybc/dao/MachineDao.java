package com.sunday.trybc.dao;

import java.util.List;

import com.sunday.trybc.model.Machine;

public interface MachineDao {
	public void addMachine(Machine machine);

	public List<Machine> listMachiness();
	
	/*public Machine getMachine(int result,int offsetreal);*/
	public static List<Machine> getMachine(int result,int offsetreal) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void deleteMachine(Machine machines);

	static int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}