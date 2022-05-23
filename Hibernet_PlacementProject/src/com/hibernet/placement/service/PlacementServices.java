package com.hibernet.placement.service;

import com.hibernet.placement.entitise.Placement;

public interface PlacementServices {
	Placement findByPlacementId(long placementId);
	void addPlacement(Placement placement);
	void updatePlacement(Placement placement);
	void removePlacement(Placement placement);


}
