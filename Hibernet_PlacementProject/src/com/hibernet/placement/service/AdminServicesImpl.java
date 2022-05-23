package com.hibernet.placement.service;

import com.hibernet.placement.dao.AdminDAO;
import com.hibernet.placement.dao.AdminDAOImpl;
import com.hibernet.placement.entitise.Admin;

public class AdminServicesImpl implements AdminServices {
	private AdminDAO dao;
	
	public  AdminServicesImpl() {
		dao = new AdminDAOImpl();
	}

	
	public Admin findByAdminId(long adminId) {
		// TODO Auto-generated method stub
		Admin admin = dao.getAdminById(adminId);
		return admin;
	}

	
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();
	}

	
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();
		
	}

	
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAdmin(admin);
		dao.commitTransaction();
		
	}
}
