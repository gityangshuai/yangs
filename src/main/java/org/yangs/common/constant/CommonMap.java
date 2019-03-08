package org.yangs.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用数据库映射Map数据（反向生成时使用）
 * @author YangS
 * @create 2019-03-08  16:10
 */
public class CommonMap {

    /**
     * 状态编码转换
     */
    public static Map<String, String> javaTypeMap = new HashMap<String, String>();

    static {
        initJavaTypeMap();
    }

    /**
     * 返回状态映射
     */
    public static void initJavaTypeMap() {

    }
}
