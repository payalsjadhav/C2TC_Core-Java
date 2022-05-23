package com.hibernet.placement.service;

import com.hibernet.placement.dao.CollegeDAO;
import com.hibernet.placement.dao.CollegeDAOImpl;
import com.hibernet.placement.entitise.College;

public class CollegeServicesImpl implements CollegeServices {
	private CollegeDAO dao;
	
	public  CollegeServicesImpl() {
		dao = new CollegeDAOImpl();
	}

	@Override
	public College findByCollegeId(long collegeId) {
		// TODO Auto-generated method stub
		College college = dao.getCollegeById(collegeId);
		return college;
	}

	@Override
	public void addCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
	}

	@Override
	public void removeCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeCollege(college);
		dao.commitTransaction();
	}

	
	
	
}
