✅ Goal:
Replace config.xml with a Java class using:

java
Copy code
@Configuration
@ComponentScan
@Bean
🔧 Required Files:
File	Purpose
AppConfig.java	Java-based Spring config
Student.java	POJO
StudentDao	Interface
StudentDaoImpl.java	Implementation (@Repository)
StudentRowMapper.java	RowMapper
App.java	Main class

✅ 1. AppConfig.java
✅ 2. Update StudentDaoImpl.java
Add @Repository and @Autowired
✅ 3. App.java
✅ What You Don't Need Anymore:
❌ config.xml
❌ <bean> tags
❌ <context:component-scan>

✅ Summary  
config.xml with <beans> -	@Configuration class
<context:component-scan> -	@ComponentScan
<bean id="...">  -	@Bean methods
applicationContext.xml -	AnnotationConfigApplicationContext
