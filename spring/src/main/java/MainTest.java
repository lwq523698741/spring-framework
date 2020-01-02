import com.sanza.config.Config;
import com.sanza.dto.Bean1;
import com.sanza.dto.Bean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-02 14:32
 **/
public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		final Bean3 bean = context.getBean(Bean3.class);
		System.out.println(bean);
	}
}
