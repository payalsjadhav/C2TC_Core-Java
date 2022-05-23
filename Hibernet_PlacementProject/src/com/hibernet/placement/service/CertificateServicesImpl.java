package com.hibernet.placement.service;

import com.hibernet.placement.dao.CertificateDAO;
import com.hibernet.placement.dao.CertificateDAOImpl;
import com.hibernet.placement.entitise.Certificate;

public class CertificateServicesImpl implements CertificateServices {
	private CertificateDAO dao;
	
	public  CertificateServicesImpl() {
		dao = new CertificateDAOImpl();
	}

	@Override
	public Certificate findByCertificateId(int studentid) {
		// TODO Auto-generated method stub
		Certificate certificate = dao.getCertificateById(studentid);
		return certificate;
	}
	@Override
	public void addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
	}

	@Override
	public void removeCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeCertificate(certificate);
		dao.commitTransaction();
	}

	
	
}
