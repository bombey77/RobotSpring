package configuration_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//конфигурационный файл, указывается для того чтобы не использовать файл xml
@ComponentScan("configuration_example")//указывается место из которого будут считаны аннотации
@PropertySource("classpath:config.properties")//будут считаны данные из файла пропертей для внедрения в бин
public class Config {

    @Bean
    public PersonBean getPerson() {
        return new PersonBean();
    }
}
