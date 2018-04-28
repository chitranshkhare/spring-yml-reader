package readYml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
	
	@Autowired
	private PropConfig propConfig;
	
	@Autowired
	private StateRepository stateRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(propConfig.getAaa() + "---->> " + propConfig);
		
		stateRepository.save(new State("Maharasta"));
	}
	
}
