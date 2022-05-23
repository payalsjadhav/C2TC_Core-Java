package com.hibernet.placement.service;

import com.hibernet.placement.entitise.Certificate;

public interface CertificateServices {
	
	Certificate findByCertificateId(int studentid);
	void addCertificate(Certificate certificate);
	void updateCertificate(Certificate certificate);
	void removeCertificate(Certificate certificate);


}
