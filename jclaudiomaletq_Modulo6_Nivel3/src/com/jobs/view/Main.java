package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 1000.0);
		controller.createSeniorEmployee("Pedro Senior", "Dirección molona 2", "665266666", 300.0);
		controller.createMidiEmployee("Laura Midi", "Dirección molona 3", "625266666", 220.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "No cobra!",0.0);
		controller.createJuniorEmployee("Pedro Junior", "Dirección molona 2", "665226666", 130.0);
		controller.createManagerEmployee("Pedro Manager", "Dirección molona 2", "665226666", 300.0);
		controller.createVolunteer("Antonio Volunteer", "Dirección molona 4", "614266666", "ayuda",250);
		controller.createMidiEmployee("Pepito Midi", "Dirección molona 2", "665226666", 170.0);
		controller.createSeniorEmployee("Laurita Senior", "Dirección molona 2", "665226666", 250.0);		
		controller.payAllEmployeers();
		controller.payBonus_All_Emplloyees();
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: "+ " \n" + allEmployees + " \n");
		
	}

}
