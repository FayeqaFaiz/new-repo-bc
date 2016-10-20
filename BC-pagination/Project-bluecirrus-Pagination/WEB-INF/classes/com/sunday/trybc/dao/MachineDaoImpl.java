package com.sunday.trybc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunday.trybc.model.Machine;
import com.sunday.trybc.dao.MachineDao;

@Repository("machineDao")
public class MachineDaoImpl implements MachineDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addMachine(Machine machine) {
		sessionFactory.getCurrentSession().saveOrUpdate(machine);
	}

	@SuppressWarnings("unchecked")
	public List<Machine> listMachiness() {
		return (List<Machine>) sessionFactory.getCurrentSession().createCriteria(Machine.class).list();
	}
	
	
	public List<Machine> getMachine(int result,int offsetreal) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Machine.class);
		criteria.setFirstResult(offsetreal);
		criteria.setMaxResults(result);
		List<Machine>  products = (List<Machine>)criteria.list();
		return products;
	}
	

	@Transactional
	public int getSize() {
		return sessionFactory.getCurrentSession().createCriteria(Machine.class).list().size();
	}
 
		
	

	/*public Machine getMachine(int result,int offsetreal) {
		return (Machine) sessionFactory.getCurrentSession().get(Machine.class);
	}
*/
	public void deleteMachine(Machine machine) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM BLUDB.BLUECIRS_PHY_MAC_DETAILS WHERE PHY_SER_ID = "+machine.getPHY_SER_ID()).executeUpdate();
	}

}
