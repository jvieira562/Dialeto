/*package app.web.dialeto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@Configuration
@EnableWebSecurity
public class DialetoConfiguration extends WebSecurityConfigurerAdapter{
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
    }
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
             registry.addResourceHandler("/resources/static**")
                     .addResourceLocations("/resources/static/");
     }
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "/conteudo").access("hasAnyAuthority('ALUNOS')")
		.antMatchers("/", "/areaprof").access("hasAnyAuthority('PROFESSORES')")
		.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll()
		.and()
		.logout().logoutRequestMatcher( new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/").permitAll()
		;
		
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user@user")
			.password(passwordEncoder().encode("password")).authorities("USER");
	}
}*/