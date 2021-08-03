/*package app.web.dialeto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class DialetoConfiguration extends WebSecurityConfigurerAdapter{
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
    }
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "/escCadastro", "/registroAluno", "/registroProf", "/index/**", "/login/**",
				"/escRegistro/**", "/registroAluno/**", "/registroProf/**").permitAll()
		
		.antMatchers("/conteudo", "/conteudo/**").access("hasAnyAuthority('ALUNO')")
		.antMatchers("/areaprof", "/areaprof/**").access("hasAnyAuthority('PROFESSOR')")
		.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll()
		.and()
		.logout().logoutRequestMatcher( new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/").permitAll();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user@user")
			.password(passwordEncoder().encode("password")).authorities("ALUNO");
	}
}*/