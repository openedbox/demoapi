package demoapi.module.order.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Builder;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Order  {
    private String buyer;
    private String province;
    private float price;
    private int count;
}
