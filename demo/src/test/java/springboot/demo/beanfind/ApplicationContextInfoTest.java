package springboot.demo.beanfind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.demo.AppConfig;

public class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitationNames = ac.getBeanDefinitionNames();
        for (String beanDefinitationName : beanDefinitationNames) {
            Object bean = ac.getBean(beanDefinitationName);
            System.out.println("name = " + beanDefinitationName + " object " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {
        String[] beanDefinitationNames = ac.getBeanDefinitionNames();
        for (String beanDefinitationName : beanDefinitationNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitationName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitationName);
                System.out.println("name = " + beanDefinitationName + " object " + bean);
            }
        }
    }
}
