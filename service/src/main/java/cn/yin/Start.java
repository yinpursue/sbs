package cn.yin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "cn.yin.model"
})
@MapperScan(basePackages = {"cn.yin.model.dao"})
@SpringBootApplication
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
    /**
     * <dependency>
     *     <groupId>com.fasterxml.jackson.datatype</groupId>
     *     <artifactId>jackson-datatype-jsr310</artifactId>
     * </dependency>
     * 在该模块中封装对Java 8的时间日期API序列化的实现，其具体实现在这个类中：com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
     * （注意：一些较早版本疯转在这个类中“com.fasterxml.jackson.datatype.jsr310.JSR310Module）。
     * 在配置了依赖之后，我们只需要在上面的应用主类中增加这个序列化模块，并禁用对日期以时间戳方式输出的特性：
     * @return
     */
//	@Bean
//	public ObjectMapper serializingObjectMapper() {
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//		objectMapper.registerModule(new JavaTimeModule());
//		return objectMapper;
//	}
}
