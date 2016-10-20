package com.sunday.trybc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sunday.trybc.dao.MachineDao;
import com.sunday.trybc.model.Machine;


@Service("machineService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MachineServiceImpl implements MachineService {

	@Autowired
	private MachineDao machineDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addMachine(Machine machine) {
		machineDao.addMachine(machine);
	}
	
	public List<Machine> listMachiness() {
		return machineDao.listMachiness();
	}

/*	public Machine getMachine(int result,int offsetreal) {
		return machineDao.getMachine(result, offsetreal);
	}*/
	
	public List<Machine> getMachine(int result,int offsetreal){
		return MachineDao.getMachine(result, offsetreal);
	}
	
	public void deleteMachine(Machine machine) {
		machineDao.deleteMachine(machine);
	}

}
