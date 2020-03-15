import com.sanza.config.Config;
import com.sanza.factorybean.HandleInvoke;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-02 14:32
 **/
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		final HandleInvoke bean = context.getBean(HandleInvoke.class);

		context.close();
	}
}
