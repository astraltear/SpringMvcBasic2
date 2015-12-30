Spring 4.2.1
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


