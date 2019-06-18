package initiateBoot.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "initiateBoot.app")
@EnableJpaRepositories({"initiateBoot.app.auth.repos", "initiateBoot.app.common.repos", "initiateBoot.app.users.repos"})
@EnableJpaAuditing
@EntityScan(basePackages = {"initiateBoot.app.*"})
public class StartApplication {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Class<?>[]{StartApplication.class}, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            ctx.getBeanDefinitionNames();
        };
    }


//    @Bean
//    public CommonsRequestLoggingFilter requestLoggingFilter() {
//        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
//        loggingFilter.setIncludeClientInfo(true);
//        loggingFilter.setIncludeQueryString(true);
//        loggingFilter.setIncludePayload(true);
//        return loggingFilter;
//    }
}