package br.com.dh.agenda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// Método que lida com autenticação
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}

	// Método que lida com autorização
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.headers().frameOptions().disable().and().

		// desabilitar csrf para que possamos fazer post
				csrf().disable().authorizeRequests().
				// liberar acesso via GET para url contato
				antMatchers(HttpMethod.GET, "/contato/*").
				permitAll().
				// liberar acesso via POST para url contato
				antMatchers(HttpMethod.POST, "/contato/**").
				permitAll().
				antMatchers("/h2-console/*").
				permitAll().
				anyRequest().
				authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	// Método que lida com recursos estáticos
	@Override
	public void configure(WebSecurity web) throws Exception {

	}
}
