package step22RunningQueryWithJdbcTemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch4Configuration.class);
		
		AccountDao accountDao = applicationContext.getBean(AccountDao.class);
		
		Account account = accountDao.find(2);
		
		System.out.println(account.getId());
		System.out.println(account.getOwnerName());
		System.out.println(account.getBalance());
		System.out.println(account.getAccessTime());
		System.out.println(account.isLocked());
		
		applicationContext.close();
	}
}
