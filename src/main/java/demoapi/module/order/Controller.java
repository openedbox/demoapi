package demoapi.module.order;

import com.google.common.collect.Lists;
import demoapi.core.BaseComponment;
import demoapi.core.Result;
import demoapi.module.order.entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by wxy on 2/2/16.
 */
@RestController
public class Controller extends BaseComponment {

    @RequestMapping("/orders")
    @ResponseBody
    public Object allOrders(){

        //Mock
        List orders = Lists.newArrayList(
                Order.builder().buyer("小红").price(1.2f).count(10).province("北京").build(),
                Order.builder().buyer("小花").price(1.3f).count(20).province("北京").build(),
                Order.builder().buyer("小明").price(1.1f).count(15).province("北京").build()
        );

        return Result.OK(orders);
    }
}
