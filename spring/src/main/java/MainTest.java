import com.sanza.config.Config;
import com.sanza.dto.Bean1;
import com.sanza.dto.Bean2;
import com.sanza.dto.Bean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-02 14:32
 **/
public class MainTest {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		final Bean2 bean = context.getBean(Bean2.class);
		bean.ioc();


	}
}
