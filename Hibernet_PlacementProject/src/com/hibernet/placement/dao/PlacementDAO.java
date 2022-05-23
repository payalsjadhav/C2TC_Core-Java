package com.hibernet.placement.dao;

import com.hibernet.placement.entitise.Placement;

public interface PlacementDAO {
	
	Placement getPlacementById(long placementId);
	void addPlacement(Placement placement);
	void removePlacement(Placement placement);
	void updatePlacement(Placement placement);
	void commitTransaction();
	void beginTransaction();

}
