package springboot.demo.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//위에 3개의 어노테이션이 붙으면 컴포넌트 스캔에서 제외한다.

public @interface MyExcludeComponent {

}
