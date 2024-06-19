package springboot.demo.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//위에 3개가 붙은 어노테이션은 내가 컴포넌트로 추가할거다

public @interface MyIncludeComponent {
}
