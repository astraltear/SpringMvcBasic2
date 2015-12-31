Spring MVC 4.2.1
slf4j
mybatis
mysql
spring jdbc
jackson
log4jdbc-log4j2

## 각 상황별 테스트 클래스 존재(웹서버를 띄우지 않고 Junit을 통해 테스트를 수행)
	MySqlConnectionTest DB 연결테스트
	MyBatisTest			SqlSessionFactoryBean 정상 설정 테스트  객체 생성 여부 
	MemberDAOTest		Service 클래스 없이 다이렉트로 DAO 테스트
	DataSourceTest		DataSource 정상 설정 테스트
	


##  mysql + mybatis 초 단순조합 


## @Autowired @Resource @Inject 차이 비교
    @Autowired
    	Spring Framework에서 지원하는 Dependency 정의 용도의 Annotation으로, Spring Framework에 종속적이긴 하지만 정밀한 Dependency Injection이 필요한 경우에 유용하다.
    	멤버변수, setter 메소드, 생성자, 일반 메소드에 적용 가능

    @Resource
    	JSR-250 표준 Annotation으로 Spring Framework 2.5.* 부터 지원하는 Annotation이다. @Resource는 JNDI 리소스(datasource, java messaging service destination or environment entry)와 연관지어 생각할 수 있으며, 특정 Bean이 JNDI 리소스에 대한 Injection을 필요로 하는 경우에는 @Resource를 사용할 것을 권장한다.
    	멤버변수, setter 메소드에 적용가능

    @Inject
    	JSR-330 표준 Annotation으로 Spring 3 부터 지원하는 Annotation이다. 특정 Framework에 종속되지 않은 어플리케이션을 구성하기 위해서는 @Inject를 사용할 것을 권장한다. @Inject를 사용하기 위해서는 클래스 패스 내에 JSR-330 라이브러리인 javax.inject-x.x.x.jar 파일이 추가되어야 함에 유의해야 한다. 
		 멤버변수, setter 메소드, 생성자, 일반 메소드에 적용 가능
	
	@Autowired, @Resource, @Inject를 멤버변수에 직접 정의하는 경우 별도 setter 메소드는 정의하지 않아도 된다.  


