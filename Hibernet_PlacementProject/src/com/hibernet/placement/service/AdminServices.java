package com.hibernet.placement.service;

import com.hibernet.placement.entitise.Admin;

public interface AdminServices {
	Admin findByAdminId(long  adminId);
	void addAdmin(Admin admin);
	void updateAdmin(Admin admin);
	void removeAdmin(Admin admin);


}
