package com.example.demo;

import com.example.demo.model.Activity;
import com.example.demo.model.Camper;
import com.example.demo.model.Signup;
import com.example.demo.repository.ActivityRepository;
import com.example.demo.repository.CamperRepository;
import com.example.demo.repository.SignupRepository;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Component
	public class ApplicationStartupRunner implements CommandLineRunner {
		private final CamperRepository camperRepository;
		private final ActivityRepository activityRepository;
		private final SignupRepository signupRepository;

		public ApplicationStartupRunner(CamperRepository camperRepository, ActivityRepository activityRepository, SignupRepository signupRepository) {
			this.camperRepository = camperRepository;
			this.activityRepository = activityRepository;
			this.signupRepository = signupRepository;
		}
		@Override
		public void run(String... args) {
//			//Creates the default activities
//			Activity archery = new Activity();
//			archery.setDifficulty(2);
//			archery.setName("Archery");
//			archery.setCreated_at(new Date());
//
//			Activity swimming = new Activity();
//			swimming.setDifficulty(3);
//			swimming.setName("Swimming");
//			swimming.setCreated_at(new Date());
//
//			activityRepository.save(archery);
//			activityRepository.save(swimming);
//
//			//Creates Default Campers
//			Camper joe = new Camper();
//			joe.setAge(10);
//			joe.setName("Joe");
//			joe.setUpdated_at(new Date());
//
//			Camper thomas = new Camper();
//			thomas.setAge(18);
//			thomas.setName("Thomas");
//			thomas.setUpdated_at(new Date());
//
//			camperRepository.save(joe);
//			camperRepository.save(thomas);
		}
	}

	@Bean
	public ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}



}
