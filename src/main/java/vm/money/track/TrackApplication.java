package vm.money.track;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@Configuration
@EnableSwagger2
public class TrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackApplication.class, args);
	}
//	@GetMapping("/")
	public String hello(){
		return "hello vm";
	}

//    @Bean
//    DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.postgresql.Driver");
//        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/spends");
//        dataSourceBuilder.username("postgres");
//        dataSourceBuilder.password("nothing");
//        return dataSourceBuilder.build();
//    }

}
