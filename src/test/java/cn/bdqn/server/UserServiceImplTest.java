package cn.bdqn.server;

import cn.bdqn.entity.User;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {
    @Test
    public void deleteUserById() throws Exception {
        int n = userService.deleteUserById(2);
        System.out.println(n);
    }

    @Test
    public void updateUserById() throws Exception {
        int n = userService.updateUserById(2);
        System.out.println(n);
    }

    @Test
    public void queryUserById() throws Exception {
        User user = userService.queryUserById(2);
        if(user!=null){
            System.out.println(user);
        }
    }

    @Resource
    private UserService userService;
    @Test
    public void queryAll() throws Exception {
        PageInfo<User> pageInfo = userService.queryAll(1, 3);
            if(pageInfo!=null){
                List<User> list=pageInfo.getList();
                if(list!=null){
                    System.out.println(list);
                }
            }
    }

}