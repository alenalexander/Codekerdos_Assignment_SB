package com.codekerdos.session_7;


//import com.codekerdos.session_4.beans.Vehicle;
//import com.codekerdos.session_4.config.ProjectConfig;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codekerdos.session_7.beans.Person;
import com.codekerdos.session_7.beans.Vehicle;
import com.codekerdos.session_7.config.ProjectConfig;
import com.codekerdos.session_7.implementation.BoseSpeakers;
import com.codekerdos.session_7.implementation.BridgeStoneTyres;
import com.codekerdos.session_7.implementation.MichelinTyre;
import com.codekerdos.session_7.implementation.SonySpeakers;
import com.codekerdos.session_7.interfaces.Speakers;
import com.codekerdos.session_7.interfaces.Tyres;
import com.codekerdos.session_7.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Session7Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);

		vehicleServices1.setSpeakers(context.getBean(BoseSpeakers.class));
		vehicleServices1.setTyres(context.getBean(MichelinTyre.class));
		System.out.println("active speaker of service1 is " + vehicleServices1.getSpeakers().toString());
		vehicleServices1.playMusic();
		vehicleServices1.moveVehicle();

		vehicleServices1.setSpeakers(context.getBean(SonySpeakers.class));
		vehicleServices1.setTyres(context.getBean(BridgeStoneTyres.class));
		System.out.println("active speaker of service1 is " + vehicleServices1.getSpeakers().toString());
		vehicleServices1.playMusic();
		vehicleServices1.moveVehicle();

		String[] activeSpeakers = context.getBeanNamesForType(Speakers.class);
		System.out.println(Arrays.toString(activeSpeakers));
		String[] activeTyres = context.getBeanNamesForType(Tyres.class);
		System.out.println(Arrays.toString(activeTyres));


//		VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
//
//		System.out.println("Hashcode of vehicleServices1 " + vehicleServices1.hashCode());
//		System.out.println("Hashcode of vehicleServices1 " + vehicleServices2.hashCode());
//
//		if(vehicleServices1 == vehicleServices2){
//			System.out.println("VehicleServives bean is a singleton");
//		}

		System.out.println("Before retreiving the Person bean from SC");
		Person person = context.getBean(Person.class);
		System.out.println("After retreiving the Person bean from SC");

	}
}