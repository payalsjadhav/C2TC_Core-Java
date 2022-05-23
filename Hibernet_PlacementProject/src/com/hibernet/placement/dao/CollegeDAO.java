package com.hibernet.placement.dao;

import com.hibernet.placement.entitise.College;

public interface CollegeDAO {
	College getCollegeById(long collegeId);
	void addCollege(College college);
	void removeCollege(College college);
	void updateCollege(College college);
	void commitTransaction();
	void beginTransaction();

}
