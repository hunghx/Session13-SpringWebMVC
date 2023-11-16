package ra.academy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // lớp cấu hình
@EnableWebMvc // cho phép sử dụng cấu hình mvc
@ComponentScan(basePackages = {"ra.academy.controller"})
public class WebConfig implements WebMvcConfigurer {

    // caaus hình bean viewResolver
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");// cấu hình đường dãn thư mục trỏ đến view
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
