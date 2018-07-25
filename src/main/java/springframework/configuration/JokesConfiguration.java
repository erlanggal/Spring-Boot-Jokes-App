package springframework.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokesConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
    }
}
