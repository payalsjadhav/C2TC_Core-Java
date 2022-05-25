package com.hibernet.placement.dao;

import javax.persistence.EntityManager;

import com.hibernet.placement.entitise.Certificate;

public interface CertificateDAO 
{
	Certificate getCertificateById(int studentid);
	void addCertificate(Certificate certificate);
	void removeCertificate(Certificate certificate);
	void updateCertificate(Certificate certificate);
	void commitTransaction();
	void beginTransaction();


}
