import com.sanza.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-01 23:40
 **/
public class test {

	public static void main(String[] args) {
		System.out.println(1);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context);
	}
}
