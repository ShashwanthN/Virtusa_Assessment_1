package CustomAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface UserInfo {
    String name() default "shashwanth";
    int level() default 1;
}