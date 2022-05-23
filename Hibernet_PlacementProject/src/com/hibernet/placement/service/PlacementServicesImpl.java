package com.hibernet.placement.service;

import com.hibernet.placement.dao.PlacementDAO;
import com.hibernet.placement.dao.PlacementDAOImpl;
import com.hibernet.placement.entitise.Placement;

public class PlacementServicesImpl implements PlacementServices {
	private PlacementDAO dao;
	
	public  PlacementServicesImpl() {
		dao = new PlacementDAOImpl();
	}

	@Override
	public Placement findByPlacementId(long placementId) {
		// TODO Auto-generated method stub
		Placement placement = dao.getPlacementById(placementId);
		return placement;
	}

	@Override
	public void addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public void updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void removePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removePlacement(placement);
		dao.commitTransaction();
	}

}

