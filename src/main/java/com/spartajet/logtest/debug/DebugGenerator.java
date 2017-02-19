package com.spartajet.logtest.debug;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description
 * @create 2017-02-19 下午9:54
 * @email gxz04220427@163.com
 */
@Component
public class DebugGenerator {
    private Logger logger = LogManager.getLogger(DebugGenerator.class);

    @PostConstruct
    private void geneDebug() {
        logger.debug("this is a debug log");
    }
}
