Spring MVC 4.2.1
slf4j
mybatis
mysql
spring jdbc
jackson
log4jdbc-log4j2

## �� ��Ȳ�� �׽�Ʈ Ŭ���� ����(�������� ����� �ʰ� Junit�� ���� �׽�Ʈ�� ����)
	MySqlConnectionTest DB �����׽�Ʈ
	MyBatisTest			SqlSessionFactoryBean ���� ���� �׽�Ʈ  ��ü ���� ���� 
	MemberDAOTest		Service Ŭ���� ���� ���̷�Ʈ�� DAO �׽�Ʈ
	DataSourceTest		DataSource ���� ���� �׽�Ʈ
	


##  mysql + mybatis �� �ܼ����� 


## @Autowired @Resource @Inject ���� ��
    @Autowired
    	Spring Framework���� �����ϴ� Dependency ���� �뵵�� Annotation����, Spring Framework�� �������̱� ������ ������ Dependency Injection�� �ʿ��� ��쿡 �����ϴ�.
    	�������, setter �޼ҵ�, ������, �Ϲ� �޼ҵ忡 ���� ����

    @Resource
    	JSR-250 ǥ�� Annotation���� Spring Framework 2.5.* ���� �����ϴ� Annotation�̴�. @Resource�� JNDI ���ҽ�(datasource, java messaging service destination or environment entry)�� �������� ������ �� ������, Ư�� Bean�� JNDI ���ҽ��� ���� Injection�� �ʿ�� �ϴ� ��쿡�� @Resource�� ����� ���� �����Ѵ�.
    	�������, setter �޼ҵ忡 ���밡��

    @Inject
    	JSR-330 ǥ�� Annotation���� Spring 3 ���� �����ϴ� Annotation�̴�. Ư�� Framework�� ���ӵ��� ���� ���ø����̼��� �����ϱ� ���ؼ��� @Inject�� ����� ���� �����Ѵ�. @Inject�� ����ϱ� ���ؼ��� Ŭ���� �н� ���� JSR-330 ���̺귯���� javax.inject-x.x.x.jar ������ �߰��Ǿ�� �Կ� �����ؾ� �Ѵ�. 
		 �������, setter �޼ҵ�, ������, �Ϲ� �޼ҵ忡 ���� ����
	
	@Autowired, @Resource, @Inject�� ��������� ���� �����ϴ� ��� ���� setter �޼ҵ�� �������� �ʾƵ� �ȴ�.  


