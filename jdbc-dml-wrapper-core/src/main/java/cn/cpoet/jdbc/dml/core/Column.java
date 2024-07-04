package cn.cpoet.jdbc.dml.core;

import lombok.Builder;
import lombok.Data;

/**
 * 字段/属性
 *
 * @author CPoet
 */
@Data
@Builder
public class Column implements Wrapper {

    private static final long serialVersionUID = -4619218279476989950L;

    /**
     * 所属的表
     */
    private final String table;

    /**
     * 字段名称
     */
    private final String name;

    /**
     * 字段别名
     */
    private final String alias;
}
