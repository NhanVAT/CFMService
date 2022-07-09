package com.cfm.CFM.CFMService;

import com.cfm.CFM.CFMService.entity.CFMRole;
import com.cfm.CFM.CFMService.entity.CFMUser;
import com.cfm.CFM.CFMService.repository.CFMRoleRepository;
import com.cfm.CFM.CFMService.repository.CFMUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class CfmServiceApplication extends SpringBootServletInitializer implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(CfmServiceApplication.class);

	@Autowired
	private CFMUserRepository userRepository;
	@Autowired
	private CFMRoleRepository roleRepository;

	/**
	 * This is a helper Java class that provides an alternative to creating a {@code web.xml}
	 * This will be invoked only when the application is deployed to a Servlet container like Tomcat, JBoss etc.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CfmServiceApplication.class);
	}

	@Bean
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}

	public static void main(String[] args) {
		SpringApplication.run(CfmServiceApplication.class, args);
		log.info("CMF Service is running");
	}

	@Override
	public void run(String... args) throws Exception {
//		List<CFMUser> users = (List<CFMUser>) userRepository.findAll();
//		List<CFMRole> roleList = (List<CFMRole>) roleRepository.findAll();
//		if (roleList.isEmpty()) {
//			CFMRole roleAdmin = new CFMRole();
//			roleAdmin.setId(1L);
//			roleAdmin.setName("ROLE_ADMIN");
//			roleRepository.save(roleAdmin);
//			CFMRole roleUser = new CFMRole();
//			roleUser.setId(2L);
//			roleUser.setName("ROLE_USER");
//			roleRepository.save(roleUser);
//		}
//		if (users.isEmpty()) {
//			CFMUser admin = new CFMUser();
//			Set<CFMRole> roles = new HashSet<>();
//			CFMRole roleAdmin = new CFMRole();
//			roleAdmin.setId(1L);
//			roleAdmin.setName("ROLE_ADMIN");
//			roles.add(roleAdmin);
//			admin.setLogin("admin");
//			admin.setPassword(passwordEncoder.encode("admin"));
//			admin.setRoles(roles);
//			userRepository.save(admin);
//		}
	}
}
