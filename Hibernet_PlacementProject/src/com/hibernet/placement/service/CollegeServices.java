package com.hibernet.placement.service;

import com.hibernet.placement.entitise.College;

public interface CollegeServices {
	College findByCollegeId(long collegeId);
	void addCollege(College college);
	void updateCollege(College college);
	void removeCollege(College college);

}
