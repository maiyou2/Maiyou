package cn.bdqn.server;

import cn.bdqn.vo.OrderFormVo;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzhichao on 2018/3/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrderFormServiceTest {

    @Resource
    private OrderFormService orderFormService;
    @Test
    public void queryAllOrderForm() throws Exception {
        PageInfo<OrderFormVo> pageInfo = orderFormService.queryAllOrderForm(1, 3);
        pageInfo.getList();
        List<OrderFormVo> vos = new ArrayList<OrderFormVo>(pageInfo.getList());
        for (OrderFormVo vo : vos) {
            System.out.println(vo);
        }

    }

    @Test
    public void deleteOrderForm() throws Exception {
        System.out.println(orderFormService.deleteOrderForm(3));
    }

    @Test
    public void queryOrderFormVoById() throws Exception {
        System.out.println(orderFormService.queryOrderFormVoById(1));
    }

}