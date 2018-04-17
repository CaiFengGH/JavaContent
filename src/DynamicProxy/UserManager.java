package DynamicProxy;

/**
 * @author Ethan
 * @desc 被代理接口
 */
public interface UserManager {
	public void addUser(String id,String password);
	public void delUser(String id);
}
