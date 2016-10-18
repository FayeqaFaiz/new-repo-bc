package com.myibm.bc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myibm.bc.dao.MachineDao;
import com.myibm.bc.model.Machine;

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

	public Machine getMachine(String serial_no) {
		return machineDao.getMachine(serial_no);
	}
	
	public void deleteMachine(Machine machine) {
		machineDao.deleteMachine(machine);
	}
	


}
