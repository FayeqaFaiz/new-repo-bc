package com.sunday.trybc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunday.trybc.model.Machine;
import com.sunday.trybc.dao.MachineDao;

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

	public Machine getMachine(long PHY_SER_ID) {
		return (Machine) sessionFactory.getCurrentSession().get(Machine.class, PHY_SER_ID);
	}

	public void deleteMachine(Machine machine) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM BLUDB.BLUECIRS_PHY_MAC_DETAILS WHERE PHY_SER_ID = "+machine.getPHY_SER_ID()).executeUpdate();
	}

}
