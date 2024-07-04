package cn.cpoet.jdbc.dml.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * CRUD操作基类
 *
 * @author CPoet
 */
@Getter
@ToString
@EqualsAndHashCode
public abstract class CRUD<T> extends Where<T> implements DML {

    private static final long serialVersionUID = -7197773327301369728L;

    protected Table table;

}
