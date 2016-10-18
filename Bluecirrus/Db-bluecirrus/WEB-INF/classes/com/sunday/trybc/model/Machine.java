package com.sunday.trybc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BLUECIRS_PHY_MAC_DETAILS")
public class Machine implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PHY_SER_ID")
	private long PHY_SER_ID;
	
	@Column(name="NO_OF_PROCESSORS")
	private long NO_OF_PROCESSORS;
	
	@Column(name="IP_ADDR")
	private String IP_ADDR;
	
	@Column(name="DEPT_ID")
	private long DEPT_ID;
	
	@Column(name="HDD")
	private long HDD;
	
	@Column(name="HARD_DRIVE_QTY")
	private long HARD_DRIVE_QTY;
	
	@Column(name="MEMORY")
	private double MEMORY;
	
	@Column(name="HOST_NAME")
	private String HOST_NAME;
	
	@Column(name="STP_BOND_NO")
	private String STP_BOND_NO;
	
	@Column(name="HBA_TYPE")
	private String HBA_TYPE;
	
	@Column(name="RACK_ID")
	private long RACK_ID;
	
	@Column(name="OS")
	private String OS;
	
	@Column(name="REMARKS")
	private String REMARKS;

	public long getPHY_SER_ID() {
		return PHY_SER_ID;
	}

	public void setPHY_SER_ID(long pHY_SER_ID) {
		PHY_SER_ID = pHY_SER_ID;
	}

	public long getNO_OF_PROCESSORS() {
		return NO_OF_PROCESSORS;
	}

	public void setNO_OF_PROCESSORS(long nO_OF_PROCESSORS) {
		NO_OF_PROCESSORS = nO_OF_PROCESSORS;
	}

	public String getIP_ADDR() {
		return IP_ADDR;
	}

	public void setIP_ADDR(String iP_ADDR) {
		IP_ADDR = iP_ADDR;
	}

	public long getDEPT_ID() {
		return DEPT_ID;
	}

	public void setDEPT_ID(long dEPT_ID) {
		DEPT_ID = dEPT_ID;
	}

	public long getHDD() {
		return HDD;
	}

	public void setHDD(long hDD) {
		HDD = hDD;
	}

	public long getHARD_DRIVE_QTY() {
		return HARD_DRIVE_QTY;
	}

	public void setHARD_DRIVE_QTY(long hARD_DRIVE_QTY) {
		HARD_DRIVE_QTY = hARD_DRIVE_QTY;
	}

	public double getMEMORY() {
		return MEMORY;
	}

	public void setMEMORY(double mEMORY) {
		MEMORY = mEMORY;
	}

	public String getHOST_NAME() {
		return HOST_NAME;
	}

	public void setHOST_NAME(String hOST_NAME) {
		HOST_NAME = hOST_NAME;
	}

	public String getSTP_BOND_NO() {
		return STP_BOND_NO;
	}

	public void setSTP_BOND_NO(String sTP_BOND_NO) {
		STP_BOND_NO = sTP_BOND_NO;
	}

	public String getHBA_TYPE() {
		return HBA_TYPE;
	}

	public void setHBA_TYPE(String hBA_TYPE) {
		HBA_TYPE = hBA_TYPE;
	}

	public long getRACK_ID() {
		return RACK_ID;
	}

	public void setRACK_ID(long rACK_ID) {
		RACK_ID = rACK_ID;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	

	

}


