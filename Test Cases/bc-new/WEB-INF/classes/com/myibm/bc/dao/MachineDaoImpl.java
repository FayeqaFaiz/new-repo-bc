package com.myibm.bc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myibm.bc.model.Machine;
import com.myibm.bc.dao.MachineDao;



@Repository("machineDao")
public class MachineDaoImpl implements MachineDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addMachine(Machine machine) {
		sessionFactory.getCurrentSession().saveOrUpdate(machine);
	}

	@SuppressWarnings("unchecked")
	public List<Machine> listMachiness() {
		return (List<Machine>) sessionFactory.getCurrentSession().createCriteria(Machine.class).list();
	}

	public Machine getMachine(String serial_no) {
		return (Machine) sessionFactory.getCurrentSession().get(Machine.class, serial_no);
	}

	public void deleteMachine(Machine machine) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Machine WHERE serial_no = "+machine.getSerial_no()).executeUpdate();

	
	}
}
