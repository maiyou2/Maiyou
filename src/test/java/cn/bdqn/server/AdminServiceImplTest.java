package cn.bdqn.server;

import cn.bdqn.entity.Admin;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhang on 2018/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AdminServiceImplTest {
    @Test
    public void adminLogin() throws Exception {
        Admin ad=new Admin();
        ad.setAdminName("admin");
        ad.setPassword("admin");
        Admin admin=adminService.AdminLogin(ad);
        System.out.println(admin);
    }

    @Resource
    private AdminService adminService;
    @Test
    public void queryAllAdmin() throws Exception {
        PageInfo<Admin> adminPageInfo=adminService.queryAllAdmin(2,3);
        if(adminPageInfo!=null){
            List<Admin> admins=adminPageInfo.getList();
            for (Admin admin : admins) {
                System.out.println(admin);
            }
            System.out.println(adminPageInfo);
        }


    }

    @Test
    public void queryAdminById() throws Exception {
        System.out.println(adminService.queryAdminById(2));
    }

    @Test
    public void updateAdminByAdminRank() throws Exception {
        Admin admin=new Admin();
        admin.setAdminId(1);
        admin.setAdminRank("2级");
        System.out.println(adminService.updateAdminByAdminRank(admin));
    }

    @Test
    public void updateAdminByAdminId() throws Exception {
        System.out.println(adminService.updateAdminByAdminId(2));

    }

}