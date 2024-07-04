package cn.cpoet.jdbc.dml.core;

import cn.cpoet.jdbc.dml.constant.OrderEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 查询
 *
 * @author CPoet
 */
@Getter
@ToString
@EqualsAndHashCode
public class Select extends CRUD<Select> {

    private static final long serialVersionUID = 1150228647618181090L;

    /**
     * 查询的列信息
     */
    private List<Column> columns;

    /**
     * 排序字段
     */
    private List<Order> orders;

    public Select column(String column) {
        return column(column, null);
    }

    public Select column(String column, String alias) {
        return columns(Column.builder().name(column).alias(alias).build());
    }

    public Select columns(String column, String... columns) {
        if (columns.length == 0) {
            return columns(new Column(null, column, null));
        }
        return columns(new Column(null, column, null), Arrays.stream(columns)
                .map(col -> new Column(null, column, null))
                .toArray(Column[]::new));
    }

    public Select columns(Column column, Column... columns) {
        if (this.columns == null) {
            this.columns = new LinkedList<>();
        }
        this.columns.add(column);
        if (columns.length > 0) {
            this.columns.addAll(Arrays.asList(columns));
        }
        return this;
    }

    public Select from(String table) {
        return from(table, null);
    }

    public Select from(String table, String alias) {
        return from(Table.builder().name(table).alias(alias).build());
    }

    public Select from(Table table) {
        this.table = table;
        return this;
    }

    public Select asc(String column, String... columns) {
        return order(OrderEnum.ASC, column, columns);
    }

    public Select desc(String column, String... columns) {
        return order(OrderEnum.DESC, column, columns);
    }

    public Select order(OrderEnum type, String column, String... columns) {
        if (columns.length == 0) {
            return order(new Order(column, type));
        }
        return order(new Order(column, type), Arrays.stream(columns).map(col -> new Order(col, type)).toArray(Order[]::new));
    }

    public Select order(Order order, Order... orders) {
        if (this.orders == null) {
            this.orders = new LinkedList<>();
        }
        this.orders.add(order);
        if (orders.length > 0) {
            this.orders.addAll(Arrays.asList(orders));
        }
        return this;
    }
}
