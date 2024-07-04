package cn.cpoet.jdbc.dml.core;

import cn.cpoet.jdbc.dml.constant.OrderEnum;
import lombok.Data;

/**
 * 排序
 *
 * @author CPoet
 */
@Data
public class Order {

    /**
     * 列名
     */
    private String column;

    /**
     * 排序类型
     */
    private OrderEnum type;

    public Order(String column, OrderEnum type) {
        this.column = column;
        this.type = type;
    }
}
