package DynamicProxy;

/**
 * @author Ethan
 * @desc 用户管理客户端
 */
public class Client {
	
	public static void main(String[] args) {
		System.out.println("----jdkProxy----");
		JDKProxy jdkProxy = new JDKProxy();
		UserManager userManagerProxy = (UserManager) jdkProxy.newProxy(new UserManagerImpl());
		userManagerProxy.addUser("1","lzw");
	}
}
