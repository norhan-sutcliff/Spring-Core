package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Doctor;
import com.hibernate.model.DoctorDetails;
import com.hibernate.model.Hospital;
import com.hibernate.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.addAnnotatedClass(Doctor.class)
				.addAnnotatedClass(DoctorDetails.class)
				.addAnnotatedClass(Hospital.class)
				.addAnnotatedClass(Patient.class)
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		Transaction transaction = session.beginTransaction();
		
		Hospital hospital1 = new Hospital();
        hospital1.setName("City Care Hospital");
        hospital1.setNumberOfDoctors(5);
        hospital1.setNumberOfPatient(30);

        // --- Create Doctor ---
        Doctor doctor1 = new Doctor();
        doctor1.setUserName("dr_samir");
        doctor1.setSalary(15000);
        doctor1.setHospital(hospital1); // link to hospital

        // --- Create DoctorDetails ---
        DoctorDetails details1 = new DoctorDetails();
        details1.setFirstName("Samir");
        details1.setLastName("Ahmed");
        details1.setAge(40);
        details1.setFukkAddress("Cairo, Egypt");
        details1.setDoc(doctor1); // link both sides
        doctor1.setDocDetails(details1);

        // --- Create Patient(s) ---
        Patient patient1 = new Patient();
        patient1.setName("Norhan Samir");
        patient1.setTypeOfDisease("Flu");
        patient1.setDoctor(doctor1);

        Patient patient2 = new Patient();
        patient2.setName("Omar Ali");
        patient2.setTypeOfDisease("Allergy");
        patient2.setDoctor(doctor1);

        // Link hospital and patients (ManyToMany)
        List<Hospital> hospitalList = new ArrayList<>();
        hospitalList.add(hospital1);
        patient1.setHospitals(hospitalList);
        patient2.setHospitals(hospitalList);

        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        hospital1.setPatients(patients);

        // Link doctor → patients
        doctor1.setPatients(patients);

        // --- Persist everything ---
        session.persist(hospital1);
        session.persist(doctor1);
        session.persist(details1);
        session.persist(patient1);
        session.persist(patient2);

		transaction.commit();
		
		session.close();
		factory.close();
		

	}

}
