package cn.cpoet.jdbc.dml.core;

import lombok.Builder;
import lombok.Data;

/**
 * 表
 *
 * @author CPoet
 */
@Data
@Builder
public class Table implements Wrapper {

    private static final long serialVersionUID = -376067724789223337L;

    /**
     * 表名
     */
    private final String name;

    /**
     * 表别名
     */
    private final String alias;
}
